CREATE DATABASE  IF NOT EXISTS `hospital_app` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hospital_app`;
-- MySQL dump 10.13  Distrib 8.0.20, for macos10.15 (x86_64)
--
-- Host: localhost    Database: hospital_app
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doctores`
--

DROP TABLE IF EXISTS `doctores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctores` (
  `id_doctor` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `id_especialidad` int DEFAULT NULL,
  `id_ref` int DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id_doctor`),
  KEY `FKf7gr01dac86l8jyxykih046av` (`id_especialidad`),
  CONSTRAINT `FKf7gr01dac86l8jyxykih046av` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidades` (`id_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctores`
--

LOCK TABLES `doctores` WRITE;
/*!40000 ALTER TABLE `doctores` DISABLE KEYS */;
INSERT INTO `doctores` VALUES (1,'Yashin','Calderon','1993-04-11 20:00:00','Av. Tarija 634',3,3,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(2,'Pablo ','Padilla','1987-03-11 20:00:00','Av. Circunvalacion 345',3,3,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(3,'Rebeca','Salinas','1972-07-19 20:00:00','c/ Eufronio Viscarra 352',4,4,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(4,'Gonzalo','Terrazas','1989-04-13 20:00:00','c/ Simeon Roncal 523',4,4,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(5,'Leonardo','Contreras','1993-01-31 20:00:00','Av. Chapare',5,5,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(6,'Lorena','Cano','1989-07-12 20:00:00','Av. 9 de Abril 436',8,8,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(7,'Michel','Castro','1991-06-11 20:00:00','Av. Alto de la Alianza 435',1,1,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(8,'Marcelo ','Rodriguez','1990-01-27 20:00:00','Av. Peru 425',1,1,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(9,'Jorge','Cano','1969-10-14 20:00:00','Av. Venezuela 52',2,2,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(10,'Mauricio','Jurgen','1967-07-10 20:00:00','Av. Beijing 532',6,6,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00'),(11,'Alvaro','Cartagena','1992-02-12 20:00:00','Av. Belzu 153',7,7,'Alejandro','Alejandro','2020-06-17 20:00:00','2020-06-17 20:00:00');
/*!40000 ALTER TABLE `doctores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidades` (
  `id_especialidad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` mediumtext,
  `id_hospital` int DEFAULT NULL,
  `id_ref` int DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_especialidad`),
  KEY `FKleuib0hr7w8buk9wkm0dvcv0` (`id_hospital`),
  CONSTRAINT `FKleuib0hr7w8buk9wkm0dvcv0` FOREIGN KEY (`id_hospital`) REFERENCES `hospitales` (`id_hospital`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (1,'ALERGIA E INMUNOLOGÍA ','Es la especialidad médica que comprende el conocimiento, diagnóstico y tratamiento de la patología producida por mecanismos inmunológicos. ',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(2,'ANESTESIOLOGÍA','La anestesiología es la especialidad médica dedicada a la\natención y cuidados especiales de los pacientes durante las intervenciones quirúrgicas u otros procesos que puedan resultar molestos o dolorosos',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(3,'ALERGIA E INMUNOLOGIA','Es la especialidad médica que comprende el conocimiento, diagnóstico y tratamiento de la patología producida por mecanismos inmunológicos. ',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(4,'ANESTESIOLOGIA','La anestesiología es la especialidad médica dedicada a la\natención y cuidados especiales de los pacientes durante las intervenciones quirúrgicas u otros procesos que puedan resultar molestos o dolorosos',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(5,'CARDIOLOGIA','Es la especialidad médica, encargada del estudio, diagnóstico y\ntratamiento de las enfermedades del corazón y del aparato circulatorio',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(6,'CIRUGIA INFANTIL','La cirugía es la especialidad dedicada al diagnóstico, cuidado preoperatorio, operación y manejo postoperatorio de los problemas que presentan el feto, lactante, escolar, adolescente y joven adulto. ',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(7,'DERMATOLOGIA','Es la especialidad médica encargada del estudio de la estructura y función de la piel, así como de las enfermedades que la afectan, su diagnóstico, prevención y tratamiento.',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(8,'GASTROENTEROLOGIA','Es la especialidad médica que se ocupa de la atención,\ndiagnóstico y tratamiento de las enfermedades del aparato digestivo y órganos asociados, conformado.',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (7);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historiales`
--

DROP TABLE IF EXISTS `historiales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historiales` (
  `id_historial` int NOT NULL AUTO_INCREMENT,
  `descripcion` longtext,
  `fecha` datetime DEFAULT NULL,
  `id_paciente` int DEFAULT NULL,
  `id_ref` int DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_historial`),
  KEY `FK8hnhwlkyhkyyaxkdn56axstpj` (`id_paciente`),
  CONSTRAINT `FK8hnhwlkyhkyyaxkdn56axstpj` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id_paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historiales`
--

LOCK TABLES `historiales` WRITE;
/*!40000 ALTER TABLE `historiales` DISABLE KEYS */;
INSERT INTO `historiales` VALUES (1,'Visita medica de rutina.','2020-06-14 20:00:00',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(2,'Consulta por gripe.','2020-06-15 20:00:00',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(3,'Cirugia por Fractura','2020-03-03 20:00:00',11,11,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(4,'Prueba de Dengue negativa','2020-06-01 20:00:00',14,14,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(5,'Prueba de Reflejos','2020-06-01 20:00:00',17,17,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(6,'Visita Rutinaria','2020-06-16 20:00:00',16,16,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro');
/*!40000 ALTER TABLE `historiales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospitales`
--

DROP TABLE IF EXISTS `hospitales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospitales` (
  `id_hospital` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_hospital`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospitales`
--

LOCK TABLES `hospitales` WRITE;
/*!40000 ALTER TABLE `hospitales` DISABLE KEYS */;
INSERT INTO `hospitales` VALUES (1,'Hospital Belga','2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(2,'Hospital del Sur','2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(5,'Hospital Solomon Klein','2020-06-18 10:54:02','2020-06-18 10:37:26','Alejandro','Alejandro'),(6,'Hospital Viedma','2020-06-18 11:01:57','2020-06-18 11:01:57',NULL,NULL);
/*!40000 ALTER TABLE `hospitales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientes` (
  `id_paciente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `id_hospital` int DEFAULT NULL,
  `id_ref` int DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_paciente`),
  KEY `FK4vfycmtv80uy2mat6c3juivaq` (`id_hospital`),
  CONSTRAINT `FK4vfycmtv80uy2mat6c3juivaq` FOREIGN KEY (`id_hospital`) REFERENCES `hospitales` (`id_hospital`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Leonardo','Obando','1998-12-25 20:00:00','Av Chapare',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(10,'Sofia','Obando','2002-06-05 20:00:00','Av. Chapare 4452',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(11,'Gimena','Cano','1970-10-09 20:00:00','Av Aniceto Arce # 758 entre Juan de la Cruz Torrez y puente muyurina',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(12,'Maria','Cano','2020-06-02 20:00:00','Venezuela Final #1180',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(14,'David','Broncano','1992-01-05 20:00:00','Av. Madrid # 4567',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(15,'Cocke','Peinado','1974-05-07 20:00:00','Av. Don Bosco',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(16,'Alex ','Contreras','1993-02-17 20:00:00','Av. Belzu #189',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(17,'Hector','De Miguel','1990-06-05 20:00:00','av madrid',1,1,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(18,'Patricio','Salinas','1991-11-09 20:00:00','Av juan pablo II',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro'),(19,'Guillermo','Sanchez','1996-01-10 20:00:00','Av. Heroinas #432',2,2,'2020-06-17 20:00:00','2020-06-17 20:00:00','Alejandro','Alejandro');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-18 11:21:47
