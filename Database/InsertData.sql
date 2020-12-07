USE navigator;

#Users
INSERT INTO Users (`name`,`last_name`,`identity_number`,`birthdate`)
VALUES ('Julian','Mastieri',41318117,'2008-7-04');

#Countries
INSERT INTO Countries (`name`, `code`) 
VALUES ('Argentina', 54);

#Cities

INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Tandil','7000','1');

#Points

INSERT INTO Points (`street`,`number`,`city_id`)
VALUES ('Roca','1234','1');

INSERT INTO Points (`street`,`number`,`city_id`)
VALUES ('9 de Julio','345','1');

#Transports

INSERT INTO Transports (`description`,`driver_id`)
VALUES ('Train','1');

#Paths

INSERT INTO Paths (`distance`,`bidirectional`,`id_point_from`,`id_point_to`, `transport_id`)
VALUES (9,TRUE, 1, 2, 1);