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
VALUES ('Roca','1234',-37.326379,-59.129535,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Sarmiento','2367',-37.330747, -59.144565,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('25 de mayo','2367',-37.336719, -59.140793,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Rivadavia','3333',-37.326038,-59.146934,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Santamarina','222',-37.320578, -59.132780,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Mitre','44',-37.319076, -59.124566,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('11 de septiembre','9867',-37.323171,-59.124052,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Gardel','354',-37.331102,-59.117560,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Larrea','235',-37.334576,-59.111573,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Libertad','345', 37.338971,-59.130542, '1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Estrada','1234',-37.340663,-59.147497,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Payro','2367',-37.331355,-59.149446,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Monsenior','2367',-37.327410,-59.151430,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('San Lorenzo','3333',-37.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Las heras','222',-37.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Garibaldi','44',-37.318680,-59.131807,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Montiel','9867',-37.325185,-59.121188,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Caseros','354',-37.325185,-59.121188,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Accari','235',-37.316510,-59.117674,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Viscali','345',-37.316639,-59.104034, '1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Darragueira','1234',-37.312243,-59.109276,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Chapalaf','2367',-37.311164,-59.092044,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('D A Maradona','10',-37.312455,-59.098565,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Pedersen','3333',37.313786,-59.093721,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Los nogales','222',-37.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Garibaldi','44',-37.318680,-59.131807,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Los Pinos','9867',-37.316817,-59.089736,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Hudson','354',-37.320148,-59.092356,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Yrigoyen','235',-37.323015,-59.090638,'1');
#Paths
INSERT INTO Paths (`distance`,`bidirectional`,`id_point_from`,`id_point_to`, `transport_id`)
VALUES (9,TRUE, 1, 2, 1);

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Azul City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Azul','7300','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -36.328973, -59.136836, '1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Roca','1234',-36.326379,-59.129535,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Sarmiento','2367',-36.330747, -59.144565,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('25 de mayo','2367',-36.336719, -59.140793,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Rivadavia','3333',-36.326038,-59.146934,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Santamarina','222',-36.320578, -59.132780,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Mitre','44',-36.319076, -59.124566,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('11 de septiembre','9867',-36.323171,-59.124052,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Gardel','354',-36.331102,-59.117560,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Larrea','235',-36.334576,-59.111573,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Libertad','345', 36.338971,-59.130542, '1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Estrada','1234',-36.340663,-59.147497,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Payro','2367',-36.331355,-59.149446,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Monsenior','2367',-36.327410,-59.151430,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('San Lorenzo','3333',-36.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Las heras','222',-36.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Garibaldi','44',-36.318680,-59.131807,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Montiel','9867',-36.325185,-59.121188,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Caseros','354',-36.325185,-59.121188,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Accari','235',-36.316510,-59.117674,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Viscali','345',-36.316639,-59.104034, '1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Darragueira','1234',-36.312243,-59.109276,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Chapalaf','2367',-36.311164,-59.092044,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('D A Maradona','10',-36.312455,-59.098565,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Pedersen','3333',36.313786,-59.093721,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Los nogales','222',-36.318892,-59.147917,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Garibaldi','44',-36.318680,-59.131807,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Los Pinos','9867',-36.316817,-59.089736,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Hudson','354',-36.320148,-59.092356,'1');
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('Yrigoyen','235',-36.323015,-59.090638,'1');

#Paths
INSERT INTO Paths (`distance`,`bidirectional`,`id_point_from`,`id_point_to`, `transport_id`)
VALUES (9,TRUE, 1, 2, 1);