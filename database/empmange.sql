-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 15, 2023 at 09:15 PM
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
(1232243, 'Rakibur', 'Rahman', 'Male', '2000-12-01', 'Narail', 1629563621, 'rr4kib@gmail.com', 1000328555, '2023-01-10', 'Developer ', 'Duch Bangla Bank', 1008078173, 'recived main certificate'),
(123112132, 'Eyamin', 'Molla', 'Male', '2000-07-19', 'Magura', 174565432, 'eyamil@gmail.com', 1001743781, '2023-07-02', 'Developer ', 'Agrani Bank Limited', 1004700153, ''),
(123112132, 'Eyamin', 'Molla', 'Male', '2000-07-19', 'Magura', 174565432, 'eyamil@gmail.com', 1002608976, '2023-07-02', 'UI/UX Design', 'Duch Bangla Bank', 1008431317, ''),
(767452132, 'Sumona', 'Molla', 'Female', '2002-10-18', 'Jessore', 171565432, 'sumona@gmail.com', 1002716861, '2023-07-04', 'UI/UX Design', 'AB Bank Limited', 1004724784, ''),
(456565132, 'MD', 'Maruf', 'Male', '1998-12-23', 'Narail', 1376535326, 'maruf@gmail.com', 1003543073, '2019-10-09', 'Database Developer', 'Dhaka Bank Limited', 1007702693, ''),
(2145112132, 'Sabbir', 'Molla', 'Male', '2001-07-18', 'Jessore', 1712755432, 'sabbir@gmail.com', 1003976002, '2023-05-14', 'Developer ', 'Citibank N.A', 1008522538, ''),
(762354132, 'Rakibur', 'Rahman', 'Male', '2000-12-01', 'Dhanmondi', 1629563621, 'rr4kib@gmail.com', 1004292201, '2022-06-14', 'Developer ', 'Duch Bangla Bank', 1007149489, ''),
(323532132, 'Rita', 'Khanom', 'Female', '2002-12-12', 'Faridpur', 134435326, 'rita@gmail.com', 1004723862, '2022-07-20', 'System Design', 'AB Bank Limited', 1002286713, ''),
(767454132, 'Sumaiaa', 'bubt', 'Female', '2002-10-18', 'Mirpur', 17176632, 'mirpur@gmail.com', 1005938510, '2023-10-09', 'Database Developer', 'Duch Bangla Bank', 1002359401, ''),
(45654132, 'MD', 'Mohibbullah', 'Male', '1994-12-14', 'Vangga', 1343532621, 'mohib@gmail.com', 1006131746, '2019-10-09', 'Database Developer', 'Dhaka Bank Limited', 1008008812, ''),
(33221, 'Rita', 'Khanom', 'Female', '2000-12-11', 'Faridpur', 16598655, 'rita.bd@gmail.com', 1006512288, '2022-09-05', 'System Design', 'Duch Bangla Bank', 1000459475, 'not submit nid'),
(342455132, 'Anika', 'Islam', 'Female', '2002-12-12', 'Dhaka', 165535326, 'anika@gmail.com', 1006804625, '2022-07-20', 'UI/UX Design', 'Duch Bangla Bank', 1002267898, '');

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
(123112132, 'Habib', 'Molla', 'Male', '2000-07-16', 'Khulna', 1712365432, 'habib@gmail.com', 1003190849, '2023-07-02', 'System Design', 'Agrani Bank Limited', 1006701717, ''),
(123112132, 'Eyamin', 'Molla', 'Male', '2000-07-19', 'Magura', 174565432, 'eyamil@gmail.com', 1007382269, '2023-07-02', 'UI/UX Design', 'Duch Bangla Bank', 1008431317, ''),
(435654132, 'Nahian', 'Islam', 'Male', '2000-12-11', 'Dhanmondi', 1623532621, 'nahian@gmail.com', 1001533703, '2020-10-13', 'Database Developer', 'Duch Bangla Bank', 1001611218, '');

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
(1006131746, 'January', 12000, 0, 12000, 'Database Developer', 'Dhaka Bank Limited', 1008008812, '1221166608107'),
(1001743781, 'June', 11000, 200, 11200, 'Developer ', 'Agrani Bank Limited', 1004700153, '1928608584844'),
(1002716861, 'April', 12000, 1500, 13500, 'UI/UX Design', 'AB Bank Limited', 1004724784, '226780398165');

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
  ADD CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
