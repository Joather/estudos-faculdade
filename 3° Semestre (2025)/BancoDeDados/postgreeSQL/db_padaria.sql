CREATE TABLE produtos (
	id INT PRIMARY KEY,
	nome VARCHAR(255),
	preco NUMERIC(10,2));

INSERT INTO produtos (id, nome, preco)
VALUES
	(01, 'pao_frances', 0.25),
	(02, 'caixa_leite', 6.00),
	(03, 'pao_de_queijo', 0.50);

SELECT * FROM produtos;