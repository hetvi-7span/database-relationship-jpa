-- MySQL dump 10.16  Distrib 10.1.48-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: banking-system-management
-- ------------------------------------------------------
-- Server version	10.1.48-MariaDB-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `oo_b_user_details`
--

DROP TABLE IF EXISTS `oo_b_user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_b_user_details` (
  `user_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `aadhar_card_no` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `pan_card_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_b_user_details`
--

LOCK TABLES `oo_b_user_details` WRITE;
/*!40000 ALTER TABLE `oo_b_user_details` DISABLE KEYS */;
INSERT INTO `oo_b_user_details` VALUES (1,'2023-01-03 18:25:37',0,'2023-01-03 18:25:37',0,'string','2023-01-03','string'),(2,'2023-01-03 19:22:02',0,'2023-01-03 19:22:02',0,'string','2023-01-03','string');
/*!40000 ALTER TABLE `oo_b_user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oo_b_user_master`
--

DROP TABLE IF EXISTS `oo_b_user_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_b_user_master` (
  `user_master_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_detail_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_master_id`),
  KEY `FKr8nlueptiiaoi9u8b24xmwe4c` (`user_detail_id`),
  CONSTRAINT `FKr8nlueptiiaoi9u8b24xmwe4c` FOREIGN KEY (`user_detail_id`) REFERENCES `oo_b_user_details` (`user_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_b_user_master`
--

LOCK TABLES `oo_b_user_master` WRITE;
/*!40000 ALTER TABLE `oo_b_user_master` DISABLE KEYS */;
INSERT INTO `oo_b_user_master` VALUES (1,'2023-01-03 18:25:37',0,'2023-01-03 18:25:37',0,'string','string','string','string','string',1),(2,'2023-01-03 19:22:02',0,'2023-01-03 19:22:02',0,'string','hetvi','string','string','string',2);
/*!40000 ALTER TABLE `oo_b_user_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oo_c_user_details`
--

DROP TABLE IF EXISTS `oo_c_user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_c_user_details` (
  `user_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `aadhar_card_no` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `pan_card_no` varchar(255) DEFAULT NULL,
  `user_master_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_detail_id`),
  KEY `FK4w66nmfoypy6kmtqt1fg22yrr` (`user_master_id`),
  CONSTRAINT `FK4w66nmfoypy6kmtqt1fg22yrr` FOREIGN KEY (`user_master_id`) REFERENCES `oo_c_user_master` (`user_master_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_c_user_details`
--

LOCK TABLES `oo_c_user_details` WRITE;
/*!40000 ALTER TABLE `oo_c_user_details` DISABLE KEYS */;
INSERT INTO `oo_c_user_details` VALUES (1,'2023-01-03 19:04:41',0,'2023-01-03 19:04:41',0,'string','2023-01-03','string',1),(2,'2023-01-03 19:21:23',0,'2023-01-03 19:21:23',0,'string','2023-01-03','string',2);
/*!40000 ALTER TABLE `oo_c_user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oo_c_user_master`
--

DROP TABLE IF EXISTS `oo_c_user_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_c_user_master` (
  `user_master_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_master_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_c_user_master`
--

LOCK TABLES `oo_c_user_master` WRITE;
/*!40000 ALTER TABLE `oo_c_user_master` DISABLE KEYS */;
INSERT INTO `oo_c_user_master` VALUES (1,'2023-01-03 19:04:41',0,'2023-01-03 19:04:41',0,'string','string','string','string','string'),(2,'2023-01-03 19:21:23',0,'2023-01-03 19:21:23',0,'string','hetvi','string','string','string');
/*!40000 ALTER TABLE `oo_c_user_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oo_p_user_details`
--

DROP TABLE IF EXISTS `oo_p_user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_p_user_details` (
  `user_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `aadhar_card_no` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `pan_card_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_p_user_details`
--

LOCK TABLES `oo_p_user_details` WRITE;
/*!40000 ALTER TABLE `oo_p_user_details` DISABLE KEYS */;
INSERT INTO `oo_p_user_details` VALUES (1,'2023-01-03 19:20:26',0,'2023-01-03 19:20:26',0,'string','2023-01-03','string');
/*!40000 ALTER TABLE `oo_p_user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oo_p_user_master`
--

DROP TABLE IF EXISTS `oo_p_user_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oo_p_user_master` (
  `user_master_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_detail_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_master_id`),
  KEY `FK5ruhatgxl122p2a82a3j9bc2a` (`user_detail_id`),
  CONSTRAINT `FK5ruhatgxl122p2a82a3j9bc2a` FOREIGN KEY (`user_detail_id`) REFERENCES `oo_p_user_details` (`user_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oo_p_user_master`
--

LOCK TABLES `oo_p_user_master` WRITE;
/*!40000 ALTER TABLE `oo_p_user_master` DISABLE KEYS */;
INSERT INTO `oo_p_user_master` VALUES (1,'2023-01-03 19:20:26',0,'2023-01-03 19:20:26',0,'string','hetvi','string','string','string',1);
/*!40000 ALTER TABLE `oo_p_user_master` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-03 19:23:16
