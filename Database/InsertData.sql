USE navigator;

#Users
INSERT INTO Users (`name`,`last_name`,`identity_number`,`birthdate`)
VALUES ('Julian','Mastieri',41318117,'2008-7-04'),
 ('Magali','Boulanger',41318123,'2008-11-03'),
 ('Joshua','Acciarri',41318456,'2008-2-09');

#Transports
INSERT INTO Transports (`description`,`driver_id`)
VALUES ('Train','1'),
('Bus','2'),
('Subway','3'),
('Train','2'),
('Bus','3'),
('Subway','1'),
('Train','3');

#Countries
INSERT INTO Countries (`name`, `code`) 
VALUES ('Argentina', 54);

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Tandil City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Tandil','7000','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -37.328973, -59.136836, '1'),
('Roca','1234',-37.326379,-59.129535,'1'),
('Sarmiento','2367',-37.330747, -59.144565,'1'),
('25 de mayo','2367',-37.336719, -59.140793,'1'),
('Rivadavia','3333',-37.326038,-59.146934,'1'),
('Santamarina','222',-37.320578, -59.132780,'1'),
('Mitre','44',-37.319076, -59.124566,'1'),
('11 de septiembre','9867',-37.323171,-59.124052,'1'),
('Gardel','354',-37.331102,-59.117560,'1'),
('Larrea','235',-37.334576,-59.111573,'1'),
('Libertad','345', -37.338971,-59.130542, '1'),
('Estrada','1234',-37.340663,-59.147497,'1'),
('Payro','2367',-37.331355,-59.149446,'1'),
('Monsenior','2367',-37.327410,-59.151430,'1'),
('San Lorenzo','3333',-37.318892,-59.147917,'1'),
('Las heras','222',-37.318892,-59.147917,'1'),
('Garibaldi','44',-37.318680,-59.131807,'1'),
('Montiel','9867',-37.325185,-59.121188,'1'),
('Caseros','354',-37.325185,-59.121188,'1'),
('Accari','235',-37.316510,-59.117674,'1'),
('Viscali','345',-37.316639,-59.104034, '1'),
('Darragueira','1234',-37.312243,-59.109276,'1'),
('Chapalaf','2367',-37.311164,-59.092044,'1'),
('D A Maradona','10',-37.312455,-59.098565,'1'),
('Pedersen','3333',-37.313786,-59.093721,'1'),
('Los nogales','222',-37.318892,-59.147917,'1'),
('Garibaldi','44',-37.318680,-59.131807,'1'),
('Los Pinos','9867',-37.316817,-59.089736,'1'),
('Hudson','354',-37.320148,-59.092356,'1'),
('Yrigoyen','235',-37.323015,-59.090638,'1');

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Azul City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Azul','7300','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -36.328973, -59.136836, '2'),
('Roca','1234',-36.326379,-59.129535,'2'),
('Sarmiento','2367',-36.330747, -59.144565,'2'),
('25 de mayo','2367',-36.336719, -59.140793,'2'),
('Rivadavia','3333',-36.326038,-59.146934,'2'),
('Santamarina','222',-36.320578, -59.132780,'2'),
('Mitre','44',-36.319076, -59.124566,'2'),
('11 de septiembre','9867',-36.323171,-59.124052,'2'),
('Gardel','354',-36.331102,-59.117560,'2'),
('Larrea','235',-36.334576,-59.111573,'2'),
('Libertad','345', -36.338971,-59.130542, '2'),
('Estrada','1234',-36.340663,-59.147497,'2'),
('Payro','2367',-36.331355,-59.149446,'2'),
('Monsenior','2367',-36.327410,-59.151430,'2'),
('San Lorenzo','3333',-36.318892,-59.147917,'2'),
('Las heras','222',-36.318892,-59.147917,'2'),
('Garibaldi','44',-36.318680,-59.131807,'2'),
('Montiel','9867',-36.325185,-59.121188,'2'),
('Caseros','354',-36.325185,-59.121188,'2'),
('Accari','235',-36.316510,-59.117674,'2'),
('Viscali','345',-36.316639,-59.104034, '2'),
('Darragueira','1234',-36.312243,-59.109276,'2'),
('Chapalaf','2367',-36.311164,-59.092044,'2'),
('D A Maradona','10',-36.312455,-59.098565,'2'),
('Pedersen','3333',-36.313786,-59.093721,'2'),
('Los nogales','222',-36.318892,-59.147917,'2'),
('Garibaldi','44',-36.318680,-59.131807,'2'),
('Los Pinos','9867',-36.316817,-59.089736,'2'),
('Hudson','354',-36.320148,-59.092356,'2'),
('Yrigoyen','235',-36.323015,-59.090638,'2');

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Olavarria City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Olavarria','7400','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -35.328973, -59.136836, '3'),
('Roca','1234',-35.326379,-59.129535,'3'),
('Sarmiento','2367',-35.330747, -59.144565,'3'),
('25 de mayo','2367',-35.336719, -59.140793,'3'),
('Rivadavia','3333',-35.326038,-59.146934,'3'),
('Santamarina','222',-35.320578, -59.132780,'3'),
('Mitre','44',-35.319076, -59.124566,'3'),
('11 de septiembre','9867',-35.323171,-59.124052,'3'),
('Gardel','354',-35.331102,-59.117560,'3'),
('Larrea','235',-35.334576,-59.111573,'3'),
('Libertad','345', -35.338971,-59.130542, '3'),
('Estrada','1234',-35.340663,-59.147497,'3'),
('Payro','2367',-35.331355,-59.149446,'3'),
('Monsenior','2367',-35.327410,-59.151430,'3'),
('San Lorenzo','3333',-35.318892,-59.147917,'3'),
('Las heras','222',-35.318892,-59.147917,'3'),
('Garibaldi','44',-35.318680,-59.131807,'3'),
('Montiel','9867',-35.325185,-59.121188,'3'),
('Caseros','354',-35.325185,-59.121188,'3'),
('Accari','235',-35.316510,-59.117674,'3'),
('Viscali','345',-35.316639,-59.104034, '3'),
('Darragueira','1234',-35.312243,-59.109276,'3'),
('Chapalaf','2367',-35.311164,-59.092044,'3'),
('D A Maradona','10',-35.312455,-59.098565,'3'),
('Pedersen','3333',-35.313786,-59.093721,'3'),
('Los nogales','222',-35.318892,-59.147917,'3'),
('Garibaldi','44',-35.318680,-59.131807,'3'),
('Los Pinos','9867',-35.316817,-59.089736,'3'),
('Hudson','354',-35.320148,-59.092356,'3'),
('Yrigoyen','235',-35.323015,-59.090638,'3');

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Rauch City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Rauch','7203','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -34.328973, -59.136836, '4'),
('Roca','1234',-34.326379,-59.129535,'4'),
('Sarmiento','2367',-34.330747, -59.144565,'4'),
('25 de mayo','2367',-34.336719, -59.140793,'4'),
('Rivadavia','3333',-34.326038,-59.146934,'4'),
('Santamarina','222',-34.320578, -59.132780,'4'),
('Mitre','44',-34.319076, -59.124566,'4'),
('11 de septiembre','9867',-34.323171,-59.124052,'4'),
('Gardel','354',-34.331102,-59.117560,'4'),
('Larrea','235',-34.334576,-59.111573,'4'),
('Libertad','345', -34.338971,-59.130542, '4'),
('Estrada','1234',-34.340663,-59.147497,'4'),
('Payro','2367',-34.331355,-59.149446,'4'),
('Monsenior','2367',-34.327410,-59.151430,'4'),
('San Lorenzo','3333',-34.318892,-59.147917,'4'),
('Las heras','222',-34.318892,-59.147917,'4'),
('Garibaldi','44',-34.318680,-59.131807,'4'),
('Montiel','9867',-34.325185,-59.121188,'4'),
('Caseros','354',-34.325185,-59.121188,'4'),
('Accari','235',-34.316510,-59.117674,'4'),
('Viscali','345',-34.316639,-59.104034, '4'),
('Darragueira','1234',-34.312243,-59.109276,'4'),
('Chapalaf','2367',-34.311164,-59.092044,'4'),
('D A Maradona','10',-34.312455,-59.098565,'4'),
('Pedersen','3333',-34.313786,-59.093721,'4'),
('Los nogales','222',-34.318892,-59.147917,'4'),
('Garibaldi','44',-34.318680,-59.131807,'4'),
('Los Pinos','9867',-34.316817,-59.089736,'4'),
('Hudson','354',-34.320148,-59.092356,'4'),
('Yrigoyen','235',-34.323015,-59.090638,'4');

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Cachari City
INSERT INTO Cities (`name`,`postal_code`,`country_id`)
VALUES ('Cachari','7203','1');

#Points
INSERT INTO Points (`street`,`number`,`latitude`,`longitude`,`city_id`)
VALUES ('9 de Julio','345', -33.328973, -59.136836, '5'),
('Roca','1234',-33.326379,-59.129535,'5'),
('Sarmiento','2367',-33.330747, -59.144565,'5'),
('25 de mayo','2367',-33.336719, -59.140793,'5'),
('Rivadavia','3333',-33.326038,-59.146934,'5'),
('Santamarina','222',-33.320578, -59.132780,'5'),
('Mitre','44',-33.319076, -59.124566,'5'),
('11 de septiembre','9867',-33.323171,-59.124052,'5'),
('Gardel','354',-33.331102,-59.117560,'5'),
('Larrea','235',-33.334576,-59.111573,'5'),
('Libertad','345', -33.338971,-59.130542, '5'),
('Estrada','1234',-33.340663,-59.147497,'5'),
('Payro','2367',-33.331355,-59.149446,'5'),
('Monsenior','2367',-33.327410,-59.151430,'5'),
('San Lorenzo','3333',-33.318892,-59.147917,'5'),
('Las heras','222',-33.318892,-59.147917,'5'),
('Garibaldi','44',-33.318680,-59.131807,'5'),
('Montiel','9867',-33.325185,-59.121188,'5'),
('Caseros','354',-33.325185,-59.121188,'5'),
('Accari','235',-33.316510,-59.117674,'5'),
('Viscali','345',-33.316639,-59.104034, '5'),
('Darragueira','1234',-33.312243,-59.109276,'5'),
('Chapalaf','2367',-33.311164,-59.092044,'5'),
('D A Maradona','10',-33.312455,-59.098565,'5'),
('Pedersen','3333',-33.313786,-59.093721,'5'),
('Los nogales','222',-33.318892,-59.147917,'5'),
('Garibaldi','44',-33.318680,-59.131807,'5'),
('Los Pinos','9867',-33.316817,-59.089736,'5'),
('Hudson','354',-33.320148,-59.092356,'5'),
('Yrigoyen','235',-33.323015,-59.090638,'5');

#---------------------------------------------------------------------------------------------------------------------------------------------------------
#All Paths
INSERT INTO Paths (`distance`,`bidirectional`,`id_point_from`,`id_point_to`, `transport_id`)
VALUES (9,FALSE, 1, 2, 1),
(4,FALSE, 1, 3, 1),
(4,FALSE, 1, 4, 2),
(5,FALSE, 1, 27, 3),
(13,FALSE, 2, 16, 4),
(21,FALSE, 2, 22, 5),
(7,FALSE, 2, 26, 1),
(14,FALSE, 3, 22, 1),
(8,FALSE, 3, 26, 3),
(1,FALSE, 3, 5, 5),
(9,FALSE, 3, 14, 1),
(10,FALSE, 4, 6, 1),
(11,FALSE, 4, 28, 1),
(16,FALSE, 5, 26, 1),
(12,FALSE, 5, 20, 1),
(13,FALSE, 5, 16, 1),
(5,FALSE, 6, 20, 1),
(7,FALSE, 6, 18, 1),
(13,FALSE, 7, 12, 1),
(10,FALSE, 7, 10, 1),
(11,FALSE, 7, 21, 1),
(5,FALSE, 8, 22, 1),
(3,FALSE, 8, 23, 1),
(2,FALSE, 8, 9, 1),
(5,FALSE, 9, 22, 1),
(7,FALSE, 9, 16, 1),
(8,FALSE, 9, 11, 1),
(10,FALSE, 9, 19, 1),
(21,FALSE, 10, 29, 1),
(2,FALSE, 10, 25, 1),
(3,FALSE, 10, 11, 1),
(4,FALSE, 11, 12, 1),
(17,FALSE, 11, 30, 1),
(15,FALSE, 11, 29, 1),
(14,FALSE, 12, 13, 1),
(9,FALSE, 12, 23, 1),
(7,FALSE, 13, 17, 1),
(4,FALSE, 13, 19, 1),
(13,FALSE, 13, 29, 1),
(1,FALSE, 14, 19, 1),
(13,FALSE, 14, 21, 1),
(3,FALSE, 14, 28, 1),
(9,FALSE, 15, 21, 1),
(2,FALSE, 15, 25, 1),
(1,FALSE, 15, 19, 6),
(14,FALSE, 16, 22, 2),
(5,FALSE, 17, 24, 3),
(8,FALSE, 17, 25, 4),
(13,FALSE, 17, 29, 5),
(14,FALSE, 18, 20, 6),
(14,FALSE, 18, 20, 6),
(6,FALSE, 19, 20, 7),
(9,FALSE, 19, 22, 4),
(2,FALSE, 20, 21, 2),
(16,FALSE, 23, 30, 7),
(3,FALSE, 24, 30, 6),
(5,FALSE, 24, 29, 7),
(9,FALSE, 29, 30, 7),

(4,FALSE, 31, 33, 1),
(4,FALSE, 31, 34, 2),
(5,FALSE, 31, 57, 1),
(13,FALSE, 32, 46, 3),
(21,FALSE, 32, 52, 4),
(7,FALSE, 32, 56, 2),
(14,FALSE, 33, 52, 6),
(8,FALSE, 33, 56, 5),
(1,FALSE, 33, 35, 6),
(9,FALSE, 33, 44, 7),
(10,FALSE, 34, 36, 4),
(11,FALSE, 34, 58, 2),
(16,FALSE, 35, 56, 1),
(12,FALSE, 35, 50, 4),
(13,FALSE, 35, 46, 3),
(5,FALSE, 36, 50, 5),
(7,FALSE, 36, 48, 4),
(13,FALSE, 37, 42, 3),
(10,FALSE, 37, 40, 2),
(11,FALSE, 37, 51, 1),
(5,FALSE, 38, 52, 1),
(3,FALSE, 38, 53, 4),
(2,FALSE, 38, 39, 6),
(5,FALSE, 39, 52, 7),
(7,FALSE, 39, 46, 5),
(8,FALSE, 39, 41, 4),
(10,FALSE, 39, 49, 3),
(21,FALSE, 40, 59, 3),
(2,FALSE, 40, 55, 2),
(3,FALSE, 40, 41, 1),
(4,FALSE, 41, 42, 2),
(17,FALSE, 41, 60, 5),
(15,FALSE, 41, 59, 6),
(14,FALSE, 42, 43, 7),
(9,FALSE, 42, 53, 3),
(7,FALSE, 43, 47, 4),
(4,FALSE, 43, 49, 1),
(13,FALSE, 43, 59, 1),
(1,FALSE, 44, 49, 2),
(13,FALSE, 44, 51, 2),
(3,FALSE, 44, 58, 2),
(9,FALSE, 45, 51, 6),
(2,FALSE, 45, 55, 1),
(1,FALSE, 45, 49, 3),
(14,FALSE, 46, 52, 1),
(5,FALSE, 47, 54, 4),
(8,FALSE, 47, 55, 5),
(13,FALSE, 47, 59, 6),
(14,FALSE, 48, 50, 7),
(6,FALSE, 49, 50, 2),
(9,FALSE, 49, 52, 4),
(2,FALSE, 50, 51, 1),
(16,FALSE, 53, 60, 3),
(3,FALSE, 54, 60, 1),
(5,FALSE, 54, 59, 5),
(9,FALSE, 59, 60, 6),

(21,FALSE, 44, 1, 1),
(33,FALSE, 4, 51, 1),
(43,FALSE, 44, 8, 1),
(29,FALSE, 5, 51, 1),
(22,FALSE, 45, 5, 1),

(4,FALSE, 3, 1, 1),
(4,FALSE, 4, 1, 2),
(5,FALSE, 27, 1, 3),
(13,FALSE, 16, 2, 4),
(21,FALSE, 22, 2, 5),
(7,FALSE, 26, 2, 1),
(14,FALSE, 22, 3, 1),
(8,FALSE, 26, 3, 3),
(1,FALSE, 5, 3, 5),
(9,FALSE, 14, 3, 1),
(10,FALSE, 6, 4, 1),
(11,FALSE, 28, 4, 1),
(16,FALSE, 26, 5, 1),
(12,FALSE, 20, 5, 1),
(13,FALSE, 16, 5, 1),
(5,FALSE, 20, 6, 1),
(7,FALSE, 18, 6, 1),
(13,FALSE, 12, 7, 1),
(10,FALSE, 10, 7, 1),
(11,FALSE, 21, 7, 1),
(5,FALSE, 22, 8, 1),
(3,FALSE, 23, 8, 1),
(2,FALSE, 9, 8, 1),
(5,FALSE, 22, 9, 1),
(7,FALSE, 16, 9, 1),
(8,FALSE, 11, 9, 1),
(10,FALSE, 19, 9, 1),
(21,FALSE, 29, 10, 1),
(2,FALSE, 25, 10, 1),
(3,FALSE, 11, 10, 1),
(4,FALSE, 12, 11, 1),
(17,FALSE, 30, 11, 1),
(15,FALSE, 29, 11, 1),
(14,FALSE, 13, 12, 1),
(9,FALSE, 23, 12, 1),
(7,FALSE, 17, 13, 1),
(4,FALSE, 19, 13, 1),
(13,FALSE, 29, 13, 1),
(1,FALSE, 19, 14, 1),
(13,FALSE, 21, 14, 1),
(3,FALSE, 28, 14, 1),
(9,FALSE, 21, 15, 1),
(2,FALSE, 25, 15, 1),
(1,FALSE, 19, 15, 6),
(14,FALSE, 22, 16, 2),
(5,FALSE, 24, 17, 3),
(8,FALSE, 25, 17, 4),
(13,FALSE, 29, 17, 5),
(14,FALSE, 20, 18, 6),
(6,FALSE, 20, 19, 7),
(9,FALSE, 22, 19, 4),
(2,FALSE, 21, 20, 2),
(16,FALSE, 30, 23, 7),
(3,FALSE, 30, 24, 6),
(5,FALSE, 29, 24, 7),
(9,FALSE, 30, 29, 7),

(4,FALSE, 33, 31, 1),
(4,FALSE, 34, 31, 2),
(5,FALSE, 57, 31, 1),
(13,FALSE, 46, 32, 3),
(21,FALSE, 52, 32, 4),
(7,FALSE, 56, 32, 2),
(14,FALSE, 52, 33, 6),
(8,FALSE, 56, 33, 5),
(1,FALSE, 35, 33, 6),
(9,FALSE, 44, 33, 7),
(10,FALSE, 36, 34, 4),
(11,FALSE, 58, 34, 2),
(16,FALSE, 56, 34, 1),
(12,FALSE, 50, 35, 4),
(13,FALSE, 46, 35, 3),
(5,FALSE, 50, 36, 5),
(7,FALSE, 48, 36, 4),
(13,FALSE, 42, 37, 3),
(10,FALSE, 40, 37, 2),
(11,FALSE, 51, 37, 1),
(5,FALSE, 52, 38, 1),
(3,FALSE, 53, 38, 4),
(2,FALSE, 39, 38, 6),
(5,FALSE, 52, 39, 7),
(7,FALSE, 46, 39, 5),
(8,FALSE, 41, 39, 4),
(10,FALSE, 49, 39, 3),
(21,FALSE, 59, 40, 3),
(2,FALSE, 55, 40, 2),
(3,FALSE, 41, 40, 1),
(4,FALSE, 42, 41, 2),
(17,FALSE, 60, 41, 5),
(15,FALSE, 59, 41, 6),
(14,FALSE, 43, 42, 7),
(9,FALSE, 53, 42, 3),
(7,FALSE, 47, 43, 4),
(4,FALSE, 49, 43, 1),
(13,FALSE, 59, 43, 1),
(1,FALSE, 49, 44, 2),
(13,FALSE, 51, 44, 2),
(3,FALSE, 58, 44, 2),
(9,FALSE, 51, 45, 6),
(2,FALSE, 55, 45, 1),
(1,FALSE, 49, 45, 3),
(14,FALSE, 52, 46, 1),
(5,FALSE, 54, 47, 4),
(13,FALSE, 59, 47, 6),
(14,FALSE, 50, 48, 7),
(6,FALSE, 50, 49, 2),
(9,FALSE, 52, 49, 4),
(2,FALSE, 51, 52, 1),
(16,FALSE, 60, 53, 3),
(3,FALSE, 60, 54, 1),
(5,FALSE, 59, 54, 5),
(9,FALSE, 60, 59, 6),

(21,FALSE, 1,44, 1),
(33,FALSE, 51, 4, 1),
(43,FALSE, 8, 44, 1),
(29,FALSE, 51, 5, 1),
(22,FALSE, 5, 45, 1),

(4,FALSE, 61, 63, 1),
(4,FALSE, 61, 64, 2),
(5,FALSE, 61, 87, 1),
(13,FALSE, 62, 76, 3),
(21,FALSE, 62, 82, 4),
(7,FALSE, 62, 86, 2),
(14,FALSE, 63, 82, 6),
(8,FALSE, 63, 86, 5),
(1,FALSE, 63, 65, 6),
(9,FALSE, 63, 74, 7),
(10,FALSE, 64, 66, 4),
(11,FALSE, 64, 88, 2),
(16,FALSE, 65, 86, 1),
(12,FALSE, 65, 80, 4),
(13,FALSE, 65, 76, 3),
(5,FALSE, 66, 80, 5),
(7,FALSE, 76, 78, 4),
(13,FALSE, 67, 72, 3),
(10,FALSE, 67, 70, 2),
(11,FALSE, 67, 81, 1),
(5,FALSE, 68, 82, 1),
(3,FALSE, 68, 83, 4),
(2,FALSE, 68, 69, 6),
(5,FALSE, 69, 82, 7),
(7,FALSE, 69, 76, 5),
(8,FALSE, 69, 71, 4),
(10,FALSE, 69, 79, 3),
(21,FALSE, 70, 89, 3),
(2,FALSE, 70, 85, 2),
(3,FALSE, 70, 71, 1),
(4,FALSE, 71, 72, 2),
(17,FALSE, 71, 90, 5),
(15,FALSE, 71, 89, 6),
(14,FALSE, 72, 73, 7),
(9,FALSE, 72, 83, 3),
(7,FALSE, 73, 77, 4),
(4,FALSE, 73, 79, 1),
(13,FALSE, 73, 89, 1),
(1,FALSE, 74, 79, 2),
(13,FALSE, 74, 81, 2),
(3,FALSE, 74, 88, 2),
(9,FALSE, 75, 81, 6),
(2,FALSE, 75, 85, 1),
(1,FALSE, 75, 79, 3),
(14,FALSE, 76, 82, 1),
(5,FALSE, 77, 84, 4),
(8,FALSE, 77, 85, 5),
(13,FALSE, 77, 89, 6),
(14,FALSE, 78, 80, 7),
(6,FALSE, 79, 80, 2),
(9,FALSE, 79, 82, 4),
(2,FALSE, 80, 81, 1),
(16,FALSE, 83, 90, 3),
(3,FALSE, 84, 90, 1),
(5,FALSE, 84, 89, 5),
(9,FALSE, 89, 90, 6),

(4,FALSE, 63, 61, 1),
(4,FALSE, 64, 61, 2),
(5,FALSE, 87, 61, 1),
(13,FALSE, 76, 62, 3),
(21,FALSE, 82, 62, 4),
(7,FALSE, 86, 62, 2),
(14,FALSE, 82, 63, 6),
(8,FALSE, 86, 63, 5),
(1,FALSE, 65, 63, 6),
(9,FALSE, 74, 63, 7),
(10,FALSE, 66, 64, 4),
(11,FALSE, 88, 64, 2),
(16,FALSE, 86, 65, 1),
(12,FALSE, 80, 65, 4),
(13,FALSE, 76, 65, 3),
(5,FALSE, 76, 66, 5),
(7,FALSE, 78, 76, 4),
(13,FALSE, 78, 67, 3),
(10,FALSE, 70, 68, 2),
(11,FALSE, 81, 67, 1),
(5,FALSE, 82, 67, 1),
(3,FALSE, 83, 68, 4),
(2,FALSE, 69, 68, 6),
(5,FALSE, 82, 69, 7),
(7,FALSE, 76, 69, 5),
(8,FALSE, 71, 69, 4),
(10,FALSE, 79, 69, 3),
(21,FALSE, 89, 70, 3),
(2,FALSE, 85, 70, 2),
(3,FALSE, 71, 70, 1),
(4,FALSE, 72, 71, 2),
(17,FALSE, 90, 71, 5),
(15,FALSE, 89, 71, 6),
(14,FALSE, 73, 72, 7),
(9,FALSE, 83, 72, 3),
(7,FALSE, 77, 73, 4),
(4,FALSE, 79, 73, 1),
(13,FALSE, 89, 73, 1),
(1,FALSE, 79, 74, 2),
(13,FALSE, 81, 74, 2),
(3,FALSE, 88, 74, 2),
(9,FALSE, 81, 75, 6),
(2,FALSE, 85, 75, 1),
(1,FALSE, 79, 75, 3),
(14,FALSE, 82, 76, 1),
(5,FALSE, 84, 77, 4),
(8,FALSE, 85, 77, 5),
(13,FALSE, 89, 77, 6),
(14,FALSE, 80, 78, 7),
(6,FALSE, 80, 79, 2),
(9,FALSE, 82, 79, 4),
(2,FALSE, 81, 80, 1),
(16,FALSE, 90, 83, 3),
(3,FALSE, 90, 84, 1),
(5,FALSE, 89, 84, 5),
(9,FALSE, 90, 89, 6),

(6,FALSE, 8, 79, 1),
(9,FALSE, 82, 9, 1),
(2,FALSE, 81, 30, 1),
(16,FALSE, 9, 33, 1),
(3,FALSE, 90, 14, 1),
(5,FALSE, 19, 84, 1),
(9,FALSE, 50, 89, 1),

(6,FALSE, 79, 8, 1),
(9,FALSE, 9, 82, 1),
(2,FALSE, 30, 81, 1),
(16,FALSE, 33, 9, 1),
(3,FALSE, 14, 90, 1),
(5,FALSE, 84, 19, 1),
(9,FALSE, 89, 50, 1),


(4,FALSE, 91, 93, 1),
(4,FALSE, 91, 94, 2),
(5,FALSE, 91, 117, 1),
(13,FALSE, 92, 106, 3),
(21,FALSE, 92, 112, 4),
(7,FALSE, 92, 116, 2),
(14,FALSE, 93, 112, 6),
(8,FALSE, 93, 116, 5),
(1,FALSE, 93, 95, 6),
(9,FALSE, 93, 104, 7),
(10,FALSE, 94, 96, 4),
(11,FALSE, 94, 118, 2),
(16,FALSE, 95, 116, 1),
(12,FALSE, 95, 110, 4),
(13,FALSE, 95, 106, 3),
(5,FALSE, 96, 110, 5),
(7,FALSE, 106, 78, 4),
(13,FALSE, 97, 102, 3),
(10,FALSE, 97, 130, 2),
(11,FALSE, 97, 111, 1),
(5,FALSE, 98, 112, 1),
(3,FALSE, 98, 113, 4),
(2,FALSE, 98, 99, 6),
(5,FALSE, 99, 112, 7),
(7,FALSE, 99, 106, 5),
(8,FALSE, 99, 101, 4),
(10,FALSE, 99, 109, 3),
(21,FALSE, 130, 119, 3),
(2,FALSE, 130, 115, 2),
(3,FALSE, 130, 101, 1),
(4,FALSE, 101, 102, 2),
(17,FALSE, 101, 90, 5),
(15,FALSE, 101, 119, 6),
(14,FALSE, 102, 103, 7),
(9,FALSE, 102, 113, 3),
(7,FALSE, 103, 107, 4),
(4,FALSE, 103, 109, 1),
(13,FALSE, 103, 119, 1),
(1,FALSE, 104, 109, 2),
(13,FALSE, 104, 111, 2),
(3,FALSE, 104, 118, 2),
(9,FALSE, 105, 111, 6),
(2,FALSE, 105, 115, 1),
(1,FALSE, 105, 109, 3),
(14,FALSE, 106, 112, 1),
(5,FALSE, 107, 114, 4),
(8,FALSE, 107, 115, 5),
(13,FALSE, 107, 119, 6),
(14,FALSE, 108, 110, 7),
(6,FALSE, 109, 110, 2),
(9,FALSE, 109, 112, 4),
(2,FALSE, 110, 111, 1),
(16,FALSE, 113, 90, 3),
(3,FALSE, 114, 90, 1),
(5,FALSE, 114, 119, 5),
(9,FALSE, 119, 90, 6),

(4,FALSE, 93, 91, 1),
(4,FALSE, 94, 91, 2),
(5,FALSE, 117, 91, 1),
(13,FALSE, 106, 92, 3),
(21,FALSE, 112, 92, 4),
(7,FALSE, 116, 92, 2),
(14,FALSE, 112, 93, 6),
(8,FALSE, 116, 93, 5),
(1,FALSE, 95, 93, 6),
(9,FALSE, 104, 93, 7),
(10,FALSE, 96, 94, 4),
(11,FALSE, 118, 94, 2),
(16,FALSE, 116, 95, 1),
(12,FALSE, 110, 95, 4),
(13,FALSE, 106, 95, 3),
(5,FALSE, 106, 96, 5),
(7,FALSE, 108, 106, 4),
(13,FALSE, 108, 97, 3),
(10,FALSE, 130, 98, 2),
(11,FALSE, 111, 97, 1),
(5,FALSE, 112, 97, 1),
(3,FALSE, 113, 98, 4),
(2,FALSE, 99, 128, 6),
(5,FALSE, 112, 99, 7),
(7,FALSE, 106, 99, 5),
(8,FALSE, 101, 99, 4),
(10,FALSE, 109, 99, 3),
(21,FALSE, 119, 100, 3),
(2,FALSE, 115, 100, 2),
(3,FALSE, 101, 100, 1),
(4,FALSE, 102, 101, 2),
(17,FALSE, 90, 101, 5),
(15,FALSE, 119, 101, 6),
(14,FALSE, 103, 102, 7),
(9,FALSE, 113, 102, 3),
(7,FALSE, 107, 103, 4),
(4,FALSE, 109, 103, 1),
(13,FALSE, 119, 103, 1),
(1,FALSE, 109, 104, 2),
(13,FALSE, 111, 104, 2),
(3,FALSE, 118, 104, 2),
(9,FALSE, 111, 105, 6),
(2,FALSE, 115, 105, 1),
(1,FALSE, 109, 105, 3),
(14,FALSE, 112, 106, 1),
(5,FALSE, 114, 107, 4),
(8,FALSE, 115, 107, 5),
(13,FALSE, 119, 107, 6),
(14,FALSE, 110, 108, 7),
(6,FALSE, 110, 109, 2),
(9,FALSE, 112, 109, 4),
(2,FALSE, 111, 110, 1),
(16,FALSE, 90, 113, 3),
(3,FALSE, 90, 114, 1),
(5,FALSE, 119, 114, 5),
(9,FALSE, 90, 119, 6),

(6,FALSE, 11, 109, 1),
(9,FALSE, 112, 19, 1),
(2,FALSE, 111, 60, 1),
(16,FALSE, 80, 113, 1),
(3,FALSE, 90, 58, 1),
(5,FALSE, 119, 45, 1),
(9,FALSE, 90, 11, 1),


(6,FALSE, 109, 11, 1),
(9,FALSE, 19, 112, 1),
(2,FALSE, 60, 111, 1),
(16,FALSE, 113, 80, 1),
(3,FALSE, 58, 90, 1),
(5,FALSE, 45, 119, 1),
(9,FALSE, 11, 90, 6),
(4,FALSE, 121, 123, 1),
(4,FALSE, 121, 124, 2),
(5,FALSE, 121, 147, 1),
(13,FALSE, 122, 136, 3),
(21,FALSE, 122, 142, 4),
(7,FALSE, 122, 146, 2),
(14,FALSE, 123, 142, 6),
(8,FALSE, 123, 146, 5),
(1,FALSE, 123, 125, 6),
(9,FALSE, 123, 134, 7),
(10,FALSE, 124, 126, 4),
(11,FALSE, 124, 148, 2),
(16,FALSE, 125, 146, 1),
(12,FALSE, 125, 140, 4),
(13,FALSE, 125, 136, 3),
(5,FALSE, 126, 140, 5),
(7,FALSE, 136, 78, 4),
(13,FALSE, 127, 132, 3),
(10,FALSE, 127, 130, 2),
(11,FALSE, 127, 141, 1),
(5,FALSE, 128, 142, 1),
(3,FALSE, 128, 143, 4),
(2,FALSE, 128, 129, 6),
(5,FALSE, 129, 142, 7),
(7,FALSE, 129, 136, 5),
(8,FALSE, 129, 131, 4),
(10,FALSE, 129, 139, 3),
(21,FALSE, 130, 149, 3),
(2,FALSE, 130, 145, 2),
(3,FALSE, 130, 131, 1),
(4,FALSE, 131, 132, 2),
(17,FALSE, 131, 120, 5),
(15,FALSE, 131, 149, 6),
(14,FALSE, 132, 133, 7),
(9,FALSE, 132, 143, 3),
(7,FALSE, 133, 137, 4),
(4,FALSE, 133, 139, 1),
(13,FALSE, 133, 149, 1),
(1,FALSE, 134, 139, 2),
(13,FALSE, 134, 141, 2),
(3,FALSE, 134, 148, 2),
(9,FALSE, 105, 141, 6),
(2,FALSE, 105, 145, 1),
(1,FALSE, 105, 139, 3),
(14,FALSE, 136, 142, 1),
(5,FALSE, 137, 144, 4),
(8,FALSE, 137, 145, 5),
(13,FALSE, 137, 149, 6),
(14,FALSE, 138, 140, 7),
(6,FALSE, 139, 140, 2),
(9,FALSE, 139, 142, 4),
(2,FALSE, 140, 141, 1),
(16,FALSE, 143, 120, 3),
(3,FALSE, 144, 120, 1),
(5,FALSE, 144, 149, 5),
(9,FALSE, 149, 120, 6),

(4,FALSE, 123, 121, 1),
(4,FALSE, 124, 121, 2),
(5,FALSE, 147, 121, 1),
(13,FALSE, 136, 122, 3),
(21,FALSE, 142, 122, 4),
(7,FALSE, 146, 122, 2),
(14,FALSE, 142, 123, 6),
(8,FALSE, 146, 123, 5),
(1,FALSE, 125, 123, 6),
(9,FALSE, 134, 123, 7),
(10,FALSE, 126, 124, 4),
(11,FALSE, 148, 124, 2),
(16,FALSE, 146, 125, 1),
(12,FALSE, 140, 125, 4),
(13,FALSE, 136, 125, 3),
(5,FALSE, 136, 126, 5),
(7,FALSE, 138, 136, 4),
(13,FALSE, 138, 127, 3),
(10,FALSE, 130, 128, 2),
(11,FALSE, 141, 127, 1),
(5,FALSE, 142, 127, 1),
(3,FALSE, 143, 128, 4),
(2,FALSE, 129, 128, 6),
(5,FALSE, 142, 129, 7),
(7,FALSE, 136, 129, 5),
(8,FALSE, 131, 129, 4),
(10,FALSE, 139, 129, 3),
(21,FALSE, 149, 130, 3),
(2,FALSE, 145, 130, 2),
(3,FALSE, 131, 130, 1),
(4,FALSE, 132, 131, 2),
(17,FALSE, 120, 131, 5),
(15,FALSE, 149, 131, 6),
(14,FALSE, 133, 132, 7),
(9,FALSE, 143, 132, 3),
(7,FALSE, 137, 133, 4),
(4,FALSE, 139, 133, 1),
(13,FALSE, 149, 133, 1),
(1,FALSE, 139, 134, 2),
(13,FALSE, 141, 134, 2),
(3,FALSE, 148, 134, 2),
(9,FALSE, 141, 105, 6),
(2,FALSE, 145, 105, 1),
(1,FALSE, 139, 105, 3),
(14,FALSE, 142, 136, 1),
(5,FALSE, 144, 137, 4),
(8,FALSE, 145, 137, 5),
(13,FALSE, 149, 137, 6),
(14,FALSE, 140, 138, 7),
(6,FALSE, 140, 139, 2),
(9,FALSE, 142, 139, 4),
(2,FALSE, 141, 140, 1),
(16,FALSE, 120, 143, 3),
(3,FALSE, 120, 144, 1),
(5,FALSE, 149, 144, 5),
(9,FALSE, 120, 149, 6),

(6,FALSE, 11, 139, 1),
(9,FALSE, 142, 19, 1),
(2,FALSE, 141, 60, 1),
(16,FALSE, 80, 143, 1),
(3,FALSE, 120, 58, 1),
(5,FALSE, 149, 45, 1),
(9,FALSE, 120, 11, 1),


(6,FALSE, 139, 11, 1),
(9,FALSE, 19, 142, 1),
(2,FALSE, 60, 141, 1),
(16,FALSE, 143, 80, 1),
(3,FALSE, 58, 120, 1),
(5,FALSE, 45, 149, 1),
(9,FALSE, 11, 120, 1);