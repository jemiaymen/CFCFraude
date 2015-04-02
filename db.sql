-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Jeu 02 Avril 2015 à 14:59
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `cfcfraude`
--
CREATE DATABASE `cfcfraude` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `cfcfraude`;

-- --------------------------------------------------------

--
-- Structure de la table `abonnee`
--

CREATE TABLE IF NOT EXISTS `abonnee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(250) NOT NULL,
  `prenom` varchar(250) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `adress` varchar(500) NOT NULL,
  `ville` varchar(250) NOT NULL,
  `localite` varchar(250) NOT NULL,
  `pays` varchar(250) NOT NULL,
  `zip` varchar(20) NOT NULL,
  `email` varchar(250) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `poste` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `compteur`
--

CREATE TABLE IF NOT EXISTS `compteur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) NOT NULL,
  `num` int(11) NOT NULL,
  `marque` varchar(250) NOT NULL,
  `dtactivation` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `consomation`
--

CREATE TABLE IF NOT EXISTS `consomation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NOT NULL,
  `creleve` varchar(250) NOT NULL,
  `coef` decimal(5,3) NOT NULL,
  `conso` int(11) NOT NULL,
  `mconso` decimal(10,3) NOT NULL,
  `caindex` int(11) NOT NULL,
  `cnindex` int(11) NOT NULL,
  `nbrmoi` int(2) NOT NULL,
  `clocatcptr` int(11) NOT NULL,
  `cprimefix` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_consomation_conteur` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `statu` varchar(60) NOT NULL,
  `prenom` varchar(250) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `adress` varchar(500) NOT NULL,
  `ville` varchar(150) NOT NULL,
  `localite` varchar(250) NOT NULL,
  `pays` varchar(250) NOT NULL,
  `zip` varchar(20) NOT NULL,
  `email` varchar(250) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `poste` varchar(250) NOT NULL,
  `matricule` varchar(250) NOT NULL,
  `login` varchar(250) NOT NULL,
  `motdepass` varchar(250) NOT NULL,
  `dtcreationmotdepass` date NOT NULL,
  `dtmodificationmotdepass` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `statu`, `prenom`, `nom`, `adress`, `ville`, `localite`, `pays`, `zip`, `email`, `tel`, `poste`, `matricule`, `login`, `motdepass`, `dtcreationmotdepass`, `dtmodificationmotdepass`) VALUES
(1, 'admin', 'admin', 'admin', 'adress', 'ville', 'loc', 'tun', '885', 'admin@gmail.com', '6', 'tun', 'mta-5858', 'admin', 'admin', '2015-04-02', NULL);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `consomation`
--
ALTER TABLE `consomation`
  ADD CONSTRAINT `fk_consomation_conteur` FOREIGN KEY (`cid`) REFERENCES `compteur` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
