CREATE TABLE d11_nivel2_m(
	d11_cdempresa BIGINT(20),
	d11_cdnivel1 BIGINT(20),
	d11_cdnivel2 BIGINT(20),
	d11_nmnivel2 VARCHAR(200),



PRIMARY KEY (d11_cdempresa,d11_cdnivel1,d11_cdnivel2),
FOREIGN KEY(d11_cdempresa, d11_cdnivel1) REFERENCES d10_nivel1_m(d10_cdempresa, d10_cdnivel1)

) Engine=InnoDB;

INSERT INTO d11_nivel2_m (d11_cdempresa, d11_cdnivel1, d11_cdnivel2, d11_nmnivel2) VALUES ('1','1','1','PRÉ EXPLORATÓRIA');
INSERT INTO d11_nivel2_m (d11_cdempresa, d11_cdnivel1, d11_cdnivel2, d11_nmnivel2) VALUES ('1','1','2','EXPLORATÓRIA');
INSERT INTO d11_nivel2_m (d11_cdempresa, d11_cdnivel1, d11_cdnivel2, d11_nmnivel2) VALUES ('1','1','3','PERMANENTE E PÓS EXPLORATÓRIA');
INSERT INTO d11_nivel2_m (d11_cdempresa, d11_cdnivel1, d11_cdnivel2, d11_nmnivel2) VALUES ('1','1','4','-');