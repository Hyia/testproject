
use mysql;

-- 데이터베이스와 사용자 생성
DROP DATABASE IF EXISTS examdb;

CREATE DATABASE examdb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

-- 사용자 추가
GRANT ALL ON examdb.* TO exam1@localhost IDENTIFIED BY '1234';

FLUSH PRIVILEGES;





-- 데이터베이스 변경
use examdb;

DROP TABLE IF EXISTS tbl_phone;

CREATE TABLE IF NOT EXISTS  tbl_phone (
      phname     NVARCHAR(20) not null
    , phfactory  NVARCHAR(40) not null
    , phprice    INTEGER  default 0 not null
)
ENGINE=InnoDB 
AUTO_INCREMENT=1 
DEFAULT CHARACTER SET utf8 
COLLATE utf8_general_ci;


commit;