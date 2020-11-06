/*
SQLyog Ultimate v8.32 
MySQL - 5.7.25-log : Database - t_order
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`t_order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `t_order`;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `aid` int(11) DEFAULT NULL COMMENT '收货地址id',
  `totalmoney` double(10,2) DEFAULT NULL COMMENT '商品总价',
  `freemoney` double(10,2) DEFAULT NULL COMMENT '优惠金额',
  `paymoney` double(10,2) DEFAULT NULL COMMENT '实付金额',
  `paytype` int(11) DEFAULT NULL COMMENT '支付方式',
  `ctime` datetime DEFAULT NULL COMMENT '创建日期',
  `update` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

/*Table structure for table `t_orderdetailed` */

DROP TABLE IF EXISTS `t_orderdetailed`;

CREATE TABLE `t_orderdetailed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `skuid` int(11) DEFAULT NULL COMMENT '商品的skuid',
  `count` int(11) DEFAULT NULL COMMENT '商品数量',
  `price` double(10,2) DEFAULT NULL COMMENT '商品单价',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_orderdetailed` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
