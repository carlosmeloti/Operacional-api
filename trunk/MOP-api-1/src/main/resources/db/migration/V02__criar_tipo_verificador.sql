CREATE TABLE d02_tipo_verificador (
	d02_cdtipoverificador BIGINT(20) AUTO_INCREMENT,
	d02_nmtipoverificador VARCHAR(200),
	d02_nrniveis int(10),
	d02_rotulonivel1 VARCHAR(200),
	d02_rotulonivel2 VARCHAR(200),
	d02_rotulonivel3 VARCHAR(200),
	d02_rotulonivel4 VARCHAR(200),
	d02_rotulonivel5 VARCHAR(200),
	
	PRIMARY KEY (d02_cdtipoverificador)
)Engine=InnoDB;

INSERT INTO d02_tipo_verificador (d02_cdtipoverificador, d02_nmtipoverificador, d02_nrniveis, d02_rotulonivel1, d02_rotulonivel2, d02_rotulonivel3, d02_rotulonivel4, d02_rotulonivel5) VALUES ('1','Monitoramento Operacional','4','-','ETAPA','ITEM','SUBITEM','VERIFICADOR');
INSERT INTO d02_tipo_verificador (d02_cdtipoverificador, d02_nmtipoverificador, d02_nrniveis, d02_rotulonivel1, d02_rotulonivel2, d02_rotulonivel3, d02_rotulonivel4, d02_rotulonivel5) VALUES ('2','Avalia��o de impactos','4','-','-','ITEM','SUBITEM','VERIFICADOR');
INSERT INTO d02_tipo_verificador (d02_cdtipoverificador, d02_nmtipoverificador, d02_nrniveis, d02_rotulonivel1, d02_rotulonivel2, d02_rotulonivel3, d02_rotulonivel4, d02_rotulonivel5) VALUES ('3','Vistoria de PMFS','4','-','ETAPA','ITEM','SUBITEM','VERIFICADOR');
INSERT INTO d02_tipo_verificador (d02_cdtipoverificador, d02_nmtipoverificador, d02_nrniveis, d02_rotulonivel1, d02_rotulonivel2, d02_rotulonivel3, d02_rotulonivel4, d02_rotulonivel5) VALUES ('4','Certifica��o Florestal','4','-','ETAPA','ITEM','SUBITEM','VERIFICADOR');
INSERT INTO d02_tipo_verificador (d02_cdtipoverificador, d02_nmtipoverificador, d02_nrniveis, d02_rotulonivel1, d02_rotulonivel2, d02_rotulonivel3, d02_rotulonivel4, d02_rotulonivel5) VALUES ('5','Avalia��o de sustentabilidade (pesquisa)','4','ASSUNTO','ETAPA','ITEM','SUBITEM','VERIFICADOR');