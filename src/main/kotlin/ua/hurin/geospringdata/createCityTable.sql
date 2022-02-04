create table city
(
    id serial
        constraint city_pk
            primary key,
    name varchar not null,
    country_id integer not null
        constraint city_country_fk
            references country
);

alter table city
    owner to postgres;

drop table city;