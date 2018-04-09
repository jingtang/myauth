/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : myauth

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2018-04-07 19:48:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_group
-- ----------------------------
DROP TABLE IF EXISTS `sys_group`;
CREATE TABLE `sys_group` (
  `group_id` char(32) NOT NULL COMMENT '主键',
  `group_name` varchar(100) DEFAULT NULL COMMENT '组名',
  `group_code` varchar(20) DEFAULT NULL COMMENT '组编码',
  `group_type` varchar(20) DEFAULT NULL COMMENT '组类型(role角色、user用户、job职位)',
  `parent_id` char(32) DEFAULT NULL COMMENT '上级ID',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `path` varchar(200) DEFAULT NULL COMMENT '全路径',
  `state` int(1) DEFAULT NULL COMMENT '状态（0禁用、1启用）',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_user_id` char(32) DEFAULT NULL COMMENT '创建人ID',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
  `update_user_id` char(32) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色，用户组，岗位';

-- ----------------------------
-- Records of sys_group
-- ----------------------------

-- ----------------------------
-- Table structure for sys_group_auth
-- ----------------------------
DROP TABLE IF EXISTS `sys_group_auth`;
CREATE TABLE `sys_group_auth` (
  `group_auth_id` char(32) NOT NULL COMMENT '主键',
  `group_id` char(32) DEFAULT NULL COMMENT '分组ID',
  `res_id` char(32) DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`group_auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包含角色，用户组，岗位组';

-- ----------------------------
-- Records of sys_group_auth
-- ----------------------------

-- ----------------------------
-- Table structure for sys_group_detail
-- ----------------------------
DROP TABLE IF EXISTS `sys_group_detail`;
CREATE TABLE `sys_group_detail` (
  `group_detail_id` char(32) NOT NULL COMMENT '主键',
  `group_id` char(32) DEFAULT NULL COMMENT '分组ID',
  `group_type` varchar(50) DEFAULT NULL COMMENT '分组类型组类型(role角色、user用户、job职位)',
  `link_id` char(32) DEFAULT NULL COMMENT '关联ID',
  PRIMARY KEY (`group_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组明细，角色，用户组关联用户，职位关联岗位（用户通过岗位查询到岗位关联的权限）';

-- ----------------------------
-- Records of sys_group_detail
-- ----------------------------

-- ----------------------------
-- Table structure for sys_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources`;
CREATE TABLE `sys_resources` (
  `res_id` char(32) NOT NULL COMMENT '主键',
  `res_name` varchar(100) DEFAULT NULL COMMENT '资源名称',
  `res_code` varchar(100) DEFAULT NULL COMMENT '资源名称',
  `type` varchar(50) DEFAULT NULL COMMENT '目录、菜单、按钮、视图',
  `parent_id` char(32) DEFAULT NULL COMMENT '上级ID',
  `path` varchar(200) DEFAULT NULL COMMENT '全路径',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `order_idx` int(3) DEFAULT NULL COMMENT '排序',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `url` varchar(200) DEFAULT NULL COMMENT '资源URL',
  `req_method` varchar(10) DEFAULT NULL COMMENT '资源请求方法（POST,GET,DELETE,PUT）',
  `auth_code` varchar(100) DEFAULT NULL COMMENT '授权标识码',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_user_id` char(32) DEFAULT NULL COMMENT '创建人ID',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
  `update_user_id` char(32) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统资源，系统目录，模块菜单，功能按钮，功能视图';

-- ----------------------------
-- Records of sys_resources
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` char(32) NOT NULL COMMENT '用户ID',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `passwd` varchar(100) DEFAULT NULL COMMENT '密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `def_org_code` varchar(50) DEFAULT NULL COMMENT '默认组织编码',
  `def_org_name` varchar(100) DEFAULT NULL COMMENT '默认组织名称',
  `def_job_code` varchar(50) DEFAULT NULL COMMENT '默认职位编码',
  `def_job_name` varchar(100) DEFAULT NULL COMMENT '默认职位',
  `state` int(1) DEFAULT NULL COMMENT '状态(0禁用，1启用)',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_user_id` char(32) DEFAULT NULL COMMENT '创建人ID',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
  `update_user_id` char(32) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('fdkjfffffffffffffffffffffsssssbb', 'jim', 'admin', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('fdkjfffffffffffffffffffffsssssss', 'admin', 'admin', null, null, null, null, null, null, null, null, null, null, null, null, null);
