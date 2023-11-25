-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le :  lun. 31 jan. 2022 à 19:33
-- Version du serveur :  10.1.36-MariaDB
-- Version de PHP :  7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bddgesnote`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `matricule` int(11) NOT NULL,
  `nom` varchar(70) NOT NULL,
  `prenom` varchar(70) NOT NULL,
  `datnaissance` varchar(15) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `filiere` varchar(20) NOT NULL,
  `niveau` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`matricule`, `nom`, `prenom`, `datnaissance`, `sexe`, `filiere`, `niveau`) VALUES
(8030, 'MELOM', 'PATRICIA', ' 19-11-1996', 'FEM', 'GTR', '2'),
(8031, 'ISSA', 'ADOUM', '   11-06-1994', 'MASC', 'GInfo', '1'),
(8032, 'NANTIGUA', 'RODOLPH', '   11-12-1995', 'MASC', 'GInfo', '1'),
(8033, 'ACHTA', 'FATIME', '   09-02-1995', 'FEM', 'GPMC', '1'),
(8034, 'BAOMEKILA', 'SERGE', '   19-08-1994', 'MASC', 'GInfo', '1'),
(8035, 'IDRISS', 'SENOUSSI', '   17-06-1995', 'MASC', 'GTR', '1'),
(8036, 'KALZEBE', 'ZOUTENE', '   20-07-1994', 'MASC', 'GIndus', '1'),
(8037, 'MENOUDJI', 'PHILOMENE', '   17-11-1995', 'FEM', 'GPMC', '1'),
(8038, 'DOKOUBOU', 'CYRIL', '   12-12-1996', 'MASC', 'GIndus', '1'),
(8039, 'MOUSSA', 'IDRISS', '   11-12-1994', 'MASC', 'GTR', '1'),
(8040, 'TOGBE', 'RODRIGUE', '   17-09-1993', 'MASC', 'GIndus', '2'),
(8041, 'DIBRILA', 'YOUNOUS', '11-09-1993', 'MASC', 'GPMC', '1'),
(8042, 'DIDA', 'ISAAC', '11-09-1990', 'MASC', 'GTR', '3'),
(8045, 'Maiga', 'Fati', '   22-07-2006', 'FEM', 'GTR', '2');

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE `matiere` (
  `idmat` varchar(30) NOT NULL,
  `appelation` varchar(100) NOT NULL,
  `filiere` varchar(50) NOT NULL,
  `niveau` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`idmat`, `appelation`, `filiere`, `niveau`) VALUES
('ALGO1', 'ALGORITHMIQUE 1', 'GTR', '1'),
('MF', 'MACHINE FRIGORIFIQUE', 'GIndus', '2'),
('OL', 'OUTILS LOGICIELS', 'GInfo', '1'),
('PM', 'PROGRAMMATION MODULAIRE', 'GPMC', '1'),
('POO', 'JAVA', 'GInfo', '2'),
('SDD', 'STRUCTURE DE DONNEES', 'GIndus', '1'),
('THERMO', 'THERMODINAMIQUE', 'GTR', '1');

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE `note` (
  `idnote` int(11) NOT NULL,
  `idetudiant` int(11) NOT NULL,
  `idmatiere` varchar(20) NOT NULL,
  `controle` double(4,2) DEFAULT NULL,
  `examen` double(4,2) DEFAULT NULL,
  `tp` double(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `note`
--

INSERT INTO `note` (`idnote`, `idetudiant`, `idmatiere`, `controle`, `examen`, `tp`) VALUES
(1, 8030, 'SDD', 12.00, 8.00, 14.00),
(2, 8030, 'OL', 15.00, 6.00, 12.00),
(3, 8030, 'PM', 11.00, 8.00, 11.00),
(4, 8030, 'ALGO1', 14.00, 17.00, 15.00),
(5, 8031, 'OL', 17.00, 19.00, 15.00),
(6, 8031, 'SDD', 11.00, 12.00, 14.00),
(7, 8031, 'PM', 6.00, 9.00, 12.50),
(8, 8031, 'ALGO1', 14.00, 10.75, 13.00),
(9, 8032, 'SDD', 12.00, 7.00, 17.75),
(10, 8032, 'OL', 12.00, 13.50, 11.00),
(11, 8032, 'PM', 10.50, 12.00, 13.00),
(12, 8032, 'ALGO1', 11.00, 8.00, 11.50),
(13, 8033, 'SDD', 15.00, 12.00, 16.00),
(14, 8033, 'OL', 12.00, 5.00, 14.00),
(15, 8033, 'PM', 11.00, 10.00, 12.00),
(16, 8033, 'ALGO1', 6.00, 8.00, 13.00),
(17, 8034, 'SDD', 16.00, 14.00, 18.00),
(18, 8034, 'OL', 8.00, 11.00, 12.00),
(19, 8034, 'PM', 5.00, 12.00, 14.00),
(20, 8034, 'ALGO1', 12.00, 9.00, 14.50);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `v_etd_note`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `v_etd_note` (
`idmat` varchar(30)
,`nom` varchar(70)
,`prenom` varchar(70)
,`appelation` varchar(100)
,`moyenne` double(23,6)
);

-- --------------------------------------------------------

--
-- Structure de la vue `v_etd_note`
--
DROP TABLE IF EXISTS `v_etd_note`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_etd_note`  AS  select `matiere`.`idmat` AS `idmat`,`etudiant`.`nom` AS `nom`,`etudiant`.`prenom` AS `prenom`,`matiere`.`appelation` AS `appelation`,(((`note`.`controle` + `note`.`examen`) + `note`.`tp`) / 3) AS `moyenne` from ((`etudiant` join `note` on((`etudiant`.`matricule` = `note`.`idetudiant`))) join `matiere` on((`note`.`idmatiere` = `matiere`.`idmat`))) ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`matricule`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`idmat`);

--
-- Index pour la table `note`
--
ALTER TABLE `note`
  ADD PRIMARY KEY (`idnote`),
  ADD KEY `fk_etudiant` (`idetudiant`),
  ADD KEY `fk_matiere` (`idmatiere`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `note`
--
ALTER TABLE `note`
  MODIFY `idnote` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `fk_etudiant` FOREIGN KEY (`idetudiant`) REFERENCES `etudiant` (`matricule`),
  ADD CONSTRAINT `fk_matiere` FOREIGN KEY (`idmatiere`) REFERENCES `matiere` (`idmat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
