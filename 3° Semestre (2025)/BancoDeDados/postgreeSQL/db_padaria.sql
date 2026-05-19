DROP TABLE produtos;
CREATE TABLE produtos (
	id INT PRIMARY KEY,
	nome VARCHAR(255),
	preco NUMERIC(10,2));

INSERT INTO produtos (id, nome, preco)
VALUES
	(01, 'pao_frances', 0.25),
	(02, 'caixa_de_leite', 6.00),
	(03, 'pao_de_queijo', 0.50);

ALTER TABLE produtos
ADD promocao INT;

UPDATE produtos
SET nome = 'pao_dormindo', preco = 0.10, promocao = 60
WHERE id = 01;

ALTER TABLE produtos
ALTER COLUMN promocao TYPE VARCHAR(3);

ALTER TABLE produtos
ALTER COLUMN nome TYPE VARCHAR(50);

ALTER TABLE produtos
DROP COLUMN promocao;

DELETE FROM produtos
WHERE nome = 'pao_dormindo';

TRUNCATE TABLE produtos;

SELECT * FROM produtos;