CREATE DATABASE blackbean;

USE blackbean;

SHOW TABLES FROM blackbean;


CREATE TABLE `user` (
  `user_id` BIGINT NOT NULL AUTO_INCREMENT,
  `nickname` VARCHAR(45) NOT NULL,
  `uimage` VARCHAR(225) NULL,
  `isNoti` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`)
);

CREATE TABLE `doctor` (
  `doctor_id` BIGINT NOT NULL AUTO_INCREMENT,
  `dname` VARCHAR(10) NOT NULL,
  `dimage` VARCHAR(225) NOT NULL,
  `animals` VARCHAR(100) NOT NULL,
  `cs_time` VARCHAR(45) NOT NULL,
  `fee` INT NOT NULL,
  `d_exp` VARCHAR(255) NOT NULL,
  `introduce` VARCHAR(255) NOT NULL,
  `hospital_id` INT NOT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`doctor_id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
);

CREATE TABLE `review` (
    `review_id` BIGINT NOT NULL AUTO_INCREMENT,
    `detail` VARCHAR(255) NOT NULL,
    `star` DOUBLE NOT NULL,
    `date` TIMESTAMP NOT NULL,
    `user_id` BIGINT NOT NULL,
    `doctor_id` BIGINT NOT NULL,
    PRIMARY KEY (`review_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE CASCADE
);

CREATE TABLE `animal` (
	`animal_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`name`	VARCHAR (45)	NOT NULL,
	`birth`	VARCHAR (20)	NOT NULL,
	`gender`	VARCHAR (5)	NOT NULL,
	`type`	VARCHAR (45)	NOT NULL,
	`no`	INT	NOT NULL,
	`isNeuter`	TINYINT(1)	NOT NULL	DEFAULT 0,
	PRIMARY KEY (`animal_id`)
);

CREATE TABLE `userpet` (
    `uani_id` BIGINT NOT NULL AUTO_INCREMENT,
    `user_id` BIGINT NOT NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`uani_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `like` (
	`like_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`user_id`	BIGINT	NOT NULL,
	`doctor_id`	BIGINT	NOT NULL,
    PRIMARY KEY (`like_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE CASCADE
);

CREATE TABLE `defecation` (
    `defecation_id` BIGINT NOT NULL AUTO_INCREMENT,
    `p_color` VARCHAR(45) NULL,
    `type` VARCHAR(45) NULL,
    `u_color` VARCHAR(45) NULL,
    `date` TIMESTAMP NOT NULL,
    `memo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`defecation_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `medication` (
    `medication_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `momo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`medication_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `weight` (
    `weight_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `weight` INT NOT NULL,
    `memo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`weight_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `vaccination` (
    `vaccination_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `memo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`vaccination_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `walking` (
    `walk_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `time` INT NOT NULL,
    `memo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`walk_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `feeding` (
    `feeding_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `f_cnt` INT NOT NULL DEFAULT 0,
    `w_cnt` INT NOT NULL DEFAULT 0,
    `mono` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`feeding_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `bathing` (
    `bathing_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `momo` VARCHAR(255) NULL,
    `animal_id` BIGINT NOT NULL,
    PRIMARY KEY (`bathing_id`),
    FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`) ON DELETE CASCADE
);

CREATE TABLE `board` (
    `board_id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL,
    `content` VARCHAR(1000) NOT NULL,
    `date` TIMESTAMP NOT NULL,
    `tag` VARCHAR(255) NULL,
    `views` INT NOT NULL DEFAULT 0,
    `user_id` BIGINT NOT NULL,
    `del_yn` TINYINT(1) NULL DEFAULT 0,
    PRIMARY KEY (`board_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
);

CREATE TABLE `scrap` (
    `scrap_id` BIGINT NOT NULL AUTO_INCREMENT,
    `board_id` BIGINT NOT NULL,
    `user_id` BIGINT NOT NULL,
    PRIMARY KEY (`scrap_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`board_id`) REFERENCES `board` (`board_id`)
);

CREATE TABLE `files` (
    `file_id` BIGINT NOT NULL AUTO_INCREMENT,
    `url` TEXT NOT NULL,
    `board_id` BIGINT NOT NULL,
    PRIMARY KEY (`file_id`),
    FOREIGN KEY (`board_id`) REFERENCES `board` (`board_id`)
);

CREATE TABLE `cmt` (
    `reply_id` BIGINT NOT NULL AUTO_INCREMENT,
    `date` TIMESTAMP NOT NULL,
    `content` VARCHAR(1000) NOT NULL,
    `isChecked` TINYINT(1) NOT NULL DEFAULT 0,
    `mdf_dt` TIMESTAMP NULL,
    `user_id` BIGINT NOT NULL,
    `board_id` BIGINT NOT NULL,
    PRIMARY KEY (`reply_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`board_id`) REFERENCES `board` (`board_id`)
);

CREATE TABLE `calendar` (
    `calendar_id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL,
    `date` TIMESTAMP NOT NULL,
    `memo` VARCHAR(500) NOT NULL,
    `s_date` TIMESTAMP NULL,
    `user_id` BIGINT NOT NULL,
    PRIMARY KEY (`calendar_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
);

CREATE TABLE `chatroom` (
    `room_id` BIGINT NOT NULL AUTO_INCREMENT,
    `r_status` VARCHAR(10) NOT NULL DEFAULT 'p',
    PRIMARY KEY (`room_id`)
);

CREATE TABLE `chatmem` (
    `room_id` BIGINT NOT NULL,
    `user_id` BIGINT NOT NULL,
    PRIMARY KEY (`room_id`, `user_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE,
    FOREIGN KEY (`room_id`) REFERENCES `chatroom` (`room_id`) ON DELETE CASCADE
);

CREATE TABLE `message` (
    `mes_id` BIGINT NOT NULL AUTO_INCREMENT,
    `content` VARCHAR(1000) NOT NULL,
    `s_date` TIMESTAMP NOT NULL,
    `isChecked` TINYINT(1) NOT NULL DEFAULT 0,
    `room_id` BIGINT NOT NULL,
    `user_id` BIGINT NOT NULL,
    PRIMARY KEY (`mes_id`),
	FOREIGN KEY (`user_id`, `room_id`) REFERENCES `chatmem` (`user_id`, `room_id`) ON DELETE CASCADE
);

CREATE TABLE `notification` (
    `notify_id` BIGINT NOT NULL AUTO_INCREMENT,
    `user_id` BIGINT NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `isChecked` TINYINT(1) NOT NULL DEFAULT 0,
    `content` VARCHAR(255) NOT NULL,
    `type` VARCHAR(255) NULL,
    `url` TEXT NULL,
    PRIMARY KEY (`notify_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
);
