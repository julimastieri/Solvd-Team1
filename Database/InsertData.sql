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
VALUES (9,TRUE, 1, 2, 1),
(4,TRUE, 1, 3, 1),
(4,TRUE, 1, 4, 2),
(5,TRUE, 1, 27, 3),
(13,TRUE, 2, 16, 4),
(21,TRUE, 2, 22, 5),
(7,TRUE, 2, 26, 1),
(14,TRUE, 3, 22, 1),
(8,TRUE, 3, 26, 3),
(1,TRUE, 3, 5, 5),
(9,TRUE, 3, 14, 1),
(10,TRUE, 4, 6, 1),
(11,TRUE, 4, 28, 1),
(16,TRUE, 5, 26, 1),
(12,TRUE, 5, 20, 1),
(13,TRUE, 5, 16, 1),
(5,TRUE, 6, 20, 1),
(7,TRUE, 6, 18, 1),
(13,TRUE, 7, 12, 1),
(10,TRUE, 7, 10, 1),
(11,TRUE, 7, 21, 1),
(5,TRUE, 8, 22, 1),
(3,TRUE, 8, 23, 1),
(2,TRUE, 8, 9, 1),
(5,TRUE, 9, 22, 1),
(7,TRUE, 9, 16, 1),
(8,TRUE, 9, 11, 1),
(10,TRUE, 9, 19, 1),
(21,TRUE, 10, 29, 1),
(2,TRUE, 10, 25, 1),
(3,TRUE, 10, 11, 1),
(4,TRUE, 11, 12, 1),
(17,TRUE, 11, 30, 1),
(15,TRUE, 11, 29, 1),
(14,TRUE, 12, 13, 1),
(9,TRUE, 12, 23, 1),
(7,TRUE, 13, 17, 1),
(4,TRUE, 13, 19, 1),
(13,TRUE, 13, 29, 1),
(1,TRUE, 14, 19, 1),
(13,TRUE, 14, 21, 1),
(3,TRUE, 14, 28, 1),
(9,TRUE, 15, 21, 1),
(2,TRUE, 15, 25, 1),
(1,TRUE, 15, 19, 6),
(14,TRUE, 16, 22, 2),
(5,TRUE, 17, 24, 3),
(8,TRUE, 17, 25, 4),
(13,TRUE, 17, 29, 5),
(14,TRUE, 18, 20, 6),
(6,TRUE, 19, 20, 8),
(9,TRUE, 19, 22, 4),
(2,TRUE, 20, 21, 2),
(16,TRUE, 23, 30, 7),
(3,TRUE, 24, 30, 6),
(5,TRUE, 24, 29, 7),
(9,TRUE, 29, 30, 7),

(4,TRUE, 31, 33, 1),
(4,TRUE, 31, 34, 2),
(5,TRUE, 31, 57, 1),
(13,TRUE, 32, 46, 3),
(21,TRUE, 32, 52, 4),
(7,TRUE, 32, 56, 2),
(14,TRUE, 33, 52, 6),
(8,TRUE, 33, 56, 5),
(1,TRUE, 33, 35, 6),
(9,TRUE, 33, 44, 7),
(10,TRUE, 34, 36, 4),
(11,TRUE, 34, 58, 2),
(16,TRUE, 35, 56, 1),
(12,TRUE, 35, 50, 4),
(13,TRUE, 35, 46, 3),
(5,TRUE, 36, 50, 5),
(7,TRUE, 36, 48, 4),
(13,TRUE, 37, 42, 3),
(10,TRUE, 37, 40, 2),
(11,TRUE, 37, 51, 1),
(5,TRUE, 38, 52, 1),
(3,TRUE, 38, 53, 4),
(2,TRUE, 38, 39, 6),
(5,TRUE, 39, 52, 7),
(7,TRUE, 39, 46, 5),
(8,TRUE, 39, 41, 4),
(10,TRUE, 39, 49, 3),
(21,TRUE, 40, 59, 3),
(2,TRUE, 40, 55, 2),
(3,TRUE, 40, 41, 1),
(4,TRUE, 41, 42, 2),
(17,TRUE, 41, 60, 5),
(15,TRUE, 41, 59, 6),
(14,TRUE, 42, 43, 7),
(9,TRUE, 42, 53, 3),
(7,TRUE, 43, 47, 4),
(4,TRUE, 43, 49, 1),
(13,TRUE, 43, 59, 1),
(1,TRUE, 44, 49, 2),
(13,TRUE, 44, 51, 2),
(3,TRUE, 44, 58, 2),
(9,TRUE, 45, 51, 6),
(2,TRUE, 45, 55, 1),
(1,TRUE, 45, 49, 3),
(14,TRUE, 46, 52, 1),
(5,TRUE, 47, 54, 4),
(8,TRUE, 47, 55, 5),
(13,TRUE, 47, 59, 6),
(14,TRUE, 48, 50, 7),
(6,TRUE, 49, 50, 2),
(9,TRUE, 49, 52, 4),
(2,TRUE, 50, 51, 1),
(16,TRUE, 53, 60, 3),
(3,TRUE, 54, 60, 1),
(5,TRUE, 54, 59, 5),
(9,TRUE, 59, 60, 6),

(21,TRUE, 44, 1, 2),
(33,TRUE, 4, 51, 2),
(43,TRUE, 44, 8, 2),
(29,TRUE, 5, 51, 6),
(22,TRUE, 45, 5, 1),
(31,TRUE, 45, 49, 3),
(14,TRUE, 46, 12, 1),
(35,TRUE, 4, 54, 4),
(38,TRUE, 47, 15, 5),
(13,TRUE, 47, 9, 6),
(14,TRUE, 48, 10, 7),
(56,TRUE, 19, 50, 2),
(29,TRUE, 19, 52, 4),
(12,TRUE, 50, 1, 1),
(16,TRUE, 3, 60, 3),
(23,TRUE, 4, 60, 1),
(25,TRUE, 54, 9, 5),
(39,TRUE, 9, 60, 6),
