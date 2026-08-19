CREATE TABLE livro (id_livro INTEGER PRIMARY KEY, nome_livro VARCHAR(200), autor VARCHAR(100));

CREATE TABLE emprestimo (id_emprestimo INTEGER PRIMARY KEY, id_cliente INTEGER REFERENCES clientes(id_cliente), id_livro INTEGER REFERENCES livro(id_livro));

INSERT INTO livro (id_livro, nome_livro, autor) 
VALUES
	(1, 'The Silver Eyes', 'Scott Cawthon'),
	(2, 'The Twisted Ones', 'Scott Cawthon'),
	(3, 'The Fourth Closet', 'Scott Cawthon');

INSERT INTO emprestimo (id_emprestimo, id_cliente, id_livro)
VALUES
	(1, 324, 1),
	(2, 324, 2),
	(3, 324, 3);
