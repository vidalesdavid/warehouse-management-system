-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-05-2024 a las 08:06:02
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `upslpbd_persona`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `modelo` varchar(20) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL,
  `ubicacion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `telefono`, `email`) VALUES
(0, 'aaaaaaaaaaaa', '33333333333', 'fdsfds'),
(1, 'Juan', '444444', 'juan.com'),
(2, 'Jose', '4454435', 'jose.com'),
(3, 'Maricarmen', '4454435', 'maricaermen.com'),
(6, 'Nuevo', '444444', 'juan.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `idPedido` int(11) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL,
  `subtotal` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logins`
--

CREATE TABLE `logins` (
  `user` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `fecha` varchar(60) NOT NULL,
  `hora` varchar(60) NOT NULL,
  `exito` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `logins`
--

INSERT INTO `logins` (`user`, `pass`, `fecha`, `hora`, `exito`) VALUES
('telnet', 'telnetw', 'Thu Apr 18 21:17:46 CDT 2024', 'Thu Apr 18 21:17:46 CDT 2024', 0),
('david', 'david', 'Thu Apr 18 21:18:14 CDT 2024', 'Thu Apr 18 21:18:14 CDT 2024', 1),
('admin', 'user', 'Thu Apr 18 21:48:02 CDT 2024', 'Thu Apr 18 21:48:02 CDT 2024', 0),
('user', 'admin', 'Thu Apr 18 21:48:16 CDT 2024', 'Thu Apr 18 21:48:16 CDT 2024', 1),
('useraaaa', 'admin', 'Thu Apr 18 21:48:26 CDT 2024', 'Thu Apr 18 21:48:26 CDT 2024', 0),
('user', 'admine', 'Thu Apr 18 22:06:38 CDT 2024', 'Thu Apr 18 22:06:38 CDT 2024', 0),
('admin', 'admin', 'Wed May 01 20:29:43 CDT 2024', 'Wed May 01 20:29:43 CDT 2024', 0),
('admin', 'admin123', 'Wed May 01 20:32:02 CDT 2024', 'Wed May 01 20:32:02 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 20:41:28 CDT 2024', 'Wed May 01 20:41:28 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 20:41:43 CDT 2024', 'Wed May 01 20:41:43 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 20:43:47 CDT 2024', 'Wed May 01 20:43:47 CDT 2024', 1),
('david', 'david', 'Wed May 01 20:44:04 CDT 2024', 'Wed May 01 20:44:04 CDT 2024', 1),
('admin123', 'admin', 'Wed May 01 20:44:37 CDT 2024', 'Wed May 01 20:44:37 CDT 2024', 0),
('admin', 'admin123', 'Wed May 01 20:44:52 CDT 2024', 'Wed May 01 20:44:52 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 20:52:35 CDT 2024', 'Wed May 01 20:52:35 CDT 2024', 1),
('david', 'david', 'Wed May 01 20:52:51 CDT 2024', 'Wed May 01 20:52:51 CDT 2024', 1),
('add', 'd', 'Wed May 01 20:54:19 CDT 2024', 'Wed May 01 20:54:19 CDT 2024', 0),
('admin', 'admin123', 'Wed May 01 20:54:27 CDT 2024', 'Wed May 01 20:54:27 CDT 2024', 1),
('david', 'david', 'Wed May 01 21:04:17 CDT 2024', 'Wed May 01 21:04:17 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 21:14:41 CDT 2024', 'Wed May 01 21:14:41 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 21:16:26 CDT 2024', 'Wed May 01 21:16:26 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 21:19:31 CDT 2024', 'Wed May 01 21:19:31 CDT 2024', 1),
('admin', 'admin123', 'Wed May 01 21:20:11 CDT 2024', 'Wed May 01 21:20:11 CDT 2024', 1),
('david', 'david', 'Wed May 01 21:43:56 CDT 2024', 'Wed May 01 21:43:56 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:24:23 CDT 2024', 'Wed May 01 22:24:23 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:25:45 CDT 2024', 'Wed May 01 22:25:45 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:26:40 CDT 2024', 'Wed May 01 22:26:40 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:28:45 CDT 2024', 'Wed May 01 22:28:45 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:30:31 CDT 2024', 'Wed May 01 22:30:31 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:37:49 CDT 2024', 'Wed May 01 22:37:49 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:38:55 CDT 2024', 'Wed May 01 22:38:55 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:40:18 CDT 2024', 'Wed May 01 22:40:18 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:42:07 CDT 2024', 'Wed May 01 22:42:07 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:43:30 CDT 2024', 'Wed May 01 22:43:30 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:44:15 CDT 2024', 'Wed May 01 22:44:15 CDT 2024', 1),
('david', 'david', 'Wed May 01 22:59:42 CDT 2024', 'Wed May 01 22:59:42 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:01:55 CDT 2024', 'Wed May 01 23:01:55 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:09:54 CDT 2024', 'Wed May 01 23:09:54 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:16:26 CDT 2024', 'Wed May 01 23:16:26 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:17:03 CDT 2024', 'Wed May 01 23:17:03 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:17:59 CDT 2024', 'Wed May 01 23:17:59 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:19:12 CDT 2024', 'Wed May 01 23:19:12 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:19:43 CDT 2024', 'Wed May 01 23:19:43 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:24:57 CDT 2024', 'Wed May 01 23:24:57 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:25:53 CDT 2024', 'Wed May 01 23:25:53 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:38:19 CDT 2024', 'Wed May 01 23:38:19 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:41:20 CDT 2024', 'Wed May 01 23:41:20 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:42:45 CDT 2024', 'Wed May 01 23:42:45 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:44:32 CDT 2024', 'Wed May 01 23:44:32 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:45:17 CDT 2024', 'Wed May 01 23:45:17 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:52:58 CDT 2024', 'Wed May 01 23:52:58 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:54:11 CDT 2024', 'Wed May 01 23:54:11 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:55:50 CDT 2024', 'Wed May 01 23:55:50 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:56:33 CDT 2024', 'Wed May 01 23:56:33 CDT 2024', 1),
('david', 'david', 'Wed May 01 23:58:37 CDT 2024', 'Wed May 01 23:58:37 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:01:29 CDT 2024', 'Thu May 02 00:01:29 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:02:42 CDT 2024', 'Thu May 02 00:02:42 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:05:05 CDT 2024', 'Thu May 02 00:05:05 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:06:46 CDT 2024', 'Thu May 02 00:06:46 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:08:06 CDT 2024', 'Thu May 02 00:08:06 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:09:02 CDT 2024', 'Thu May 02 00:09:02 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:25:51 CDT 2024', 'Thu May 02 00:25:51 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:26:49 CDT 2024', 'Thu May 02 00:26:49 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:30:02 CDT 2024', 'Thu May 02 00:30:02 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:30:40 CDT 2024', 'Thu May 02 00:30:40 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:33:04 CDT 2024', 'Thu May 02 00:33:04 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:34:25 CDT 2024', 'Thu May 02 00:34:25 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:36:25 CDT 2024', 'Thu May 02 00:36:25 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:37:29 CDT 2024', 'Thu May 02 00:37:29 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:43:25 CDT 2024', 'Thu May 02 00:43:25 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:44:17 CDT 2024', 'Thu May 02 00:44:17 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:49 CDT 2024', 'Thu May 02 00:48:49 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:50 CDT 2024', 'Thu May 02 00:48:50 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:52 CDT 2024', 'Thu May 02 00:48:52 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:53 CDT 2024', 'Thu May 02 00:48:53 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:54 CDT 2024', 'Thu May 02 00:48:54 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:48:55 CDT 2024', 'Thu May 02 00:48:55 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:49:21 CDT 2024', 'Thu May 02 00:49:21 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:50:18 CDT 2024', 'Thu May 02 00:50:18 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:50:20 CDT 2024', 'Thu May 02 00:50:20 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:50:55 CDT 2024', 'Thu May 02 00:50:55 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:51:24 CDT 2024', 'Thu May 02 00:51:24 CDT 2024', 1),
('david', 'david', 'Thu May 02 00:55:29 CDT 2024', 'Thu May 02 00:55:29 CDT 2024', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `total` float NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `estado`, `total`, `idCliente`) VALUES
(1, 'Entregado', 7898, 1),
(2, 'Entregado', 7898, 1),
(3, 'No Entregado', 7898, 1),
(4, 'No Entregado', 7898, 1),
(5, 'Entregado', 7898, 1),
(6, 'Entregado', 7898, 1),
(64, 'Entregado', 342342, 34);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `curp` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `edad` int(2) NOT NULL,
  `colorOjos` varchar(10) NOT NULL,
  `colorPiel` varchar(10) NOT NULL,
  `colorCabello` varchar(10) NOT NULL,
  `tipoCabello` varchar(10) NOT NULL,
  `estatura` float NOT NULL,
  `peso` float NOT NULL,
  `nacionalidad` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`curp`, `nombre`, `apellidos`, `sexo`, `edad`, `colorOjos`, `colorPiel`, `colorCabello`, `tipoCabello`, `estatura`, `peso`, `nacionalidad`) VALUES
('AMFFES', 'Juana', 'CAMBIO', 'Femenino', 38, 'null', 'null', 'null', 'null', 0, 0, 'Mexicana'),
('PPSSSSS', 'Mayo', 'CAMBIO', 'Femenino', 38, 'null', 'null', 'null', 'null', 0, 0, 'Mexicana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `user` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`user`, `pass`) VALUES
('user', 'admin'),
('david', 'david'),
('telnet', 'telnet'),
('admin', 'admin123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`curp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
