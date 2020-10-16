CREATE TABLE `tb_usuario` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`Nome_Completo` varchar(255) NOT NULL,
	`Data_Nascimento` DATE NOT NULL,
	`Email` varchar(225) NOT NULL,
	`Endereco` varchar(225) NOT NULL,
	`Telefone_Celular` varchar(50) NOT NULL,
	`Telefone_Fixo` varchar(50),
	`RG` varchar(8) NOT NULL,
	`CPF` varchar(11) NOT NULL,
	`Sexo` varchar(50) NOT NULL,
	`SEnha` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_Categoria` (
	`Clinico_geral` BOOLEAN NOT NULL,
	`Preco_Clinico_geral` FLOAT NOT NULL,
	`Cirurgiao_geral` BOOLEAN NOT NULL,
	`Preco_Cirurgiao_geral` FLOAT NOT NULL,
	`endocrinologia` BOOLEAN NOT NULL,
	`preco_endocrinologia` FLOAT NOT NULL,
	`ginecologia-obstetricia` BOOLEAN NOT NULL,
	`preco_ginecologia-obstetricia` BOOLEAN NOT NULL,
	`neurologia` BOOLEAN NOT NULL,
	`preco_neurologia` FLOAT NOT NULL,
	`fk_id_hospital` INT NOT NULL
);

CREATE TABLE `tb_funcionario` (
	`id_funcionario` INT NOT NULL AUTO_INCREMENT,
	`Nome_funcionario` varchar(255) NOT NULL,
	`Senha` varchar(255) NOT NULL,
	`Email` varchar(255) NOT NULL,
	`codigo_hospital_funcionario` varchar(255) NOT NULL,
	PRIMARY KEY (`id_funcionario`)
);

CREATE TABLE `tb_hospital` (
	`id_hospitais` INT NOT NULL AUTO_INCREMENT,
	`nome_Hospital` varchar(255) NOT NULL,
	`Endereco_hospital` varchar(255) NOT NULL,
	`codigo_hospital` varchar(255) NOT NULL,
	PRIMARY KEY (`id_hospitais`)
);

ALTER TABLE `tb_Categoria` ADD CONSTRAINT `tb_Categoria_fk0` FOREIGN KEY (`fk_id_hospital`) REFERENCES `tb_hospital`(`id_hospitais`);

ALTER TABLE `tb_funcionario` ADD CONSTRAINT `tb_funcionario_fk0` FOREIGN KEY (`codigo_hospital_funcionario`) REFERENCES `tb_hospital`(`codigo_hospital`);

