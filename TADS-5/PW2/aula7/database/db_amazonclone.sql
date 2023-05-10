-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Maio-2023 às 01:32
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
-- Banco de dados: `db_amazonclone`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_categorias`
--

CREATE TABLE `tb_categorias` (
  `nome` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_categorias`
--

INSERT INTO `tb_categorias` (`nome`) VALUES
('Acessorios'),
('Cozinha'),
('Games'),
('Tecnoligia');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_itens_venda`
--

CREATE TABLE `tb_itens_venda` (
  `id` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtd` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_lojas`
--

CREATE TABLE `tb_lojas` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_lojas`
--

INSERT INTO `tb_lojas` (`id`, `nome`) VALUES
(1, 'Amazon'),
(2, 'Riachuelo'),
(3, 'Google'),
(4, 'Sansung'),
(5, 'PLaystation'),
(6, 'Philco'),
(7, 'Barilla'),
(8, 'Eletrolux'),
(9, 'Dell'),
(10, 'HP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id` int(11) NOT NULL,
  `id_loja` int(11) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `descricao` text DEFAULT NULL,
  `estrelas` float DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `qtd` int(11) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_produtos`
--

INSERT INTO `tb_produtos` (`id`, `id_loja`, `titulo`, `descricao`, `estrelas`, `marca`, `preco`, `categoria`, `qtd`, `status`, `img_url`) VALUES
(1, 5, 'Controle de PS4 Dualshok 4', 'Contole Dualshok 4 para Playstation 4 e PC', 4.5, 'PlayStation', 249.99, 'Games', 2049, '0', 'img/produtos/controller_ps4.jpg'),
(2, 5, 'Controle de PS5 Dualshok 5', 'Contole Dualshok 5 para Playstation 5 PLaystation 4 e PC', 4, 'PlayStation', 549.99, 'Games', 876, '0', 'img/produtos/controller_ps5.jpg'),
(3, 6, 'Cafeteira Philco', 'Cafeteira Philco que faz café em 2 minutos com capacidade de 2L e quente e frio', 5, 'Philco', 689.99, 'Cozinha', 600, '0', 'img/produtos/cozinha_cafeteiraphilco.jpg'),
(4, 7, 'Macarrão Spaghetti Barilla', 'Spaguetti 500g Barilla serve 5 pessoas', 4, 'Barilla', 9.59, 'Cozinha', 20000, '0', 'img/produtos/cozinha_macarrao.jpg'),
(5, 3, 'Google Chromecast 3', 'Transmita seu conteúdo de onde e quando quiser | Streaming em Full HD', 5, 'Google', 219, 'Tecnoligia', 15000, '0', 'img/produtos/tech_chromecast.jpg'),
(6, 1, 'Echo Dot (4ª Geração)', 'Smart Speaker com Alexa | Música, informação e Casa Inteligente - Cor Preta', 5, 'Amazon', 269, 'Tecnoligia', 4562, '0', 'img/produtos/tech_echodot.jpg'),
(7, 1, 'Suporte de Notebook', 'Suporte Uptable OCTOO, Preto', 5, 'Amazon', 39.99, 'Acessorios', 0, '0', 'img/produtos/acessorios_suportenotebook.jpg'),
(8, 1, 'Egujiwa Clipe de chapéu de bolso', 'peça clipes de retentor de boné para bolsa de viagem clipes magnéticos para chapéu suporte de chapéu para acessórios de viagem ao ar livre (preto)', 0, 'Egujiwa', 51.49, 'Acessorios', 20000, '0', 'img/produtos/acessorios_pingente.jpg'),
(9, 1, 'Suporte para Headset', 'Suporte para Headset Blackfire Preto Fortrek', 5, 'Fortrek', 39.79, 'Acessorios', 12000, '0', 'img/produtos/acessorios_suporteheadset.jpg'),
(10, 9, 'Mochila para notebook', 'Mochila Dell Pro EcoLoop para notebook, Preto, CP5723', 5, 'Dell', 318, 'Acessorios', 1300, '0', 'img/produtos/acessorios_mochilanotebook.jpg'),
(11, 1, 'Mouse Pad Tecido Preto', 'Mouse Pad Tecido Preto 22 x 18 cm - 01 Unidade, Maxprint, 603579, Outros Acessórios para Notebooks', 5, 'Maxprint', 6.42, 'Acessorios', 19000, '0', 'img/produtos/acessorios_mousepad.jpg');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuarios`
--

CREATE TABLE `tb_usuarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_usuarios`
--

INSERT INTO `tb_usuarios` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Administrador', 'adm@adm', 'adm'),
(2, 'Carlos', 'carlos@123', '123'),
(3, 'Pedro', 'pedro@123', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vendas`
--

CREATE TABLE `tb_vendas` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_itens_venda` int(11) NOT NULL,
  `id_loja` int(11) NOT NULL,
  `preco_total` float DEFAULT NULL,
  `data` date DEFAULT NULL,
  `status` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_categorias`
--
ALTER TABLE `tb_categorias`
  ADD PRIMARY KEY (`nome`);

--
-- Índices para tabela `tb_itens_venda`
--
ALTER TABLE `tb_itens_venda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Índices para tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_loja` (`id_loja`),
  ADD KEY `categoria` (`categoria`);

--
-- Índices para tabela `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_itens_venda` (`id_itens_venda`),
  ADD KEY `id_loja` (`id_loja`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_itens_venda`
--
ALTER TABLE `tb_itens_venda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_lojas`
--
ALTER TABLE `tb_lojas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_itens_venda`
--
ALTER TABLE `tb_itens_venda`
  ADD CONSTRAINT `tb_itens_venda_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `tb_produtos` (`id`);

--
-- Limitadores para a tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`id_loja`) REFERENCES `tb_lojas` (`id`),
  ADD CONSTRAINT `tb_produtos_ibfk_2` FOREIGN KEY (`categoria`) REFERENCES `tb_categorias` (`nome`);

--
-- Limitadores para a tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD CONSTRAINT `tb_vendas_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id`),
  ADD CONSTRAINT `tb_vendas_ibfk_2` FOREIGN KEY (`id_itens_venda`) REFERENCES `tb_itens_venda` (`id`),
  ADD CONSTRAINT `tb_vendas_ibfk_3` FOREIGN KEY (`id_loja`) REFERENCES `tb_lojas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
