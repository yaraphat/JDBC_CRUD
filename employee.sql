/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.6.20 : Database - emp_mgt
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`emp_mgt` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `emp_mgt`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `employee_id` varchar(4) NOT NULL,
  `employee_name` varchar(255) NOT NULL,
  `designation` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `mgr_id` varchar(4) DEFAULT NULL,
  `salary` double(10,2) NOT NULL,
  `benefits` double(10,2) DEFAULT NULL,
  `hire_date` date NOT NULL,
  `password` varchar(16) NOT NULL DEFAULT '12345',
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`employee_id`,`employee_name`,`designation`,`department`,`mgr_id`,`salary`,`benefits`,`hire_date`,`password`,`last_update`) values 
('1001','hanif','ceo','','',100000.00,50000.00,'2019-12-05','12345','2020-08-24 08:40:54'),
('1002','monsur','accountant','accounts','1001',50000.00,20000.00,'2019-12-05','12345','2020-08-24 08:40:54'),
('1003','rashed','gm','','1001',80000.00,30000.00,'2019-12-08','12345','2020-08-24 08:40:54'),
('1004','mahmud','pm','production','1003',50000.00,25000.00,'2019-12-09','12345','2020-08-24 08:40:54'),
('1005','afsar','hrm','hr','1003',30000.00,15000.00,'2019-12-06','12345','2020-08-24 08:40:54'),
('1006','shudhir','clerk','hr','1005',10000.00,5000.00,'2019-12-05','12345','2020-08-24 08:40:54');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
