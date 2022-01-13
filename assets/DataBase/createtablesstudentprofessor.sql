CREATE DATABASE IF NOT EXISTS `systatikesepistoles`;
USE systatikesepistoles;

DROP TABLE IF EXISTS `student`;
DROP TABLE IF EXISTS `professor`;

CREATE TABLE `student` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`first_name` varchar(45) DEFAULT NULL,
`last_name` varchar(45) DEFAULT NULL,
`email` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `professor` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`first_name` varchar(45) DEFAULT NULL,
`last_name` varchar(45) DEFAULT NULL,
`email` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO student (id, first_name, last_name, email) VALUES ('21456','John','Miller','johnmiler@hua.gr');
INSERT INTO student (id, first_name, last_name, email) VALUES ('21567','Maria','Hilton','mariahilton@hua.gr');
INSERT INTO student (id, first_name, last_name, email) VALUES ('21874','Jose','Pappas','josepappas@hua.gr');
INSERT INTO student (id, first_name, last_name, email) VALUES ('21723','Alexandra','Smith','alexandrasmith@hua.gr');
INSERT INTO student (id, first_name, last_name, email) VALUES ('21905','Olivia','Panasoffkee','oliviapanasoffkee@hua.gr');

INSERT INTO professor (id, first_name, last_name, email) VALUES ('22378','James','Jones','jamesjones@hua.gr');
INSERT INTO professor (id, first_name, last_name, email) VALUES ('22851','Robert','Taylor','roberttaylor@hua.gr');
INSERT INTO professor (id, first_name, last_name, email) VALUES ('22009','Amilia','Brown','amiliabrowns@hua.gr');
INSERT INTO professor (id, first_name, last_name, email) VALUES ('22450','Matthew','Green','matthewgreen@hua.gr');
INSERT INTO professor (id, first_name, last_name, email) VALUES ('22329','Timothy','Douglas','timothydouglas@hua.gr');