/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : start_light

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 05/11/2020 22:28:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_cart`;
CREATE TABLE `t_cart`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `skuid` int(11) NULL DEFAULT NULL COMMENT '商品的skuid',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `scount` int(11) NULL DEFAULT NULL,
  `jprice` int(11) NULL DEFAULT NULL COMMENT '价格 单位分',
  `ctime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_cart
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
