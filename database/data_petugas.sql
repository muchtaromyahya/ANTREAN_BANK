-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Des 2018 pada 17.19
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
  `tanggalLahir` varchar(25) NOT NULL,
  `lamaBekerja` int(11) NOT NULL,
  `jenisService` enum('Teller','Customer Service','Admin','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarpetugas`
--

INSERT INTO `daftarpetugas` (`idPetugas`, `password`, `namaPetugas`, `alamatPetugas`, `tanggalLahir`, `lamaBekerja`, `jenisService`) VALUES
('admin1', 'admin', 'Gery Nugroho', 'Bandung', '1999-25-3', 15, 'Admin'),
('admin2', 'admin', 'Muchtarom yahya', 'bandung', '22-04-99', 15, 'Admin'),
('admin3', 'admin', 'rayhan', 'batununggal', '26-07-89', 12, 'Admin'),
('cs1', 'cs', 'yoga', 'cirebon', '25-09-99', 1, 'Customer Service'),
('cs2', 'cs', 'bayu', 'kontrakan', '25-01-70', 11, 'Customer Service'),
('cs3', 'cs', 'pal', 'smg', '11-12-98', 21, 'Customer Service'),
('teller1', 'teller', 'iriyanto', 'sukapura', '05-10-99', 55, 'Teller'),
('teller2', 'teller', 'shadieq', 'sukabirus', '25-01-98', 32, 'Teller'),
('teller3', 'teller', 'yogs', 'kalimantan', '25-10-99', 10, 'Teller');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formulirteller`
--

CREATE TABLE `formulirteller` (
  `namaLengkap` varchar(50) NOT NULL,
  `noRek` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `formulirteller`
--

INSERT INTO `formulirteller` (`namaLengkap`, `noRek`) VALUES
('1312', '124124'),
('133', '144');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formuliruntukcs`
--

CREATE TABLE `formuliruntukcs` (
  `id` varchar(25) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `no_rek` varchar(25) NOT NULL,
  `SetoranAwal` varchar(25) NOT NULL,
  `tanggalKehilangan` varchar(10) NOT NULL,
  `jamKehilangan` varchar(5) NOT NULL,
  `sebabKehilangan` varchar(255) NOT NULL,
  `noKartu` varchar(16) NOT NULL,
  `jenisAwalKartu` varchar(25) NOT NULL,
  `upgradeKartu` varchar(25) NOT NULL,
  `keperluan` varchar(255) NOT NULL,
  `jenisTabungan` varchar(50) NOT NULL,
  `keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `formuliruntukteller`
--

CREATE TABLE `formuliruntukteller` (
  `id` varchar(25) NOT NULL,
  `namaLengkap` varchar(50) NOT NULL,
  `noRek` varchar(25) NOT NULL,
  `namaBank` varchar(255) NOT NULL,
  `rekTujuan` varchar(25) NOT NULL,
  `jumlahUang` varchar(12) NOT NULL,
  `berita` varchar(255) NOT NULL,
  `Keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `formuliruntukteller`
--

INSERT INTO `formuliruntukteller` (`id`, `namaLengkap`, `noRek`, `namaBank`, `rekTujuan`, `jumlahUang`, `berita`, `Keterangan`) VALUES
('F1', '133', '144', '', '', '12412', '', 'setoran'),
('F2', '1312', '124124', '12312', '2133', '12312', '123', 'transfer');

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
  `noRek` varchar(25) NOT NULL,
  `jumlahUang` varchar(50) NOT NULL,
  `keterangan` enum('Setoran','Tarikan','','') NOT NULL,
  `berita` varchar(255) NOT NULL
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
-- Indeks untuk tabel `formulirteller`
--
ALTER TABLE `formulirteller`
  ADD PRIMARY KEY (`noRek`);

--
-- Indeks untuk tabel `formuliruntukteller`
--
ALTER TABLE `formuliruntukteller`
  ADD KEY `noRek` (`noRek`);

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
-- Indeks untuk tabel `setortarik`
--
ALTER TABLE `setortarik`
  ADD KEY `FK1` (`noRek`);

--
-- Indeks untuk tabel `upgradeatm`
--
ALTER TABLE `upgradeatm`
  ADD PRIMARY KEY (`nik`);

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
