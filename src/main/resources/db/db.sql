CREATE SCHEMA `test` DEFAULT CHARACTER SET utf8 ;


CREATE TABLE `test`.`store` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(250) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  `address` VARCHAR(250) NOT NULL,
  `goods` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE `test`.`goods` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


INSERT INTO `test`.`goods`
(id, name, date)
VALUES
(1, 'goods', CURRENT_DATE), (2, 'goods1', CURRENT_DATE), (3, 'goods2', CURRENT_DATE),
(4, 'goods3', CURRENT_DATE), (5, 'goods4', CURRENT_DATE), (6, 'goods5', CURRENT_DATE),
(7, 'goods6', CURRENT_DATE), (8, 'goods7', CURRENT_DATE), (9, 'goods8', CURRENT_DATE),
(10, 'goods9', CURRENT_DATE), (11, 'goods10', CURRENT_DATE);


INSERT INTO `test`.`store`
(id, name, description, address, goods)
VALUES
(1, 'store1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.', '2225 Salk Ave, Ste 125 Carlsbad CA 94508', 'goods1, goods2, goods3'),

(2, 'store2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.', '2233 Salk Ave, Ste 175 Carlsbad CA 98708', 'goods1, goods2, goods3'),

(3, 'store3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.', '2455 Salk Ave, Ste 115 Carlsbad CA 99808', 'goods1, goods2, goods3'),

(4, 'store4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.', '2775 Salk Ave, Ste 189 Carlsbad CA 949008', 'goods1, goods2, goods3');