-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Nov 2018 pada 18.55
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_petugas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `formulir_cs`
--

CREATE TABLE `formulir_cs` (
  `nik` varchar(16) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `nama_wali` varchar(50) NOT NULL,
  `tgl_lahir` varchar(50) NOT NULL,
  `telp` varchar(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_rek` varchar(25) NOT NULL,
  `pendidikan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `formulir_cs`
--

INSERT INTO `formulir_cs` (`nik`, `nama_lengkap`, `nama_wali`, `tgl_lahir`, `telp`, `alamat`, `no_rek`, `pendidikan`) VALUES
('123', '11', '123', '2018-11-09', '123', '123', '123', '123'),
('123', '123', '123', '1995-2-4', '123', '123', '123', '123'),
('123', '123', '123', '1995-2-4', '123', '123', '123', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
