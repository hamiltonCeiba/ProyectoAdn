/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     1/09/2019 3:19:47 p. m.                      */
/*==============================================================*/


drop index CONDUCTOR_PK;

drop table CONDUCTOR;

drop index SERVICIO2_FK;

drop index SERVICIO_FK;

drop index SERVICIO_PK;

drop table SERVICIO;

drop index TONELAJE_PK;

drop table TONELAJE;

drop index VEHICULO_TONELAJE_FK;

drop index VEHICULO_PK;

drop table VEHICULO;

/*==============================================================*/
/* Table: CONDUCTOR                                             */
/*==============================================================*/
create table CONDUCTOR (
   ID_CONDUCTOR         SERIAL               not null,
   CEDULA_COND          VARCHAR(20)          not null,
   PRIMERNOMBRE_COND    VARCHAR(20)          null,
   SEGUNDONOMBRE_COND   VARCHAR(20)          null,
   PRIMERAPELLIDO_COND  VARCHAR(20)          null,
   SEGUNDOAPELLIDO_COND VARCHAR(20)          null,
   CELULAR_COND         DECIMAL              null,
   DISPONIBLE_COND      BOOL                 null,
   constraint PK_CONDUCTOR primary key (ID_CONDUCTOR)
);

/*==============================================================*/
/* Index: CONDUCTOR_PK                                          */
/*==============================================================*/
create unique index CONDUCTOR_PK on CONDUCTOR (
ID_CONDUCTOR
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO (
   ID_VEHICULO          INT4                 not null,
   ID_CONDUCTOR         INT4                 not null,
   ID_SERVICIO          SERIAL               not null,
   CEDULASOLICITANTE_SERV VARCHAR(20)          null,
   DISTANCIAKM_SERV     DECIMAL              null,
   DIRECCIONINICIAL_SERV VARCHAR(20)          null,
   DIRECCIONFINAL_SERV  VARCHAR(20)          null,
   MUNICIOPIOFINAL_SERV VARCHAR(20)          null,
   TOTAL_SERV           DECIMAL              null,
   constraint PK_SERVICIO primary key (ID_VEHICULO, ID_CONDUCTOR)
);

/*==============================================================*/
/* Index: SERVICIO_PK                                           */
/*==============================================================*/
create unique index SERVICIO_PK on SERVICIO (
ID_VEHICULO,
ID_CONDUCTOR
);

/*==============================================================*/
/* Index: SERVICIO_FK                                           */
/*==============================================================*/
create  index SERVICIO_FK on SERVICIO (
ID_VEHICULO
);

/*==============================================================*/
/* Index: SERVICIO2_FK                                          */
/*==============================================================*/
create  index SERVICIO2_FK on SERVICIO (
ID_CONDUCTOR
);

/*==============================================================*/
/* Table: TONELAJE                                              */
/*==============================================================*/
create table TONELAJE (
   ID_TONELAJE          SERIAL               not null,
   CAPACIDAD_TON        DECIMAL              not null,
   DESCRIPCION_TON      VARCHAR(20)          null,
   PRECIOKM_TON         CHAR(10)             null,
   constraint PK_TONELAJE primary key (ID_TONELAJE)
);

/*==============================================================*/
/* Index: TONELAJE_PK                                           */
/*==============================================================*/
create unique index TONELAJE_PK on TONELAJE (
ID_TONELAJE
);

/*==============================================================*/
/* Table: VEHICULO                                              */
/*==============================================================*/
create table VEHICULO (
   ID_VEHICULO          SERIAL               not null,
   ID_TONELAJE          INT4                 not null,
   PLACA_VEHI           VARCHAR(10)          not null,
   MODELO_VEHI          INT4                 null,
   SOAT_VEHI            VARCHAR(20)          null,
   TECNOMECANICO_VEHI   VARCHAR(20)          null,
   CAPACIDAD_VEHI       DECIMAL              null,
   constraint PK_VEHICULO primary key (ID_VEHICULO)
);

/*==============================================================*/
/* Index: VEHICULO_PK                                           */
/*==============================================================*/
create unique index VEHICULO_PK on VEHICULO (
ID_VEHICULO
);

/*==============================================================*/
/* Index: VEHICULO_TONELAJE_FK                                  */
/*==============================================================*/
create  index VEHICULO_TONELAJE_FK on VEHICULO (
ID_TONELAJE
);

alter table SERVICIO
   add constraint FK_SERVICIO_SERVICIO_VEHICULO foreign key (ID_VEHICULO)
      references VEHICULO (ID_VEHICULO)
      on delete restrict on update restrict;

alter table SERVICIO
   add constraint FK_SERVICIO_SERVICIO2_CONDUCTO foreign key (ID_CONDUCTOR)
      references CONDUCTOR (ID_CONDUCTOR)
      on delete restrict on update restrict;

alter table VEHICULO
   add constraint FK_VEHICULO_VEHICULO__TONELAJE foreign key (ID_TONELAJE)
      references TONELAJE (ID_TONELAJE)
      on delete restrict on update restrict;

