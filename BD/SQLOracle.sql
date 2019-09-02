/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     1/09/2019 3:31:01 p. m.                      */
/*==============================================================*/


alter table SERVICIO
   drop constraint FK_SERVICIO_SERVICIO_VEHICULO;

alter table SERVICIO
   drop constraint FK_SERVICIO_SERVICIO2_CONDUCTO;

alter table VEHICULO
   drop constraint FK_VEHICULO_VEHICULO__TONELAJE;

drop table CONDUCTOR cascade constraints;

drop index SERVICIO2_FK;

drop index SERVICIO_FK;

drop table SERVICIO cascade constraints;

drop table TONELAJE cascade constraints;

drop index VEHICULO_TONELAJE_FK;

drop table VEHICULO cascade constraints;

drop sequence S_CONDUCTOR;

drop sequence S_SERVICIO;

drop sequence S_TONELAJE;

drop sequence S_VEHICULO;

create sequence S_CONDUCTOR;

create sequence S_SERVICIO;

create sequence S_TONELAJE;

create sequence S_VEHICULO;

/*==============================================================*/
/* Table: CONDUCTOR                                             */
/*==============================================================*/
create table CONDUCTOR 
(
   ID_CONDUCTOR         NUMBER(6)            not null,
   CEDULA_COND          VARCHAR2(20)         not null,
   PRIMERNOMBRE_COND    VARCHAR2(20),
   SEGUNDONOMBRE_COND   VARCHAR2(20),
   PRIMERAPELLIDO_COND  VARCHAR2(20),
   SEGUNDOAPELLIDO_COND VARCHAR2(20),
   CELULAR_COND         NUMBER,
   DISPONIBLE_COND      SMALLINT,
   constraint PK_CONDUCTOR primary key (ID_CONDUCTOR)
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO 
(
   ID_VEHICULO          NUMBER(6)            not null,
   ID_CONDUCTOR         NUMBER(6)            not null,
   ID_SERVICIO          NUMBER(6)            not null,
   CEDULASOLICITANTE_SERV VARCHAR2(20),
   DISTANCIAKM_SERV     NUMBER,
   DIRECCIONINICIAL_SERV VARCHAR2(20),
   DIRECCIONFINAL_SERV  VARCHAR2(20),
   MUNICIOPIOFINAL_SERV VARCHAR2(20),
   TOTAL_SERV           NUMBER,
   constraint PK_SERVICIO primary key (ID_VEHICULO, ID_CONDUCTOR)
);

/*==============================================================*/
/* Index: SERVICIO_FK                                           */
/*==============================================================*/
create index SERVICIO_FK on SERVICIO (
   ID_VEHICULO ASC
);

/*==============================================================*/
/* Index: SERVICIO2_FK                                          */
/*==============================================================*/
create index SERVICIO2_FK on SERVICIO (
   ID_CONDUCTOR ASC
);

/*==============================================================*/
/* Table: TONELAJE                                              */
/*==============================================================*/
create table TONELAJE 
(
   ID_TONELAJE          NUMBER(6)            not null,
   CAPACIDAD_TON        NUMBER               not null,
   DESCRIPCION_TON      VARCHAR2(20),
   PRECIOKM_TON         NUMBER,
   constraint PK_TONELAJE primary key (ID_TONELAJE)
);

/*==============================================================*/
/* Table: VEHICULO                                              */
/*==============================================================*/
create table VEHICULO 
(
   ID_VEHICULO          NUMBER(6)            not null,
   ID_TONELAJE          NUMBER(6)            not null,
   PLACA_VEHI           VARCHAR2(10)         not null,
   MODELO_VEHI          INTEGER,
   SOAT_VEHI            VARCHAR2(20),
   TECNOMECANICO_VEHI   VARCHAR2(20),
   CAPACIDAD_VEHI       NUMBER,
   constraint PK_VEHICULO primary key (ID_VEHICULO)
);

/*==============================================================*/
/* Index: VEHICULO_TONELAJE_FK                                  */
/*==============================================================*/
create index VEHICULO_TONELAJE_FK on VEHICULO (
   ID_TONELAJE ASC
);

alter table SERVICIO
   add constraint FK_SERVICIO_SERVICIO_VEHICULO foreign key (ID_VEHICULO)
      references VEHICULO (ID_VEHICULO);

alter table SERVICIO
   add constraint FK_SERVICIO_SERVICIO2_CONDUCTO foreign key (ID_CONDUCTOR)
      references CONDUCTOR (ID_CONDUCTOR);

alter table VEHICULO
   add constraint FK_VEHICULO_VEHICULO__TONELAJE foreign key (ID_TONELAJE)
      references TONELAJE (ID_TONELAJE);

