INSERT INTO usuario (correo, nombreusuario, rol, contrasenia)
VALUES ('dummy@dummy.com', 'dummy', 0, 'dummy');

INSERT INTO tema (nombretema, r, g, b, correo)
VALUES ('dummytema', 0, 0, 0, 'dummy@dummy.com');

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('St. Petersburg', 59.89, 30.26, 1);

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('Moscow', 55.75, 37.61, 1);

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('Krasnodar', 45.03, 38.98, 1);
