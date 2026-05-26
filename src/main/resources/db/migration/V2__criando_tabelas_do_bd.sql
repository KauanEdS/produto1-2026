create table tb_categoria (
                              id bigint not null auto_increment,
                              nome varchar(255),
                              criado_em datetime(6),
                              atualizado_em datetime(6),
                              primary key (id)
);

create table tb_perfil (
                           id bigint not null auto_increment,
                           autoridade varchar(255),
                           primary key (id)
);

create table tb_produto (
                            id bigint not null auto_increment,
                            nome varchar(255),
                            descricao text,
                            preco double,
                            img_url varchar(255),
                            criado_em datetime(6),
                            atualizado_em datetime(6),
                            primary key (id)
);

create table tb_produto_categoria (
                                      id_produto bigint not null,
                                      id_categoria bigint not null,
                                      primary key (id_produto, id_categoria)
);

create table tb_usuario (
                            id bigint not null auto_increment,
                            nome varchar(255),
                            telefone varchar(255),
                            email varchar(255),
                            senha varchar(255),
                            criado_em datetime(6),
                            atualizado_em datetime(6),
                            primary key (id)
);

create table tb_usuario_perfil (
                                   id_usuario bigint not null,
                                   id_perfil bigint not null,
                                   primary key (id_usuario, id_perfil)
);

alter table tb_produto_categoria
    add constraint FK_tb_produto_categoria_categoria
        foreign key (id_categoria) references tb_categoria(id);

alter table tb_produto_categoria
    add constraint FK_tb_produto_categoria_produto
        foreign key (id_produto) references tb_produto(id);

alter table tb_usuario_perfil
    add constraint FK_tb_usuario_perfil_perfil
        foreign key (id_perfil) references tb_perfil(id);

alter table tb_usuario_perfil
    add constraint FK_tb_usuario_perfil_usuario
        foreign key (id_usuario) references tb_usuario(id);

insert into tb_categoria(nome, criado_em) values ('livro', now());
insert into tb_categoria(nome, criado_em) values ('Notebooks', now());
insert into tb_categoria(nome, criado_em) values ('Computadores', now());
insert into tb_categoria(nome, criado_em) values ('Brinquedos', now());

insert into tb_produto(nome, descricao, preco, img_url, criado_em)
values ('Livro', 'Livro de Spring Boot Avançado com JPA', 120.50, 'https://exemplo.com/img/livro.jpg', now());

insert into tb_produto(nome, descricao, preco, img_url, criado_em)
values ('Notebooks', 'Notebook Gamer 16GB RAM 512GB SSD', 4500.00, 'https://exemplo.com/img/notebook.jpg', now());

insert into tb_produto(nome, descricao, preco, img_url, criado_em)
values ('Computadores', 'PC de Mesa Completo para Escritório', 2500.00, 'https://exemplo.com/img/pc.jpg', now());

insert into tb_produto(nome, descricao, preco, img_url, criado_em)
values ('Brinquedos', 'Quebra-cabeça de 1000 peças educativo', 89.90, 'https://exemplo.com/img/brinquedo.jpg', now());

insert into tb_produto_categoria(id_produto, id_categoria) values (1, 1);
insert into tb_produto_categoria(id_produto, id_categoria) values (1, 2);
insert into tb_produto_categoria(id_produto, id_categoria) values (2, 1);
insert into tb_produto_categoria(id_produto, id_categoria) values (3, 3);
insert into tb_produto_categoria(id_produto, id_categoria) values (4, 4);

insert into tb_perfil(autoridade) values ('ROLE_ADMINISTRADOR');
insert into tb_perfil(autoridade) values ('ROLE_VENDEDOR');
insert into tb_perfil(autoridade) values ('ROLE_CLIENTE');

insert into tb_usuario(nome, telefone, email, senha, criado_em)
values ('Kauan', '3799122-2222', 'kauan.eduardosilveira3@gmail.com', '$2a$10$v5FFnZkLiLMqdYFVpQqLruGgZujxKHB3cpFttyAzVSZmPsRLQ2OSq', now());

insert into tb_usuario(nome, telefone, email, senha, criado_em)
values ('Maria', '3799122-3333', 'maria@gmail.com', '$2a$10$v5FFnZkLiLMqdYFVpQqLruGgZujxKHB3cpFttyAzVSZmPsRLQ2OSq', now());

insert into tb_usuario_perfil(id_usuario, id_perfil) values (1, 1);
insert into tb_usuario_perfil(id_usuario, id_perfil) values (1, 2);
insert into tb_usuario_perfil(id_usuario, id_perfil) values (1, 3);
insert into tb_usuario_perfil(id_usuario, id_perfil) values (2, 3);