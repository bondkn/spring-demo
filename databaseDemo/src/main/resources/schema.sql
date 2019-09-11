create table person(
id integer not null,
name varchar(255) not null,
emailid varchar(45),
birth_date timestamp,

primary key(id)
);

insert into person(id,name,emailid,birth_date)
values(1,'nawab','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birth_date)
values(2,'nawab2','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birth_date)
values(3,'nawab3','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birth_date)
values(4,'nawab4','nawab@gmail.com',sysdate());
