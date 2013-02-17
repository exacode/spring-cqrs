create sequence user_id_seq;
create table users (
	user_id bigint primary key default nextval('user_id_seq'),
	login varchar(200) unique,
	email varchar(200) unique,
	password varchar(200),
	creation_time timestamp,
	modification_time timestamp,
	version bigint
);
