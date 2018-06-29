CREATE TABLE USER
(
	id Long not null auto_increment,
	first_name varchar(255) not null,
	email varchar(255) not null,
	password varchar(255) not null,
	primary key(id)
);