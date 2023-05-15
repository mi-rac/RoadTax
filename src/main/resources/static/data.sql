-- Owners table
INSERT INTO owner (first_name, last_name, address, city, state, zip_code, phone_number, email)
VALUES
    ('John', 'Doe', '123 Main St', 'London', 'England', 'AB12CD', '0123456789', 'johndoe@example.com'),
    ('Jane', 'Smith', '456 Elm St', 'Manchester', 'England', 'EF34GH', '9876543210', 'janesmith@example.com'),
    ('David', 'Williams', '789 Oak St', 'Birmingham', 'England', 'IJ56KL', '8765432109', 'davidwilliams@example.com'),
    ('Emma', 'Johnson', '321 Maple St', 'Glasgow', 'Scotland', 'MN78OP', '7654321098', 'emmajohnson@example.com'),
    ('Michael', 'Brown', '654 Pine St', 'Edinburgh', 'Scotland', 'QR90ST', '6543210987', 'michaelbrown@example.com'),
    ('Sarah', 'Taylor', '987 Birch St', 'Cardiff', 'Wales', 'UV12WX', '5432109876', 'sarahtaylor@example.com'),
    ('Daniel', 'Wilson', '159 Cedar St', 'Swansea', 'Wales', 'YZ34AB', '4321098765', 'danielwilson@example.com'),
    ('Laura', 'Davis', '753 Spruce St', 'Belfast', 'Northern Ireland', 'CD56EF', '3210987654', 'lauradavis@example.com'),
    ('James', 'Evans', '852 Walnut St', 'Lisburn', 'Northern Ireland', 'GH78IJ', '2109876543', 'jamesevans@example.com'),
    ('Olivia', 'Thomas', '456 Oak St', 'Aberdeen', 'Scotland', 'KL90MN', '1098765432', 'oliviathomas@example.com');

INSERT INTO vehicle (owner_id, make, model, year, license_plate, vin_number, registration_date, category_id)
VALUES
    (5, 'Ford', 'Focus', 2018, 'AB12 CDE', '1HGCM82633A123456', '2018-05-10'),
    (8, 'Volkswagen', 'Golf', 2019, 'EF34 GHI', '2HGCM82633A654321', '2019-06-15'),
    (1, 'BMW', '3 Series', 2017, 'IJ56 KLM', '3HGCM82633A789012', '2017-08-20'),
    (10, 'Toyota', 'Corolla', 2020, 'MN78 OPQ', '4HGCM82633A345678', '2020-09-25'),
    (3, 'Honda', 'Civic', 2016, 'QR90 STU', '5HGCM82633A901234', '2016-11-30'),
    (6, 'Mercedes-Benz', 'E-Class', 2021, 'UV12 WXY', '6HGCM82633A456789', '2021-02-05'),
    (9, 'Audi', 'A4', 2015, 'YZ34 ABC', '7HGCM82633A012345', '2015-03-12'),
    (4, 'Vauxhall', 'Corsa', 2022, 'CD56 DEF', '8HGCM82633A567890', '2022-04-17'),
    (2, 'Ford', 'Fiesta', 2014, 'GH78 IJK', '9HGCM82633A234567', '2014-05-22'),
    (7, 'Nissan', 'Qashqai', 2019, 'KL90 MNO', '0HGCM82633A678901', '2019-06-27'),
    (5, 'Renault', 'Clio', 2017, 'AB12 PQR', '1HGCM82633A789012', '2017-08-01'),
    (8, 'BMW', '5 Series', 2021, 'EF34 STU', '2HGCM82633A890123', '2021-09-05'),
    (1, 'Volkswagen', 'Tiguan', 2020, 'IJ56 VWX', '3HGCM82633A901234', '2020-10-10'),
    (10, 'Mercedes-Benz', 'C-Class', 2016, 'MN78 YZA', '4HGCM82633A012345', '2016-11-15'),
    (3, 'Audi', 'Q3', 2019, 'QR90 BCD', '5HGCM82633A123456', '2019-12-20'),
    (6, 'Ford', 'Mustang', 2022, 'UV12 EFG', '6HGCM82633A234567', '2022-01-25'),
    (9, 'BMW', 'X5', 2015, 'YZ34 HIJ', '7HGCM82633A345678', '2015-03-01'),
    (2, 'Ford', 'Mondeo', 2018, 'EF34 NOP', '9HGCM82633A567890', '2018-05-10'),
    (7, 'Vauxhall', 'Astra', 2019, 'GH78 QRS', '0HGCM82633A678901', '2019-06-15'),
    (5, 'Nissan', 'Micra', 2017, 'AB12 TUV', '1HGCM82633A789012', '2017-08-20'),
    (8, 'Mercedes-Benz', 'GLC', 2020, 'EF34 WXY', '2HGCM82633A890123', '2020-09-25'),
    (1, 'Audi', 'A3', 2016, 'IJ56 ZAB', '3HGCM82633A901234', '2016-11-30'),
    (10, 'Volkswagen', 'Arteon', 2021, 'KL90 CDE', '4HGCM82633A012345', '2021-02-05'),
    (3, 'Ford', 'Kuga', 2015, 'QR90 FGH', '5HGCM82633A123456', '2015-03-12'),
    (6, 'BMW', 'X3', 2022, 'UV12 IJK', '6HGCM82633A234567', '2022-04-17'),
    (9, 'Audi', 'A6', 2014, 'YZ34 LMN', '7HGCM82633A345678', '2014-05-22');