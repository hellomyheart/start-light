/*
 Navicat Premium Data Transfer

 Source Server         : gsll
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : db_cloudoffer

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 05/11/2020 22:22:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_favorite
-- ----------------------------
DROP TABLE IF EXISTS `t_favorite`;
CREATE TABLE `t_favorite`  (
  `id` int(11) NOT NULL,
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `cid` int(11) NULL DEFAULT NULL COMMENT '文章id',
  `ctime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `tital` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收藏名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_favorite
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
