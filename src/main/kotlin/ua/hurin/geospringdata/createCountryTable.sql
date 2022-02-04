create table country
(
    id serial
        constraint country_pk
            primary key ,
    name varchar(100) not null
);

alter table country
    owner to postgres;