/*
 Navicat Premium Data Transfer

 Source Server         : phpstudy
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 01/10/2021 18:47:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `bName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书书名',
  `author` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者姓名',
  `pubComp` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出版社',
  `pubDate` datetime NULL DEFAULT NULL COMMENT '出版日期',
  `bCount` int(11) NULL DEFAULT NULL COMMENT '现存数量',
  `price` float(6, 2) NULL DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'Java从入门到精通', '刘天培', '南京大学出版社', '2021-03-10 14:17:10', 50, 20.00);
INSERT INTO `book` VALUES (2, '84ef-fd531319d5ac', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
