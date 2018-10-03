CREATE TABLE d05_local3_m(
	d05_cdempresa BIGINT(20),
	d05_cdlocal1 BIGINT(20),
	d05_cdlocal2 BIGINT(20),
	d05_cdlocal3 BIGINT(20),
	d05_nmlocal3 VARCHAR(200),


PRIMARY KEY (d05_cdempresa,d05_cdlocal1,d05_cdlocal2,d05_cdlocal3),
FOREIGN KEY(d05_cdempresa) REFERENCES d24_empresa(d24_cdempresa),
FOREIGN KEY(d05_cdlocal1) REFERENCES d03_local1_m(d03_cdlocal1),
FOREIGN KEY(d05_cdlocal2) REFERENCES d04_local2_m(d04_cdlocal2)

);

INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 1, '?rvores inventariadas (geral)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 2, 'Dist?ncia entre picadas');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 3, 'Dist?ncia nas picadas');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 4, 'Numera??o das picadas');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 5, 'Dire??o das picadas');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 6, '?rvores inventariadas (fuste)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 7, '?rvores inventariadas (esp?cies comuns)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 8, '?rvores inventariadas (demais esp?cies)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 9, '?rvores inventariadas (circunfer?ncia)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 10, '?rvores inventariadas (altura)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 11, 'Etiquetas nas ?rvores (informa??es)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 12, 'Etiquetas nas ?rvores (durabilidade)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 13, '?rvores inventariadas (localiza??o)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 1, 14, 'Microzoneamento UTs');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 1, 'Equipe (EPIs)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 2, 'Equipe (geral)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 3, 'Procedimentos (caminhos de fuga)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 4, 'Toco (altura)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 5, 'Procedimentos (t?cnica de corte)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 6, 'Procedimentos (seguran?a)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 7, '?rvore a explorar (teste do oco)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 8, 'Equipamentos ');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 9, 'Procedimentos (corte de cip?s)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 10, 'Equipe (uso de mapas)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 1, 2, 11, '?rvore explorada (tora/galhada)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 1, '?rvore explorada (tora/galhada)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 2, 'Equipe (EPIs)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 3, 'Leito da trilha (geral)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 4, 'Planejamento (trilha)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 5, 'Planejamento (arraste)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 6, 'Leito da trilha (?rvores piv?)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 7, 'Equipe (uso de mapas)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 2, 1, 8, 'Equipamentos');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 1, 1, 'Leito (dimens?es)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 1, 2, '?rvore explorada');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 1, 3, 'Equipe (EPIs)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 1, 4, 'Equipamentos');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 2, 1, 'Leito (margens)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 3, 1, 'Procedimentos (romaneio)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 3, 2, 'Procedimentos (transporte)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 3, 3, 3, 'Procedimentos (ATPF)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 4, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 4, 1, 1, '?rvore explorada');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 4, 1, 2, 'Leito (res?duos)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 1, 1, 'Leito');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 1, 2, 'Margens');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 2, 1, 'Leito');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 2, 2, 'Margens');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 3, 1, 'Delimita??o UPA');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 3, 2, 'Delimita??o AMF');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 3, 3, 'Bueiros');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 3, 4, 'Pontes');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 5, 3, 5, 'Valetas');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 1, 1, 'Estabelecimento');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 1, 2, 'Dados');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 1, 'Fitossociologia');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 2, 'Ecologia florestal');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 3, 'Cobertura florestal');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 4, 'Rendimento florestal');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 5, 'An?lise de danos');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 6, 'Economia');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 7, 'Pol?tica/legisla??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 6, 2, 8, 'Organiza??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 1, 'Treinamentos ');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 2, 'Procedimentos (invas?o)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 3, 'Equipe (geral)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 4, 'Procedimentos (combust?veis)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 5, 'Procedimentos (seguran?a)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 1, 6, 'Equipamentos');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 1, 'Localiza??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 2, 'Dormit?rios');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 3, 'Refeit?rios');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 4, 'Cozinha');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 5, 'Sanit?rios');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 6, 'Procedimentos (lixo e res?duos)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 7, 2, 7, 'Equipamentos');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 1, 1, 'Organiza??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 1, 2, 'Economia');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 1, 3, 'Pol?tica/legisla??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 1, 'Mapas (UPA)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 2, 'Mapas (UT)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 3, 'Mapas (infra-estrutura)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 4, 'Mapas (?rvores)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 5, 'Procedimentos (silvicultura)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 6, 'Mapas (macrozoneamemto)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 7, 'Mapas (geral)');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 8, 2, 8, 'Listagens ');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 0, 0, '-');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 1, 'Organiza??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 2, 'Infra-estrutura ');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 3, 'M?o-de-obra e qualifica??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 4, 'Pol?tica/legisla??o');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 5, 'Sa?de p?blica');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 6, 'Economia');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 7, 'Empresas locais');
INSERT INTO d05_local3_m (d05_cdempresa, d05_cdlocal1, d05_cdlocal2, d05_cdlocal3, d05_nmlocal3) VALUES(1, 9, 1, 8, 'Ecologia regional');