CREATE TABLE r17_verificador_template_m (
	r17_cdempresa BIGINT(20),
	r17_cdverificador BIGINT(20),
	r17_cdtipoverificador BIGINT(20),
	r17_cdtemplate BIGINT(20),
	r17_cdnivel1 BIGINT(20),
	r17_cdnivel2 BIGINT(20),
	r17_cdnivel3 BIGINT(20),
	r17_cdnivel4 BIGINT(20),
	r17_lgdadosanaliticos BOOLEAN,
	r17_lgdadosagrupados BOOLEAN,
	r17_txcoletaanalitica VARCHAR(200),
	r17_txcoletaagrupada VARCHAR(200),

	PRIMARY KEY(r17_cdempresa,r17_cdverificador,r17_cdtipoverificador,r17_cdtemplate),

	FOREIGN KEY(r17_cdempresa,r17_cdnivel1,r17_cdnivel2,r17_cdnivel3,r17_cdnivel4) REFERENCES d13_nivel4_m(d13_cdempresa,d13_cdnivel1,d13_cdnivel2,d13_cdnivel3,d13_cdnivel4),
	FOREIGN KEY(r17_cdtemplate) REFERENCES d14_template(d14_cdtemplate),
	FOREIGN KEY(r17_cdempresa,r17_cdverificador,r17_cdtipoverificador) REFERENCES p01_verificador_m(p01_cdempresa,p01_cdverificador,p01_cdtipoverificador)
) Engine=InnoDB;
