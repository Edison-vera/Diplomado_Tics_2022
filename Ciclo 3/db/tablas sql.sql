-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema grupo_24
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `grupo_24` ;

-- -----------------------------------------------------
-- Schema grupo_24
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `grupo_24` DEFAULT CHARACTER SET utf8 ;
USE `grupo_24` ;

-- -----------------------------------------------------
-- Table `grupo_24`.`docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`docente` (
  `cedula` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `primer_apellido` VARCHAR(60) NOT NULL,
  `segundo_apellido` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`facultad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`facultad` (
  `numero` VARCHAR(10) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `ubicacion` VARCHAR(45) NOT NULL,
  `docente_cedula` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_facultad_docente1_idx` (`docente_cedula` ASC),
  CONSTRAINT `fk_facultad_docente1`
    FOREIGN KEY (`docente_cedula`)
    REFERENCES `grupo_24`.`docente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`decano`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`decano` (
  `cedula` VARCHAR(15) NOT NULL,
  `nombre_1` VARCHAR(45) NOT NULL,
  `primer_apellido` VARCHAR(10) NOT NULL,
  `segundo_apellido` VARCHAR(60) NOT NULL,
  `facultad_numero` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`cedula`),
  INDEX `fk_decano_facultad1_idx` (`facultad_numero` ASC),
  CONSTRAINT `fk_decano_facultad1`
    FOREIGN KEY (`facultad_numero`)
    REFERENCES `grupo_24`.`facultad` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`celular`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`celular` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo_pais` VARCHAR(3) NOT NULL,
  `numero` VARCHAR(12) NOT NULL,
  `decano_cedula` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_celular_decano_idx` (`decano_cedula` ASC),
  CONSTRAINT `fk_celular_decano`
    FOREIGN KEY (`decano_cedula`)
    REFERENCES `grupo_24`.`decano` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`titulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`titulo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`docente_titulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`docente_titulo` (
  `docente_cedula` VARCHAR(15) NOT NULL,
  `titulo_id` INT NOT NULL,
  INDEX `fk_docente_titulo_docente1_idx` (`docente_cedula` ASC),
  INDEX `fk_docente_titulo_titulo1_idx` (`titulo_id` ASC),
  PRIMARY KEY (`docente_cedula`, `titulo_id`),
  CONSTRAINT `fk_docente_titulo_docente1`
    FOREIGN KEY (`docente_cedula`)
    REFERENCES `grupo_24`.`docente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_docente_titulo_titulo1`
    FOREIGN KEY (`titulo_id`)
    REFERENCES `grupo_24`.`titulo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`asignatura` (
  `codigo` VARCHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `creditos` INT NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`docente_asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`docente_asignatura` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `signatura_codigo` VARCHAR(10) NOT NULL,
  `docente_cedula` VARCHAR(15) NOT NULL,
  INDEX `fk_docente_asignatura_signatura1_idx` (`signatura_codigo` ASC),
  INDEX `fk_docente_asignatura_docente1_idx` (`docente_cedula` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_docente_asignatura_signatura1`
    FOREIGN KEY (`signatura_codigo`)
    REFERENCES `grupo_24`.`asignatura` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_docente_asignatura_docente1`
    FOREIGN KEY (`docente_cedula`)
    REFERENCES `grupo_24`.`docente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`estudiante` (
  `tarjeta_identidad` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(60) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`tarjeta_identidad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `grupo_24`.`estudiante_asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `grupo_24`.`estudiante_asignatura` (
  `signatura_codigo` VARCHAR(10) NOT NULL,
  `estudiante_tarjeta_identidad` VARCHAR(15) NOT NULL,
  INDEX `fk_estudiante_asignatura_signatura1_idx` (`signatura_codigo` ASC),
  INDEX `fk_estudiante_asignatura_estudiante1_idx` (`estudiante_tarjeta_identidad` ASC),
  PRIMARY KEY (`estudiante_tarjeta_identidad`, `signatura_codigo`),
  CONSTRAINT `fk_estudiante_asignatura_signatura1`
    FOREIGN KEY (`signatura_codigo`)
    REFERENCES `grupo_24`.`asignatura` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_estudiante_asignatura_estudiante1`
    FOREIGN KEY (`estudiante_tarjeta_identidad`)
    REFERENCES `grupo_24`.`estudiante` (`tarjeta_identidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
