create sequence role_id_seq;
create table roles (
	role_id bigint primary key default nextval('role_id_seq'),
	name varchar(200) not null unique
);

create sequence authority_id_seq;
create table authorities (
	authority_id bigint primary key default nextval('authority_id_seq'),
	name varchar(200) not null unique
);

create table role_authorities (
	role_id bigint not null references roles(role_id) on delete cascade,
	authority_id bigint not null references authorities(authority_id) on delete cascade,
	primary key(role_id, authority_id)
);

create table user_roles (
	user_id bigint not null references users(user_id) on delete cascade,
	role_id bigint not null references roles(role_id) on delete cascade,
	primary key(user_id, role_id)
);