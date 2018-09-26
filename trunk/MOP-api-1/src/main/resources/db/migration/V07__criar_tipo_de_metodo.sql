CREATE TABLE d07_tipo_metodo_m(
	d07_cdtipometodo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	d07_cdempresa BIGINT(20),
	d07_nmtipometodo VARCHAR(200),

FOREIGN KEY(d07_cdempresa) REFERENCES d24_empresa(d24_cdempresa)
);

INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'An�lise de mapas e/ou documenta��o no campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'An�lise de mapas e/ou documenta��o no escrit�rio');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Entrevistas com funcion�rios');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Medi��o em campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Medi��o no acampamento');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Observa��o em campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Observa��o no acampamento');


