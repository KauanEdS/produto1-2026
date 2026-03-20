CREATE TABLE IF NOT EXISTS tb_categoria (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    criado_em TIMESTAMP,
    atualizado_em TIMESTAMP
    );


insert into tb_categoria(nome,criado_em) values ('livro',NOW());
insert into tb_categoria(nome,criado_em) values ('Notebookes',NOW());
insert into tb_categoria(nome,criado_em) values ('Computadores',NOW());
insert into tb_categoria(nome,criado_em) values ('Brinquedos',NOW());