create table tb_password_recover (
    id bigint not null auto_increment,
    token varchar(100) not null,
    email varchar(150) not null,
    expiration datetime(6) not null,
    primary key (id)
);
