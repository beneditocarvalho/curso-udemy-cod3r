select * from cidades;

insert into prefeitos (nome, cidade_id)
    values ('Rodrigo Neves', 2),
           ('Raquel Lyra', 3),
           ('Zenaldo Countinho', null);

insert into prefeitos (nome, cidade_id)
    values ('Rafael Greca',null);

insert into prefeitos (nome, cidade_id)
    values ('Rodrigo Pinheiro', null);

select * from prefeitos;
