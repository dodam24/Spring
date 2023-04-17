create table USERIMAGE(
SEQ number primary key,
IMAGENAME varchar2(50) not null,
IMAGECONTENT varchar2(4000),
IMAGE1 varchar2(200));


create sequence SEQ_USERIMAGE nocycle nocache;