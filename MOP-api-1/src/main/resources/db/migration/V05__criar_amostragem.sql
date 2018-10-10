CREATE TABLE d06_amostragem_m(
	d06_cdamostragem BIGINT(20) AUTO_INCREMENT,
	d06_cdempresa BIGINT(20),
	d06_nmamostragem VARCHAR(200),

PRIMARY KEY (d06_cdamostragem, d06_cdempresa)
)Engine=InnoDB;

INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma checagem nos mapas e/ou documentos');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma medi��o no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Duas medi��es no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Tr�s medi��es no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Quatro ou mais medi��es no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma observa��o em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Duas observa��es em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Tr�s observa��es em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Quatro ou mais observa��es em campo');
