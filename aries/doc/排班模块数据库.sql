-- MySQL Script generated by MySQL Workbench
-- 2020年11月05日 星期四 22时16分53秒
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema scheduling
-- -----------------------------------------------------
-- 排班模块数据库

-- -----------------------------------------------------
-- Schema scheduling
--
-- 排班模块数据库
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `scheduling` DEFAULT CHARACTER SET utf8 ;
USE `scheduling` ;

-- -----------------------------------------------------
-- Table `scheduling`.`scheduling_play`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scheduling`.`scheduling_play` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sp_name` VARCHAR(200) NULL COMMENT '排班计划名',
  `p_id` BIGINT NULL COMMENT '职位id,外键',
  `start_time` TIME NULL COMMENT '排班开始时间',
  `end_time` TIME NULL COMMENT '排班结束时间',
  `total_time` FLOAT NULL COMMENT '工时',
  `create_time` DATETIME NULL COMMENT '创建时间',
  `update_time` DATETIME NULL COMMENT '更新时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '排班计划表';


-- -----------------------------------------------------
-- Table `scheduling`.`scheduling`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `scheduling`.`scheduling` (
  `id` BIGINT NOT NULL COMMENT 'id',
  `sp_id` BIGINT NULL COMMENT '排班计划id',
  `e_id` BIGINT NULL COMMENT '职工id',
  `status` INT NULL COMMENT '状态：0未开始，1.正常，2.迟到，3.早退，4.旷工，5.请假',
  `spheduling_time` DATE NULL COMMENT '排班日期',
  `create_time` DATETIME NULL COMMENT '创建时间',
  `update_time` DATETIME NULL COMMENT '更新时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '排班表';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
