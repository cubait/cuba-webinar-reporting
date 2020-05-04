-- begin WBNREPORTS_AZIENDA
create table WBNREPORTS_AZIENDA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SEDE_LEGALE_VIA varchar(255) not null,
    SEDE_LEGALE_COMUNE varchar(100) not null,
    SEDE_LEGALE_PROVINCIA varchar(2) not null,
    SEDE_LEGALE_CAP varchar(5) not null,
    --
    RAGIONE_SOCIALE varchar(255) not null,
    PARTITA_IVA varchar(16) not null,
    REA varchar(15) not null,
    EMAIL varchar(255) not null,
    PEC varchar(255) not null,
    TELEFONO varchar(30),
    EMAIL_PRIVACY varchar(255) not null,
    FIRMA_TITOLARE_PRIVACY_ID varchar(36) not null,
    ID_LOGO varchar(36),
    --
    primary key (ID)
)^
-- end WBNREPORTS_AZIENDA
-- begin WBNREPORTS_CLIENTE
create table WBNREPORTS_CLIENTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SEDE_LEGALE_VIA varchar(255) not null,
    SEDE_LEGALE_COMUNE varchar(100) not null,
    SEDE_LEGALE_PROVINCIA varchar(2) not null,
    SEDE_LEGALE_CAP varchar(5) not null,
    --
    RAGIONE_SOCIALE varchar(255) not null,
    TIPO varchar(50) not null,
    PARTITA_IVA varchar(30),
    CODICE_FISCALE varchar(30) not null,
    RAPPRESENTANTE_LEGALE varchar(255),
    CONSENSO_PRIVACY boolean not null,
    AZIENDA_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end WBNREPORTS_CLIENTE
