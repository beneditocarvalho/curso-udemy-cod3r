ALTER TABLE empresas MODIFY cnpj varchar(14);

insert into empresas (nome, cnpj)
    values ('Bradesco', 95595959562323),
           ('Vale', 95595329562124),
           ('Cielo', 97463129576493);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

insert into cidades_empresas (empresa_id, cidade_id, sede)
    values (1,1,1),
           (1,2,0),
           (2,1,0),
           (2,2,1);

select * from cidades_empresas