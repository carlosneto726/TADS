-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Abr-2023 às 02:45
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
  `id_user` int(11) DEFAULT NULL,
  `img_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_lojas`
--

INSERT INTO `tb_lojas` (`id`, `nome`, `descricao`, `id_user`, `img_path`) VALUES
(1, 'Bugatti', 'Fabricante de carros', 1, NULL),
(2, 'Ferrari', 'Fabricante de carros', 2, NULL),
(3, 'Honda', 'Fabricante de carros', 3, NULL),
(4, 'Koenigsegg', 'Fabricante de carros', 4, NULL),
(5, 'Lamborghini', 'Fabricante de carros', 5, NULL),
(6, 'Mazda', 'Fabricante de carros', 6, NULL),
(7, 'Mclaren', 'Fabricante de carros', 7, NULL),
(8, 'Mercedes-Benz', 'Fabricante de carros', 8, NULL),
(9, 'Mitsubishi', 'Fabricante de carros', 9, NULL),
(10, 'Nissan', 'Fabricante de carros', 10, NULL),
(11, 'Porsche', 'Fabricante de carros', 11, NULL),
(12, 'Subaru', 'Fabricante de carros', 12, NULL),
(13, 'Toyota', 'Fabricante de carros', 13, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `preco` float NOT NULL,
  `id_loja` int(11) NOT NULL,
  `img_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_produtos`
--

INSERT INTO `tb_produtos` (`id`, `nome`, `descricao`, `preco`, `id_loja`, `img_path`) VALUES
(1, 'Bugatti Centodie', 'This is a car.', 1, 1, 'img/produtos/bugatti-centodieci.png'),
(2, 'Bugatti Chiron', 'This is a car.', 1, 1, 'img/produtos/bugatti-chiron.png'),
(3, 'Bugatti Divo', 'This is a car.', 1, 1, 'img/produtos/bugatti-divo.png'),
(4, 'Bugatti La Voiture Noire', 'This is a car.', 1, 1, 'img/produtos/bugatti-lavoiturenoire.png'),
(5, 'Bugatti Mistral', 'This is a car.', 1, 1, 'img/produtos/bugatti-mistral.png'),
(6, 'Bugatti Veyron', 'This is a car.', 1, 1, 'img/produtos/bugatti-veyron.png'),
(7, 'Ferrari Enzo', 'This is a car.', 1, 2, 'img/produtos/ferrari-enzo.png'),
(8, 'Ferrari F40', 'This is a car.', 1, 2, 'img/produtos/ferrari-f40.png'),
(9, 'Ferrari Porto Fino', 'This is a car.', 1, 2, 'img/produtos/ferrari-portofino.png'),
(10, 'Ferrari Testarossa', 'This is a car.', 1, 2, 'img/produtos/ferrari-testarossa.png'),
(11, 'Honda S2000', 'This is a car.', 1, 3, 'img/produtos/honda-s2000.png'),
(12, 'Honda Civic Type R', 'This is a car.', 1, 3, 'img/produtos/honda-civictyper.png'),
(13, 'Honda NSX-R', 'This is a car.', 1, 3, 'img/produtos/honda-nsx-r.png'),
(14, 'Koenigsegg One 1', 'This is a car.', 1, 4, 'img/produtos/koenigsegg-one1.png'),
(15, 'Koenigsegg Jesko', 'This is a car.', 1, 4, 'img/produtos/koenigsegg-jesko.png'),
(16, 'Lamborghini Aventador', 'This is a car.', 1, 5, 'img/produtos/lamborghini-aventador.png'),
(17, 'Lamborghini Diablo', 'This is a car.', 1, 5, 'img/produtos/lamborghini-diablo.png'),
(18, 'Lamborghini Huracan', 'This is a car.', 1, 5, 'img/produtos/lamborghini-huracan.png'),
(19, 'Lamborghini Murcielago', 'This is a car.', 1, 5, 'img/produtos/lamborghini-murcielago.png'),
(20, 'Mazda Rx-7', 'This is a car.', 1, 6, 'img/produtos/mazda-rx7.png'),
(21, 'Mazda Rx-5 Miata', 'This is a car.', 1, 6, 'img/produtos/mazda-rx5miata.png'),
(22, 'McLaren F1', 'This is a car.', 1, 7, 'img/produtos/mclaren-f1.png'),
(23, 'McLaren Senna', 'This is a car.', 1, 7, 'img/produtos/mclaren-senna.png'),
(24, 'McLaren SLR', 'This is a car.', 1, 7, 'img/produtos/mclaren-visionslrconcept.png'),
(25, 'Mercedes-Benz C112', 'This is a car.', 1, 8, 'img/produtos/mercedes-c112.png'),
(26, 'Mercedes-Benz CLKMS Tarben', 'This is a car.', 1, 8, 'img/produtos/mercedes-clklmstarben.png'),
(27, 'Mercedes-Benz S Class Coupe', 'This is a car.', 1, 8, 'img/produtos/mercedes-sclasscoupeconcepta.png'),
(28, 'Mercedes-Benz SLR Mansonry', 'This is a car.', 1, 8, 'img/produtos/mercedes-slrmclarenmansoryrenovatio.png'),
(29, 'Mitsubishi Eclipse 98', 'This is a car.', 1, 9, 'img/produtos/mitsubishi-eclipse98.png'),
(30, 'Mitsubishi Eclipse Spider', 'This is a car.', 1, 9, 'img/produtos/mitsubishi-elipsespider.png'),
(31, 'Mitsubishi Lancer Evo 8', 'This is a car.', 1, 9, 'img/produtos/mitsubishi-lancerevo8.png'),
(32, 'Mitsubishi Lancer Evo X', 'This is a car.', 1, 9, 'img/produtos/mitsubishi-lancerevox.png'),
(33, 'Nissan 180x', 'This is a car.', 1, 10, 'img/produtos/nissan-180x.png'),
(34, 'Nissan 300zx', 'This is a car.', 1, 10, 'img/produtos/nissan-300zx.png'),
(35, 'Nissan 350z', 'This is a car.', 1, 10, 'img/produtos/nissan-350z.png'),
(36, 'Nissan GTR', 'This is a car.', 1, 10, 'img/produtos/nissan-gtr.png'),
(37, 'Nissan Silvia', 'This is a car.', 1, 10, 'img/produtos/nissan-silvia.png'),
(38, 'Nissan Skyline', 'This is a car.', 1, 10, 'img/produtos/nissan-skyline.png'),
(39, 'Porsche 911', 'This is a car.', 1, 11, 'img/produtos/porsche-911.png'),
(40, 'Porsche 917k', 'This is a car.', 1, 11, 'img/produtos/porsche-917k.png'),
(41, 'Porsche 918', 'This is a car.', 1, 11, 'img/produtos/porsche-918.png'),
(42, 'Porsche Carrera GT', 'This is a car.', 1, 11, 'img/produtos/porsche-carreragt.png'),
(43, 'Porsche Cayman', 'This is a car.', 1, 11, 'img/produtos/porsche-cayman.png'),
(44, 'Porsche Taycan', 'This is a car.', 1, 11, 'img/produtos/porsche-taycan.png'),
(45, 'Subaru BRZ', 'This is a car.', 1, 12, 'img/produtos/subaru-brz.png'),
(46, 'Subaru Impreza WRX STI 1', 'This is a car.', 1, 12, 'img/produtos/subaru-imprezawrxsti1.png'),
(47, 'Subaru Impreza WRX STI 2', 'This is a car.', 1, 12, 'img/produtos/subaru-imprezawrxsti2.png'),
(48, 'Subaru Impreza WRX STI 4', 'This is a car.', 1, 12, 'img/produtos/subaru-imprezawrxsti4.png'),
(49, 'Toyota AE86', 'This is a car.', 1, 13, 'img/produtos/toyota-ae86truenocorolla.png'),
(50, 'Toyota Celica', 'This is a car.', 1, 13, 'img/produtos/toyota-celica.jpg'),
(51, 'Toyota Supra Mk4', 'This is a car.', 1, 13, 'img/produtos/toyota-supramk4.png');

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
(13, 'toyota@123', '123');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de tabela `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  ADD CONSTRAINT `tb_lojas_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `tb_users` (`id`);

--
-- Limitadores para a tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`id_loja`) REFERENCES `tb_lojas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
