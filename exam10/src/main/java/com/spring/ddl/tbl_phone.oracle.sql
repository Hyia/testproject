create table tbl_phone (
      phname     VARCHAR2(20) not null enable
    , phfactory  VARCHAR2(40) not null enable
    , phprice    NUMBER(10)  default 0 not null enable
);

commit;