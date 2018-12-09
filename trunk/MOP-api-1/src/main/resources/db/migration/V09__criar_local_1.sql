CREATE TABLE d03_local1_m(
	d03_cdlocal1 BIGINT(20) AUTO_INCREMENT,
	d03_cdempresa BIGINT(20),
	d03_nmlocal1 VARCHAR(200),

PRIMARY KEY(d03_cdlocal1,d03_cdempresa),
FOREIGN KEY(d03_cdempresa) REFERENCES d24_empresa(d24_cdempresa)
);

INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Floresta em opera��o de derruba');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Floresta em opera��o de arraste');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'P�tio em opera��o');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'P�tio transportado');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Infra-estrutura');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Monitoramento');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Acampamento');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Escrit�rio (pr�-campo)');
INSERT INTO d03_local1_m (d03_cdempresa, d03_nmlocal1) VALUES('1', 'Entornos AMF');
