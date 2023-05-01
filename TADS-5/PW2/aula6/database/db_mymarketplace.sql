-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Maio-2023 às 18:31
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_mymarketplace`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_lojas`
--

CREATE TABLE `tb_lojas` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `img_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_lojas`
--

INSERT INTO `tb_lojas` (`id`, `nome`, `descricao`, `img`, `id_user`, `img_path`) VALUES
(1, 'Bugatti', 'Fabricante de carros', NULL, 1, 'img/lojas/bugatti.png'),
(2, 'Ferrari', 'Fabricante de carros', NULL, 2, 'img/lojas/ferrari.png'),
(3, 'Honda', 'Fabricante de carros', NULL, 3, 'img/lojas/honda.png'),
(4, 'Koenigsegg', 'Fabricante de carros', NULL, 4, 'img/lojas/koenigsegg.png'),
(5, 'Lamborghini', 'Fabricante de carros', NULL, 5, 'img/lojas/lamborghini.png'),
(6, 'Mazda', 'Fabricante de carros', NULL, 6, 'img/lojas/mazda.png'),
(7, 'Mclaren', 'Fabricante de carros', NULL, 7, 'img/lojas/mclaren.png'),
(8, 'Mercedes', 'Fabricante de carros', NULL, 8, 'img/lojas/mercedesbenz.png'),
(9, 'Mitsubishi', 'Fabricante de carros', NULL, 9, 'img/lojas/mitsubishi.png'),
(10, 'Nissan', 'Fabricante de carros', NULL, 10, 'img/lojas/nissan.png'),
(11, 'Porsche', 'Fabricante de carros', NULL, 11, 'img/lojas/porsche.png'),
(12, 'Subaru', 'Fabricante de carros', NULL, 12, 'img/lojas/subaru.png'),
(13, 'Toyota', 'Fabricante de carros', NULL, 13, 'img/lojas/toyota.png'),
(14, 'BMW', 'Fabricante de carros', NULL, 14, 'img/lojas/bmw.png'),
(15, 'Pagani', 'Fabricante de carros', NULL, 15, 'img/lojas/pagani.png'),
(25, '123', '123', NULL, 26, 'img/lojas/WhatsApp Image 2023-04-15 at 14.28.51.jpeg');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `preco` float NOT NULL,
  `id_loja` int(11) NOT NULL,
  `img_path` varchar(255) DEFAULT NULL,
  `cavalos` int(255) DEFAULT NULL,
  `zeroacem` float DEFAULT NULL,
  `velocidade` int(255) DEFAULT NULL,
  `quantidade` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_produtos`
--

INSERT INTO `tb_produtos` (`id`, `nome`, `preco`, `id_loja`, `img_path`, `cavalos`, `zeroacem`, `velocidade`, `quantidade`) VALUES
(1, 'Bugatti Centodieci ', 44000000, 1, 'img/produtos/bugatti-centodieci.png', 1600, 2.4, 380, 10),
(2, 'Bugatti Chiron', 54000000, 1, 'img/produtos/bugatti-chiron.png', 1622, 2.3, 490, 500),
(3, 'Bugatti Divo', 30800000, 1, 'img/produtos/bugatti-divo.png', 1500, 2.3, 380, 40),
(4, 'Bugatti La Voiture Noire', 56898000, 1, 'img/produtos/bugatti-lavoiturenoire.png', 1479, 2.4, 418, 1),
(5, 'Bugatti Mistral', 27500000, 1, 'img/produtos/bugatti-mistral.png', 1578, 0, 420, 99),
(6, 'Bugatti Veyron', 16000000, 1, 'img/produtos/bugatti-veyron.png', 1001, 2.5, 407, 450),
(7, 'Ferrari Enzo', 10500000, 2, 'img/produtos/ferrari-enzo.png', 660, 3, 250, 400),
(8, 'Ferrari F40', 10400000, 2, 'img/produtos/ferrari-f40.png', 478, 3.1, 368, 1311),
(9, 'Ferrari Porto Fino', 3377500, 2, 'img/produtos/ferrari-portofino.png', 620, 3.4, 320, 4250),
(10, 'Ferrari Testarossa', 600000, 2, 'img/produtos/ferrari-testarossa.png', 428, 5, 290, 10000),
(11, 'Honda S2000', 349076, 3, 'img/produtos/honda-s2000.png', 240, 5.4, 248, 0),
(12, 'Honda Civic Type R', 19912, 3, 'img/produtos/honda-civictyper.png', 182, 6.8, 222, 0),
(13, 'Honda NSX-R', 408917, 3, 'img/produtos/honda-nsx-r.png', 250, 5.2, 260, 18000),
(14, 'Koenigsegg One 1', 29000000, 4, 'img/produtos/koenigsegg-one1.png', 1360, 3.2, 440, 7),
(15, 'Koenigsegg Jesko', 15500000, 4, 'img/produtos/koenigsegg-jesko.png', 1600, 2.6, 531, 125),
(16, 'Koenigsegg Regera ', 13000000, 4, 'img/produtos/koenigsegg-regera.png', 1520, 2.8, 447, 80),
(17, 'Lamborghini Aventador', 14400000, 5, 'img/produtos/lamborghini-aventador.png', 780, 2.8, 355, 11465),
(18, 'Lamborghini Diablo', 2000000, 5, 'img/produtos/lamborghini-diablo.png', 575, 4, 315, 3000),
(19, 'Lamborghini Huracan', 5300000, 5, 'img/produtos/lamborghini-huracan.png', 640, 2.9, 325, 14000),
(20, 'Lamborghini Murcielago', 1166760, 5, 'img/produtos/lamborghini-murcielago.png', 640, 3.2, 342, 4099),
(21, 'Lamborghini Veneno', 44500000, 5, 'img/produtos/lamborghini-veneno.png', 750, 2.9, 356, 5),
(22, 'Lamborghini Countach', 13257700, 5, 'img/produtos/lamborghini-countach.png', 353, 5.9, 292, 2000),
(23, 'Mazda Rx-7 FD', 154590, 6, 'img/produtos/mazda-rx7.png', 205, 5.3, 250, 68589),
(24, 'Mazda Rx-5 Miata', 73654, 6, 'img/produtos/mazda-rx5miata.png', 184, 8.8, 195, 1050000),
(25, 'McLaren F1', 99736000, 7, 'img/produtos/mclaren-f1.png', 635, 6.3, 315, 106),
(26, 'McLaren Senna', 6149140, 7, 'img/produtos/mclaren-senna.png', 800, 2.8, 335, 16),
(27, 'McLaren P1', 6482840, 7, 'img/produtos/mclaren-p1.png', 737, 2.8, 350, 375),
(28, 'McLaren Speedtail', 11469600, 7, 'img/produtos/mclaren-speedtail.png', 1070, 3, 403, 106),
(29, 'Mercedes C112', 19947200, 8, 'img/produtos/mercedes-c112.png', 402, 4.9, 309, 1),
(30, 'Mercedes CLK GTR', 42387800, 8, 'img/produtos/mercedes-clklmstarben.png', 612, 3.8, 318, 28),
(31, 'Mercedes S-Class Coupe', 576723, 8, 'img/produtos/mercedes-sclasscoupeconcepta.png', 463, 4.5, 209, 818000),
(32, 'Mercedes SLR', 1994720, 8, 'img/produtos/mercedes-slrmclarenmansoryrenovatio.png', 626, 3.9, 333, 2157),
(33, 'Mercedes AMG One', 13713700, 8, 'img/produtos/mercedes-one.png', 1063, 2.9, 352, 275),
(35, 'Mitsubishi Eclipse Spider', 50124, 9, 'img/produtos/mitsubishi-elipsespider.png', 200, 7.5, 220, 0),
(36, 'Mitsubishi Lancer Evo 8', 92904, 9, 'img/produtos/mitsubishi-lancerevo8.png', 405, 6, 243, 0),
(37, 'Mitsubishi Lancer GT', 50643, 9, 'img/produtos/mitsubishi-lancerevox.png', 160, 10.7, 198, 0),
(38, 'Nissan 180sx', 172633, 10, 'img/produtos/nissan-180x.png', 171, 7.1, 235, 0),
(39, 'Nissan 300zx', 74432, 10, 'img/produtos/nissan-300zx.png', 300, 6.5, 246, 329900),
(40, 'Nissan 350z', 170548, 10, 'img/produtos/nissan-350z.png', 280, 5.9, 250, 173924),
(41, 'Nissan GT-R', 1253180, 10, 'img/produtos/nissan-gtr.png', 570, 3.5, 315, 13000),
(42, 'Nissan Silvia S15', 136354, 10, 'img/produtos/nissan-silvia.png', 250, 7.5, 235, 43097),
(43, 'Nissan Skyline', 1462620, 10, 'img/produtos/nissan-skyline.png', 276, 4.6, 251, 11578),
(44, 'Porsche 911', 815000, 11, 'img/produtos/porsche-911.png', 580, 2.7, 330, 105000),
(45, 'Porsche 917k', 69815200, 11, 'img/produtos/porsche-917k.png', 600, 0, 360, 65),
(46, 'Porsche 918', 7006450, 11, 'img/produtos/porsche-918.png', 887, 2.6, 345, 918),
(47, 'Porsche Carrera GT', 7978880, 11, 'img/produtos/porsche-carreragt.png', 612, 3.9, 330, 1270),
(48, 'Porsche Cayman GT4', 743531, 11, 'img/produtos/porsche-cayman.png', 500, 3.4, 315, 2500),
(49, 'Porsche Taycan', 629000, 11, 'img/produtos/porsche-taycan.png', 761, 2.8, 260, 100000),
(50, 'Subaru BRZ', 139605, 12, 'img/produtos/subaru-brz.png', 228, 5.4, 225, 0),
(51, 'Subaru Impreza WRX STI 1', 179499, 12, 'img/produtos/subaru-imprezawrxsti1.png', 276, 4.9, 236, 0),
(52, 'Subaru Impreza WRX STI 2', 680962, 12, 'img/produtos/subaru-imprezawrxsti2.png', 261, 4.9, 249, 0),
(53, 'Subaru Impreza WRX STI 4', 308900, 12, 'img/produtos/subaru-imprezawrxsti4.png', 300, 5.2, 255, 0),
(54, 'Toyota AE86 Trueno Corolla', 149604, 13, 'img/produtos/toyota-ae86truenocorolla.png', 118, 8.5, 200, 0),
(55, 'Toyota Celica', 11365, 13, 'img/produtos/toyota-celica.jpg', 116, 9.5, 200, 0),
(56, 'Toyota Supra Mk4', 1465620, 13, 'img/produtos/toyota-supramk4.png', 321, 4.7, 257, 0),
(57, 'Toyota GT86', 134490, 13, 'img/produtos/toyota-gt86.webp', 200, 7.6, 226, 0),
(58, 'BMW E36', 244353, 14, 'img/produtos/bmw-e36.png', 193, 8, 232, 0),
(59, 'BMW E30', 359353, 14, 'img/produtos/bmw-e30.png', 200, 6.1, 248, 0),
(60, 'BMW M5 E39', 117164, 14, 'img/produtos/bmw-m5e39.png', 219, 15.5, 259, 0),
(61, 'BMW 320i M', 163965, 14, 'img/produtos/bmw-320im.png', 184, 7.1, 235, 0),
(62, 'Pagani Utopia', 12467000, 15, 'img/produtos/pagani-utopia.png', 864, 2.7, 370, 99),
(63, 'Pagani Huayra', 6981520, 15, 'img/produtos/pagani-huayra.png', 838, 2.8, 383, 300),
(64, 'Pagani Zonda Cinque', 8976240, 15, 'img/produtos/pagani-zondacinque.png', 678, 3.4, 350, 5),
(65, 'Pagani Zonda Revolution', 14461700, 15, 'img/produtos/pagani-zondarevolution.png', 739, 2.7, 375, 15),
(87, 'Mitsubishi Eclipse 98', 66764, 9, 'img/produtos/mitsubishi-eclipse98.png', 213, 9.5, 248, 906876),
(88, 'Honda Civic Estilo EG6', 56129, 3, 'img/produtos/honda-civicestilo.png', 160, 7.8, 215, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_users`
--

CREATE TABLE `tb_users` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `passw` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_users`
--

INSERT INTO `tb_users` (`id`, `email`, `passw`) VALUES
(1, 'bugatti@123', '123'),
(2, 'ferrari@123', '123'),
(3, 'honda@123', '123'),
(4, 'koenigsegg@123', '123'),
(5, 'lamborghini@123', '123'),
(6, 'mazda@123', '123'),
(7, 'mclaren@123', '123'),
(8, 'mercedes@123', '123'),
(9, 'mitsubishi@123', '123'),
(10, 'nissan@123', '123'),
(11, 'porsche@123', '123'),
(12, 'subaru@123', '123'),
(13, 'toyota@123', '123'),
(14, 'bmw@123', '123'),
(15, 'pagani@123', '123'),
(26, 'teste@123', '123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`);

--
-- Índices para tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_loja` (`id_loja`);

--
-- Índices para tabela `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91;

--
-- AUTO_INCREMENT de tabela `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  ADD CONSTRAINT `tb_lojas_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `tb_users` (`id`) ON DELETE CASCADE;

--
-- Limitadores para a tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`id_loja`) REFERENCES `tb_lojas` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
