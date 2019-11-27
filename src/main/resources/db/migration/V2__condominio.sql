CREATE TABLE advobills.condominio(
    id bigserial primary key,
    name VARCHAR (50) unique not null,
    adress VARCHAR (50),
    administrator VARCHAR (50)
);

INSERT INTO advobills.condominio(name, adress, administrator)
VALUES ('CONDOMÍNIO VILLAGE DO BOSQUE II', '', '');