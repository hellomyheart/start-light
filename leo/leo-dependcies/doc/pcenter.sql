/*
 Navicat Premium Data Transfer

 Source Server         : chamKing
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : pcenter

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 05/11/2020 22:24:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_center
-- ----------------------------
DROP TABLE IF EXISTS `t_center`;
CREATE TABLE `t_center`  (
  `c_id` int(11) NOT NULL,
  `c_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_time` datetime(0) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_center
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
