USE navigator;

#Users
INSERT INTO Users (`name`,`last_name`,`identity_number`,`birthdate`)
VALUES ('Julian','Mastieri',41318117,'2008-7-04');

#Transports
INSERT INTO Transports (`description`,`driver_id`)
VALUES ('Train','1');

#Countries
INSERT INTO Countries (`name`, `code`) 
VALUES ('Argentina', 54);

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Tandil City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Tandil','7000','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -37.328973, -59.136836, '1');

INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Roca','1234','-37.326379','-59.129535','1');

INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Sarmiento','2367','-37.330747', '-59.144565','1');

INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('25 de mayo','2367','-37.336719', '-59.140793','1');

#Paths
INSERT INTO Paths (`distance`,`bidirectional`,`id_point_from`,`id_point_to`, `transport_id`)
VALUES (9,TRUE, 1, 2, 1);

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Azul city