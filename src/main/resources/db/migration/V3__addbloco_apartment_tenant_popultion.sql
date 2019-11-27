CREATE TABLE advobills.bloco(
    id bigserial primary key,
    name VARCHAR (50) not null,
    condominio_id BIGINT REFERENCES advobills.condominio(id)
);

INSERT INTO advobills.bloco
    (name, condominio_id)
VALUES
    ('BL01', 1);

CREATE TABLE advobills.apartment(
    id bigserial primary key,
    number VARCHAR (10) NOT NULL,
    bloco_id BIGINT REFERENCES advobills.bloco(id)
);

INSERT INTO advobills.apartment
    (number, bloco_id)
VALUES
    ('AP 0001', 1);

CREATE TABLE advobills.tenant(
    id bigserial primary key,
    name VARCHAR (50) unique not null,
    owner BOOLEAN,
    cpf VARCHAR (11),
    rg VARCHAR (11),
    email VARCHAR (50),
    phone VARCHAR (15),
    apartment_id BIGINT REFERENCES advobills.apartment(id)
);

INSERT INTO advobills.tenant
    (name, owner, cpf, rg, email, phone, apartment_id)
VALUES
    ('GENILDE MARINHO RIAL', true, '61608823334', '', 'rialgenilde@gmail.com', '98988620643', 1);