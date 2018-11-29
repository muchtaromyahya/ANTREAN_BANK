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
-- Struktur dari tabel `setortarik`
--

CREATE TABLE `setortarik` (
  `NamaNasabah` varchar(50) NOT NULL,
  `noRek` varchar(25) NOT NULL,
  `jumlahUang` varchar(50) NOT NULL,
  `keterangan` enum('Setoran','Tarikan','','') NOT NULL,
  `berita` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `setortarik`
--

INSERT INTO `setortarik` (`NamaNasabah`, `noRek`, `jumlahUang`, `keterangan`, `berita`) VALUES
('1233', '1233', '', 'Setoran', ''),
('5', '5', '', 'Setoran', ''),
('212', '212', '', 'Setoran', ''),
('1', '1', '', 'Setoran', '');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `setortarik`
--
ALTER TABLE `setortarik`
  ADD KEY `FK1` (`noRek`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `setortarik`
--
ALTER TABLE `setortarik`
  ADD CONSTRAINT `FK1` FOREIGN KEY (`noRek`) REFERENCES `formulirteller` (`noRek`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
