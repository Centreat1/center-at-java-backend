DROP TABLE IF EXISTS users CASCADE;

CREATE TABLE IF NOT EXISTS users(
id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
username varchar(250) NOT NULL,
user_password varchar(250) NOT NULL,
email varchar(254) NOT NULL UNIQUE,
first_name varchar(250) NOT NULL,
last_name varchar(250) NOT NULL,
created_on timestamp NOT NULL,
user_role varchar(50) NOT NULL
);





