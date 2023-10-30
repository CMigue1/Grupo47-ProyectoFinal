-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 20:37:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `massalud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrativo`
--

CREATE TABLE `administrativo` (
  `id_Administrativo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrativo`
--

INSERT INTO `administrativo` (`id_Administrativo`, `nombre`, `apellido`, `usuario`, `contrasena`) VALUES
(1, 'Miguel', 'Torres', 'miguel@ejemplo.com', '123456'),
(2, 'Valen', 'Iriarte', 'valen@ejemplo.com', '123456'),
(3, 'Ana', 'Juarez', 'ana@ejemplo.com', '123456'),
(4, 'Martin', 'Martinez', 'martin@ejemplo.com', '123456'),
(5, 'Carlos', 'Albornoz', 'carlos@ejemplo.com', '123456'),
(6, 'Sabastian', 'Castillo', 'sebastian@ejemplo.com', '123456'),
(7, 'Maria', 'Lopez', 'maria@ejemplo.com', '123456'),
(8, 'Soledad', 'Silvera', 'soledad@ejemplo.com', '123456'),
(9, 'Pedro', 'Munoz', 'pedro@ejemplo.com', '123456'),
(10, 'Teresita', 'Gallardo', 'tere@ejemplo.com', '123456'),
(11, 'Analia', 'Rodriguez', 'analia@ejemplo.com', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afiliado`
--

CREATE TABLE `afiliado` (
  `idAfiliado` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` int(50) NOT NULL,
  `idPlan` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `afiliado`
--

INSERT INTO `afiliado` (`idAfiliado`, `nombre`, `apellido`, `dni`, `domicilio`, `telefono`, `idPlan`, `activo`) VALUES
(1, 'Luis', 'Martínez', 37425964, 'Av. Corrientes 123, Buenos Aires', 1122334455, 1, 1),
(2, 'Carolina', 'Rodríguez', 40002222, 'Calle San Martín 456, Rosario', 2147483647, 2, 1),
(3, 'Gustavo', 'Gutiérrez', 40003333, 'Av. Belgrano 789, Córdoba', 2147483647, 3, 1),
(4, 'Florencia', 'Fernández', 40004444, 'Calle Entre Ríos 222, Mendoza', 2147483647, 4, 1),
(5, 'Mariano Carlos', 'Díaz', 40005555, 'Av. Santa Fe 555, Rosario', 2147483647, 5, 1),
(6, 'Lucía', 'López', 40006666, 'Calle Libertad 666, Buenos Aires', 2147483647, 1, 1),
(7, 'Martín', 'Gómez', 40007777, 'Av. Corrientes 777, Córdoba', 2147483647, 2, 1),
(8, 'Sofía', 'Suárez', 40008888, 'Calle San Juan 888, Rosario', 2147483647, 3, 1),
(9, 'Alejandro', 'Martín', 40009999, 'Av. Belgrano 999, Buenos Aires', 2147483647, 4, 1),
(10, 'Laura', 'Pérez', 40001010, 'Calle Entre Ríos 1010, Mendoza', 1011223344, 5, 1),
(11, 'David', 'García', 40001111, 'Av. Santa Fe 1111, Rosario', 1122334455, 1, 1),
(12, 'Valentina', 'Rodríguez', 40001212, 'Calle San Martín 1212, Buenos Aires', 1223344556, 2, 1),
(13, 'Carlos', 'Gutierrez', 40001313, 'Av. Corrientes 1313, Córdoba', 1334455667, 3, 1),
(14, 'Julieta', 'López', 40001414, 'Calle Libertad 1414, Rosario', 1445566778, 4, 1),
(15, 'Federico', 'Suárez', 40001515, 'Av. Belgrano 1515, Mendoza', 1556677889, 5, 1),
(16, 'María', 'Martinez', 40001616, 'Av. Santa Fe 1616, Buenos Aires', 1667789001, 1, 1),
(17, 'José', 'Pérez', 40001717, 'Calle Entre Ríos 1717, Rosario', 1778890012, 2, 1),
(18, 'Luciana', 'García', 40001818, 'Av. Corrientes 1818, Córdoba', 1889900123, 3, 1),
(19, 'Ezequiel', 'Rodríguez', 40001919, 'Calle San Juan 1919, Buenos Aires', 1990011234, 4, 1),
(20, 'Victoria', 'López', 40002020, 'Av. Belgrano 2020, Mendoza', 2001122345, 5, 1),
(21, 'Miguel', 'Carrizo', 42140282, 'Argentina', 123123, 2, 0),
(22, 'Vanina', 'Hernandez', 12345, 'Argentina', 1223, 5, 1),
(23, 'Yanina', 'Hernandez', 9876, 'Argentina', 1223, 1, 1),
(28, 'Maria Fernanda', 'Lopez', 15986422, 'San Martin 410', 123456, 1, 1),
(29, 'Ana', 'Diaz', 51646442, 'Puesto del marquez 430', 1548987564, 1, 1),
(30, 'Alex', 'Quiros', 3465554, 'Belgrano 250', 38865432, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `idEspecialidad` int(11) NOT NULL,
  `especialidad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`idEspecialidad`, `especialidad`) VALUES
(1, 'Cardiología'),
(2, 'Dermatología'),
(3, 'Endocrinología'),
(4, 'Gastroenterología'),
(5, 'Ginecología'),
(6, 'Neurología'),
(7, 'Oftalmología'),
(8, 'Otorrinolaringología'),
(9, 'Pediatría'),
(10, 'Psiquiatría'),
(11, 'Traumatología'),
(12, 'Urología'),
(13, 'Cirugía General'),
(14, 'Oncología'),
(15, 'Nefrología'),
(16, 'Neumonología'),
(17, 'Hematología'),
(18, 'Reumatología'),
(19, 'Angiología'),
(20, 'Medicina Interna'),
(21, 'Medicina Deportiva'),
(22, 'Oncología Pediátrica'),
(23, 'Hematología Pediátrica'),
(24, 'Dermatología Pediátrica'),
(25, 'Neurología Pediátrica'),
(26, 'Neumonología Pediátrica'),
(27, 'Endocrinología Pediátrica'),
(28, 'Oftalmología Pediátrica'),
(29, 'Cardiología Pediátrica'),
(30, 'Gastroenterología Pediátrica'),
(31, 'Urología Pediátrica'),
(32, 'Cirugía Pediátrica'),
(33, 'Psicología Clínica'),
(34, 'Psicoterapia'),
(35, 'Nutrición'),
(36, 'Odontología'),
(37, 'Anestesiología'),
(38, 'Radiología'),
(39, 'Patología'),
(40, 'Oncología Radioterápica'),
(41, 'Psiquiatría Pediátrica'),
(42, 'Cirugía Cardiovascular'),
(43, 'Cirugía Plástica'),
(44, 'Cirugía Maxilofacial'),
(45, 'Cirugía Vascular'),
(46, 'Ginecología Oncológica'),
(47, 'Inmunología'),
(48, 'Reproducción Asistida'),
(49, 'Reumatología Pediátrica'),
(50, 'Sexología'),
(51, 'Toxicología'),
(52, 'Cirugía de Mano'),
(53, 'Cirugía Torácica'),
(54, 'Cirugía Oncológica'),
(55, 'Cirugía de Columna'),
(56, 'Cirugía de Cabeza y Cuello'),
(57, 'Cirugía Bariátrica'),
(58, 'Medicina Nuclear'),
(59, 'Neurocirugía Pediátrica'),
(60, 'Traumatología Pediátrica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

CREATE TABLE `orden` (
  `idOrden` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `formaPago` varchar(100) NOT NULL,
  `importe` double NOT NULL,
  `idAfiliado` int(11) NOT NULL,
  `idPrestador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `orden`
--

INSERT INTO `orden` (`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`) VALUES
(1, '2023-09-23', 'Efectivo', 150.5, 1, 1),
(2, '2023-09-25', 'Efectivo', 200, 2, 3),
(3, '2023-09-25', 'Efectivo', 120.75, 3, 2),
(4, '2023-09-26', 'Débito', 180.25, 4, 5),
(5, '2023-09-27', 'Efectivo', 100, 5, 4),
(6, '2023-09-28', 'Efectivo', 300, 6, 6),
(7, '2023-09-29', 'Débito', 250.75, 7, 8),
(8, '2023-09-30', 'Efectivo', 180.5, 8, 7),
(9, '2023-10-01', 'Débito', 190.2, 9, 10),
(10, '2023-10-02', 'Efectivo', 220, 10, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planes`
--

CREATE TABLE `planes` (
  `idPlan` int(11) NOT NULL,
  `tipoDePlan` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `adherentes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `planes`
--

INSERT INTO `planes` (`idPlan`, `tipoDePlan`, `precio`, `adherentes`) VALUES
(1, 'Plan Mas Joven', 50, 1),
(2, 'Plan Mas Familia', 100, 4),
(3, 'Plan Mas Adultos', 80, 2),
(4, 'Plan Mas Gold', 150, 3),
(5, 'Plan Premium', 200, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestador`
--

CREATE TABLE `prestador` (
  `idPrestador` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` int(11) NOT NULL,
  `idEspecialidad` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestador`
--

INSERT INTO `prestador` (`idPrestador`, `nombre`, `apellido`, `dni`, `domicilio`, `telefono`, `idEspecialidad`, `activo`) VALUES
(1, 'Lucas', 'Sanchez', 41234567, 'Av. Corrientes 123, Buenos Aires', 1122334455, 1, 1),
(2, 'Martina', 'Peralta', 52234567, 'Calle San Martín 456, Rosario', 2147483647, 2, 1),
(3, 'Javier', 'Ferrari', 63456789, 'Av. Belgrano 789, Córdoba', 2147483647, 3, 1),
(4, 'Camila', 'Rios', 74567890, 'Calle Entre Ríos 1234, Mendoza', 2147483647, 4, 1),
(5, 'Sofía', 'Mendoza', 85638901, 'Av. Pueyrredón 890, Salta', 2147483647, 5, 1),
(6, 'Mateo', 'Gimenez', 96789812, 'Calle 9 de Julio 567, La Plata', 2147483647, 6, 1),
(7, 'Valentina', 'Alonso', 17890123, 'Av. Libertador 890, San Juan', 2147483647, 7, 1),
(8, 'Maximiliano', 'Barrios', 28901234, 'Calle Lavalle 123, Tucumán', 2147483647, 8, 1),
(9, 'Isabella', 'Torres', 30987654, 'Av. Independencia 567, Bahía Blanca', 2147483647, 9, 1),
(10, 'Lautaro', 'Correa', 40123456, 'Calle Sarmiento 456, Mar del Plata', 2147483647, 10, 1),
(11, 'Renata', 'Ortega', 51234567, 'Av. San Martín 789, Santa Fe', 1112223344, 11, 1),
(12, 'Alejandro', 'Herrera', 62345678, 'Calle Entre Ríos 789, Resistencia', 2147483647, 12, 1),
(13, 'Valeria', 'Gomez', 73456789, 'Av. Belgrano 1234, Paraná', 2147483647, 13, 1),
(14, 'Facundo', 'Rivas', 84567890, 'Calle 9 de Julio 567, Formosa', 2147483647, 14, 1),
(15, 'Agustina', 'Diaz', 95678901, 'Av. Pueyrredón 890, San Salvador de Jujuy', 2147483647, 15, 1),
(16, 'Ignacio', 'Vargas', 6789012, 'Calle Lavalle 123, Posadas', 2147483647, 16, 1),
(17, 'Martina', 'Ruiz', 17901234, 'Av. Independencia 567, Santiago del Estero', 2147483647, 17, 1),
(18, 'Sebastián', 'Luna', 29012345, 'Calle Sarmiento 456, Ushuaia', 2147483647, 18, 1),
(19, 'Victoria', 'Mansilla', 30123456, 'Av. San Martín 789, Viedma', 2147483647, 19, 1),
(20, 'Jeremías', 'Paz', 41234367, 'Calle Entre Ríos 1234, Rawson', 2147483647, 20, 1),
(21, 'Lucía', 'Pereyra', 52224567, 'Av. Belgrano 890, Neuquén', 112233445, 21, 1),
(22, 'Thiago', 'Mendez', 61456789, 'Calle 9 de Julio 456, La Rioja', 2147483647, 22, 1),
(23, 'Amanda', 'Villalba', 74547890, 'Av. Pueyrredón 789, Formosa', 2147483647, 23, 1),
(24, 'Emilio', 'Aguirre', 85678901, 'Calle Lavalle 456, San Juan', 2147483647, 24, 1),
(25, 'Mía', 'Gallardo', 96789012, 'Av. San Martín 1234, San Luis', 2147483647, 25, 1),
(26, 'Benjamín', 'Olivera', 7890123, 'Calle Entre Ríos 567, Santa Rosa', 2147483647, 26, 1),
(27, 'Julieta', 'Godoy', 18901234, 'Av. Libertador 890, Salta', 2147483647, 27, 1),
(28, 'Simón', 'Caballero', 20912345, 'Calle Sarmiento 456, Ushuaia', 2147483647, 28, 1),
(29, 'Camila', 'Campos', 30127456, 'Av. San Martín 789, Viedma', 2147483647, 29, 1),
(30, 'Tobías', 'Santos', 41234560, 'Calle Entre Ríos 1234, Rawson', 2147483647, 30, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrativo`
--
ALTER TABLE `administrativo`
  ADD PRIMARY KEY (`id_Administrativo`);

--
-- Indices de la tabla `afiliado`
--
ALTER TABLE `afiliado`
  ADD PRIMARY KEY (`idAfiliado`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idPlan` (`idPlan`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`idEspecialidad`);

--
-- Indices de la tabla `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`idOrden`),
  ADD KEY `idAfiliado` (`idAfiliado`),
  ADD KEY `idPrestador` (`idPrestador`);

--
-- Indices de la tabla `planes`
--
ALTER TABLE `planes`
  ADD PRIMARY KEY (`idPlan`);

--
-- Indices de la tabla `prestador`
--
ALTER TABLE `prestador`
  ADD PRIMARY KEY (`idPrestador`),
  ADD UNIQUE KEY `idEspecialidad_2` (`idEspecialidad`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idEspecialidad` (`idEspecialidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrativo`
--
ALTER TABLE `administrativo`
  MODIFY `id_Administrativo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `afiliado`
--
ALTER TABLE `afiliado`
  MODIFY `idAfiliado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `idEspecialidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `orden`
--
ALTER TABLE `orden`
  MODIFY `idOrden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `planes`
--
ALTER TABLE `planes`
  MODIFY `idPlan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `prestador`
--
ALTER TABLE `prestador`
  MODIFY `idPrestador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `afiliado`
--
ALTER TABLE `afiliado`
  ADD CONSTRAINT `afiliado_ibfk_1` FOREIGN KEY (`idPlan`) REFERENCES `planes` (`idPlan`);

--
-- Filtros para la tabla `orden`
--
ALTER TABLE `orden`
  ADD CONSTRAINT `orden_ibfk_2` FOREIGN KEY (`idPrestador`) REFERENCES `prestador` (`idPrestador`),
  ADD CONSTRAINT `orden_ibfk_3` FOREIGN KEY (`idAfiliado`) REFERENCES `afiliado` (`idAfiliado`);

--
-- Filtros para la tabla `prestador`
--
ALTER TABLE `prestador`
  ADD CONSTRAINT `prestador_ibfk_1` FOREIGN KEY (`idEspecialidad`) REFERENCES `especialidad` (`idEspecialidad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
