CREATE TABLE d20_nivel_avaliacao (

	d20_cdnivelavaliacao BIGINT(20) AUTO_INCREMENT,	
	d20_nmnivelavaliacao VARCHAR(50),
	d20_sigla VARCHAR(20),
	d20_txdescricao VARCHAR(255),
	
	
	
	PRIMARY KEY (d20_cdnivelavaliacao)
		
)Engine=InnoDB;

INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('A��o corretiva pr�xima safra','AC/PS','Provid�ncias relacionadas ao verificador que devem ser cumpridas at� a pr�xima safra.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('A��o corretiva urgente (60)','AC60','Provid�ncias relacionadas ao verificador que devem ser cumpridas em um prazo m�ximo de 60 dias.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('A��o corretiva urgente (30)','AC30','Provid�ncias relacionadas ao verificador que devem ser cumpridas em um prazo m�ximo de 30 dias.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('Sujeito a suspens�o','SS','N�o conformidade que implica em suspens�o do PMFS.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('Sujeito a cancelamento','SC','N�o conformidades t�o graves que implica em cancelamento do PMFS.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('Recomenda��o','R','Recomenda��o relacionada � execu��o do PMFS, que n�o implica em a��o corretiva ou san��o administrativa.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('Nenhuma a��o corretiva','NAC','O verificador foi atendido em sua totalidade, n�o sendo aplic�vel nenhuma a��o corretiva ou san��o.');
INSERT INTO d20_nivel_avaliacao (d20_nmnivelavaliacao, d20_sigla, d20_txdescricao) VALUES ('N�o se aplica / N�o avaliado','NA','O verificador n�o se aplica, no momento da vistoria, ou n�o foi avaliado.');
