select e.nome, c.nome
from empresas e, cidades_empresas ce, cidades c
where e.id = ce.empresa_id
and c.id = ce.cidade_id
and sede;