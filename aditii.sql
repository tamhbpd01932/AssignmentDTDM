-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 18, 2017 at 05:27 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aditii`
--

-- --------------------------------------------------------

--
-- Table structure for table `dbdanhmuc`
--

CREATE TABLE `dbdanhmuc` (
  `ID` int(6) NOT NULL,
  `tenDanhMuc` varchar(500) CHARACTER SET ucs2 COLLATE ucs2_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dbdanhmuc`
--

INSERT INTO `dbdanhmuc` (`ID`, `tenDanhMuc`) VALUES
(0, ''),
(1, '1'),
(2, '2');

-- --------------------------------------------------------

--
-- Table structure for table `dbgiohang`
--

CREATE TABLE `dbgiohang` (
  `ID` int(6) NOT NULL,
  `IDKhachHang` int(6) NOT NULL,
  `TongTien` double NOT NULL,
  `NgayTinhTien` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dbkhachhang`
--

CREATE TABLE `dbkhachhang` (
  `ID` int(11) NOT NULL,
  `tenKhachHang` varchar(500) CHARACTER SET utf16 COLLATE utf16_unicode_ci NOT NULL,
  `diaChi` text NOT NULL,
  `sdt` int(12) NOT NULL,
  `email` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dbsanpham`
--

CREATE TABLE `dbsanpham` (
  `ID` int(6) NOT NULL,
  `TenSanPham` varchar(500) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `Gia` double NOT NULL,
  `MoTa` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `DanhMuc` int(6) NOT NULL,
  `TinhTrang` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dbstt`
--

CREATE TABLE `dbstt` (
  `ID` int(6) NOT NULL,
  `TinhTrang` varchar(50) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dbstt`
--

INSERT INTO `dbstt` (`ID`, `TinhTrang`) VALUES
(1, 'Còn hàng'),
(2, 'Hết hàng');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dbdanhmuc`
--
ALTER TABLE `dbdanhmuc`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dbgiohang`
--
ALTER TABLE `dbgiohang`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dbkhachhang`
--
ALTER TABLE `dbkhachhang`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dbsanpham`
--
ALTER TABLE `dbsanpham`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `DanhMuc` (`DanhMuc`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dbgiohang`
--
ALTER TABLE `dbgiohang`
  MODIFY `ID` int(6) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `dbsanpham`
--
ALTER TABLE `dbsanpham`
  MODIFY `ID` int(6) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dbsanpham`
--
ALTER TABLE `dbsanpham`
  ADD CONSTRAINT `dbsanpham_ibfk_1` FOREIGN KEY (`DanhMuc`) REFERENCES `dbdanhmuc` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
