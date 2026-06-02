alter table tb_perfil
    rename column autoridade to nome;

alter table tb_perfil
    add column criado_em datetime(6);

alter table tb_perfil
    add column atualizado_em datetime(6);
