-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jun 2021 pada 22.05
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbokuis2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `formulir`
--

CREATE TABLE `formulir` (
  `email` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `namalengkap` varchar(25) NOT NULL,
  `tempat` varchar(20) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `domisili` varchar(20) NOT NULL,
  `deskripsi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `formulir`
--

INSERT INTO `formulir` (`email`, `username`, `password`, `namalengkap`, `tempat`, `tanggal`, `domisili`, `deskripsi`) VALUES
('adrianuswisnu@gmail.com', 'admin1', 'makandulu', 'Adrianus Wisnu Pratama', 'Yogyakarta', '19 Juli 2000', 'Yogyakarta', 'Saya sangat bangga kuliah di UPN yogyakarta.'),
('adrianuswisnu@gmail.com', 'admin1', 'makandulu', 'Adrianus Wisnu Pratama', 'Yogyakarta', '19 Juli 2000', 'Yogyakarta', 'Saya sangat bangga kuliah di UPN yogyakarta.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
