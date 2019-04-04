INSERT INTO usuario (correo, nombreusuario, rol, contrasenia)
VALUES ('dummy@dummy.com', 'dummy', 1, 'dummy');

INSERT INTO tema (nombretema, color, correo)
VALUES ('dummytema', 'azul', 'dummy@dummy.com');

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('St. Petersburg', 59.89, 30.26, 1);

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('Moscow', 55.75, 37.61, 1);

INSERT INTO marcador (descripcion, latitud, longitud, idtema)
VALUES ('Krasnodar', 45.03, 38.98, 1);
