/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : db_cloudoffer

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-11-05 22:22:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_cart`;
CREATE TABLE `t_cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `skuid` int(11) DEFAULT NULL COMMENT '商品的skuid',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `scount` int(11) DEFAULT NULL,
  `jprice` int(11) DEFAULT NULL COMMENT '价格 单位分',
  `ctime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_cart
-- ----------------------------

-- ----------------------------
-- Table structure for t_commodity
-- ----------------------------
DROP TABLE IF EXISTS `t_commodity`;
CREATE TABLE `t_commodity` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL COMMENT '商品id',
  `skuid` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价 单位分',
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_commodity
-- ----------------------------

-- ----------------------------
-- Table structure for t_like
-- ----------------------------
DROP TABLE IF EXISTS `t_like`;
CREATE TABLE `t_like` (
  `id` int(11) NOT NULL,
  `cid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_like
-- ----------------------------

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL,
  `aid` int(11) DEFAULT NULL COMMENT '收货地址',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `totalmoney` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位分 总金额',
  `paymoney` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位分 付款金额',
  `freemoney` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '优惠总金额',
  `flag` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '订单状态 1 2 3 4 5 6 7 8 ',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for t_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `t_orderitem`;
CREATE TABLE `t_orderitem` (
  `id` int(11) NOT NULL,
  `oid` int(11) DEFAULT NULL COMMENT '订单id',
  `skuid` int(11) DEFAULT NULL COMMENT '商品skuid',
  `scount` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价 单位分',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_orderitem
-- ----------------------------
