
insert into tb_categoria(nome,criado_em) values ('livro',NOW());
insert into tb_categoria(nome,criado_em) values ('Notebookes',NOW());
insert into tb_categoria(nome,criado_em) values ('Computadores',NOW());
insert into tb_categoria(nome,criado_em) values ('Brinquedos',NOW());

insert into tb_produto(nome, descricao, preco, img_url, criado_em) values ('Livro', 'Livro de Spring Boot Avançado com JPA', 120.50, 'https://exemplo.com/img/livro.jpg', NOW());
insert into tb_produto(nome, descricao, preco, img_url, criado_em) values ('Notebooks', 'Notebook Gamer 16GB RAM 512GB SSD', 4500.00, 'https://exemplo.com/img/notebook.jpg', NOW());
insert into tb_produto(nome, descricao, preco, img_url, criado_em) values ('Computadores', 'PC de Mesa Completo para Escritório', 2500.00, 'https://exemplo.com/img/pc.jpg', NOW());
insert into tb_produto(nome, descricao, preco, img_url, criado_em) values ('Brinquedos', 'Quebra-cabeça de 1000 peças educativo', 89.90, 'https://exemplo.com/img/brinquedo.jpg', NOW());