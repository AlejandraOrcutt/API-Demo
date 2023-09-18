DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id varchar(255) NOT NULL,
  description varchar(255) DEFAULT NULL,
  price decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)