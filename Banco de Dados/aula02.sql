#Criar base de dados
CREATE DATABASE aula02;

#Selecionar base de dados
USE aula02;

#CRIAR TABELA
CREATE TABLE usuarios(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    cidade VARCHAR(20)
);

#Cadastrar usuários
INSERT INTO usuarios (nome, cidade) VALUES
("Alan", "Curitiba"),
("Brenda", "Blumenau"),
("Carlos", "Blumenau"),
("Dênis", "Joinville"),
("Ellen", "Joinville");

#Agrupar cidades
SELECT COUNT(*) AS "Quantidade", cidade FROM usuarios GROUP BY cidade;


#Excluir a tabela de usuários
DROP TABLE usuarios;

#Criar tabela de marcas
CREATE TABLE marcas(
   codigo INT AUTO_INCREMENT PRIMARY KEY,
   marca VARCHAR(30)
);

#Inserir marcas
INSERT INTO marcas (marca) VALUES
("LG"),
("Samsung");

#Criar tabela de produtos
CREATE TABLE produtos(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
    produto VARCHAR(30),
	marca INT,
    FOREIGN KEY(marca) REFERENCES marcas(codigo)
);

# Cadastrar produtos
INSERT INTO produtos (produto, marca) VALUES ("Galaxy S20", 2);

#Selecionar produtos
SELECT
	produtos.codigo,
    produtos.produto,
    marcas.marca
FROM produtos
INNER JOIN marcas
ON produtos.marca = marcas.codigo;

SELECT
    marcas.marca,
    COUNT(produtos.produto)
FROM marcas
LEFT JOIN produtos
ON marcas.codigo = produtos.marca
GROUP BY marcas.marca;

#Adiciona nova coluna na tabela produtos
ALTER TABLE produtos ADD COLUMN cadastro DATE;

#Exibir estrutura da tabela
DESCRIBE produtos;

#Atualizar cada de cadastro do produto Galaxy S20
UPDATE produtos SET cadastro = "2020-08-03";

#Formatar data
SELECT 
	produto,
    date_format(cadastro, "%d/%m/%Y")
 FROM produtos;

CREATE VIEW visao AS
SELECT
	produtos.codigo,
    produtos.produto,
    marcas.marca
FROM produtos
INNER JOIN marcas
ON produtos.marca = marcas.codigo;


SELECT produto, marca FROM visao;



















