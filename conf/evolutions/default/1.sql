# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table item (
  item_id                       integer auto_increment not null,
  sale_id                       integer,
  title                         varchar(255),
  description                   varchar(255),
  price                         double,
  stock                         integer,
  image                         longblob,
  constraint pk_item primary key (item_id)
);

create table sale (
  sale_id                       integer auto_increment not null,
  seller_id                     varchar(255),
  admin_id                      varchar(255),
  title                         varchar(255),
  location                      varchar(255),
  size                          integer,
  image                         longblob,
  constraint pk_sale primary key (sale_id)
);

create table transaction (
  transaction_id                integer auto_increment not null,
  customer_id                   varchar(255),
  total                         double,
  constraint pk_transaction primary key (transaction_id)
);

create table user (
  username                      varchar(255) not null,
  pwd                           varchar(255),
  email                         varchar(255),
  name                          varchar(255),
  phone                         varchar(255),
  address                       varchar(255),
  locked                        tinyint(1) default 0,
  roles                         varchar(255),
  constraint pk_user primary key (username)
);

create table user_item (
  user_username                 varchar(255) not null,
  item_item_id                  integer not null,
  constraint pk_user_item primary key (user_username,item_item_id)
);

alter table user_item add constraint fk_user_item_user foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_user_item_user on user_item (user_username);

alter table user_item add constraint fk_user_item_item foreign key (item_item_id) references item (item_id) on delete restrict on update restrict;
create index ix_user_item_item on user_item (item_item_id);


# --- !Downs

alter table user_item drop foreign key fk_user_item_user;
drop index ix_user_item_user on user_item;

alter table user_item drop foreign key fk_user_item_item;
drop index ix_user_item_item on user_item;

drop table if exists item;

drop table if exists sale;

drop table if exists transaction;

drop table if exists user;

drop table if exists user_item;

