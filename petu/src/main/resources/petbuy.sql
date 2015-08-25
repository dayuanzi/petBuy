/*
Navicat MySQL Data Transfer

Source Server         : PetBuy
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : petbuy

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-08-25 22:03:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activericode
-- ----------------------------
DROP TABLE IF EXISTS `activericode`;
CREATE TABLE `activericode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(20) DEFAULT NULL,
  `vericode` varchar(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activericode
-- ----------------------------
INSERT INTO `activericode` VALUES ('1', '1111', '1111', '2015-07-07 12:37:13');
INSERT INTO `activericode` VALUES ('2', '34', '2R2tL', '2015-07-31 15:00:59');
INSERT INTO `activericode` VALUES ('3', '35', '7WSpK', '2015-07-31 15:07:01');
INSERT INTO `activericode` VALUES ('4', '36', 'KTJwU', '2015-07-31 15:14:52');

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  `default_main` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '湖北', '武汉', '武昌', '武汉理工大学创业园', '33', '13628619951', '张随远', '珞狮路', '430063', '0');
INSERT INTO `address` VALUES ('2', '湖北', '武汉', '武昌', '武汉理工大学创业园', '33', '13628619980', '陈梦菲', '珞狮路', '430063', '1');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `privileges` varchar(50) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT '',
  `salary` varchar(50) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `company` varchar(50) DEFAULT NULL,
  `experience` tinyint(4) DEFAULT NULL,
  `marriage` tinyint(4) DEFAULT NULL,
  `catcount` int(10) DEFAULT NULL,
  `buyreason` varchar(255) DEFAULT NULL,
  `selfintroduce` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='系统管理员表';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'ROLE_USER', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `admin` VALUES ('2', 'adm', 'adm', 'ROLE_USER', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `admin` VALUES ('33', 'a_dayuanzi@163.com', 'tTz0fdmj7dkYsbpD3q08Zw==', 'ROLE_CATT', '1', '3', '3', null, '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for breedingorder
-- ----------------------------
DROP TABLE IF EXISTS `breedingorder`;
CREATE TABLE `breedingorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `breedingplanid` int(11) DEFAULT NULL,
  `time` datetime(6) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `breedingplanid` (`breedingplanid`),
  CONSTRAINT `breedingorder_ibfk_1` FOREIGN KEY (`breedingplanid`) REFERENCES `breedingplan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of breedingorder
-- ----------------------------
INSERT INTO `breedingorder` VALUES ('1', '33', '1', '2015-07-30 20:26:02.000000', '0');
INSERT INTO `breedingorder` VALUES ('3', '33', '1', '2015-07-31 11:49:01.000000', '0');

-- ----------------------------
-- Table structure for breedingplan
-- ----------------------------
DROP TABLE IF EXISTS `breedingplan`;
CREATE TABLE `breedingplan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mother` int(11) DEFAULT NULL,
  `father` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  `catteryid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `catcount` int(11) DEFAULT NULL,
  `ordercount` int(11) DEFAULT NULL,
  `father_color` varchar(30) DEFAULT NULL,
  `mother_color` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mother` (`mother`),
  KEY `father` (`father`),
  KEY `catteryid` (`catteryid`),
  KEY `userid` (`userid`),
  CONSTRAINT `breedingplan_ibfk_1` FOREIGN KEY (`mother`) REFERENCES `parentcat` (`id`),
  CONSTRAINT `breedingplan_ibfk_2` FOREIGN KEY (`father`) REFERENCES `parentcat` (`id`),
  CONSTRAINT `breedingplan_ibfk_3` FOREIGN KEY (`catteryid`) REFERENCES `cattery` (`id`),
  CONSTRAINT `breedingplan_ibfk_4` FOREIGN KEY (`userid`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of breedingplan
-- ----------------------------
INSERT INTO `breedingplan` VALUES ('1', '1', '12', '2015-07-17 00:37:29', '111', '1', '33', '3', '2', '红色', '绿色');
INSERT INTO `breedingplan` VALUES ('2', '5', '6', '2015-08-16 00:00:00', '111', '1', '33', '4', '4', '粉色', '花色');
INSERT INTO `breedingplan` VALUES ('3', '1', '5', '2015-08-14 14:20:42', '111', '4', '33', '3', '3', '黑色', '蓝色');
INSERT INTO `breedingplan` VALUES ('4', '14', '13', '2015-08-06 14:22:03', '111', '2', '33', '5', '5', '白色', '棕色');
INSERT INTO `breedingplan` VALUES ('5', '7', '12', '2015-08-06 14:23:03', '11', '2', '33', '6', '6', '透明色', '白色');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` datetime(6) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `petid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `petid` (`petid`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `admin` (`ID`),
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`petid`) REFERENCES `cat` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('1', '2015-07-13 14:19:49.000000', '1', '9');
INSERT INTO `cart` VALUES ('3', '2015-07-10 00:00:00.000000', '33', '1');
INSERT INTO `cart` VALUES ('4', '2015-07-27 15:19:23.000000', '33', '5');
INSERT INTO `cart` VALUES ('5', '2015-07-27 15:21:01.000000', '33', '6');
INSERT INTO `cart` VALUES ('6', '2015-07-27 19:28:40.000000', '33', '3');

-- ----------------------------
-- Table structure for cat
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  `rankid` int(11) DEFAULT NULL,
  `pedigree_certificate` int(2) DEFAULT NULL,
  `immune` tinyint(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `catteryid` int(11) DEFAULT NULL,
  `price` double(11,0) DEFAULT NULL,
  `oldprice` int(11) DEFAULT NULL,
  `stalen` tinyint(2) DEFAULT NULL,
  `orderid` int(11) DEFAULT NULL,
  `sex` tinyint(2) DEFAULT NULL,
  `imageid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `typeid` (`typeid`),
  KEY `rankid` (`rankid`),
  KEY `catteryid` (`catteryid`),
  KEY `orderid` (`orderid`),
  KEY `pedigree_certificate` (`pedigree_certificate`),
  CONSTRAINT `cat_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `catype` (`id`),
  CONSTRAINT `cat_ibfk_2` FOREIGN KEY (`rankid`) REFERENCES `rank` (`id`),
  CONSTRAINT `cat_ibfk_3` FOREIGN KEY (`catteryid`) REFERENCES `cattery` (`id`),
  CONSTRAINT `cat_ibfk_4` FOREIGN KEY (`orderid`) REFERENCES `order` (`id`),
  CONSTRAINT `cat_ibfk_5` FOREIGN KEY (`pedigree_certificate`) REFERENCES `pedigree_certificate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cat
-- ----------------------------
INSERT INTO `cat` VALUES ('1', '小黑', '1', '2', '1', '1', '2015-07-01', '1', '10000', null, '1', null, '1', null);
INSERT INTO `cat` VALUES ('2', '小红', '1', '1', '1', '1', '2015-07-01', '1', '20000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('3', '小黄', '1', '2', '1', '1', '2015-07-01', '1', '30000', '40000', '1', null, '1', null);
INSERT INTO `cat` VALUES ('4', '小粉', '1', '1', '1', '1', '2015-07-02', '1', '10000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('5', '小绿', '1', '2', '1', '1', '2015-07-01', '2', '20000', '30000', '3', null, '1', null);
INSERT INTO `cat` VALUES ('6', '小黄', '1', '1', '1', '1', '2015-07-01', '1', '30000', null, '1', '1', '1', null);
INSERT INTO `cat` VALUES ('7', '小橙', '1', '1', '1', '1', '2015-07-01', '2', '10000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('8', '小白', '1', '2', '1', '1', '2015-07-01', '1', '20000', null, '3', null, '1', null);
INSERT INTO `cat` VALUES ('9', '小驴', '1', '3', '1', '1', '2015-08-01', '2', '20000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('10', '大驴', '1', '1', '1', '1', '2015-08-01', '2', '10000', null, '1', '2', '1', null);
INSERT INTO `cat` VALUES ('11', '大红', '1', '1', '1', '1', '2015-08-02', '4', '20000', null, '3', null, '1', null);
INSERT INTO `cat` VALUES ('12', '大白', '1', '1', '1', '1', '2015-08-02', '1', '2000', null, '1', null, '1', null);
INSERT INTO `cat` VALUES ('13', '大紫', '1', '1', '1', '1', '2015-08-02', '2', '3000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('14', '小紫', '1', '1', '1', '1', '2015-08-01', '1', '4000', null, '3', '3', '1', null);
INSERT INTO `cat` VALUES ('15', '大粉', '1', '1', '1', '1', '2015-08-05', '2', '1000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('16', '大屎', '1', '2', '1', '1', '2015-08-01', '2', '3000', null, '3', null, '0', null);
INSERT INTO `cat` VALUES ('17', '小屎', '1', '3', '1', '1', '2015-08-01', '1', '2000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('18', '花花', '1', '3', '1', '1', '2015-08-01', '2', '1000', null, '1', '3', '0', null);
INSERT INTO `cat` VALUES ('19', '草草', '1', '2', '1', '1', '2015-08-01', '1', '2000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('20', '笔笔', '1', '3', '1', '1', '2015-08-01', '2', '3000', null, '3', null, '1', null);
INSERT INTO `cat` VALUES ('21', '路路', '1', '2', '1', '1', '2015-08-01', '1', '2000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('22', '班长', '1', '2', '1', '1', '2015-08-07', '2', '3000', null, '3', null, '1', null);
INSERT INTO `cat` VALUES ('23', '大远子', '1', '3', '1', '1', '2015-08-01', '4', '2000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('24', '小袖子', '1', '2', '1', '1', '2015-08-01', '2', '2000', null, '3', '4', '1', null);
INSERT INTO `cat` VALUES ('25', '绿茶', '1', '3', '1', '1', '2015-08-01', '1', '3000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('26', '王尼玛', '1', '3', '1', '1', '2015-08-01', '1', '2000', null, '1', null, '1', null);
INSERT INTO `cat` VALUES ('27', '二货', '1', '3', '1', '1', '2015-08-01', '2', '20000', null, '1', '4', '0', null);
INSERT INTO `cat` VALUES ('28', '汤圆', '1', '3', '1', '1', '2015-08-01', '1', '20000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('29', '元宵', '1', '2', '1', '1', '2015-08-01', '2', '5000', null, '1', null, '0', null);
INSERT INTO `cat` VALUES ('30', '粽子', '1', '3', '1', '1', '2015-08-01', '4', '9000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('31', '饺子', '1', '2', '1', '1', '2015-08-01', '4', '20000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('32', '火腿', '1', '3', '1', '1', '2015-08-01', '1', '1000', null, '1', '5', '1', null);
INSERT INTO `cat` VALUES ('33', '叉烧包', '1', '3', '1', '1', '2015-08-01', '2', '3000', null, '1', null, '0', null);
INSERT INTO `cat` VALUES ('34', '小鲜肉', '1', '3', '1', '1', '2015-08-01', '1', '4000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('35', '罗汉果', '1', '2', '1', '1', '2015-08-01', '2', '6000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('36', '脑洞', '1', '2', '1', '1', '2015-08-01', '1', '5000', null, '3', '6', '1', null);
INSERT INTO `cat` VALUES ('37', '魅族', '1', '3', '1', '1', '2015-08-01', '2', '6000', null, '3', null, '0', null);
INSERT INTO `cat` VALUES ('38', '小米', '1', '1', '1', '1', '2015-08-01', '1', '8000', null, '2', null, '0', null);
INSERT INTO `cat` VALUES ('39', '三星', '1', '3', '1', '1', '2015-08-01', '2', '10000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('40', '茄子', '1', '1', '1', '1', '2015-08-01', '1', '5000', null, '1', null, '0', null);
INSERT INTO `cat` VALUES ('41', '黄瓜', '1', '2', '1', '1', '2015-08-01', '2', '7000', null, '2', null, '1', null);
INSERT INTO `cat` VALUES ('42', '草莓', '1', '3', '1', '1', '2015-08-01', '1', '4000', null, '3', null, '0', null);

-- ----------------------------
-- Table structure for cattery
-- ----------------------------
DROP TABLE IF EXISTS `cattery`;
CREATE TABLE `cattery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `regionid` int(11) DEFAULT NULL,
  `mainvariety` varchar(20) DEFAULT NULL,
  `experience` int(11) DEFAULT NULL,
  `cattpetrankid` int(11) DEFAULT NULL,
  `pass` tinyint(2) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `leadername` varchar(30) DEFAULT NULL,
  `maintxt` longtext,
  PRIMARY KEY (`id`),
  KEY `regionid` (`regionid`),
  KEY `cattpetrankid` (`cattpetrankid`),
  CONSTRAINT `cattery_ibfk_1` FOREIGN KEY (`regionid`) REFERENCES `region` (`id`),
  CONSTRAINT `cattery_ibfk_2` FOREIGN KEY (`cattpetrankid`) REFERENCES `cattpetrank` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cattery
-- ----------------------------
INSERT INTO `cattery` VALUES ('1', '大远子猫舍', '1', '布偶猫', '6', '2', '1', '北京', '13628619951', '张随远', '近段时间来，方丈释永信连续遭遇举报，举报称其“有私生子、玩弄女人、侵占少林财产”等。与释永信历次遭遇的举报不同，这次举报署名“释正义”，并留有联系方式。\r\n\r\n　　“释正义”尚不知是谁。少林寺称“释正义”为曾被少林寺除名的释延鲁，释延鲁予以否认。\r\n\r\n　　8月8日，释延鲁和少林寺武僧团前团长李国营等多名曾在少林寺内生活或工作的人，到北京实名举报释永信。释延鲁说，实名举报是受“释正义”鼓舞。\r\n\r\n　　宗教事务部门也没有“坐视不管”。7月30日，国家宗教事务局称，已要求河南省宗教事务部门协调有关部门和地方了解核实情况。8月4日夜间，登封市宗教局发布消息称，经核查，没有“释正义”这个人，其他事项正在核实之中。\r\n\r\n　　目前，官方调查结果尚无出来，关于释永信的传言仍没有停止的迹象，甚至一度传出释永信正接受<p>调查的消息。\r\n\r\n<p>');
INSERT INTO `cattery` VALUES ('2', '好坏好坏的猫舍', '1', '布偶猫', '4', '2', '1', '上海', '13628619937', '张继笔', '近段时间来，方丈释永信连续遭遇举报，举报称其“有私生子、玩弄女人、侵占少林财产”等。与释永信历次遭遇的举报不同，这次举报署名“释正义”，并留有联系方式。\r\n\r\n　　“释正义”尚不知是谁。少林寺称“释正义”为曾被少林寺除名的释延鲁，释延鲁予以否认。\r\n\r\n　　8月8日，释延鲁和少林寺武僧团前团长李国营等多名曾在少林寺内生活或工作的人，到北京实名举报释永信。释延鲁说，实名举报是受“释正义”鼓舞。\r\n\r\n　　宗教事务部门也没有“坐视不管”。7月30日，国家宗教事务局称，已要求河南省宗教事务部门协调有关部门和地方了解核实情况。8月4日夜间，登封市宗教局发布消息称，经核查，没有“释正义”这个人，其他事项正在核实之中。\r\n\r\n　　目前，官方调查结果尚无出来，关于释永信的传言仍没有停止的迹象，甚至一度传出释永信正接受调查的消息。\r\n\r\n　　平时，释永信住在寺院西侧一个类似四合院的院子里。看门的保安告诉长江新闻记者，方丈在\\n\\r院内，工作起居正常，只是不接受任何采访。');
INSERT INTO `cattery` VALUES ('4', '小菲菲猫舍', '1', '折耳猫', '3', '2', '1', '深圳', '13628619980', '陈梦菲', '');

-- ----------------------------
-- Table structure for cattpetrank
-- ----------------------------
DROP TABLE IF EXISTS `cattpetrank`;
CREATE TABLE `cattpetrank` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `cattpetrank` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cattpetrank
-- ----------------------------
INSERT INTO `cattpetrank` VALUES ('1', '宠物级');
INSERT INTO `cattpetrank` VALUES ('2', '繁育级');
INSERT INTO `cattpetrank` VALUES ('3', '赛级');

-- ----------------------------
-- Table structure for catype
-- ----------------------------
DROP TABLE IF EXISTS `catype`;
CREATE TABLE `catype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catype` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catype
-- ----------------------------
INSERT INTO `catype` VALUES ('1', '布偶');

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `userid` int(11) NOT NULL,
  `catteryid` int(11) NOT NULL,
  `id` varchar(11) NOT NULL,
  PRIMARY KEY (`userid`,`catteryid`),
  KEY `catteryid` (`catteryid`),
  CONSTRAINT `follow_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `admin` (`ID`),
  CONSTRAINT `follow_ibfk_2` FOREIGN KEY (`catteryid`) REFERENCES `cattery` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of follow
-- ----------------------------
INSERT INTO `follow` VALUES ('33', '2', '');

-- ----------------------------
-- Table structure for imagmsg
-- ----------------------------
DROP TABLE IF EXISTS `imagmsg`;
CREATE TABLE `imagmsg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `path` varchar(255) DEFAULT NULL,
  `imagetype` int(11) DEFAULT NULL,
  `catid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `catid` (`catid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of imagmsg
-- ----------------------------
INSERT INTO `imagmsg` VALUES ('1', '1.jpg', '1', '1', '1');
INSERT INTO `imagmsg` VALUES ('2', '1201507220343130.jpg', '1', '2', '1');
INSERT INTO `imagmsg` VALUES ('3', '1201507220343131.jpg', '1', '3', '1');
INSERT INTO `imagmsg` VALUES ('8', '33201508010408240.jpg', '1', '1', '2');
INSERT INTO `imagmsg` VALUES ('9', '33201508010408241.jpg', '1', '5', '2');
INSERT INTO `imagmsg` VALUES ('10', '33201508010408240.jpeg', '1', '6', '2');
INSERT INTO `imagmsg` VALUES ('11', '33201508010408240.jpg', '1', '7', '2');
INSERT INTO `imagmsg` VALUES ('17', '33201508010437250.jpg', '1', '12', '2');
INSERT INTO `imagmsg` VALUES ('18', '33201508010437251.jpg', '2', '13', '2');
INSERT INTO `imagmsg` VALUES ('19', '33201508010437250.jpg', '1', '13', '2');
INSERT INTO `imagmsg` VALUES ('20', '33201508010437250.jpeg', '1', '14', '2');
INSERT INTO `imagmsg` VALUES ('21', '33201508031038470.jpg', '1', '4', '1');
INSERT INTO `imagmsg` VALUES ('22', '5.jpg', '1', '5', '1');
INSERT INTO `imagmsg` VALUES ('23', '33201508031038480.jpeg', '1', '6', '1');
INSERT INTO `imagmsg` VALUES ('24', '33201508031038480.jpg', '1', '7', '1');
INSERT INTO `imagmsg` VALUES ('25', '33201508031106230.jpg', '1', '8', '1');
INSERT INTO `imagmsg` VALUES ('26', '33201508031106231.jpg', '1', '9', '1');
INSERT INTO `imagmsg` VALUES ('27', '33201508031126290.jpeg', '1', '10', '1');
INSERT INTO `imagmsg` VALUES ('28', '33201508031126291.jpg', '1', '11', '1');
INSERT INTO `imagmsg` VALUES ('29', '33201508031129060.jpg', '1', '12', '1');
INSERT INTO `imagmsg` VALUES ('30', '33201508031129061.jpg', '1', '13', '1');
INSERT INTO `imagmsg` VALUES ('31', '33201508040254370.jpg', '1', '14', '1');
INSERT INTO `imagmsg` VALUES ('32', '33201508040254371.jpeg', '1', '15', '1');
INSERT INTO `imagmsg` VALUES ('33', '33201508040254370.jpeg', '1', '16', '1');
INSERT INTO `imagmsg` VALUES ('34', '33201508040254370.jpg', '1', '17', '1');
INSERT INTO `imagmsg` VALUES ('35', '33201508040731190.jpg', '1', '1', '3');
INSERT INTO `imagmsg` VALUES ('36', '33201508040731191.jpg', '2', '1', '3');
INSERT INTO `imagmsg` VALUES ('37', '33201508040731192.jpeg', '2', '1', '3');
INSERT INTO `imagmsg` VALUES ('38', '33201508040731193.jpg', '3', '1', '3');
INSERT INTO `imagmsg` VALUES ('39', '39.jpg', '1', '18', '1');
INSERT INTO `imagmsg` VALUES ('40', '40.jpg', '1', '19', '1');
INSERT INTO `imagmsg` VALUES ('41', '41.jpg', '1', '20', '1');
INSERT INTO `imagmsg` VALUES ('42', '42.jpg', '1', '21', '1');
INSERT INTO `imagmsg` VALUES ('43', '43.jpg', '1', '22', '1');
INSERT INTO `imagmsg` VALUES ('44', '44.jpg', '1', '23', '1');
INSERT INTO `imagmsg` VALUES ('45', '45.jpg', '1', '24', '1');
INSERT INTO `imagmsg` VALUES ('46', '46.jpg', '1', '25', '1');
INSERT INTO `imagmsg` VALUES ('47', '47.jpg', '1', '26', '1');
INSERT INTO `imagmsg` VALUES ('48', '48.jpg', '1', '27', '1');
INSERT INTO `imagmsg` VALUES ('49', '49.jpg', '1', '28', '1');
INSERT INTO `imagmsg` VALUES ('50', '50.jpg', '1', '29', '1');
INSERT INTO `imagmsg` VALUES ('51', '51.jpg', '1', '30', '1');
INSERT INTO `imagmsg` VALUES ('52', '52.jpg', '1', '31', '1');
INSERT INTO `imagmsg` VALUES ('53', '53.jpg', '1', '32', '1');
INSERT INTO `imagmsg` VALUES ('54', '54.jpg', '1', '33', '1');
INSERT INTO `imagmsg` VALUES ('55', '55.jpg', '1', '34', '1');
INSERT INTO `imagmsg` VALUES ('56', '56.jpg', '1', '35', '1');
INSERT INTO `imagmsg` VALUES ('57', '57.jpg', '1', '36', '1');
INSERT INTO `imagmsg` VALUES ('58', '58.jpg', '1', '37', '1');
INSERT INTO `imagmsg` VALUES ('59', '59.jpg', '1', '38', '1');
INSERT INTO `imagmsg` VALUES ('60', '60.jpg', '1', '39', '1');
INSERT INTO `imagmsg` VALUES ('61', '61.jpg', '1', '40', '1');
INSERT INTO `imagmsg` VALUES ('62', '62.jpg', '1', '41', '1');
INSERT INTO `imagmsg` VALUES ('63', '63.jpg', '1', '42', '1');
INSERT INTO `imagmsg` VALUES ('64', '64.jpg', '2', '1', '1');
INSERT INTO `imagmsg` VALUES ('65', '65.jpg', '1', '2', '3');
INSERT INTO `imagmsg` VALUES ('66', '66.jpg', '2', '2', '3');
INSERT INTO `imagmsg` VALUES ('67', '67.jpg', '2', '2', '3');
INSERT INTO `imagmsg` VALUES ('68', '68.jpg', '1', '4', '3');
INSERT INTO `imagmsg` VALUES ('69', '69.jpg', '2', '4', '3');
INSERT INTO `imagmsg` VALUES ('70', '70.jpg', '2', '4', '3');
INSERT INTO `imagmsg` VALUES ('71', '71.jpg', '2', '2', '3');
INSERT INTO `imagmsg` VALUES ('72', '72.jpg', '2', '2', '3');
INSERT INTO `imagmsg` VALUES ('73', '73.jpg', '3', '2', '3');
INSERT INTO `imagmsg` VALUES ('74', '74.jpg', '2', '1', '3');
INSERT INTO `imagmsg` VALUES ('75', '75.jpg', '3', '4', '3');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `ispay` tinyint(4) DEFAULT NULL,
  `catteryid` int(11) DEFAULT NULL,
  `price` double(11,0) DEFAULT NULL,
  `addressid` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `catteryid` (`catteryid`),
  KEY `addressid` (`addressid`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `admin` (`ID`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`catteryid`) REFERENCES `cattery` (`id`),
  CONSTRAINT `order_ibfk_3` FOREIGN KEY (`addressid`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '2015-07-08 10:37:17', '33', '1', '1', null, null, '1');
INSERT INTO `order` VALUES ('2', '2015-07-02 10:39:59', '33', '1', '1', null, null, '1');
INSERT INTO `order` VALUES ('3', '2015-07-10 15:40:10', '33', '0', '1', null, null, '1');
INSERT INTO `order` VALUES ('4', '2015-07-16 14:55:20', '33', '1', '1', null, null, '1');
INSERT INTO `order` VALUES ('5', '2015-07-01 14:55:44', '33', '1', '1', null, null, '1');
INSERT INTO `order` VALUES ('6', '2015-07-14 14:56:04', '33', '1', '1', null, null, '1');

-- ----------------------------
-- Table structure for parentcat
-- ----------------------------
DROP TABLE IF EXISTS `parentcat`;
CREATE TABLE `parentcat` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `typeid` int(20) DEFAULT NULL,
  `catteryid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `typeid` (`typeid`),
  KEY `catteryid` (`catteryid`),
  CONSTRAINT `parentcat_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `catype` (`id`),
  CONSTRAINT `parentcat_ibfk_2` FOREIGN KEY (`catteryid`) REFERENCES `cattery` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parentcat
-- ----------------------------
INSERT INTO `parentcat` VALUES ('1', '汤圆', '1', '绿色', '1', '1');
INSERT INTO `parentcat` VALUES ('5', '绿茶猫', '2', '蓝色', '1', '2');
INSERT INTO `parentcat` VALUES ('6', '单身猫', '1', '粉色', '1', '1');
INSERT INTO `parentcat` VALUES ('7', '争气猫', '2', '花色', '1', '2');
INSERT INTO `parentcat` VALUES ('12', '包子', '1', '白色', '1', '1');
INSERT INTO `parentcat` VALUES ('13', '蒸饺', '2', '透明色', '1', '2');
INSERT INTO `parentcat` VALUES ('14', '水饺', '1', '黄色', '1', '1');

-- ----------------------------
-- Table structure for pedigree_certificate
-- ----------------------------
DROP TABLE IF EXISTS `pedigree_certificate`;
CREATE TABLE `pedigree_certificate` (
  `id` int(11) NOT NULL,
  `pedigree_certificate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pedigree_certificate
-- ----------------------------
INSERT INTO `pedigree_certificate` VALUES ('1', '无');
INSERT INTO `pedigree_certificate` VALUES ('2', 'CFA注册');
INSERT INTO `pedigree_certificate` VALUES ('3', 'WCF注册');
INSERT INTO `pedigree_certificate` VALUES ('4', 'CFA&WCF注册');

-- ----------------------------
-- Table structure for planvideo
-- ----------------------------
DROP TABLE IF EXISTS `planvideo`;
CREATE TABLE `planvideo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `video` varchar(255) DEFAULT NULL,
  `planid` int(11) DEFAULT NULL,
  `week` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of planvideo
-- ----------------------------

-- ----------------------------
-- Table structure for rank
-- ----------------------------
DROP TABLE IF EXISTS `rank`;
CREATE TABLE `rank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rank` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rank
-- ----------------------------
INSERT INTO `rank` VALUES ('1', '宠物级');
INSERT INTO `rank` VALUES ('2', '繁育级');
INSERT INTO `rank` VALUES ('3', '赛级');

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('1', '中国');
