-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2023 at 07:38 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `car_management_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `carowner`
--

CREATE TABLE `carowner` (
  `id_co` int(11) NOT NULL,
  `prenom` varchar(250) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `tel` varchar(250) NOT NULL,
  `CNI` varchar(11) NOT NULL,
  `DateNaissance` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `carowner`
--

INSERT INTO `carowner` (`id_co`, `prenom`, `nom`, `tel`, `CNI`, `DateNaissance`) VALUES
(8, 'Test1', 'Test2', '7777', '1000', '2022-02-01'),
(9, 'Test2', 'Test3', '77778', '2000', '2023-02-03'),
(10, 'Test4', 'Test4', '77774', '4000', '2004-02-07'),
(11, 'Test5', 'Test5', '77775', '10005', '2025-02-02'),
(12, 'Test122', 'Test222', '777722', '100022', '2023-02-10'),
(13, 'Test7', 'Test7', '7777777', '7000', '2007-02-06'),
(14, 'Test1', 'Test2', '7777', '1000', '2026-02-21'),
(15, 'Test1', 'Test2', '7777', '1000', '2027-02-26'),
(16, 'Test1', 'Test2', '7777', '1000', '2024-02-29'),
(17, 'Test8', 'test8', '44444', '23456', '2030-02-08');

-- --------------------------------------------------------

--
-- Table structure for table `cartype`
--

CREATE TABLE `cartype` (
  `id_c` int(11) NOT NULL,
  `matricule` varchar(250) NOT NULL,
  `marque` varchar(250) NOT NULL,
  `modele` varchar(250) NOT NULL,
  `transmission` varchar(250) NOT NULL,
  `annee` int(11) NOT NULL,
  `id_co` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cartype`
--

INSERT INTO `cartype` (`id_c`, `matricule`, `marque`, `modele`, `transmission`, `annee`, `id_co`) VALUES
(8, 'ZZZZ', 'Toy', 'ota', 'Manuel', 2014, 8),
(9, 'ZZZZ2', 'Toyy', 'otaa', 'Manuel', 2002, 1),
(10, 'ZZZZ4', 'Toy4', 'ota4', 'Hybrid', 2009, 1),
(11, 'ZZZZ5', 'Toy5', 'ota5', 'Automatique', 2005, 1),
(12, 'ZZZZ22', 'Toy22', 'ota22', 'Manuel', 2019, 1),
(13, 'ZZZZ77', 'Toy7', 'ota7', 'Manuel', 2007, 1),
(14, 'ZZZZ', 'Toy', 'ota', 'Manuel', 2026, 16),
(15, '66TT66', 'hop', 'laaa', 'Manuel', 2000, 17);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carowner`
--
ALTER TABLE `carowner`
  ADD PRIMARY KEY (`id_co`);

--
-- Indexes for table `cartype`
--
ALTER TABLE `cartype`
  ADD PRIMARY KEY (`id_c`),
  ADD KEY `id_co` (`id_co`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carowner`
--
ALTER TABLE `carowner`
  MODIFY `id_co` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `cartype`
--
ALTER TABLE `cartype`
  MODIFY `id_c` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cartype`
--
ALTER TABLE `cartype`
  ADD CONSTRAINT `cartype_ibfk_1` FOREIGN KEY (`id_c`) REFERENCES `carowner` (`id_co`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
