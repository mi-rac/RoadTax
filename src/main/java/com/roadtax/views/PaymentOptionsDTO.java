package com.roadtax.views;

import java.util.Date;

public class PaymentOptionsDTO
{
    private Boolean directDebit;
    private Integer duration;
    private Date paymentDate;

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Boolean getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(Boolean directDebit) {
        this.directDebit = directDebit;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
