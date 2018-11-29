-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Nov 2018 pada 09.07
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
-- Struktur dari tabel `bukarekening`
--

CREATE TABLE `bukarekening` (
  `nik` varchar(16) NOT NULL,
  `namaLengkap` varchar(50) NOT NULL,
  `namaWali` varchar(50) NOT NULL,
  `tanggalLahir` date NOT NULL,
  `noTelepon` varchar(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noRekening` varchar(50) NOT NULL,
  `pendidikan` varchar(50) NOT NULL,
  `jenisRekening` enum('tabungan','tabunganRencana','tabunganBisnis','tabunganInvestor','tabunganHaji') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarpetugas`
--

CREATE TABLE `daftarpetugas` (
  `idPetugas` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `namaPetugas` varchar(255) NOT NULL,
  `alamatPetugas` varchar(255) NOT NULL,
  `tanggalLahir` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lamaBekerja` int(11) NOT NULL,
  `jenisService` enum('Teller','Customer Service','Admin','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarpetugas`
--

INSERT INTO `daftarpetugas` (`idPetugas`, `password`, `namaPetugas`, `alamatPetugas`, `tanggalLahir`, `lamaBekerja`, `jenisService`) VALUES
('admin', 'admin', 'Admin cuy', 'bebas', '2018-11-01 17:00:00', 14, 'Admin'),
('CS01', 'ttr', 'tutu', 'bdg', '2018-10-31 17:00:00', 10, 'Customer Service'),
('T01', 'tuturu', 'Tutu Ru', 'Bdg', '2018-11-03 17:00:00', 10, 'Teller');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formulir_cs`
--

CREATE TABLE `formulir_cs` (
  `nik` varchar(16) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `nama_wali` varchar(50) NOT NULL,
  `tgl_lahir` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `telp` char(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_rek` varchar(25) NOT NULL,
  `pendidikan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `lainlain`
--

CREATE TABLE `lainlain` (
  `nik` varchar(16) NOT NULL,
  `namaLengkap` varchar(50) NOT NULL,
  `namaWali` varchar(50) NOT NULL,
  `tanggalLahir` date NOT NULL,
  `noTelepon` varchar(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noRekening` varchar(50) NOT NULL,
  `pendidikan` varchar(100) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `laporankehilangan`
--

CREATE TABLE `laporankehilangan` (
  `nik` varchar(16) NOT NULL,
  `namaLengkap` varchar(50) NOT NULL,
  `namaWali` varchar(50) NOT NULL,
  `tanggalLahir` date NOT NULL,
  `noTelepon` varchar(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noRekening` varchar(50) NOT NULL,
  `pendidikan` varchar(255) NOT NULL,
  `tanggalHilang` date NOT NULL,
  `jamHilang` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sebab` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `setortarik`
--

CREATE TABLE `setortarik` (
  `NamaNasabah` varchar(50) NOT NULL,
  `noRekening` varchar(50) NOT NULL,
  `jumlahUang` int(11) NOT NULL,
  `keterangan` enum('Setoran','Tarikan','','') NOT NULL,
  `berita` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transfer`
--

CREATE TABLE `transfer` (
  `namaBank` varchar(50) NOT NULL,
  `noRek` varchar(50) NOT NULL,
  `jumlahUang` int(11) NOT NULL,
  `berita` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `upgradeatm`
--

CREATE TABLE `upgradeatm` (
  `nik` varchar(16) NOT NULL,
  `namaLengkap` varchar(50) NOT NULL,
  `namaWali` varchar(50) NOT NULL,
  `tanggalLahir` date NOT NULL,
  `noTelepon` varchar(12) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noRekening` varchar(50) NOT NULL,
  `pendidikan` varchar(100) NOT NULL,
  `noKartu` varchar(16) NOT NULL,
  `jenisAwal` enum('atmBiasa','debitSilver','debitGold','debitPlatinum') NOT NULL,
  `upgradeKe` enum('atmBiasa','debitSilver','debitGold','debitPlatinum') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `bukarekening`
--
ALTER TABLE `bukarekening`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `daftarpetugas`
--
ALTER TABLE `daftarpetugas`
  ADD PRIMARY KEY (`idPetugas`);

--
-- Indeks untuk tabel `formulir_cs`
--
ALTER TABLE `formulir_cs`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `lainlain`
--
ALTER TABLE `lainlain`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `laporankehilangan`
--
ALTER TABLE `laporankehilangan`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `upgradeatm`
--
ALTER TABLE `upgradeatm`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
