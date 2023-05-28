-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 28, 2023 at 01:57 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empmange`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(20) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `pass`) VALUES
('admin@mail.com', '21232f297a57a5a743894a0e4a801fc3');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `nid` int(20) DEFAULT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `gendar` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `phone` int(15) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `emp_id` int(20) NOT NULL,
  `jointdate` date DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `bank` varchar(50) DEFAULT NULL,
  `acc_num` int(10) DEFAULT NULL,
  `comments` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`nid`, `fname`, `lname`, `gendar`, `dob`, `city`, `phone`, `email`, `emp_id`, `jointdate`, `dept`, `bank`, `acc_num`, `comments`) VALUES
(213213, 'Rakibur ', 'Rahamn', 'Male', '2027-05-13', 'Narail', 1629563621, 'raakib@email.com', 432232, '2023-05-10', 'Database Developer', 'Duch Bangla Bank', 3242342, 'background bad'),
(21321321, 'Eyamin', 'Molla', 'Male', '2027-05-27', 'magura', 323234, 'adsf@maic.mn', 4321324, '2023-05-26', 'UI/UX Design', 'Bank Asia Limited', 3242342, 'background bad'),
(32423, 'Mohib', 'Vai', 'Male', '2023-05-01', 'Mirpur', 12423423, 'mohib@mail.com', 4353423, '2023-05-25', 'System Design', 'Bank Asia Limited', 4532334, 'good employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
