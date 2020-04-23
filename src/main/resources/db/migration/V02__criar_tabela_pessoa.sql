CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN,
	logradouro VARCHAR(60),
	numero VARCHAR(8),
	complemento VARCHAR(50),
	bairro VARCHAR(50),
	cep VARCHAR(9),
	cidade VARCHAR(40),
	estado VARCHAR(2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Gerson', true, 'Av. Tancredo Neves', '14', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Junior', true, 'Rua Antonio Esteves dos Anjos', '21', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Neuma', true, 'Rua Manoel Martins', '56', 'Urucuia Nova', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('José', true, 'Av. Brasiliano Bras', '14', 'Rutilante', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Marli', true, 'Av. Tancredo Neves', '56', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Daniel', true, 'Av. Floriano Peixoto', '1765', 'Umuarama', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Jonas', true, 'Av. Brasil', '21', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Manoel', true, 'Av. Tancredo Neves', '45', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Adonias', true, 'Av. Tancredo Neves', '11', 'Centro', '39150-000', 'Urucuia', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) values ('Antonio', true, 'Av. Tancredo Neves', '36', 'Centro', '39150-000', 'Urucuia', 'MG');