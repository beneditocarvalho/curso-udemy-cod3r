create table if not exists prefeitos (
id INT unsigned not null auto_increment,
nome varchar(255) not null,
cidade_id int unsigned,
primary key (id),
unique key (cidade_id),
foreign key(cidade_id) references cidades(id)
);

select * from prefeitos