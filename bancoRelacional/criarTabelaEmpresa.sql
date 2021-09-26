create table if not exists empresas (
    id INT unsigned not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    primary key (id),
    unique key (cnpj)
);

create table if not exists cidades_empresas(
    empresa_id INT unsigned not null,
    cidade_id INT unsigned,
    sede TINYINT (1) NOT NULL,
    primary key (empresa_id, cidade_id)
);