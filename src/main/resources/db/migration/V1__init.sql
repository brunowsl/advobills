CREATE TABLE advobills.users(
    id bigserial primary key,
    user_name VARCHAR (50) unique not null,
    password VARCHAR (50) not null,
    email varchar (50) unique not null,
    first_name varchar (50) not null,
    last_name varchar (50) not null
);

INSERT INTO advobills.users(user_name, password, email, first_name, last_name) 
VALUES ('samirasimas', 'samira18', 'samirasimas@hotmail.com', 'Samira', 'Simas');