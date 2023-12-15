CREATE TABLE Cliente (
	codCliente SERIAL,
	nome VARCHAR(50),
	CPF VARCHAR(14),
	email VARCHAR(30),
	endereço VARCHAR(50),
	dtNascimento DATE,
	PRIMARY KEY (codCliente)
);

CREATE TABLE Filme (
	codfilme SERIAL,
	titulo VARCHAR(20),
	gênero VARCHAR(20),
	sinopse VARCHAR(100),
	duração INT,
	PRIMARY KEY (codFilme)
);

CREATE TABLE Item (
	codItem SERIAL,
	codFilme INT,
	codCliente INT,
	preço REAL,
	tipo VARCHAR(20),
	dataLocação DATE,
	dataDevolução DATE,
	PRIMARY KEY (codItem),
	FOREIGN KEY (codFilme) REFERENCES Filme (codFilme),
	FOREIGN KEY (codCliente) REFERENCES Cliente (codCliente)
);
