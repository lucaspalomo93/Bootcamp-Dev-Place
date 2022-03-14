CREATE TABLE `empleados`.`new_table` (
  `id_empleado` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `antiguedad` INT NOT NULL,
  `salario` DOUBLE NOT NULL,
  `nombre_puesto` VARCHAR(45) NOT NULL,
  `municipalidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_empleado`));
