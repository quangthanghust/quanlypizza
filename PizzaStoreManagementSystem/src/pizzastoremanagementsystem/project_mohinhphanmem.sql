-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2022 at 12:18 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_mohinhphanmem`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounttable`
--

CREATE TABLE `accounttable` (
  `ACCID` int(50) NOT NULL,
  `NAME` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `PASSWORD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Gender` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `accounttable`
--

INSERT INTO `accounttable` (`ACCID`, `NAME`, `PASSWORD`, `Gender`) VALUES
(1, 'Duy', '12345', 'Male'),
(2, 'Hung', '56789', 'Male'),
(3, 'Thang', '02468', 'Male'),
(4, 'Long', '13579', 'Male'),
(5, 'Luong', '54321', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `soldproductstable`
--

CREATE TABLE `soldproductstable` (
  `PROID` int(11) NOT NULL,
  `NAME` varchar(15) NOT NULL,
  `PRICE` int(11) NOT NULL,
  `SOLDAMOUNT` int(11) NOT NULL,
  `TOTAL` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `soldproductstable`
--

INSERT INTO `soldproductstable` (`PROID`, `NAME`, `PRICE`, `SOLDAMOUNT`, `TOTAL`) VALUES
(1, 'pizza A', 100000, 2, 200000),
(2, 'pizza B', 150000, 5, 750000),
(3, 'pizza C', 180000, 3, 540000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
