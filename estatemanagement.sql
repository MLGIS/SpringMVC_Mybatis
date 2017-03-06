/*
Navicat MySQL Data Transfer

Source Server         : ml
Source Server Version : 50710
Source Host           : 127.0.0.1:3306
Source Database       : estatemanagement

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-03-06 18:09:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `sfzh` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `zzjgbh` int(18) unsigned DEFAULT NULL COMMENT '组织机构代码',
  `mail` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `user_type` int(5) unsigned DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`),
  KEY `sfzh` (`sfzh`,`id`,`user_type`) USING BTREE,
  KEY `user_ibfk_1` (`user_type`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_type`) REFERENCES `user_type` (`type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('test', '123', 'abc', '1111111111', '1', null, null, null);

-- ----------------------------
-- Table structure for user2
-- ----------------------------
DROP TABLE IF EXISTS `user2`;
CREATE TABLE `user2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `create_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user2
-- ----------------------------
INSERT INTO `user2` VALUES ('1', 'wangxin', '123', '2014-02-14');
INSERT INTO `user2` VALUES ('2', 'Tom', '123456', '2014-02-14');
INSERT INTO `user2` VALUES ('3', 'Jack', '123', '2014-02-14');
INSERT INTO `user2` VALUES ('4', 'Bob', '123', '2014-02-14');

-- ----------------------------
-- Table structure for user_type
-- ----------------------------
DROP TABLE IF EXISTS `user_type`;
CREATE TABLE `user_type` (
  `type_id` int(5) unsigned NOT NULL COMMENT '用户类型编号',
  `type_name` varchar(20) NOT NULL COMMENT '用户类型',
  KEY `type_id` (`type_id`),
  KEY `type_name` (`type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_type
-- ----------------------------
