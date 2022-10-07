create table proposta_valor (
id serial,
text_proposta_valor varchar,
primary key(id)
);


create table segmento_clientes (
id serial,
text_segmento_clientes varchar,
primary key(id)
);


create table canais (
id serial,
text_canais varchar,
primary key(id)
);


create table relacionamento_clientes (
id serial,
text_relacionamento_clientes varchar,
primary key(id)
);


create table atividade_chave (
id serial,
text_atividade_chave varchar,
primary key(id)
);


create table recursos_principais (
id serial,
text_recursos_principais varchar,
primary key(id)
);


create table parcerias_principais (
id serial,
text_parcerias_principais varchar,
primary key(id)
);


create table fontes_receita (
id serial,
text_fontes_receita varchar,
primary key(id)
);


create table estrutura_custos (
id serial,
text_estrutura_custos varchar,
primary key(id)
);