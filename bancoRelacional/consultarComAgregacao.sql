select regiao, sum(populacao) as Total from estados group by regiao order by Total desc -- soma população

select avg (populacao) as Total from estados -- media população

