package com.roadtax.config;

import com.roadtax.services.KeycloakRealmConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    String jwkSetUri = "http://localhost:8090/realms/RoadTaxSystemRealm/protocol/openid-connect/certs";

    @Bean
    public SecurityFilterChain securedApis(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/swagger-ui/**", "/v3/api-docs/**", "/v2/api-docs/**", "/swagger-resources/**", "/swagger-ui.html", "/webjars/**")
                .permitAll()
                .antMatchers(HttpMethod.DELETE, "/**").hasRole("admin")
                .antMatchers(HttpMethod.GET, "/**").hasAnyRole("admin", "tax_officer", "vehicle_owner")
                .antMatchers(HttpMethod.POST, "/**").hasAnyRole("admin", "tax_officer")
                .antMatchers(HttpMethod.PUT, "/**").hasAnyRole("admin", "tax_officer")
                .antMatchers(HttpMethod.PATCH, "/**").hasAnyRole("admin", "tax_officer")
                .anyRequest().authenticated();

        http
                .oauth2ResourceServer()
                .jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter()));

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

    private Converter<Jwt, ? extends AbstractAuthenticationToken> jwtAuthenticationConverter() {
        JwtAuthenticationConverter jwtConverter = new JwtAuthenticationConverter();
        jwtConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRealmConverter());
        return jwtConverter;
    }

    @Bean
    JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
    }
}