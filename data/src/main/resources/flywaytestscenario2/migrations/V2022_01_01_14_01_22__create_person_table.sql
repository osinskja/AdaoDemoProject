create table person
(
    id           serial primary key,
    first_name   text,
    last_name    text,
    time_created timestamp with time zone
);