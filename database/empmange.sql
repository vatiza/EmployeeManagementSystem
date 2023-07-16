-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 16, 2023 at 09:10 PM
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
  `nid` int(30) DEFAULT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `gendar` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `phone` int(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `emp_id` int(30) NOT NULL,
  `jointdate` date DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `bank` varchar(50) DEFAULT NULL,
  `acc_num` int(30) DEFAULT NULL,
  `comments` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`nid`, `fname`, `lname`, `gendar`, `dob`, `city`, `phone`, `email`, `emp_id`, `jointdate`, `dept`, `bank`, `acc_num`, `comments`) VALUES
(2342422, 'Sumu', 'Rahamn', 'Female', '2023-06-28', 'Dhaka', 2133421423, 'sumu@gmai.com', 1001104209, '2023-10-09', 'Database Developer', 'Duch Bangla Bank', 1006988362, '');

-- --------------------------------------------------------

--
-- Table structure for table `removed_employee`
--

CREATE TABLE `removed_employee` (
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
-- Dumping data for table `removed_employee`
--

INSERT INTO `removed_employee` (`nid`, `fname`, `lname`, `gendar`, `dob`, `city`, `phone`, `email`, `emp_id`, `jointdate`, `dept`, `bank`, `acc_num`, `comments`) VALUES
(234242332, 'Nidad', 'Rahamn', 'Male', '2023-06-05', 'Dhaka', 3421423, 'niaddd@gmai.com', 1006933744, '2023-07-26', 'System Design', 'Dhaka Bank Limited', 1007685494, ''),
(2342423, 'Rakibur', 'Rahamn', 'Male', '2023-06-05', 'Dhaka', 3421423, 'rakib@gmai.com', 1000820761, '2023-07-26', 'UI/UX Design', 'Bank Asia Limited', 1001653322, '');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `emp_id` int(20) NOT NULL,
  `months` varchar(20) DEFAULT NULL,
  `mainsalary` int(20) DEFAULT NULL,
  `bonus` int(20) DEFAULT NULL,
  `totalParoll` int(20) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `bank_name` varchar(20) DEFAULT NULL,
  `accNum` int(20) DEFAULT NULL,
  `transId` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`emp_id`, `months`, `mainsalary`, `bonus`, `totalParoll`, `dept`, `bank_name`, `accNum`, `transId`) VALUES
(1001104209, 'January', 32423, 0, 32423, 'Database Developer', 'Duch Bangla Bank', 1006988362, '593530998938');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`transId`),
  ADD KEY `emp_id` (`emp_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `salary`
--
ALTER TABLE `salary`
  ADD CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
