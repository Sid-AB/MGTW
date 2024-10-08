-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 07 oct. 2024 à 12:46
-- Version du serveur : 8.2.0
-- Version de PHP : 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `amg`
--

-- --------------------------------------------------------

--
-- Structure de la table `agrument`
--

DROP TABLE IF EXISTS `agrument`;
CREATE TABLE IF NOT EXISTS `agrument` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `agrument`
--

INSERT INTO `agrument` (`created_at`, `id`, `updated_at`, `name`, `description`) VALUES
('2024-04-23 17:00:44.000000', 3, '2024-04-23 17:00:44.000000', 'TV', ' '),
('2024-04-23 17:00:58.000000', 4, '2024-04-23 17:00:58.000000', 'radio', ' '),
('2024-04-23 17:01:15.000000', 5, '2024-04-23 17:01:15.000000', 'electronique', ' '),
('2024-04-23 17:01:32.000000', 6, '2024-04-23 17:01:32.000000', 'ecrit', ' ');

-- --------------------------------------------------------

--
-- Structure de la table `caracteristique`
--

DROP TABLE IF EXISTS `caracteristique`;
CREATE TABLE IF NOT EXISTS `caracteristique` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `radio_id` bigint DEFAULT NULL,
  `tv_id` bigint DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `fec` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `frequency` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `modulation` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polarization` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `satellite` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `symbolrate` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `transmission` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6lrlshlcqe75wn0cqobxwos3k` (`radio_id`),
  KEY `FK5d7jdnxcusvdaulf94k706dvv` (`tv_id`)
) ENGINE=InnoDB AUTO_INCREMENT=927 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `caracteristique`
--

INSERT INTO `caracteristique` (`created_at`, `id`, `radio_id`, `tv_id`, `updated_at`, `fec`, `frequency`, `modulation`, `polarization`, `satellite`, `symbolrate`, `transmission`) VALUES
('2024-04-23 15:59:59.000000', 861, 1996, NULL, '2024-04-23 15:59:59.000000', '2/3', '  90.2', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 10:28:59.000000', 867, 1998, NULL, '2024-04-24 10:28:59.000000', '2/3', ' 88.4', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 10:36:08.000000', 868, 1998, NULL, '2024-04-24 10:36:08.000000', '2/3', '11679.57 MHz', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 10:37:22.000000', 869, 1996, NULL, '2024-04-24 10:37:22.000000', '2/3', '11679.57 MHz', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 10:39:47.000000', 870, 1999, NULL, '2024-04-24 10:39:47.000000', '2/3', ' 88.4 ', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 10:40:18.000000', 871, 1999, NULL, '2024-04-24 10:40:18.000000', '2/3', '11679.57 MHz', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 10:45:28.000000', 872, 2000, NULL, '2024-04-24 10:45:28.000000', '2/3', '95.6 ', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 10:45:37.000000', 873, NULL, 1721, '2024-04-24 10:45:37.000000', '2/3', '11680', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 10:46:39.000000', 874, 2000, NULL, '2024-04-24 10:46:39.000000', '2/3', '11679.57 MHZ', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 10:50:56.000000', 875, 2001, NULL, '2024-04-24 10:50:56.000000', '2/3', '93.6', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 10:52:00.000000', 876, 2001, NULL, '2024-04-24 10:52:00.000000', '2/3', '11679.57MHz', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 11:04:15.000000', 877, NULL, 1722, '2024-04-24 11:04:15.000000', '2/3', '10992', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:08:28.000000', 878, 2002, NULL, '2024-04-24 11:08:28.000000', '2/3', '101.5', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:09:13.000000', 879, 2002, NULL, '2024-04-24 11:09:13.000000', '2/3', '11679.57 ', '8PSK', '', 'eutlsat', '27500', 'DVB-S'),
('2024-04-24 11:09:47.000000', 880, NULL, 1723, '2024-04-24 11:09:47.000000', '2/3', '11680', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:13:03.000000', 881, 2003, NULL, '2024-04-24 11:13:03.000000', '2/3', '94.7', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:15:45.000000', 882, 2004, NULL, '2024-04-24 11:15:45.000000', '2/3', '94.2', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:16:09.000000', 883, NULL, 1724, '2024-04-24 11:16:09.000000', '3/4', '11679', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:18:11.000000', 884, NULL, 1725, '2024-04-24 11:18:11.000000', '3/4', '11679', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:18:36.000000', 885, 2005, NULL, '2024-04-24 11:18:36.000000', '2/3', '99.6', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:20:22.000000', 886, NULL, 1726, '2024-04-24 11:20:22.000000', '3/4', '10993\n', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:20:24.000000', 887, NULL, 1727, '2024-04-24 11:20:24.000000', '3/4', '11679', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:33:54.000000', 888, 2006, NULL, '2024-04-24 11:33:54.000000', '2/3', '87.80', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:39:35.000000', 889, 2007, NULL, '2024-04-24 11:39:35.000000', '2/3', '87.70', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:51:37.000000', 890, 2008, NULL, '2024-04-24 11:51:37.000000', '2/3', '87.90', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:52:29.000000', 891, NULL, 1728, '2024-04-24 11:52:29.000000', '2/3', '10922', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 11:56:12.000000', 892, 2009, NULL, '2024-04-24 11:56:12.000000', '2/3', '103.3', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 11:57:06.000000', 893, NULL, 1729, '2024-04-24 11:57:06.000000', '2/3', '10992', '8PSK', 'nilsat', 'nilsat', '5000', 'DVB-S'),
('2024-04-24 12:01:46.000000', 894, 2010, NULL, '2024-04-24 12:01:46.000000', '2/3', '89.3', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:02:13.000000', 895, NULL, 1730, '2024-04-24 12:02:13.000000', '2/3', '11393', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:04:30.000000', 896, 2011, NULL, '2024-04-24 12:04:30.000000', '2/3', '88.7', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:05:53.000000', 897, NULL, 1731, '2024-04-24 12:05:53.000000', '2/3', '10922', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:06:41.000000', 898, 2012, NULL, '2024-04-24 12:06:41.000000', '2/3', '91,2', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:11:18.000000', 899, 2013, NULL, '2024-04-24 12:11:18.000000', '2/3', '89.3', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:14:31.000000', 900, NULL, 1732, '2024-04-24 12:14:31.000000', '2/3', '10922', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:16:09.000000', 901, 2014, NULL, '2024-04-24 12:16:09.000000', '2/3', '100,9', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:19:29.000000', 902, 2015, NULL, '2024-04-24 12:19:29.000000', '2/3', '103.9', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:20:40.000000', 903, NULL, 1733, '2024-04-24 12:20:40.000000', '2/3', '11958', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:23:26.000000', 904, 2016, NULL, '2024-04-24 12:23:26.000000', '2/3', '95.8', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:25:21.000000', 905, NULL, 1734, '2024-04-24 12:25:21.000000', '2/3', '10922', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:27:37.000000', 906, NULL, 1735, '2024-04-24 12:27:37.000000', '2/3', '12418', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:31:30.000000', 907, 2017, NULL, '2024-04-24 12:31:30.000000', '2/3', '87.9', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:34:12.000000', 908, 2018, NULL, '2024-04-24 12:34:12.000000', '2/3', '100.40', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:37:30.000000', 909, 2019, NULL, '2024-04-24 12:37:30.000000', '2/3', '94.80', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:42:42.000000', 910, NULL, 1736, '2024-04-24 12:42:42.000000', '2/3', '10921', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-04-24 12:47:22.000000', 911, 2020, NULL, '2024-04-24 12:47:22.000000', '2/3', '93', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:58:33.000000', 912, 2021, NULL, '2024-04-24 12:58:33.000000', '2/3', '91.10', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 12:59:43.000000', 913, 2021, NULL, '2024-04-24 12:59:43.000000', '3/4', '12249.5 MHz', 'QPSK', '', 'eutlsat', '12.510 ', 'DVB-S'),
('2024-04-24 13:03:42.000000', 914, 2022, NULL, '2024-04-24 13:03:42.000000', '2/3', '94.80', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 14:54:53.000000', 915, 2033, NULL, '2024-04-24 14:54:53.000000', '2/3', '88.8', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 15:27:04.000000', 916, 2042, NULL, '2024-04-24 15:27:04.000000', '2/3', '92.7', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 15:32:16.000000', 917, 2043, NULL, '2024-04-24 15:32:16.000000', '2/3', '100.1', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 15:34:49.000000', 918, 2044, NULL, '2024-04-24 15:34:49.000000', '2/3', '100.1', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-24 15:38:18.000000', 919, 2045, NULL, '2024-04-24 15:38:18.000000', '2/3', ' 96.2', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-04-25 11:03:50.000000', 922, 1996, NULL, '2024-04-25 11:03:50.000000', '2/3', '891 AM', '8PSK', '', 'eutlsat', '', 'DVB-S'),
('2024-10-07 11:20:03.000000', 923, NULL, 1737, '2024-10-07 11:20:03.000000', '3/4', '10922', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-10-07 11:31:05.000000', 924, NULL, 1738, '2024-10-07 11:31:05.000000', '2/3', '11680', '8PSK', '', 'nilsat', '27500', 'DVB-S'),
('2024-10-07 11:41:36.000000', 925, NULL, 1739, '2024-10-07 11:41:36.000000', '3/4', '11680', '8PSK', 'nilsat', 'nilsat', '27500', 'DVB-S'),
('2024-10-07 11:42:20.000000', 926, NULL, 1739, '2024-10-07 11:42:20.000000', '3/4', '12054', '8PSK', 'nilsat', 'eutlsat', '27503', 'DVB-S');

-- --------------------------------------------------------

--
-- Structure de la table `categorie_chaine`
--

DROP TABLE IF EXISTS `categorie_chaine`;
CREATE TABLE IF NOT EXISTS `categorie_chaine` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `categorie_chaine`
--

INSERT INTO `categorie_chaine` (`created_at`, `id`, `updated_at`, `name`, `name_en`, `name_fr`) VALUES
('2024-04-17 03:14:12.000000', 1, '2024-04-16 03:14:12.000000', 'عامة', NULL, NULL),
(NULL, 2, NULL, 'إخبارية', NULL, NULL),
(NULL, 3, NULL, 'دينية', NULL, NULL),
(NULL, 4, NULL, 'رياضية', NULL, NULL),
(NULL, 5, NULL, 'نسائية', NULL, NULL),
(NULL, 6, NULL, 'أطفال', NULL, NULL),
('2024-04-23 16:12:42.000000', 7, '2024-04-23 16:12:42.000000', 'hk', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `complexe`
--

DROP TABLE IF EXISTS `complexe`;
CREATE TABLE IF NOT EXISTS `complexe` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `site` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `adresse_en` text COLLATE utf8mb4_general_ci,
  `adresse_fr` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `complexe`
--

INSERT INTO `complexe` (`created_at`, `id`, `updated_at`, `adresse`, `email`, `name`, `phone`, `site`, `type`, `description`, `adresse_en`, `adresse_fr`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
('2024-04-17 02:41:58.000000', 1, NULL, 'Blida,Algeria', 'CMX@CMX.com', 'Groupe All', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('2024-04-23 10:03:24.000000', 2, '2024-10-06 13:29:00.827439', 'elNAhar', 'elNAhar', 'النهار', '247', 'Cheje', 'public', 'النهار', NULL, NULL, 'Ennahar', 'Ennahar', 'Ennahar', 'Ennahar'),
('2024-04-23 15:51:41.000000', 4, '2024-10-06 20:24:26.043127', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz ', ' المؤسسة العمومية للتلفزيون (EPTV)', '023 53 10 10', ' https://www.entv.dz/', 'public', 'تم بسط السيادة على المؤسسة الوطنية للتلفزيون في 28 أكتوبر 1962، وعرفت عدة تحولات الى مؤسسة البث الإذاعي والتلفزي ثم مؤسسة الإذاعة والتلفزيون الى غاية صدور المرسوم رقم 86-146 المؤرخ في 01 جويلية 1986، والذي بموجبه أنشأت المؤسسة الوطنية للتلفزيون، بعد تحولها إلى مؤسسة عمومية للتلفزيون ذات طابع صناعي وتجاري بموجب المرسوم رقم 91-100 المؤرخ في 20 أفريل 1991، التي تتواجد ب 21 شارع ساحة الشهداء الجزائر العاصمة. تضطلع مؤسسة التلفزيون بمهمة الخدمة العمومية، وتكلف بالمهام التالية: (المادة 5 من المرسوم التنفيذي رقم 91-100 المؤرخ في 5شوال عام 1411 الموافق 20 أفريل1991)     • الإعلام بواسطة بث أو نقل جميع التحقيقات والحصص والبرامج المتعلقة بالأحداث الوطنية أو الجهوية أو المحلية أو الدولية طبقا لأحكام دفتر شروطها.     •  ضمان التعددية الإعلامية واستقلالها طبقا للأحكام الدستورية والنصوص الملحقة ومقررات المجلس الأعلى للإعلام وتوصياته.     •  تلبية الاحتياجات التربوية والترفيهية والثقافية لمختلف الفئات الاجتماعية في حدود وسائلها، وذلك قصد زيادة المعارف وتنمية روح المبادرة لدى المواطنين.     •  المساهمة في تطوير انتاج الأعمال الفكرية.     •  التشجيع على الاتصال الاجتماعي الذي تنظمه الحكومة أو الهيئات التابعة لها.  تسهر مؤسسة التلفزيون الجزائري على مواكبة التقنيات الجديدة وتكنولوجيات الاعلام والاتصال، من خلال توسيع حركية الرقمنة داخل المؤسسة والتركيز على العمل بأجهزة متطورة، وهي تدير حاليا شبكة تلفزيونية واحدة هي التلفزيون الجزائري، بالإضافة الى ثماني قنوات تلفزيونية وطنية، وهي كنال ألجيري، الجزائرية الإخبارية، القناة الامازيغية، قناة القرآن الكريم، الجزائرية السادسة، المعرفة، قناة الذاكرة والبرلمانية. ', '21 Martyrs Street, Algiers, Algeria', '21 rue des Martyrs, Alger, Algérie', 'Sovereignty over the National Television Establishment was initiated on October 28, 1962. It underwent several transformations: first into the Radio and Television Broadcasting Establishment, then into the Radio and Television Establishment, until the issuance of Decree No. 86-146 on July 1, 1986, which officially founded the National Television Establishment. Later, by Decree No. 91-100 dated April 20, 1991, the entity was transformed into the Public Television Establishment with an industrial and commercial nature, located at 21 Boulevard des Martyrs.  It undertakes the task of public service, and is entrusted with the following tasks: (Article 5 of Executive Decree No. 91-100 of 5 Shawwal 1411 corresponding to April 20, 1991).', 'La souveraineté sur l\'établissement national de télévision a été établie le 28 octobre 1962,  ce dernier a été transformé en établissement de radiodiffusion et de télévision puis en établissement de radio et de télévision jusqu\'à la promulgation du décret n° 86-146 du 01 juillet 1986, portant création de l\'établissement national de télévision, après sa transformation en établissement public de télévision à caractère industriel et commercial par le décret n° 91-100 du 20 avril 1991, sis au 21 boulevard des Martyrs, Alger. L\'établissement de télévision a une mission de service public et est chargé des tâches suivantes : (Article 5 du décret exécutif n° 91-100 du 5 chaoual 1411 correspondant au 20 avril 1991)', 'National television establishment (EPTV)', 'Etablissement national de télévision (EPTV)'),
('2024-04-23 15:54:28.000000', 5, '2024-10-06 20:24:47.628229', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر', 'info@echorouk.net\n', 'الشروق', '023 71 39 90\n', 'https://www.echoroukonline.com/\n', 'prive', 'الشروق', 'Saidoun Mohamed neighborhood, Villa No. 166 - Kouba, Algeria', 'Quartier Saidoun Mohamed, Villa N°166 - Kobba, Algérie', 'El Chourouk', 'El Chourouk', 'El Chourouk', 'El Chourouk'),
('2024-04-23 17:03:41.000000', 6, '2024-10-06 20:25:05.974973', ' 21 شارع الشهداء، الجزائر العاصمة، الجزائر', ' webtv@entv.dz\n', 'المؤسسة العمومية للتلفزيون (EPTV)', '025 30 10 10', ' https://www.entv.dz/\n', 'public', ' تم بسط السيادة على المؤسسة الوطنية للتلفزيون في 28 أكتوبر 1962، وعرفت عدة تحولات الى مؤسسة البث الإذاعي والتلفزي ثم مؤسسة الإذاعة والتلفزيون الى غاية صدور المرسوم رقم 86-146 المؤرخ في 01 جويلية 1986، والذي بموجبه أنشأت المؤسسة الوطنية للتلفزيون، بعد تحولها إلى مؤسسة عمومية للتلفزيون ذات طابع صناعي وتجاري بموجب المرسوم رقم 91-100 المؤرخ في 20 أفريل 1991، التي تتواجد ب 21 شارع ساحة الشهداء الجزائر العاصمة.', '21 Martyrs Street, Algiers, Algeria', '21 rue des Martyrs, Alger, Algérie', 'Sovereignty over the National Television Establishment was initiated on October 28, 1962. It underwent several transformations: first into the Radio and Television Broadcasting Establishment, then into the Radio and Television Establishment, until the issuance of Decree No. 86-146 on July 1, 1986, which officially founded the National Television Establishment. Later, by Decree No. 91-100 dated April 20, 1991, the entity was transformed into the Public Television Establishment with an industrial and commercial nature, located at 21 Boulevard des Martyrs.  It undertakes the task of public service, and is entrusted with the following tasks: (Article 5 of Executive Decree No. 91-100 of 5 Shawwal 1411 corresponding to April 20, 1991).', 'La souveraineté sur l\'établissement national de télévision a été établie le 28 octobre 1962,  ce dernier a été transformé en établissement de radiodiffusion et de télévision puis en établissement de radio et de télévision jusqu\'à la promulgation du décret n° 86-146 du 01 juillet 1986, portant création de l\'établissement national de télévision, après sa transformation en établissement public de télévision à caractère industriel et commercial par le décret n° 91-100 du 20 avril 1991, sis au 21 boulevard des Martyrs, Alger. L\'établissement de télévision a une mission de service public et est chargé des tâches suivantes : (Article 5 du décret exécutif n° 91-100 du 5 chaoual 1411 correspondant au 20 avril 1991)', 'National television establishment (EPTV)', 'Etablissement national de télévision (EPTV)'),
('2024-04-24 09:43:05.000000', 7, '2024-10-06 20:25:46.486957', 'بئر مراد رايس، الجزائر العاصمة', ' ', 'النهار', ' ', ' ', 'public', 'صدرت عام 2007', 'Bir Mourad Rais, Algiers', 'Bir Mourad Raïs, Alger', 'Ennahar', 'Ennahar', 'Ennahar', 'Ennahar'),
('2024-04-24 11:01:44.000000', 8, '2024-10-06 20:26:26.313135', ' بئر مراد رايس، الجزائر العاصمة', ' publicite@ennahartv.tv', 'النهار', ' +21323 59 91 14', 'https://www.ennaharonline.com/', 'prive', 'النهار', 'Bir Mourad Rais, Algiers', 'Bir Mourad Raïs, Alger', 'Ennahar', 'Ennahar', 'Ennahar', 'Ennahar'),
('2024-04-24 11:55:15.000000', 9, '2024-10-06 13:35:49.506070', ' ', ' ', 'الأنيس', ' ', ' ', 'prive', '  الأنيس ', NULL, NULL, 'Alanees', 'Alanees', 'Alanees', 'Alanees'),
('2024-04-24 12:00:42.000000', 10, '2024-10-06 13:37:27.686383', ' ', ' ', ' الهقار ', ' ', ' ', 'prive', 'الهقار  ', NULL, NULL, 'Hogar', 'Hogar', 'Hogar', 'Hogar'),
('2024-04-24 12:03:32.000000', 11, '2024-10-06 20:26:51.128853', 'شارع ديدوش مراد الجزائر العاصمة - الطابق الرابع 52', ' ', ' البلاد', ' ', ' ', 'prive', 'البلاد ', 'Didouche Mourad Street, Algiers - 4th floor 52', 'Rue Didouche Mourad, Alger, 4ème étage 52', 'El bilad', 'El bilad', 'El bilad', 'El bilad'),
('2024-04-24 12:07:11.000000', 12, '2024-10-06 13:42:01.276005', ' ', ' ', 'نوميديا نيوز', ' ', ' ', 'prive', 'نوميديا نيوز', NULL, NULL, 'Numidia news', 'Numidia news', 'Numidia news', 'Numidia news'),
('2024-04-24 12:19:00.000000', 13, '2024-10-06 13:41:25.998751', ' ', ' ', ' دزاير نيوز', '  ', ' ', 'prive', 'دزاير نيوز ', NULL, NULL, 'Dzair News', 'Dzair News', 'Dzair News', 'Dzair News'),
('2024-04-24 12:23:49.000000', 14, '2024-10-06 13:42:47.057498', ' ', ' ', 'الهداف', ' ', ' ', 'prive', 'الهداف', NULL, NULL, 'El haddaf', 'El haddaf', 'El haddaf', 'El haddaf'),
('2024-04-24 12:26:08.000000', 15, '2024-10-06 13:43:11.097770', ' ', ' ', 'سميرة ', ' ', ' ', 'prive', 'سميرة ', NULL, NULL, 'Samira', 'Samira', 'Samira', 'Samira'),
('2024-04-24 12:28:45.000000', 16, '2024-10-06 13:47:06.046143', ' ', ' ', 'الباهية', ' ', ' ', 'prive', 'الباهية', NULL, NULL, 'Bahia', ' Bahia', 'Bahia', 'Bahia'),
('2024-04-24 15:09:20.000000', 17, '2024-10-06 20:27:35.342734', 'طريق بينام بوزريعة 50 الجزائر', 'dmk@tda.dz', 'مؤسسة البث الاذاعي والتلفزي الجزائري (TDA)', '+213 (0) 23 18 10 01', 'https://www.tda.dz/', 'prive', 'على إثر إعادة هيكلة مؤسسة الإذاعة والتلفزة الجزائرية (ا ت ج)، تم انشاء المؤسسة الوطنية للبث الاذاعي والتلفزي ذات طابع اقتصادي وصيغة اجتماعية وثقافية، بموجب المرسوم رقم 86-148 المؤرخ في 24 شوال عام 1406 الموافق أول يوليو سنة 1986، بعدها تم تغيير تسميتها وصيغتها القانونية بموجب المرسوم التنفيذي رقم 91-98 المؤرخ في 20 أفريل1991، إلى المؤسسة العمومية للبث الاذاعي والتلفزي، ذات طابع صناعي وتجاري، تتمتع بالشخصية المعنوية والاستقلال المالي.', 'Benam Bouzareah Road 50 Algeria', 'Route Binam Bouzareah 50, Algérie', 'Under Decree No. 86-148 dated 24 Shawwal 1406, corresponding to July 1, 1986, following the restructuring of the Algerian Radio and Television Establishment (ART), the National Broadcasting Establishment was created as an economic company with a social and cultural nature, Subsequently, its name and legal status were changed under Executive Decree No. 91-98 dated April 20, 1991, to the Public Institution for Radio and Television Broadcasting, characterized by its industrial and commercial nature, enjoying legal personality and financial independence.  The tasks of the establishment, in particular, are as follows: Article 5 of Executive Decree No. 91-98 dated 5 Shawwal 1411, corresponding to April 20, 1991', 'Suite à la restructuration de l\'établissement algérien de radio et de télévision (RTA), l\'entreprise nationale de télédiffusion, à caractère économique, social et culturel, a été créée par le décret n° 86-148 du 24 chaoual 1406, correspondant au 1er juillet 1986, puis rebaptisée par le décret exécutif n° 91-98 du 20 avril 1991, Télédiffusion d’Algérie, à caractère industriel et commercial, dotée de la personnalité morale et de l\'autonomie financière. Les missions de l\'entreprise sont les suivantes : Article 5 du décret exécutif n° 91-98 du 5 chaoual 1411 (20 avril 1991)', 'Public Broadcasting Establishment of Algeria', 'Etablissement Public Télédiffusion d’Algérie TDA');

-- --------------------------------------------------------

--
-- Structure de la table `complexe_agrument`
--

DROP TABLE IF EXISTS `complexe_agrument`;
CREATE TABLE IF NOT EXISTS `complexe_agrument` (
  `agrument_id` bigint NOT NULL,
  `complexe_id` bigint NOT NULL,
  KEY `FKaaq6ue4im06m21545xapadpdi` (`agrument_id`),
  KEY `FKcx832gfsnj6t4617ayn6a6gk2` (`complexe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `complexe_agrument`
--

INSERT INTO `complexe_agrument` (`agrument_id`, `complexe_id`) VALUES
(3, 6),
(3, 8),
(5, 8),
(6, 8),
(3, 5),
(3, 9),
(3, 10),
(3, 11),
(3, 12),
(3, 13),
(3, 14),
(3, 15),
(3, 16),
(3, 17),
(4, 17),
(3, 6),
(3, 8),
(5, 8),
(6, 8),
(3, 5),
(3, 9),
(3, 10),
(3, 11),
(3, 12),
(3, 13),
(3, 14),
(3, 15),
(3, 16),
(3, 17),
(4, 17);

-- --------------------------------------------------------

--
-- Structure de la table `direction`
--

DROP TABLE IF EXISTS `direction`;
CREATE TABLE IF NOT EXISTS `direction` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email_directeur` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_directeur` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_direction` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone_directeur` int DEFAULT NULL,
  `prenom_directeur` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_directeur_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_directeur_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_direction_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nom_direction_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `prenom_directeur_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `prenom_directeur_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `direction`
--

INSERT INTO `direction` (`id`, `email_directeur`, `nom_directeur`, `nom_direction`, `phone_directeur`, `prenom_directeur`, `nom_directeur_en`, `nom_directeur_fr`, `nom_direction_en`, `nom_direction_fr`, `prenom_directeur_en`, `prenom_directeur_fr`) VALUES
(5, 'd.developpement@ministerecommunication.gov.dz', 'علان', 'مديرية التطوير و الاستثمار', 23549952, 'عبد القادر', NULL, 'Alane', 'Directorate of Development and Investment', '\nDirection du Développement et de l\'Investissement', NULL, 'Abdelkader'),
(6, 'dcf@ministerecommunication.gov.dz', 'جغادر', 'مدرية التعاون  والتكوين', 23549914, 'عبد الجليل ', NULL, 'Djeghadar', 'Directorate of Cooperation and Training', '\nDirection de la Coopération et de la Formation', NULL, 'Abdeljalil'),
(7, 'dam@ministerecommunication.gov.dz', 'بلدية', 'مديرية الإدارة والوسائل', 23549941, 'أحمد ', NULL, 'Beldia', 'Directorate of Administration and Means', 'Direction de l\'Administration et des Moyens', NULL, 'Ahmed'),
(8, 'dci@ministerecommunication.gov.dz', 'تلمات عمار', 'مديرية الاتصال المؤسساتي', 23549878, ' رضا ', NULL, 'Talmat Amar', 'Directorate of Institutional Communication', 'Direction de la Communication Institutionnelle', NULL, 'Redha Amine'),
(9, 'dajda@ministerecommunication.gov.dz', 'شريف ', 'مديرية الشؤون  القانونية  والتوثيق  والأرشيف', 23549864, 'فاطمة', NULL, 'Cherif', 'Directorate of Legal, Documentation and Archive Affairs', 'Direction des Affaires Juridiques, de la Documentation et des Archives', NULL, 'Fatma'),
(10, 'd.media@ministerecommunication.gov.dz', 'خليفي ', 'مديرية  وسائل  الإعلام', 23549909, 'خديجة', NULL, 'Khelifi', 'Directorate of Media', 'Direction des Médias', NULL, 'Khadidja'),
(11, 'inspecteur.g@ministerecommunication.gov. dz', 'بن زليخة ', 'المفتش العام ', 23549938, 'أحمد ', NULL, 'Benzlikha', 'General Inspector', 'Inspecteur général', NULL, 'Ahmed'),
(12, 'sg@ministerecommunication.gov.dz', 'خالدي', 'أمين عام ', 23549807, 'مختار', NULL, 'Khaldi', 'General Secretary', 'Secretaire General', NULL, 'Mokhtar'),
(13, 'chef.cabinet@ministerecommunication.gov.dz', 'ذبيح', 'رئيس الديوان ', 23549888, ' رضوان ', NULL, 'Debih', 'Chef of Cabinet', 'Chef de cabinet', NULL, 'Radouane');

-- --------------------------------------------------------

--
-- Structure de la table `etablissement`
--

DROP TABLE IF EXISTS `etablissement`;
CREATE TABLE IF NOT EXISTS `etablissement` (
  `complexe_id` bigint DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `site` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `localisation` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `adresse_en` text COLLATE utf8mb4_general_ci,
  `adresse_fr` text COLLATE utf8mb4_general_ci,
  `localisation_en` text COLLATE utf8mb4_general_ci,
  `localisation_fr` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_80odl28njpub882o8qo5u35yg` (`complexe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1566 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `etablissement`
--

INSERT INTO `etablissement` (`complexe_id`, `created_at`, `id`, `updated_at`, `adresse`, `description`, `email`, `fax`, `name`, `phone`, `site`, `type`, `localisation`, `description_en`, `description_fr`, `name_fr`, `name_en`, `adresse_en`, `adresse_fr`, `localisation_en`, `localisation_fr`) VALUES
(6, '2024-04-24 12:56:36.000000', 1554, '2024-10-06 16:18:13.000000', 'ـ21 شارع الشهداء، الجزائر العاصمة، الجزائر\r\n', 'تم بسط السيادة على المؤسسة الوطنية للتلفزيون في 28 أكتوبر 1962، وعرفت عدة تحولات الى مؤسسة البث الإذاعي والتلفزي ثم مؤسسة الإذاعة والتلفزيون الى غاية صدور المرسوم رقم 86-146 المؤرخ في 01 جويلية 1986، والذي بموجبه أنشأت المؤسسة الوطنية للتلفزيون، بعد تحولها إلى مؤسسة عمومية للتلفزيون ذات طابع صناعي وتجاري بموجب المرسوم رقم 91-100 المؤرخ في 20 أفريل 1991، التي تتواجد ب 21 شارع ساحة الشهداء الجزائر العاصمة.تضطلع مؤسسة التلفزيون بمهمة الخدمة العمومية، وتكلف بالمهام التالية: (المادة 5 من المرسوم التنفيذي رقم 91-100 المؤرخ في 5شوال عام 1411 الموافق 20 أفريل1991)', 'webtv@entv.dz\r\n', '+21323 53 10 93\r\n+21323 53 19 98\r\n', ' المؤسسة العمومية للتلفزيون (EPTV)', '+21323 53 10 10\r\n', 'https://www.entv.dz/\r\n', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3196.7106310586696!2d3.0464917763783355!3d36.75351627032883!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fb27ad162e7d1%3A0x8a03f3a3f2667dac!2zVMOpbMOpdmlzaW9uIFB1YmxpcXVlIEFsZ8Opcmllbm5l!5e0!3m2!1sfr!2sdz!4v1714029807195!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;', 'Sovereignty over the National Television Establishment was initiated on October 28, 1962. It underwent several transformations: first into the Radio and Television Broadcasting Establishment, then into the Radio and Television Establishment, until the issuance of Decree No. 86-146 on July 1, 1986, which officially founded the National Television Establishment. Later, by Decree No. 91-100 dated April 20, 1991, the entity was transformed into the Public Television Establishment with an industrial and commercial nature, located at 21 Boulevard des Martyrs. It undertakes the task of public service, and is entrusted with the following tasks: (Article 5 of Executive Decree No. 91-100 of 5 Shawwal 1411 corresponding to April 20, 1991).', 'La souveraineté sur l\'établissement national de télévision a été établie le 28 octobre 1962,  ce dernier a été transformé en établissement de radiodiffusion et de télévision puis en établissement de radio et de télévision jusqu\'à la promulgation du décret n° 86-146 du 01 juillet 1986, portant création de l\'établissement national de télévision, après sa transformation en établissement public de télévision à caractère industriel et commercial par le décret n° 91-100 du 20 avril 1991, sis au 21 boulevard des Martyrs, Alger. L\'établissement de télévision a une mission de service public et est chargé des tâches suivantes : (Article 5 du décret exécutif n° 91-100 du 5 chaoual 1411 correspondant au 20 avril 1991)', 'Etablissement national de télévision (EPTV)', 'National television establishment (EPTV)', '21 Martyrs Street, Algiers, Algeria', '-21 rue des Martyrs, Alger, Algérie', NULL, NULL),
(NULL, '2024-04-24 15:45:49.000000', 1555, '2024-10-06 20:14:05.032037', '02 شارع فريد زوييش، القبة، الجزائر العاصمة، الجزائر', 'تم تأسيس المركز الدولي للصحافة بموجب المرسوم التنفيذي رقم 02-117 المؤرخ في 20 محرم 1423 الموافق 3 أفريل2002، ويعد مؤسسة عمومية ذات طابع صناعي وتجاري تتمتع بالشخصية المعنوية والاستقلال المالي.لقد أضاف انشاء المركز الدولي للصحافة سنة 1995 إسهاما ملموسا في تحسين ظروف عمل المهنيين وكذا تطوير الاتصال المؤسساتي والحكومي في عدة مناسبات كبرى على الصعيدين الوطني والدولي، حيث أضحت خبرة المركز الدولي للصحافة عبر الأحداث المتتالية وسيلة اتصال ضرورية من خلال مختلف الخدمات التي يقدمها لضمان تغطية إعلامية جيدة، هذا الفضاء سمح أيضا باحتضان مجموعة من النشاطات الثقافية والفنية كوسيلة لقاء وتبادل الخبرات.', 'Contact@cipalgerie.com', '(+213) 2370-9034/36', 'المركز الدولي للصحافة', '023 70 90 34', NULL, 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1344.4443072748!2d3.0937264715329253!3d36.73107494323319!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fad527e33e70d%3A0x318654c772eafdeb!2sP3JW%2BG38%2C%20Kouba!5e0!3m2!1sfr!2sdz!4v1714031136712!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\" ', 'Created by Executive Decree No. 02-117 of 20 Muharram 1423, corresponding to April 3, 2002, the International Presse Center is a public industrial and commercial establishment with legal personality and financial autonomy.The establishment of the International Presse Center in 1995 made a tangible contribution to improving working conditions for press professionals and to the development of institutional and government communication during several major national and international events. As events unfolded, the expertise of the International Presse Center became a necessary communication tool through the various services it offers to ensure effective media coverage. Additionally, this space has enabled the Center to host various cultural and artistic activities, fostering meetings and exchanges of experiences.', 'Créé par le décret exécutif n° 02-117 du 20 Muharram 1423correspondant au 3 avril 2002, le centre international de presse est un établissement public à caractère industriel et commercial doté de la personnalité morale et de l\'autonomie financière. La création du centre international de presse en 1995 a contribué concrètement à l\'amélioration des conditions de travail des professionnels ainsi qu\'au développement de la communication institutionnelle et gouvernementale, et ce, à l\'occasion de plusieurs événements majeurs au niveau national et international. Au fil des événements successifs, l\'expertise du centre international de presse est devenue un moyen de communication nécessaire à travers les différents services qu\'il offre pour assurer une bonne couverture médiatique, et cet espace lui a également permis d\'accueillir diverses activités culturelles et artistiques comme moyen de rencontre et d\'échange d\'expériences. ', 'Centre International de Presse ', 'International Press Center', '02 Farid Zouiche Street, Kouba, Algiers, Algeria', '02 Farid Zouiche Street, Kouba, Algiers, Algeria', NULL, NULL),
(NULL, '2024-04-24 14:46:36.000000', 1556, '2024-04-24 14:46:36.000000', 'غير متوفر', 'على إثر إعادة هيكلة مؤسسة الإذاعة والتلفزة الجزائرية (ا ت ج)، تم انشاء مؤسسة الإذاعة الوطنية المسموعة، بموجب المرسوم رقم 146-86 المؤرخ في 01 جويلية 1986، ليتم تحويلها سنة 1991 الى المؤسسة العمومية للإذاعة المسموعة ذات طابع اقتصادي وصيغة تجارية، بموجب المرسوم رقم 102-91 المؤرخ في 5شوال عام 1411 الموافق 20 أفريل1991.\nوتتمثل مهمة المؤسسة فيما يأتي: المادة 6 من المرسوم التنفيذي رقم 91-102 المؤرخ في 5شوال عام 1411 الموافق 20 أفريل1991.\n', 'غير متوفر', 'غير متوفر', 'المؤسسة العمومية للإذاعة المسموعة (EPRS)', '  غير متوفر', '  غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3196.419968665234!2d3.0541613763785826!3d36.760491369936105!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fb35a8dc45493%3A0xfa248774b5cc62c!2z2YXYpNiz2LPYqSDYp9mE2LnZhdmI2YXZitipINin2YTYp9iw2KfYudipINmI2KrZhNmB2LLZitmI2YY!5e0!3m2!1sfr!2sdz!4v1714030311139!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'Following the restructuring of the Algerian Radio and Television Establishment (ART), the National Sound Broadcasting Establishment was created by Decree No. 146-86 on July 1, 1986. In 1991, it was transformed into the Public Sound Broadcasting Establishment of an economic and commercial nature by Decree No. 102-91 of 5 Chaoual 1411, corresponding to April 20, 1991. This establishment was given the following mission, as outlined in Article 6 of Executive Decree No. 91-102 of 5 Chaoual 1411 (April 20, 1991).', 'Suite à la restructuration de l\'établissement algérien de radio et de télévision (RTA), l’établissement national de radiodiffusion sonore a été créée par le décret n° 146-86 du 01 juillet 1986, pour être transformée en 1991 en établissement public de radiodiffusion sonore à caractère économique et commercial, par le décret n° 102-91 du 5 chaoual 1411, correspondant au 20 avril 1991. La mission de l\'établissement est la suivante : Article 6 du décret exécutif n° 91-102 du 5 chaoual 1411 (20 avril 1991).', 'Etablissement Public de Radiodiffusion Sonore (EPRS)', 'Public Sound Broadcasting Establishment (EPRS)', NULL, NULL, NULL, NULL),
(17, '2024-04-24 15:09:57.000000', 1557, '2024-10-06 20:18:49.198052', 'طريق بينام بوزريعة 50 الجزائر', 'على إثر إعادة هيكلة مؤسسة الإذاعة والتلفزة الجزائرية (ا ت ج)، تم انشاء المؤسسة الوطنية للبث الاذاعي والتلفزي ذات طابع اقتصادي وصيغة اجتماعية وثقافية، بموجب المرسوم رقم 86-148 المؤرخ في 24 شوال عام 1406 الموافق أول يوليو سنة 1986، بعدها تم تغيير تسميتها وصيغتها القانونية بموجب المرسوم التنفيذي رقم 91-98 المؤرخ في 20 أفريل1991، إلى المؤسسة العمومية للبث الاذاعي والتلفزي، ذات طابع صناعي وتجاري، تتمتع بالشخصية المعنوية والاستقلال المالي.تتمثل مهام المؤسسة على الخصوص فيما يأتي: المادة 5 من المرسوم التنفيذي رقم 91-98 المؤرخ في 5شوال عام 1411 الموافق 20 أفريل1991)', 'dmk@tda.dz', NULL, 'مؤسسة البث الاذاعي والتلفزي الجزائري (TDA)', '+213 (0) 23 18 10 01', 'https://www.tda.dz/', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3195.0845078137927!2d3.0108056763796305!3d36.79252416813133!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fb17c1d1fa0d5%3A0x23c0b01cddcf746c!2zVMOpbMOpZGlmZnVzaW9uIGQnQWxnw6lyaWUgVERB!5e0!3m2!1sfr!2sdz!4v1714029921245!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'Under Decree No. 86-148 dated 24 Shawwal 1406, corresponding to July 1, 1986, following the restructuring of the Algerian Radio and Television Establishment (ART), the National Broadcasting Establishment was created as an economic company with a social and cultural nature, Subsequently, its name and legal status were changed under Executive Decree No. 91-98 dated April 20, 1991, to the Public Institution for Radio and Television Broadcasting, characterized by its industrial and commercial nature, enjoying legal personality and financial independence. The tasks of the establishment, in particular, are as follows: Article 5 of Executive Decree No. 91-98 dated 5 Shawwal 1411, corresponding to April 20, 1991', 'Suite à la restructuration de l\'établissement algérien de radio et de télévision (RTA), l\'entreprise nationale de télédiffusion, à caractère économique, social et culturel, a été créée par le décret n° 86-148 du 24 chaoual 1406, correspondant au 1er juillet 1986, puis rebaptisée par le décret exécutif n° 91-98 du 20 avril 1991, Télédiffusion d’Algérie, à caractère industriel et commercial, dotée de la personnalité morale et de l\'autonomie financière. Les missions de l\'entreprise sont les suivantes : Article 5 du décret exécutif n° 91-98 du 5 chaoual 1411 (20 avril 1991)', 'Etablissement Public Télédiffusion d’Algérie TDA', 'Public Broadcasting Establishment of Algeria', 'Benam Bouzareah Road 50 Algeria', 'Route Binam Bouzareah 50, Algérie', NULL, NULL),
(NULL, '2024-04-24 15:31:54.000000', 1558, '2024-10-06 20:19:28.482086', 'بئر مراد رايس 16.000الجزائر الجزائر.', 'تم إنشاء وكالة الأنباء الجزائرية في 1 ديسمبر 1961 بتونس، في خضم حرب التحرير الوطنية، لتكون صوت الثورة الجزائرية وحامل لوائها على الساحة الإعلامية الدولية، بعد الاستقلال تم نقل مقرها بشكل طبيعي إلى الجزائر العاصمة، وواصلت عملها كوكالة أنباء تقدم خدمات إعلامية وفق النصوص والمهام المكلفة بها.تمارس مؤسسة \"وكالة الأنباء الجزائرية\" التي تم تحويلها بموجب المرسوم التنفيذي رقم 91-105 المؤرخ في 20 أفريل 1991 الى مؤسسة عمومية ذات طابع اقتصادي وتجاري، وظيفة الخدمة العمومية من خلال المهام التالية: المادة 3 من المرسوم رقم 91-105 المؤرخ في 20 أفريل 1991', 'contact@aps.dz\r\n', '+213 (0) 23 56 96 47', 'وكالة الأنباء الجزائرية (APS)', '+213 (0) 23 56 96 90', 'https://www.aps.dz/', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3197.349198935703!2d3.0580478890422325!3d36.73818839969114!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fad81ad08914d%3A0xc1135269d69ae530!2sAlg%C3%A9rie%20Presse%20Service!5e0!3m2!1sfr!2sdz!4v1714030527049!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'Algeria Press Service was established on December 1, 1961, in Tunisia, in the midst of the National Liberation War, to be the voice of the Algerian revolution and its banner on the international media stage. After independence, its headquarters was transferred naturally to Algiers, and it continued to operate as a news agency providing media services in accordance with the texts and tasks assigned to it. \'Algeria Press Service,\' which was transformed into a public establishment with an economic and commercial nature under Executive Decree No. 91-105 dated April 20, 1991, exercises the function of public service through the following missions: Article 3 of Decree No. 91-105 dated April 20, 1991', 'Algérie Presse Service a été créée le 1er décembre 1961 à Tunis, en pleine guerre de libération nationale, pour être la voix de la Révolution algérienne et son porte-drapeau sur la scène médiatique internationale. Après l\'indépendance, son siège a été naturellement transféré à Alger et a poursuivi son travail d\'agence de presse fournissant des services médiatiques conformément aux textes et aux missions qui lui ont été assignés. Transformée par le décret exécutif n° 91-105 du 20 avril 1991 en établissement public à caractère économique et commercial, «Algérie Presse Service » exerce une fonction de service public à travers les missions suivantes : Article 3 du décret n° 91-105 du 20 avril 1991', 'Algérie Presse Service', 'Algeria Press Service', 'Bir Mourad Rais 16,000 Algeria Algeria.', 'Bir Mourad Rais16 000 Alger Algérie.', NULL, NULL),
(NULL, '2024-04-24 15:54:41.000000', 1559, '2024-10-06 20:20:05.108595', ' دار الصحافة الطاهر جعوط ، 1 ماي ، الجزائر العاصمة', 'بمقتضى مرسوم تنفيذي رقم 90-243 مؤرخ في 13 محرم عام 1411 الموافق 4 أوت 1990، يتضمن انشاء مؤسسة عمومية ذات طابع صناعي وتجاري تتمتع بالشخصية المعنوية والاستقلال المالي تسمى \"دار الصحافة\"، مقرها 01 نهج بشير عطار أول ماي –الجزائر العاصمة.', 'غير متوفر', 'غير متوفر', 'دار الصحافة', 'غير متوفر', 'غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d950.9170633022551!2d3.187553278997451!3d36.71076748846273!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sfr!2sdz!4v1714037132517!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'By virtue of Executive Decree No. 90-243 dated 13 Muharram 1411, corresponding to August 4, 1990, a public establishment of an industrial and commercial nature, enjoying legal personality and financial autonomy, was created, called \'Press House,\' with its headquarters located at 01 Avenue Bachir Attar, 1er Mai - Algiers.', 'Par  décret exécutif n° 90-243 du 13 Mouharram 1411 correspondant au 4 août 1990 portant création d\'un établissement public à caractère industriel et commercial doté de la personnalité morale et de l\'autonomie financière dénommé « Maison de la presse », dont le siège est fixé au 01 Avenue Bachir Attar 1er mai - Alger.', 'Maison de la presse', 'Press House', 'Tahar Djaout Press House, May 1, Algiers', 'Maison de Presse Tahar Jaout, 1er mai, Alger', NULL, NULL),
(NULL, '2024-04-24 16:44:11.000000', 1560, '2024-10-06 20:20:35.119182', 'المنطقة الصناعية العليا ، باب الزوار ، الجزائر العاصمة ، الجزائر', 'شركة الطباعة بالجزائر هي مؤسسة عمومية اقتصادية أُنشِئَت بموجب المرسوم رقم 90-242 المؤرخ في 11/12/1990 تحت إشراف وزارة الاتصال، نتيجة لإعادة هيكلة شركة الشعب. تُؤمن الشركة بطباعة وتوزيع الصحف الوطنية العامة والخاصة، وتُساهم في تطوير الصحافة الوطنية المكتوبة من خلال التحديث الدائم لوسائل إنتاجها، واستخدام التكنولوجيا الحديثة، وظائف الطباعة ذات الجودة المتنوعة.في إطار تحسين قطاع الاتصال والإعلام على المستوى الوطني وتسهيل وتوسيع توزيع الصحف على المستوى الوطني؛ تجسَّد هذا الاهتمام في قرار إنشاء وحدات طباعة إقليمية في الجنوب الأكبر (سنة 2008 مطبعة ورقلة، سنة 2013 مطبعة بشار).', 'contact@sia.dz', '+21323 83 96 75', 'شركة الطباعة للجزائر (SIA)', '+21323 83 98 76', 'https://www.sia.dz/', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d950.9170633022551!2d3.187553278997451!3d36.71076748846273!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sfr!2sdz!4v1714037132517!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'Algiers Printing Company is a public economic establishment under the supervision of the Ministry of Communication, founded under Decree No. 90-242 dated December 11, 1990, as a result of the restructuring of the People\'s Company. It is responsible for printing and distributing national public and private newspapers and contributes to the development of national written journalism through the continuous modernization of its production methods and the use of modern technology to ensure diverse quality printing functions. To improve the communication and media sector at the national level and facilitate the distribution of newspapers nationwide, this commitment was reflected in the decision to establish regional printing units in the greater south: the Ouargla printing press in 2008 and the Béchar printing press in 2013.', 'Société d’impression d’Alger est un établissement public à caractère économique créé par le décret n° 90-242 du 11 décembre 1990 sous la tutelle du ministère de la Communication, à la suite de la restructuration de ECHAAB. La société assure l\'impression et la distribution des journaux nationaux publics et privés et contribue au développement de la presse écrite nationale par la modernisation constante de ses méthodes de production, l\'utilisation de technologies modernes et des travaux d\'impression diversifiés et de qualité. Dans le cadre de l\'amélioration du secteur de la communication et des médias au niveau national et de la facilitation et de l\'élargissement de la distribution des journaux au niveau national, cet intérêt s\'est traduit par la décision de créer des unités régionales d\'impression dans le Grand Sud (2008 imprimerie de Ouargla, 2013 imprimerie de Bechar).', 'Société d’Impression d’Alger SIA', 'Algiers Printing Company SIA', 'Upper Industrial Zone, Bab Ezzouar, Algiers, Algeria', 'Zone Haute Industrielle, Bab Ezzouar, Alger, Algérie', NULL, NULL),
(NULL, '2024-04-25 11:38:55.000000', 1561, '2024-10-06 20:20:56.591861', '02شارع فريد زويوش، القبة- الجزائر العاصمة.', 'وهي مؤسسة اقتصادية عمومية ذات أسهم، أسست في سنة 1997 برأسمال قدره 300.000.000 دج، ', 'alpapspa@gmail.com', '023 70 93 48', 'الجزائرية للورق  (ALPAP)', '023 70 93 49\r\n\r\n023 70 93 50', 'غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1598.843120024312!2d3.0885984296224462!3d36.730096014493974!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fad4fda97c663%3A0x827b7bb9920e684a!2sP3JQ%2B7RV%2C%20Kouba!5e0!3m2!1sfr!2sdz!4v1714038667666!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\"', 'It is a public economic establishment with shares, founded in 1997 with a capital of 300,000,000 DZD.', 'Il s\'agit d\'une société économique publique par actions, créée en 1997 avec un capital de 300.000.000 DA', 'Entreprises publiques d’impression et du Papier ALPAP', 'Public printing and paper companies ALPAP', '02 Farid Zouiche Street, Kouba - Algiers.', '02 Rue Farid Zoyoush, Kouba – Alger.', NULL, NULL),
(NULL, '2024-04-25 11:54:56.000000', 1562, '2024-10-06 20:22:16.083814', 'المنطقة الصناعية بومرزوق قطعة رقم 08 ص.ب 384 RP، قسنطينة، الجزائر', 'انبثقت عن إعادة هيكلة مؤسسة \"النصر\" تقوم بطباعة الجرائد، الكتب، المجلات والملصقات', 'contact@siecne.com', '+21331 73 19 10', 'شركة الطباعة للشرق(SIE) ', '+21331 73 19 12', 'غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m17!1m12!1m3!1d3213.4449455985596!2d6.6!3d36.35!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m2!1m1!2zMzbCsDIxJzAwLjAiTiA2wrAzNicwMC4wIkU!5e0!3m2!1sfr!2sdz!4v1714044941149!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"', 'It emerged from the restructuring of \'Al-Nasr\', specialized in printing newspapers, books, magazines, and posters.', 'Résultant de la restructuration d\'Al Nasr, elle a pour mission d’imprimer des journaux, des livres, des magazines et des affiches.', 'Imprimerie de l\'Est (SIE)', 'Eastern Printing Company (SIE)', 'Industrial Zone Boumerzoug Lot n° 08 BP 384 RP, Constantine, Algeria', 'Zone Industrielle Boumerzoug Lot n° 08 BP 384 RP, Constantine, Algérie', NULL, NULL),
(NULL, '2024-04-25 12:47:54.000000', 1563, '2024-10-06 20:22:39.403307', '03 طريق النجم ، إسينيا ، وهران ، الجزائر', ' وهي مؤسسة ذات طابع اقتصادي(EPE) تقوم بطباعة الجرائد، الكتب والمجلات.', 'directiongenerale@sio-dz.com', '+21341 61 77 41', 'شركة الطباعة للغرب(SIO)', '+21341 61 77 51', 'غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m17!1m12!1m3!1d3240.189893442299!2d-0.6330555999999998!3d35.6969444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m2!1m1!2zMzXCsDQxJzQ5LjAiTiAwwrAzNyc1OS4wIlc!5e0!3m2!1sfr!2sdz!4v1714044842663!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"', 'An establishment of an economic nature (EPE) that prints newspapers, books, and magazines.', 'Il s\'agit d\'une entreprise économique (EPE) qui a pour mission d’imprimer des journaux, des livres et des magazines.', 'Imprimerie de l’Ouest (SIO)', 'Western Printing Company (SIO)', '03 Star Road, Issinia, Oran, Algeria', '03 Route Najm, Essinia, Oran, Algérie', NULL, NULL),
(NULL, '2024-04-25 13:07:03.000000', 1564, '2024-10-06 20:23:03.429363', '06 شارع باستور ، الجزائر العاصمة ، الجزائر', 'كانت ولغاية سنة 1997 ذات طابع صناعي وتجاري، تحولت في شهر مارس من سنة 1997 الى مؤسسة عمومية اقتصادية ذات أسهم، تقوم بطباعة الجرائد، الكتب والمجلات.', 'enapspa@gmail.com', '+21321 73 18 00\r\n\r\n', 'المؤسسة الجزائرية للصحافة(ENAP)', '+21321 73 18 01', 'غير متوفر', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m17!1m12!1m3!1d3195.9015489198964!2d3.0576983999999996!3d36.7729292!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m2!1m1!2zMzbCsDQ2JzIyLjYiTiAzwrAwMycyNy43IkU!5e0!3m2!1sfr!2sdz!4v1714044656183!5m2!1sfr!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"', 'Until 1997, it had an industrial and commercial nature. In March 1997, it was transformed into a public economic establishment with shares, whose mission is printing newspapers, books and magazines.', 'Jusqu\'en 1997, il s\'agissait d\'une entreprise industrielle et commerciale, transformé en mars 1997 en un établissement public à caractère économique par actions, ayant pour mission d’imprimer des journaux, des livres et des magazines.', 'Entreprise de la Presse Algérienne (ENAP)', 'Algerian Press Company (ENAP)', '06 Pasteur Street, Algiers, Algeria', '06 rue Pasteur, Alger, Algérie', NULL, NULL),
(NULL, '2024-10-06 16:11:41.000000', 1565, '2024-10-06 16:42:42.000000', '02  شارع فريدة زويوش  القبة الجزائر ', 'المركز الوطني للوثائق والصحافة والصورة والإعلام هو مؤسسة عمومية تضطلع بمهمة جمع، معالجة، حفظ، وإيصال التراث المكتوب، المصور، والسمعي البصري التابع لقطاع الاتصال لأكثر من قرن من تاريخ الجزائر. كما يتولى المركز نشر وتوزيع المنتجات الوثائقية، النصوص، والصور، مع تسهيل الوصول إلى الذاكرة الوثائقية عبر المنصة الإلكترونية  وذلك بإحالة   المتصفح إلى المراجع وفهرسة الوثائق، إضافة إلى تحديد مواضيع الأرصدة الوثائقية، وذلك لتقديم نظام معلوماتي متنوع يشمل الاقتصاد، المجتمع، السياسة، والثقافة', '', '023.70.90.52', 'المركز الوطني للوثائق والصحافة والصورة والإعلام', '023.70.90.52', 'www.cndpi.dz', 'soustutelle', 'https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d4522.40105687396!2d3.09442646362691!3d36.72687308643245!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1zMDIg2LTYp9ix2Lkg2YHYsdmK2K_YqSDYstmI2YrZiNi0ICDYp9mE2YLYqNipINin2YTYrNiy2KfYptixIA!5e0!3m2!1sar!2sdz!4v1728223761219!5m2!1sar!2sdz\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"', 'The National Center for Documentation, Press, Image and Information is a public institution that is responsible for collecting, processing, preserving and communicating the written, photographic and audiovisual heritage of the communication sector for more than a century of Algerian history. The center also publishes and distributes documentary products, texts and images, while facilitating access to documentary memory via the electronic platform by referring the browser to references and indexing documents, in addition to identifying the topics of documentary assets, in order to provide a diverse information system that includes the economy, society, politics and culture.', 'Le Centre National de la Documentation, de la Presse, de l\'Image et des Médias est un établissement public qui assure la mission de collecte, de traitement, de conservation et de communication du patrimoine écrit, photographique et audiovisuel du secteur de la communication pour plus d\'un siècle d\'histoire algérienne. Le centre publie et diffuse également des produits documentaires, des textes et des images, tout en facilitant l\'accès à la mémoire documentaire via la plateforme électronique en renvoyant le navigateur vers des références et des documents d\'indexation, en plus d\'identifier des thèmes dans les crédits documentaires, afin de fournir une information diversifiée. système qui comprend l’économie, la société, la politique et la culture.', 'Centre national du document, de la presse, de l\'image et des médias', 'National Center for Documents, Press, Image and Media', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `event_publication`
--

DROP TABLE IF EXISTS `event_publication`;
CREATE TABLE IF NOT EXISTS `event_publication` (
  `id` binary(16) NOT NULL,
  `completion_date` datetime(6) DEFAULT NULL,
  `event_type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `listener_id` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `publication_date` datetime(6) DEFAULT NULL,
  `serialized_event` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `lois`
--

DROP TABLE IF EXISTS `lois`;
CREATE TABLE IF NOT EXISTS `lois` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `lois`
--

INSERT INTO `lois` (`created_at`, `id`, `updated_at`, `name`, `description`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
('2024-04-24 13:01:11.000000', 2, '2024-04-24 13:01:11.000000', 'القوانين', NULL, NULL, NULL, NULL, NULL),
('2024-04-28 10:34:06.000000', 5, '2024-04-28 10:34:06.000000', 'المراسيم التنفيذية', ' ', NULL, NULL, NULL, NULL),
('2024-09-24 13:43:24.000000', 6, '2024-09-24 13:43:24.000000', 'القرارت', 'القرارت', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `minister`
--

DROP TABLE IF EXISTS `minister`;
CREATE TABLE IF NOT EXISTS `minister` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `start_from` date DEFAULT NULL,
  `until` date DEFAULT NULL,
  `profile_picture_id` bigint DEFAULT NULL,
  `first_name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `formatted_start_from` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `formatted_until` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `last_name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_eqosespnllwcj7bdqatuc4uyb` (`profile_picture_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `minister`
--

INSERT INTO `minister` (`id`, `address`, `birthday`, `first_name`, `last_name`, `start_from`, `until`, `profile_picture_id`, `first_name_fr`, `formatted_start_from`, `formatted_until`, `last_name_fr`) VALUES
(1, 'alg', NULL, 'يزيد', 'امحمد', '1958-09-19', '1962-07-22', 355, 'Yazid', NULL, NULL, 'M\'hamed '),
(2, 'alg', NULL, 'حمو', 'الحاج', '1962-01-01', '1963-01-01', 356, 'Hamou', NULL, NULL, 'Hadj '),
(3, 'alg', NULL, 'بلهوان', 'مولود', '1963-01-01', '1965-01-01', 357, 'Belahouane', NULL, NULL, 'Mouloud '),
(4, 'alg', NULL, 'بومعزة', 'بشير', '1965-01-01', '1966-01-01', 358, 'Boumaza', NULL, NULL, 'Bachir '),
(5, 'alg', NULL, 'بن يحي', 'محمد صديق', '1966-01-01', '1970-01-01', 359, 'Benyahia', NULL, NULL, 'Mohamed Seddik '),
(6, 'alg', NULL, 'الإبراهيمي', 'أحمد طالب', '1970-01-01', '1977-01-01', 360, 'Ibrahimi', NULL, NULL, 'Ahmed Taleb '),
(7, 'alg', NULL, 'مالك', 'رضا', '1977-01-01', '1979-01-01', 361, 'Malek', NULL, NULL, 'Redha '),
(8, 'alg', NULL, 'مهري', ' عبد الحميد', '1979-01-01', '1980-01-01', 362, 'Mehri', NULL, NULL, 'Abdelhamid '),
(9, 'alg', NULL, 'بسايح', 'بوعلام', '1980-01-01', '1984-01-01', 363, 'Bessaih', NULL, NULL, 'Boualem '),
(10, 'alg', NULL, 'رويس', 'بشير', '1984-01-01', '1988-01-01', 364, 'Rouis', NULL, NULL, 'Bachir '),
(11, 'alg', NULL, 'عمار', ' محمد علي', '1988-01-01', '1989-01-01', 365, 'Ammar', NULL, NULL, 'Mohamed Ali '),
(12, 'alg', NULL, 'الشيخ', '  بوعمران', '1991-06-01', '1991-10-01', 366, 'Cheikh ', NULL, NULL, 'Bouamrane        '),
(13, 'alg', NULL, 'بلقايد', ' أبو بكر ', '1991-01-01', '1992-01-01', 367, 'Belkaid', NULL, NULL, 'Aboubakr '),
(14, 'alg', NULL, 'حمراوي', ' حبيب شوقي', '1992-01-01', '1993-01-01', 368, 'Hamraoui', NULL, NULL, 'Habib Chawki'),
(15, 'alg', NULL, 'مرزوق', 'محمد', '1993-09-01', '1993-11-01', 369, 'Marzouk', NULL, NULL, 'Mohamed '),
(16, 'alg', NULL, 'زرهوني', 'محمد بن عمر', '1994-01-01', '1995-01-01', 370, 'Mohamed', NULL, NULL, 'Ali'),
(17, 'alg ', NULL, 'بشيشي', 'لمين', '1995-01-01', '1996-01-01', 371, 'Youssef', NULL, NULL, 'Ghanem'),
(18, 'alg', NULL, 'ميهوبي', 'ميهوب', '1996-01-01', '1997-01-01', 372, 'Abdelkader', NULL, NULL, 'Messaoudi'),
(19, 'alg', NULL, 'حمراوي', 'حبيب شوقي', '1997-01-01', '1998-01-01', 373, 'Houcine', NULL, NULL, 'Derrar'),
(20, 'alg', NULL, 'رحابي', ' عبد العزيز', '1998-01-01', '1999-01-01', 374, 'Djamila', NULL, NULL, 'Zerouki'),
(21, 'alg', NULL, 'تبون', ' عبد المجيد', '1999-01-01', '2000-01-01', 375, 'Ahmed', NULL, NULL, 'Sidi'),
(22, 'alg ', NULL, 'عميمور', 'محي الدين', '2000-01-01', '2001-01-01', 376, 'Abderrahmane', NULL, NULL, 'Ould Kadour'),
(23, 'alg', NULL, 'عبو', 'محمد', '2001-01-01', '2002-01-01', 377, 'Mohamed Tayeb', NULL, NULL, 'Bouazza'),
(24, 'alg', NULL, 'تومي', 'خليدة', '2002-01-01', '2004-01-01', 378, 'Nadia', NULL, NULL, 'Bouazza'),
(25, 'alg ', NULL, 'هيشور', 'بوجمعة', '2004-01-01', '2006-01-01', 379, 'Salim', NULL, NULL, 'Henine'),
(26, 'alg', NULL, 'جيار', 'الهاشمي', '2006-01-01', '2007-01-01', 380, 'Fatima', NULL, NULL, 'Habiba'),
(27, 'alg', NULL, 'بوكرزازة', ' عبد الرشيد', '2007-01-01', '2008-01-01', 381, 'Boukerzaza', NULL, NULL, 'Abderrachid'),
(28, 'alg', NULL, 'ميهوبي', ' عزالدين', '2008-01-01', '2010-01-01', 382, 'Mihoubi', NULL, NULL, 'Azzedine'),
(29, 'alg', NULL, 'مهل', 'ناصر', '2010-01-01', '2012-01-01', 383, 'Mehal', NULL, NULL, 'Nacer'),
(30, 'alg', NULL, 'السعيد', 'محمد', '2012-09-01', '2013-09-01', 384, 'Belaïd', NULL, NULL, 'Mohand-Oussaïd'),
(31, 'alg', NULL, 'مساهل', ' عبدالقادر ', '2013-09-01', '2014-05-01', 385, 'Messahel', NULL, NULL, 'Abdelkader'),
(32, 'alg', NULL, 'قر ين', 'حميد', '2014-05-01', '2017-05-01', 386, 'Grine', NULL, NULL, 'Hamid'),
(33, 'alg', NULL, 'كعوان', 'جمال', '2017-05-25', '2019-03-31', 387, 'Kaouane', NULL, NULL, 'Djamel'),
(34, 'alg', NULL, 'رابحي', 'حسن', '2019-08-01', '2020-01-02', 388, 'Rabhi', NULL, NULL, 'Hassan'),
(35, 'alg', NULL, 'بلحيمر', 'عمار', '2020-01-02', '2021-11-01', 389, 'Belhimer', NULL, NULL, 'Ammar'),
(36, 'alg', NULL, 'بوسليماني', 'محمد', '2021-11-01', '2023-06-01', 390, 'Bouslimani', NULL, NULL, 'Mohamed'),
(37, 'alg', NULL, 'لعقاب', 'محمد', '2023-09-01', NULL, 391, 'Docteur Laagab', NULL, NULL, 'Mohamed');

-- --------------------------------------------------------

--
-- Structure de la table `multimedia`
--

DROP TABLE IF EXISTS `multimedia`;
CREATE TABLE IF NOT EXISTS `multimedia` (
  `created_at` datetime(6) DEFAULT NULL,
  `etablissement_id` bigint DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `presse_id` bigint DEFAULT NULL,
  `radio_id` bigint DEFAULT NULL,
  `text_juridique_id` bigint DEFAULT NULL,
  `tv_id` bigint DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `doc_type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `file_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `file_path` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fromtable` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `minister_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK430s9iwxejdhgykl5mksxiwnc` (`etablissement_id`),
  KEY `FKthv4bidn8m41cugevxi64rhhb` (`presse_id`),
  KEY `FK6ke2068jfg5ygjmey2u59r39o` (`radio_id`),
  KEY `FKg0hfeer38vyuwtit258wamuce` (`text_juridique_id`),
  KEY `FK841iiluy2pexb2qg6exqhbws0` (`tv_id`),
  KEY `FKqetdote85qjqxe9namkmfygww` (`user_id`),
  KEY `FKs37vceteeeh5w6sf235bk8rtm` (`minister_id`)
) ENGINE=InnoDB AUTO_INCREMENT=395 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `multimedia`
--

INSERT INTO `multimedia` (`created_at`, `etablissement_id`, `id`, `presse_id`, `radio_id`, `text_juridique_id`, `tv_id`, `updated_at`, `user_id`, `doc_type`, `file_name`, `file_path`, `fromtable`, `type`, `minister_id`) VALUES
('2024-04-23 15:59:59.000000', NULL, 6, NULL, 1996, NULL, NULL, '2024-04-23 15:59:59.000000', NULL, 'profileDoc', '391f46ab-3d02-4f28-915d-262d4d045c1f_1.1.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-23 16:08:02.000000', NULL, 8, 1005, NULL, NULL, NULL, '2024-04-23 16:08:02.000000', NULL, 'profileDoc', '701f8753-143b-4ce0-9e0c-477246b1bd11_1.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 16:13:51.000000', NULL, 9, 1006, NULL, NULL, NULL, '2024-04-23 16:13:51.000000', NULL, 'profileDoc', '809ac086-6dee-4b53-99ca-d94600bca5dc_2.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 16:20:11.000000', NULL, 11, 1007, NULL, NULL, NULL, '2024-04-23 16:20:11.000000', NULL, 'profileDoc', '9d66b8a3-0be8-4470-8397-1023fa9767e9_24.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 16:27:06.000000', NULL, 12, 1008, NULL, NULL, NULL, '2024-04-23 16:27:06.000000', NULL, 'profileDoc', 'c2d434d5-e775-4df4-b7a1-95a3c5becdb8_5.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:08:02.000000', NULL, 16, 1010, NULL, NULL, NULL, '2024-04-23 17:08:02.000000', NULL, 'profileDoc', 'd1fb643d-3383-416e-820d-a268212eed74_1.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:19:15.000000', NULL, 17, 1011, NULL, NULL, NULL, '2024-04-23 17:19:15.000000', NULL, 'profileDoc', '3ba1f2d2-f7c0-4be6-9111-742c3c364685_2.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:21:19.000000', NULL, 18, 1012, NULL, NULL, NULL, '2024-04-23 17:21:19.000000', NULL, 'profileDoc', '9efe5305-3708-4723-93dd-238c616eccb9_24.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:23:21.000000', NULL, 19, 1013, NULL, NULL, NULL, '2024-04-23 17:23:21.000000', NULL, 'profileDoc', 'ad8464a7-bc46-4ad5-bde4-cf62e8c2bbef_5.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:25:36.000000', NULL, 20, 1014, NULL, NULL, NULL, '2024-04-23 17:25:36.000000', NULL, 'profileDoc', 'be63e2d8-6a37-4620-9bef-443cf6b5441e_6.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-23 17:27:25.000000', NULL, 21, 1015, NULL, NULL, NULL, '2024-04-23 17:27:25.000000', NULL, 'profileDoc', '24268b1d-5938-4a11-9d6f-ae805dbb380c_8.png', 'images', NULL, 'image/png', NULL),
('2024-04-23 17:29:39.000000', NULL, 22, 1016, NULL, NULL, NULL, '2024-04-23 17:29:39.000000', NULL, 'profileDoc', '5ac34081-3dab-4592-9efe-0040fba1bb23_13.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:03:10.000000', NULL, 23, 1017, NULL, NULL, NULL, '2024-04-24 10:03:10.000000', NULL, 'profileDoc', '8ab7a2a7-d89d-48c7-b67e-09f86222d298_35.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:05:36.000000', NULL, 24, 1018, NULL, NULL, NULL, '2024-04-24 10:05:36.000000', NULL, 'profileDoc', '5958e26e-5f79-448b-8430-bd5ec32fda03_50.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:08:10.000000', NULL, 25, 1019, NULL, NULL, NULL, '2024-04-24 10:08:10.000000', NULL, 'profileDoc', '05837526-484d-4fcc-b330-6769882e7357_54.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 10:25:55.000000', NULL, 26, 1020, NULL, NULL, NULL, '2024-04-24 10:25:55.000000', NULL, 'profileDoc', '33bea472-6f17-44a0-b851-f7b0f3970b11_التحرير.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:27:57.000000', NULL, 27, 1021, NULL, NULL, NULL, '2024-04-24 10:27:57.000000', NULL, 'profileDoc', 'c8226395-66ef-4060-bc55-4743c084558f_الجديد اليومي.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 10:28:58.000000', NULL, 28, NULL, 1998, NULL, NULL, '2024-04-24 10:28:58.000000', NULL, 'profileDoc', '0b923fd9-2fe5-446e-b383-f0e246aef72c_2.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:31:58.000000', NULL, 29, 1022, NULL, NULL, NULL, '2024-04-24 10:31:58.000000', NULL, 'profileDoc', '29dc6b50-7cf1-4f60-8764-0b0d9953bfc7_58.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 10:34:23.000000', NULL, 30, 1023, NULL, NULL, NULL, '2024-04-24 10:34:23.000000', NULL, 'profileDoc', 'bb55420d-dd46-4e5b-9b22-88a0b45df6aa_51.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:36:19.000000', NULL, 31, 1024, NULL, NULL, NULL, '2024-04-24 10:36:19.000000', NULL, 'profileDoc', 'b2e53b31-8c57-4853-83c9-97d70c6581b6_47.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:37:44.000000', NULL, 32, 1025, NULL, NULL, NULL, '2024-04-24 10:37:44.000000', NULL, 'profileDoc', 'b9ea1823-3bc2-48ac-aa3e-06efdc87561b_37.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 10:39:47.000000', NULL, 33, NULL, 1999, NULL, NULL, '2024-04-24 10:39:47.000000', NULL, 'profileDoc', '7c927458-6c8e-4bc2-8639-f40be9291520_3.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:45:28.000000', NULL, 34, NULL, 2000, NULL, NULL, '2024-04-24 10:45:28.000000', NULL, 'profileDoc', '4755e4ab-2059-4911-895e-116785f0b44b_4.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:45:36.000000', NULL, 35, NULL, NULL, NULL, 1721, '2024-04-24 10:45:36.000000', NULL, 'profileDoc', '31a2e1b8-4dd9-4d9e-8fb4-072ea543bf9a_2.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 10:50:55.000000', NULL, 36, NULL, 2001, NULL, NULL, '2024-04-24 10:50:55.000000', NULL, 'profileDoc', 'a6f1c88f-518f-49be-b47a-7e2c4509505a_5.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:04:11.000000', NULL, 37, NULL, NULL, NULL, 1722, '2024-04-24 11:04:11.000000', NULL, 'profileDoc', '75d06fcc-2072-4d86-a435-6ea60e7b54c5_10.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:08:28.000000', NULL, 38, NULL, 2002, NULL, NULL, '2024-04-24 11:08:28.000000', NULL, 'profileDoc', 'f9f8503a-1719-4c57-bfad-747d37118a11_6.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:09:45.000000', NULL, 39, NULL, NULL, NULL, 1723, '2024-04-24 11:09:45.000000', NULL, 'profileDoc', '4bd26560-7c6f-47f7-bc31-538829763907_4.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:13:02.000000', NULL, 40, NULL, 2003, NULL, NULL, '2024-04-24 11:13:02.000000', NULL, 'profileDoc', '064639ca-3686-4add-9938-d5aec06f9c44_7.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:15:44.000000', NULL, 41, NULL, 2004, NULL, NULL, '2024-04-24 11:15:44.000000', NULL, 'profileDoc', 'fd1034f5-6163-48b7-84a7-6e0708be179f_8.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:16:07.000000', NULL, 42, NULL, NULL, NULL, 1724, '2024-04-24 11:16:07.000000', NULL, 'profileDoc', '1c070633-6859-4e17-b905-c5e8c5d16997_5.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:18:08.000000', NULL, 43, NULL, NULL, NULL, 1725, '2024-04-24 11:18:08.000000', NULL, 'profileDoc', '620f55a1-f252-4554-b0ff-96ad9a038d38_6.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 11:18:35.000000', NULL, 44, NULL, 2005, NULL, NULL, '2024-04-24 11:18:35.000000', NULL, 'profileDoc', '2e945134-f034-40ea-99a4-a223f5b4b686_9.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:20:19.000000', NULL, 45, NULL, NULL, NULL, 1726, '2024-04-24 11:20:19.000000', NULL, 'profileDoc', '7f85feec-3f07-4092-9fd9-0c9a7b63f0a4_7.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:20:22.000000', NULL, 46, NULL, NULL, NULL, 1727, '2024-04-24 11:20:22.000000', NULL, 'profileDoc', 'e2dcfdf8-ef93-4170-8586-a349f819b6d6_91.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 11:33:54.000000', NULL, 47, NULL, 2006, NULL, NULL, '2024-04-24 11:33:54.000000', NULL, 'profileDoc', '4c2c7882-6782-4638-9ed1-745bebdbf660_001.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:39:35.000000', NULL, 48, NULL, 2007, NULL, NULL, '2024-04-24 11:39:35.000000', NULL, 'profileDoc', 'dd071aa6-15af-4848-b9cf-20c3237a2010_002.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:51:37.000000', NULL, 49, NULL, 2008, NULL, NULL, '2024-04-24 11:51:37.000000', NULL, 'profileDoc', '73b2d4ff-1a08-4b46-8d0a-ef71742796af_003.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:52:29.000000', NULL, 50, NULL, NULL, NULL, 1728, '2024-04-24 11:52:29.000000', NULL, 'profileDoc', '0b18f68b-bcbd-42f4-b83b-85279e43058b_14.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:56:12.000000', NULL, 51, NULL, 2009, NULL, NULL, '2024-04-24 11:56:12.000000', NULL, 'profileDoc', 'd8482d53-ba0a-4733-9928-3dbf400dd360_004.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 11:57:05.000000', NULL, 52, NULL, NULL, NULL, 1729, '2024-04-24 11:57:05.000000', NULL, 'profileDoc', '005ca511-cce9-42bc-88cb-79a93c7f2262_1.webp', 'images', NULL, 'image/webp', NULL),
('2024-04-24 11:58:37.000000', NULL, 53, 1026, NULL, NULL, NULL, '2024-04-24 11:58:37.000000', NULL, 'profileDoc', '9baf6eaa-f30a-474c-8c27-978235e59239_41.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:01:46.000000', NULL, 54, NULL, 2010, NULL, NULL, '2024-04-24 12:01:46.000000', NULL, 'profileDoc', '90404d1c-5744-4b07-9570-5c1255f9d20d_005.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:02:13.000000', NULL, 55, NULL, NULL, NULL, 1730, '2024-04-24 12:02:13.000000', NULL, 'profileDoc', 'e4fb0226-6c3f-456e-83bc-9b80938e5dba_11.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 12:04:30.000000', NULL, 56, NULL, 2011, NULL, NULL, '2024-04-24 12:04:30.000000', NULL, 'profileDoc', '12e1eb4c-1d8a-4fce-a34a-c8975d57c12f_006.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:05:53.000000', NULL, 57, NULL, NULL, NULL, 1731, '2024-04-24 12:05:53.000000', NULL, 'profileDoc', '3677868c-92af-4974-a6e4-43235f5c4a59_12.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 12:06:13.000000', NULL, 58, 1027, NULL, NULL, NULL, '2024-04-24 12:06:13.000000', NULL, 'profileDoc', 'fbe35ea5-563b-49fa-82aa-47a6229c7594_26.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 12:06:41.000000', NULL, 59, NULL, 2012, NULL, NULL, '2024-04-24 12:06:41.000000', NULL, 'profileDoc', '225ef69c-7aa6-4cce-9dfe-fbe47245954d_007.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:11:18.000000', NULL, 60, NULL, 2013, NULL, NULL, '2024-04-24 12:11:18.000000', NULL, 'profileDoc', 'ec72d201-5a70-4a5f-80b6-a5815ddfae0d_008.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:14:31.000000', NULL, 61, NULL, NULL, NULL, 1732, '2024-04-24 12:14:31.000000', NULL, 'profileDoc', 'c03d94d3-07f3-4964-873f-ee2b692399cc_numedianews.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:16:09.000000', NULL, 62, NULL, 2014, NULL, NULL, '2024-04-24 12:16:09.000000', NULL, 'profileDoc', '5ec97492-e9ae-4612-a535-2929baeae80a_009.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:19:29.000000', NULL, 63, NULL, 2015, NULL, NULL, '2024-04-24 12:19:29.000000', NULL, 'profileDoc', '9cb73f58-7840-4652-a710-f2373474ec7c_010.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:20:40.000000', NULL, 64, NULL, NULL, NULL, 1733, '2024-04-24 12:20:40.000000', NULL, 'profileDoc', 'dee44704-851b-4605-9af7-6479fa2eb863_15.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:23:26.000000', NULL, 65, NULL, 2016, NULL, NULL, '2024-04-24 12:23:26.000000', NULL, 'profileDoc', '6f1db219-87f9-4a61-93cf-28767faa2649_011.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:23:29.000000', NULL, 66, 1028, NULL, NULL, NULL, '2024-04-24 12:23:29.000000', NULL, 'profileDoc', 'a60dd2b4-1f73-48c4-9f8d-b0331c1d86f0_43.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:25:21.000000', NULL, 67, NULL, NULL, NULL, 1734, '2024-04-24 12:25:21.000000', NULL, 'profileDoc', 'a1c54d34-2dc9-429f-b826-a41319dbd2db_17.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 12:27:37.000000', NULL, 68, NULL, NULL, NULL, 1735, '2024-04-24 12:27:37.000000', NULL, 'profileDoc', '174b1a8b-4f4a-4e31-ae9b-1eddf13a5e45_18.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:29:06.000000', NULL, 69, 1029, NULL, NULL, NULL, '2024-04-24 12:29:06.000000', NULL, 'profileDoc', '97e97f3f-25bc-4877-bb1d-7f89ee2e3a39_36.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:31:30.000000', NULL, 70, NULL, 2017, NULL, NULL, '2024-04-24 12:31:30.000000', NULL, 'profileDoc', '08ec8bea-1ed6-49c8-82f0-95a6edd21ad6_012.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:34:12.000000', NULL, 71, NULL, 2018, NULL, NULL, '2024-04-24 12:34:12.000000', NULL, 'profileDoc', '280fe844-9074-444a-aae7-b13b518d6cc3_013.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:37:30.000000', NULL, 72, NULL, 2019, NULL, NULL, '2024-04-24 12:37:30.000000', NULL, 'profileDoc', 'b851fc2f-c6e5-43ee-869a-a33a3a186368_014.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:42:42.000000', NULL, 73, NULL, NULL, NULL, 1736, '2024-04-24 12:42:42.000000', NULL, 'profileDoc', 'ec98c406-4798-4f32-91d8-4223efbf5a81_23.jpeg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-24 12:47:22.000000', NULL, 74, NULL, 2020, NULL, NULL, '2024-04-24 12:47:22.000000', NULL, 'profileDoc', '77b885d1-a6e7-43d3-928e-971651d29ab4_015.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:58:33.000000', NULL, 75, NULL, 2021, NULL, NULL, '2024-04-24 12:58:33.000000', NULL, 'profileDoc', '033d5328-462d-40e0-9786-3f1c82a1d52c_017.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 13:02:13.000000', NULL, 76, NULL, NULL, 2, NULL, '2024-04-24 13:02:13.000000', NULL, 'profileDoc', '8c88e51e-42e9-4d37-ba8c-86645f26b971_الصحافة المكتوبة والالكترونية.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-24 13:03:42.000000', NULL, 77, NULL, 2022, NULL, NULL, '2024-04-24 13:03:42.000000', NULL, 'profileDoc', 'f6a2d50c-bb0b-477a-a6f7-6e57a2fd8a6a_018.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:50:59.000000', 1555, 85, NULL, NULL, NULL, NULL, '2024-04-24 15:50:59.000000', NULL, 'profileDoc', '_d520cc28-bd20-4860-af2d-6b4ac3986835_03722.jpg', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:40:41.000000', 1558, 86, NULL, NULL, NULL, NULL, '2024-04-24 15:40:41.000000', NULL, 'profileDoc', '8ab7a2a7-d89d-48c7-b67e-09f86222d298_35.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:28:40.000000', 1556, 87, NULL, NULL, NULL, NULL, '2024-04-24 15:28:40.000000', NULL, 'profileDoc', 'fd1034f5-6163-48b7-84a7-6e0708be179f_8_tda_25.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:09:57.000000', 1557, 88, NULL, NULL, NULL, NULL, '2024-04-24 15:13:09.000000', NULL, 'profileDoc', 'fd1034f5-6163-48b7-84a7-6e0708be179f_8_tda.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 12:56:36.000000', 1554, 89, NULL, NULL, NULL, NULL, '2024-04-24 13:06:06.000000', NULL, 'profileDoc', '79285c64-9e95-4142-8bc4-e4e1468af9fd_62.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 13:51:53.000000', NULL, 90, NULL, NULL, 3, NULL, '2024-04-24 13:51:53.000000', NULL, 'profileDoc', '020c549c-6b75-414f-8084-01b245870369_القانون العضوي للإعلام.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-24 13:55:56.000000', NULL, 91, NULL, NULL, 4, NULL, '2024-04-24 13:55:56.000000', NULL, 'profileDoc', 'afae01d4-cb37-496b-9e5a-7c6513eb0550_قانون نشاط السمعي البصري.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-24 14:25:45.000000', NULL, 98, NULL, 2029, NULL, NULL, '2024-04-24 14:25:45.000000', NULL, 'profileDoc', 'ee7a16c0-3c82-4889-a147-9d12418653de_019.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:34:16.000000', NULL, 99, NULL, 2030, NULL, NULL, '2024-04-24 14:34:16.000000', NULL, 'profileDoc', '4b1912e5-a4b7-44f6-b2d1-2f9cdb6b3eb7_020.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:46:36.000000', 1556, 100, NULL, NULL, NULL, NULL, '2024-04-24 14:46:36.000000', NULL, 'etablissementDoc', '52c8762c-3fc6-45b2-beb0-d103ce2d4775_logo-entv-tV1.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:47:29.000000', NULL, 101, NULL, 2031, NULL, NULL, '2024-04-24 14:47:29.000000', NULL, 'profileDoc', '4a9bf7ea-142d-4371-9878-939b538fb284_021.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:51:49.000000', NULL, 102, NULL, 2032, NULL, NULL, '2024-04-24 14:51:49.000000', NULL, 'profileDoc', 'd495c7eb-54a1-43b0-891d-5b147e2f8cfb_022.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:54:52.000000', NULL, 103, NULL, 2033, NULL, NULL, '2024-04-24 14:54:52.000000', NULL, 'profileDoc', '4fe76648-0b79-40fb-8ee9-eed67e7bf569_023.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:58:26.000000', NULL, 104, NULL, 2034, NULL, NULL, '2024-04-24 14:58:26.000000', NULL, 'profileDoc', '9d9e38f8-cf43-46ce-9165-9ff20ae544a6_024.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 14:58:32.000000', NULL, 105, NULL, 2035, NULL, NULL, '2024-04-24 14:58:32.000000', NULL, 'profileDoc', '94aafde2-4501-47d1-ab1f-3a5147cee891_024.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:01:19.000000', NULL, 106, NULL, 2036, NULL, NULL, '2024-04-24 15:01:19.000000', NULL, 'profileDoc', '145ec7f8-0b16-4304-b678-a4daf69a05be_025.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:11:31.000000', NULL, 107, NULL, 2037, NULL, NULL, '2024-04-24 15:11:31.000000', NULL, 'profileDoc', 'e368e722-0d35-4e1c-8409-16e6a65b33b3_026.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:13:47.000000', NULL, 108, NULL, 2038, NULL, NULL, '2024-04-24 15:13:47.000000', NULL, 'profileDoc', 'c9f91138-fa04-4968-98c1-80fbcaef206d_027.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:17:34.000000', NULL, 109, NULL, 2039, NULL, NULL, '2024-04-24 15:17:34.000000', NULL, 'profileDoc', '45a9d8cf-b32e-4f98-98f4-8acf955a4b46_028.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:21:19.000000', NULL, 110, NULL, 2040, NULL, NULL, '2024-04-24 15:21:19.000000', NULL, 'profileDoc', '7c04c4d2-4b14-45b9-b5fd-42694f42aa72_029.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:24:35.000000', NULL, 111, NULL, 2041, NULL, NULL, '2024-04-24 15:24:35.000000', NULL, 'profileDoc', 'b04f65dd-57da-4f5e-bf3d-223a4d422606_030.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:27:04.000000', NULL, 112, NULL, 2042, NULL, NULL, '2024-04-24 15:27:04.000000', NULL, 'profileDoc', '8b3f2601-576f-4a1d-b2f5-c3088be67b21_031.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:34:49.000000', NULL, 113, NULL, 2044, NULL, NULL, '2024-04-24 15:34:49.000000', NULL, 'profileDoc', '7c94aa54-a319-429f-a76e-b81b453c665f_033.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:38:17.000000', NULL, 114, NULL, 2045, NULL, NULL, '2024-04-24 15:38:17.000000', NULL, 'profileDoc', '9d707078-75ec-4b5f-8e05-7fa667ce94bd_034.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:41:22.000000', NULL, 115, NULL, 2046, NULL, NULL, '2024-04-24 15:41:22.000000', NULL, 'profileDoc', '09442421-9979-411f-8ecf-4ee8a35523ad_035.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:44:59.000000', NULL, 116, NULL, 2047, NULL, NULL, '2024-04-24 15:44:59.000000', NULL, 'profileDoc', 'de056bf6-b2ce-43ea-ae79-f03e82cdc514_036.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:48:43.000000', NULL, 117, NULL, 2048, NULL, NULL, '2024-04-24 15:48:43.000000', NULL, 'profileDoc', 'd520cc28-bd20-4860-af2d-6b4ac3986835_037.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:52:37.000000', NULL, 118, NULL, 2049, NULL, NULL, '2024-04-24 15:52:37.000000', NULL, 'profileDoc', 'ffcefe0e-2e1c-4114-be8c-7eab62550e15_038.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:55:48.000000', NULL, 119, NULL, 2050, NULL, NULL, '2024-04-24 15:55:48.000000', NULL, 'profileDoc', '15f107c9-8919-4ca0-9fe1-5934e1108a4d_039.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 15:58:15.000000', NULL, 122, NULL, 2053, NULL, NULL, '2024-04-24 15:58:15.000000', NULL, 'profileDoc', 'bcb17255-7b82-48c1-bb00-0e3cee8d2acb_040.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:12:43.000000', NULL, 127, NULL, 2058, NULL, NULL, '2024-04-24 16:12:43.000000', NULL, 'profileDoc', '8eb15e6b-cd4f-4f3e-9f15-5347af5bcbc5_041.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:40:31.000000', NULL, 129, NULL, 2060, NULL, NULL, '2024-04-24 16:40:31.000000', NULL, 'profileDoc', '57900afb-a068-49ff-bb5d-c7c257bf188e_042.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:44:20.000000', NULL, 130, NULL, 2061, NULL, NULL, '2024-04-24 16:44:20.000000', NULL, 'profileDoc', '3ed47fd8-f38e-4e7e-abf5-6a05f30678fa_043.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:46:19.000000', NULL, 131, NULL, 2062, NULL, NULL, '2024-04-24 16:46:19.000000', NULL, 'profileDoc', 'aa4fd723-bbec-4bd7-b775-fc5f1ce094e4_044.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:47:24.000000', NULL, 132, NULL, 2063, NULL, NULL, '2024-04-24 16:47:24.000000', NULL, 'profileDoc', '3d0e2f8f-eadb-432f-b4f7-4ba3b6774c19_045.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:49:00.000000', NULL, 133, NULL, 2064, NULL, NULL, '2024-04-24 16:49:00.000000', NULL, 'profileDoc', '0202e4fe-800a-4ef4-a1bf-14b677256777_046.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:49:59.000000', NULL, 134, NULL, 2065, NULL, NULL, '2024-04-24 16:49:59.000000', NULL, 'profileDoc', 'b27da7a3-e921-4578-892d-da8f26139aa8_047.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:51:19.000000', NULL, 135, NULL, 2066, NULL, NULL, '2024-04-24 16:51:19.000000', NULL, 'profileDoc', 'aa4190c8-65b0-43f7-9b8a-0e7a6da6a0da_048.png', 'images', NULL, 'image/png', NULL),
('2024-04-24 16:53:12.000000', 1560, 250, NULL, NULL, NULL, NULL, NULL, NULL, 'profileDoc', 'ffcefe0e-2e1c-4114-be8c-7eab62550e15_038_sia.png', 'images', NULL, 'image/png', NULL),
('2024-04-25 11:51:46.000000', 1561, 251, NULL, NULL, NULL, NULL, '2024-04-25 11:51:46.000000', NULL, 'profileDoc', NULL, 'images', NULL, 'image/png', NULL),
('2024-04-25 12:09:47.000000', 1562, 252, NULL, NULL, NULL, NULL, NULL, NULL, 'profileDoc', 'ffcefe0e-2e1c-4114-be8c-7eab62550e15_038_sie.png', 'images', NULL, 'image/png', NULL),
('2024-04-25 12:55:17.000000', 1563, 253, NULL, NULL, NULL, NULL, '2024-04-25 12:55:17.000000', NULL, 'profileDoc', 'ffcefe0e-2e1c-4114-be8c-7eab62550e15_038_sio.png', 'images', NULL, 'image/png', NULL),
('2024-04-28 10:40:33.000000', NULL, 254, NULL, NULL, 5, NULL, '2024-04-28 10:40:33.000000', NULL, 'profileDoc', '9de9eb1c-de66-412c-895b-e34c7d9dd748_EPRS.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-28 11:08:36.000000', NULL, 255, NULL, NULL, 6, NULL, '2024-04-28 11:08:36.000000', NULL, 'profileDoc', 'cc50efc5-3d24-477b-9da6-d8d60debcf33_APS.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-28 11:12:36.000000', NULL, 256, NULL, NULL, 7, NULL, '2024-04-28 11:12:36.000000', NULL, 'profileDoc', '708b8192-be53-48dd-b874-a6138d852716_APS.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-04-29 16:26:31.894450', NULL, 257, 1030, NULL, NULL, NULL, '2024-04-29 16:26:31.894450', NULL, 'profileDoc', '27bb76c0-b47a-4f12-a3fa-040262c76a3f_37DEGRES.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 16:29:48.952135', NULL, 258, 1031, NULL, NULL, NULL, '2024-04-29 16:29:48.952135', NULL, 'profileDoc', 'cc68d663-dd4a-43cb-b9c1-f68a564e2ffd_AAJILNEWS.webp', 'images', NULL, 'image/webp', NULL),
('2024-04-29 16:32:07.985287', NULL, 259, 1032, NULL, NULL, NULL, '2024-04-29 16:32:07.985287', NULL, 'profileDoc', '0299506e-0d94-452c-b372-13ff3ac9e2fe_AINDEFLANEWS.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-29 16:35:46.128666', NULL, 260, 1033, NULL, NULL, NULL, '2024-04-29 16:35:46.128666', NULL, 'profileDoc', 'cfac2d7e-fb0b-4f39-9213-d485fbf1d531_AKHERKHABAR.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-29 16:37:02.977788', NULL, 261, 1034, NULL, NULL, NULL, '2024-04-29 16:37:02.977788', NULL, 'profileDoc', '72f3ada6-0272-4417-bf41-1e56cacec800_ALBNDZ.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 16:39:19.216445', NULL, 262, 1035, NULL, NULL, NULL, '2024-04-29 16:39:19.216445', NULL, 'profileDoc', 'feb78376-9a1b-4789-a5b9-c722d9e655cd_ALGERIAFIRST.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-29 16:43:50.881399', NULL, 263, 1036, NULL, NULL, NULL, '2024-04-29 16:43:50.881399', NULL, 'profileDoc', '8256326a-a599-45fb-94b1-56c5b6119551_ALGERIAFIRST.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 16:48:23.286266', NULL, 264, 1037, NULL, NULL, NULL, '2024-04-29 16:48:23.286266', NULL, 'profileDoc', '8ab5cff6-7720-4e10-988b-e2bb40076406_ALGERIANEXPRESS.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 16:54:50.573525', NULL, 265, 1038, NULL, NULL, NULL, '2024-04-29 16:54:50.573525', NULL, 'profileDoc', '1f3d8b44-da37-48ed-86eb-e76162e914c7_Capture d\'écran 2024-04-29 165412.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 16:57:43.345331', NULL, 266, 1039, NULL, NULL, NULL, '2024-04-29 16:57:43.345331', NULL, 'profileDoc', '9c67baaf-6a13-4d19-addb-c03ed3f055ff_ALGERIEBREVESNEWS.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-29 17:06:28.241054', NULL, 267, 1040, NULL, NULL, NULL, '2024-04-29 17:06:28.241054', NULL, 'profileDoc', '034f4497-5294-4f77-9e33-3cc5ccffc771_ALGERIEINVEST.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-29 17:09:16.471589', NULL, 268, 1041, NULL, NULL, NULL, '2024-04-29 17:09:16.471589', NULL, 'profileDoc', 'a3f6ef87-e664-4cf4-8bf1-7a3b85666e3b_ALGERIE–MEDINFO.png', 'images', NULL, 'image/png', NULL),
('2024-04-29 17:11:12.609140', NULL, 269, 1042, NULL, NULL, NULL, '2024-04-29 17:11:12.609140', NULL, 'profileDoc', '5464b7fb-8ce9-42d9-ac21-83817a48e95f_ALGERIEPATRIOT.gif', 'images', NULL, 'image/gif', NULL),
('2024-04-30 09:36:41.370770', NULL, 270, 1043, NULL, NULL, NULL, '2024-04-30 09:36:41.370770', NULL, 'profileDoc', '3ec8a975-20d0-43cf-a217-96bfc77a5ce0_ALGERIESCOOP.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:38:20.634481', NULL, 271, 1044, NULL, NULL, NULL, '2024-04-30 09:38:20.634481', NULL, 'profileDoc', '6a6d69b2-159a-4b40-9318-f023a6b91d89_ALHAQIQADZ.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:42:19.386667', NULL, 272, 1045, NULL, NULL, NULL, '2024-04-30 09:42:19.386667', NULL, 'profileDoc', '84191019-3904-4362-91df-ea82559e80b4_Capture d\'écran 2024-04-30 094156.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:44:36.574133', NULL, 273, 1046, NULL, NULL, NULL, '2024-04-30 09:44:36.574133', NULL, 'profileDoc', 'f11cff33-5f3d-4288-ae63-cd7a27d20f54_ALJAZAIR1.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:55:27.946052', NULL, 274, 1047, NULL, NULL, NULL, '2024-04-30 09:55:27.946052', NULL, 'profileDoc', '99c58571-4e43-447b-a595-5775b1f65fa3_ALJAZAIRALYOUM.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:57:23.329246', NULL, 275, 1048, NULL, NULL, NULL, '2024-04-30 09:57:23.329246', NULL, 'profileDoc', 'fc6a3d48-7025-4b16-afb1-cdd234e236c9_ALMASDAR-DZ.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 09:59:42.798285', NULL, 276, 1049, NULL, NULL, NULL, '2024-04-30 09:59:42.798285', NULL, 'profileDoc', 'a2988996-44bc-4f9b-b279-c1c9cb354cd0_ALMIZANPRESS.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:02:13.225723', NULL, 277, 1050, NULL, NULL, NULL, '2024-04-30 10:02:13.225723', NULL, 'profileDoc', '9161631f-9572-4751-93b2-90b4dbe657a9_alsahafi.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:05:16.217042', NULL, 278, 1051, NULL, NULL, NULL, '2024-04-30 10:05:16.218018', NULL, 'profileDoc', 'd68cdad0-5b0e-47ac-bfac-72d0f2ecbc11_ANALGERIA.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:08:49.544653', NULL, 279, 1052, NULL, NULL, NULL, '2024-04-30 10:08:49.544653', NULL, 'profileDoc', '8609d3b8-d5cd-4b3f-8c78-60823a19b72a_anndz.webp', 'images', NULL, 'image/webp', NULL),
('2024-04-30 10:10:26.965864', NULL, 280, 1053, NULL, NULL, NULL, '2024-04-30 10:10:26.965864', NULL, 'profileDoc', '835b4e9b-f39b-401e-a456-fca652872a8b_ASDAAELGHARB.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:14:52.864255', NULL, 281, 1054, NULL, NULL, NULL, '2024-04-30 10:14:52.864255', NULL, 'profileDoc', '68b622b2-fd1b-49b8-b7e4-3a3e733f6b0c_AUTOBIP.webp', 'images', NULL, 'image/webp', NULL),
('2024-04-30 10:18:18.153209', NULL, 282, 1055, NULL, NULL, NULL, '2024-04-30 10:18:18.153209', NULL, 'profileDoc', '78b3d5c6-2dc9-4df1-9a41-289506cc4713_autojazairdz.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-30 10:23:32.303543', NULL, 283, 1056, NULL, NULL, NULL, '2024-04-30 10:23:32.303543', NULL, 'profileDoc', 'b533861b-796b-4fea-826a-fc719205a63c_347596009_557338779935041_9041567045597053310_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-30 10:26:03.458916', NULL, 284, 1057, NULL, NULL, NULL, '2024-04-30 10:26:03.458916', NULL, 'profileDoc', '1efcc98a-bcfe-44a2-bfdd-c086746ce394_bak-press.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:27:45.997312', NULL, 285, 1058, NULL, NULL, NULL, '2024-04-30 10:27:45.997312', NULL, 'profileDoc', 'd23e3e56-220b-443c-885e-7e87b60dd9d6_BARAKANEWS.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:30:36.367649', NULL, 286, 1059, NULL, NULL, NULL, '2024-04-30 10:30:36.368626', NULL, 'profileDoc', '5b1bac74-f582-4437-a06e-884013499428_BIBANETV.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:32:57.977173', NULL, 287, 1060, NULL, NULL, NULL, '2024-04-30 10:32:57.977173', NULL, 'profileDoc', '5886adde-d5ca-413e-b3ca-e64fe17fe98e_BORDJNEWS.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:40:10.807817', NULL, 288, 1061, NULL, NULL, NULL, '2024-04-30 10:40:10.807817', NULL, 'profileDoc', '3e4e1d4d-d6ab-4158-807c-942e0199195a_ALGERIEDIRECT.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:44:00.252227', NULL, 289, 1062, NULL, NULL, NULL, '2024-04-30 10:44:00.252227', NULL, 'profileDoc', '24a541b9-e7bf-4569-95b7-b4479b73f327_CARVISION.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:46:15.896123', NULL, 290, 1063, NULL, NULL, NULL, '2024-04-30 10:46:15.896123', NULL, 'profileDoc', '14a499ff-d58e-495b-a8c9-a4385c31359b_CHEBABTV.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:49:05.342815', NULL, 291, 1064, NULL, NULL, NULL, '2024-04-30 10:49:05.342815', NULL, 'profileDoc', '1fc57cb0-461d-4a7a-8b89-0ad6c2303bbd_CHERCHELLNEWS.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-30 10:51:36.349574', NULL, 292, 1065, NULL, NULL, NULL, '2024-04-30 10:51:36.349574', NULL, 'profileDoc', '2b0edc8f-116f-4bbf-b482-5d035858992c_djalia.PNG', 'images', NULL, 'image/png', NULL),
('2024-04-30 10:53:49.822065', NULL, 293, 1066, NULL, NULL, NULL, '2024-04-30 10:53:49.822065', NULL, 'profileDoc', '43ec8778-ad43-421b-aa49-7e5e540d4103_DJELFAINFO.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:03:36.474177', NULL, 294, 1067, NULL, NULL, NULL, '2024-04-30 11:03:36.474177', NULL, 'profileDoc', '8a61605d-5f35-4765-a8a0-4b5b36aed4c4_DZ54.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:16:22.045216', NULL, 295, 1068, NULL, NULL, NULL, '2024-04-30 11:16:22.045216', NULL, 'profileDoc', '21206c6c-b4c3-4397-83dc-94ed0632de8c_352233936_780750703774679_4245187042385903436_n.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:20:10.545621', NULL, 296, 1069, NULL, NULL, NULL, '2024-04-30 11:20:10.545621', NULL, 'profileDoc', 'bd9a361f-8242-4265-8943-af9d0ac50dfd_DZAYERNEWS.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:24:52.700345', NULL, 297, 1070, NULL, NULL, NULL, '2024-04-30 11:24:52.700345', NULL, 'profileDoc', 'bbb83f6b-97bf-41f6-bf00-838625547632_DZERTIC24.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:26:46.434656', NULL, 298, 1071, NULL, NULL, NULL, '2024-04-30 11:26:46.434656', NULL, 'profileDoc', '13e1f9f1-f48c-4a64-a949-885f0dd8703b_DZINFOLINE.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:28:19.145410', NULL, 299, 1072, NULL, NULL, NULL, '2024-04-30 11:28:19.145410', NULL, 'profileDoc', '218d4bc5-3b2a-4a50-bc27-690f067f866f_DZLIVE.PNG', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:30:54.746759', NULL, 300, 1073, NULL, NULL, NULL, '2024-04-30 11:30:54.746759', NULL, 'profileDoc', '7ed4c2b9-fbf0-4f02-b9fe-cc5672898bcc_DZNEWS.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:34:38.504009', NULL, 301, 1074, NULL, NULL, NULL, '2024-04-30 11:34:38.504009', NULL, 'profileDoc', '83544c3d-0bc3-40b0-a20f-7475f230c20b_ECOALGERIA 1.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 11:39:21.683264', NULL, 302, 1075, NULL, NULL, NULL, '2024-04-30 11:39:21.683264', NULL, 'profileDoc', '4c9bbd49-f93a-4dba-ab36-92475ce8337e_EDTECH.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 16:14:34.208879', NULL, 303, 1076, NULL, NULL, NULL, '2024-04-30 16:14:34.208879', NULL, 'profileDoc', '0322db9d-3720-4952-8de9-1d2b5068e2b6_424949199_927707239364233_7447100311186272902_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-30 16:16:23.340120', NULL, 304, 1077, NULL, NULL, NULL, '2024-04-30 16:16:23.340120', NULL, 'profileDoc', '3d8f3564-be16-44cc-b2e2-97be30b4e911_logo-likaa.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-04-30 16:18:07.472356', NULL, 305, 1078, NULL, NULL, NULL, '2024-04-30 16:18:07.472356', NULL, 'profileDoc', '4512af39-ff81-431c-aec0-9ea9be3c2b38_logo-v1.1.png', 'images', NULL, 'image/png', NULL),
('2024-04-30 16:21:32.319424', NULL, 306, 1079, NULL, NULL, NULL, '2024-04-30 16:21:32.319424', NULL, 'profileDoc', '6b983172-cc9f-45e7-a9bb-5eda88710c28_عين الجزائر.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 11:53:21.000000', NULL, 307, 1080, NULL, NULL, NULL, '2024-05-02 11:53:21.000000', NULL, 'profileDoc', '238ab57a-69a6-4fcc-8221-a1a377c0d3cc_أفريكا نيوز.webp', 'images', NULL, 'image/webp', NULL),
('2024-05-02 12:35:35.000000', NULL, 308, 1081, NULL, NULL, NULL, '2024-05-02 12:35:35.000000', NULL, 'profileDoc', '12c41cda-032d-4b11-8d3c-4b75e55554b7_أخبار الوطن.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 12:37:39.000000', NULL, 309, 1082, NULL, NULL, NULL, '2024-05-02 12:37:39.000000', NULL, 'profileDoc', '81c33ee8-5585-46c0-9ecc-a1483e185875_logo1.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 14:06:41.000000', NULL, 310, 1083, NULL, NULL, NULL, '2024-05-02 14:06:41.000000', NULL, 'profileDoc', '638cf7e1-4d0c-44cd-89a0-4473ac058cb4_Capture d\'écran 2024-04-30 150812.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:09:30.000000', NULL, 311, 1084, NULL, NULL, NULL, '2024-05-02 14:09:30.000000', NULL, 'profileDoc', 'e0b09f45-747e-4a19-88e4-22fa9f7ddb6b_logo_656dd4bfa541b9-14855626.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:11:41.000000', NULL, 312, 1085, NULL, NULL, NULL, '2024-05-02 14:11:41.000000', NULL, 'profileDoc', 'aab0ec5e-ba19-4e07-86d3-f992f5b7897f_الجزائر الجديدة.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:14:25.000000', NULL, 313, 1086, NULL, NULL, NULL, '2024-05-02 14:14:25.000000', NULL, 'profileDoc', '8d5cc0c6-f7e1-4e5a-b5d1-725da0bbcadf_جيجل الجديدة.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 14:16:47.000000', NULL, 314, 1087, NULL, NULL, NULL, '2024-05-02 14:16:47.000000', NULL, 'profileDoc', '6d443414-d511-4b78-92b2-ce1e1653164d_الحوار.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:18:55.000000', NULL, 315, 1088, NULL, NULL, NULL, '2024-05-02 14:18:55.000000', NULL, 'profileDoc', '80e03a32-8a02-4dd6-81fe-c05042bd39cc_الرائد.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:23:11.000000', NULL, 316, 1089, NULL, NULL, NULL, '2024-05-02 14:23:11.000000', NULL, 'profileDoc', '51dd5c4f-6974-4045-920d-29fc89aae1dd_الراية.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:33:28.000000', NULL, 317, 1090, NULL, NULL, NULL, '2024-05-02 14:33:28.000000', NULL, 'profileDoc', 'fab5c4db-123b-4a7a-b90d-9efb90f1acc1_السلام-اليوم-1-2048x1013.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:37:25.000000', NULL, 318, 1092, NULL, NULL, NULL, '2024-05-02 14:37:25.000000', NULL, 'profileDoc', '6b558329-8736-43fb-ad40-9a52f8f4a8a6_الصريح.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:43:30.000000', NULL, 319, 1093, NULL, NULL, NULL, '2024-05-02 14:43:30.000000', NULL, 'profileDoc', '048485af-a476-4c42-8ffc-dfb412778b23_300977162_453398026838718_8433868488276898335_n.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 14:48:57.000000', NULL, 320, 1094, NULL, NULL, NULL, '2024-05-02 14:48:57.000000', NULL, 'profileDoc', '8ec48a7c-138a-4162-8fb9-148b9e9d9239_272204565_475565330744627_8868429936322753225_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 14:56:06.000000', NULL, 321, 1096, NULL, NULL, NULL, '2024-05-02 14:56:06.000000', NULL, 'profileDoc', 'bfd5409b-115b-452a-b4a3-c588a6165fae_اللقاء.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:02:00.000000', NULL, 322, 1097, NULL, NULL, NULL, '2024-05-02 15:02:00.000000', NULL, 'profileDoc', 'f8309497-1657-4d3c-8acb-4763fb18ecc9_الموعد اليومي.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 15:09:33.000000', NULL, 323, 1098, NULL, NULL, NULL, '2024-05-02 15:09:33.000000', NULL, 'profileDoc', 'f274bbf5-58fb-4ae5-a6fd-c0398d6c9929_71187658_157616872108325_1348800059440889856_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:18:27.000000', NULL, 324, 1100, NULL, NULL, NULL, '2024-05-02 15:18:27.000000', NULL, 'profileDoc', '65b891b3-dacc-4655-bcae-64ea2493e0fd_163575819_176095910983230_7878890522708777793_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:23:32.000000', NULL, 325, 1101, NULL, NULL, NULL, '2024-05-02 15:23:32.000000', NULL, 'profileDoc', 'e216c95c-b483-44f8-aa07-45f1ad38efd3_REFLEXION.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 15:26:43.000000', NULL, 326, 1102, NULL, NULL, NULL, '2024-05-02 15:26:43.000000', NULL, 'profileDoc', 'a19bfffa-1e07-451b-b398-d148e1ac1b8b_OUEST TRIBUNE.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:30:14.000000', NULL, 327, 1103, NULL, NULL, NULL, '2024-05-02 15:30:14.000000', NULL, 'profileDoc', '0414e033-5fff-4ffa-98e7-193d6b3fc660_MIDI LIBRE.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:35:23.000000', NULL, 328, 1104, NULL, NULL, NULL, '2024-05-02 15:35:23.000000', NULL, 'profileDoc', '251385c0-e1dc-42ee-932e-d972c8253e18_LE SOIR D’ALGERIE.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 15:39:12.000000', NULL, 329, 1105, NULL, NULL, NULL, '2024-05-02 15:39:12.000000', NULL, 'profileDoc', '65f2b143-802b-4317-bb8e-b1f88fe4a5a0_272884358_280014804219980_346709076682269337_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:42:33.000000', NULL, 330, 1106, NULL, NULL, NULL, '2024-05-02 15:42:33.000000', NULL, 'profileDoc', 'ce437d8d-f47d-4aaf-a4a7-e197120bbc79_LE QUOTIDIEN D’ORAN.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:45:28.000000', NULL, 331, 1107, NULL, NULL, NULL, '2024-05-02 15:45:28.000000', NULL, 'profileDoc', 'abc7e655-b1ea-452a-993f-bba70386acdc_leprovincial.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:47:48.000000', NULL, 332, 1108, NULL, NULL, NULL, '2024-05-02 15:47:48.000000', NULL, 'profileDoc', '1880a762-c81e-4446-ad8f-50d45e1d1a8f_LE JOUR D’ALGERIE.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 15:50:42.000000', NULL, 333, 1109, NULL, NULL, NULL, '2024-05-02 15:50:42.000000', NULL, 'profileDoc', 'e07e7e58-df92-4e3f-85f6-e8e2a569f5ea_LE JEUNE INDEPENDANT.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 15:56:20.000000', NULL, 334, 1110, NULL, NULL, NULL, '2024-05-02 15:56:20.000000', NULL, 'profileDoc', 'ffcefe0e-2e1c-4114-be8c-7eab62550e15_038_sioLogo-courrier1-copie.png', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 15:58:57.000000', NULL, 335, 1111, NULL, NULL, NULL, '2024-05-02 15:58:57.000000', NULL, 'profileDoc', '1ac6d3d4-907d-416a-96a6-a5d786bf38d7_CARREFOUR D’ALGERIE.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 16:02:34.000000', NULL, 336, 1112, NULL, NULL, NULL, '2024-05-02 16:02:34.000000', NULL, 'profileDoc', '66cacd0a-98f4-4a53-803d-1b40bb6a4ab4_LA NOUVELLE REPUBLIQUE.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 16:06:16.000000', NULL, 337, 1113, NULL, NULL, NULL, '2024-05-02 16:06:16.000000', NULL, 'profileDoc', '8e0bbc44-9c8f-4f36-bdf5-954056e745db_logo-nat-1.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 16:09:02.000000', NULL, 338, 1114, NULL, NULL, NULL, '2024-05-02 16:09:02.000000', NULL, 'profileDoc', '8387c616-ccd3-4426-ac58-d4af4c6cd86b_Logo-LA-NATION.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 16:16:35.000000', NULL, 339, 1115, NULL, NULL, NULL, '2024-05-02 16:16:35.000000', NULL, 'profileDoc', '534e04c3-58f0-42a3-bf45-fa3976878b34_Capture d\'écran 2024-05-02 161554.png', 'images', NULL, 'image/png', NULL),
('2024-05-02 16:19:18.000000', NULL, 340, 1116, NULL, NULL, NULL, '2024-05-02 16:19:18.000000', NULL, 'profileDoc', 'fb2b7d88-7cd2-4005-8382-47150662856a_310716927_414471714202232_7525426939875767661_n.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-05-02 16:25:55.000000', NULL, 341, 1118, NULL, NULL, NULL, '2024-05-02 16:25:55.000000', NULL, 'profileDoc', '53a28687-8fe7-44be-8e03-a1bb84812031_L’ECHO D’ALGERIE.jpg', 'images', NULL, 'image/jpeg', NULL),
('2024-09-24 13:41:40.000000', NULL, 342, NULL, NULL, 8, NULL, '2024-09-24 13:41:40.000000', NULL, 'profileDoc', 'f74c884d-0260-4a6c-bfb0-d3ccbc5cbceb_1.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:43:51.000000', NULL, 343, NULL, NULL, 9, NULL, '2024-09-24 13:43:51.000000', NULL, 'profileDoc', '0ef85aeb-b4fe-4fb5-9404-6cad353919e0_2.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:44:14.000000', NULL, 344, NULL, NULL, 10, NULL, '2024-09-24 13:44:14.000000', NULL, 'profileDoc', '1654497f-05c4-454e-8216-33b51e01447a_3.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:44:35.000000', NULL, 345, NULL, NULL, 11, NULL, '2024-09-24 13:44:35.000000', NULL, 'profileDoc', '9470d905-f425-43ab-b69c-fc3ae0b8d20e_4.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:45:04.000000', NULL, 346, NULL, NULL, 12, NULL, '2024-09-24 13:45:04.000000', NULL, 'profileDoc', '0e4357bb-59cd-4bd2-b078-0dd4cfe0f89b_5.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:45:54.000000', NULL, 347, NULL, NULL, 13, NULL, '2024-09-24 13:45:54.000000', NULL, 'profileDoc', '66259484-1920-4893-88f1-dd9b321d9b59_6.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:46:17.000000', NULL, 348, NULL, NULL, 14, NULL, '2024-09-24 13:46:17.000000', NULL, 'profileDoc', '792e54f8-045f-4451-b972-dd3d48ae6969_7.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:46:36.000000', NULL, 349, NULL, NULL, 15, NULL, '2024-09-24 13:46:36.000000', NULL, 'profileDoc', '72a6a077-8342-4a17-a524-ed3ebec4a538_8.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:46:49.000000', NULL, 350, NULL, NULL, 16, NULL, '2024-09-24 13:46:49.000000', NULL, 'profileDoc', '6e8c07c3-eab6-4bf4-a8f5-7d912ef0cee6_9.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:47:04.000000', NULL, 351, NULL, NULL, 17, NULL, '2024-09-24 13:47:04.000000', NULL, 'profileDoc', '752a9be9-0c80-4c4b-92a2-cf91443bba23_10.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:47:21.000000', NULL, 352, NULL, NULL, 18, NULL, '2024-09-24 13:47:21.000000', NULL, 'profileDoc', '2a7f34b9-4ac2-49b0-a2cc-1325b5ae83a4_11.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:47:36.000000', NULL, 353, NULL, NULL, 19, NULL, '2024-09-24 13:47:36.000000', NULL, 'profileDoc', '863e4826-0b34-4c0b-b1c2-2902462d77f3_12.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-09-24 13:47:49.000000', NULL, 354, NULL, NULL, 20, NULL, '2024-09-24 13:47:49.000000', NULL, 'profileDoc', '85a3420f-c83c-4c08-b15e-3cd3ea180046_13.pdf', 'pdfs', NULL, 'application/pdf', NULL),
('2024-10-05 17:17:56.519434', NULL, 355, NULL, NULL, NULL, NULL, '2024-10-05 17:17:56.519648', NULL, NULL, 'امحمد يزيد- وزير الأنباء 19 سبتمبر1958   - 22 جويلية 1962.png', 'src/main/resources/static/multimedia/امحمد يزيد- وزير الأنباء 19 سبتمبر1958   - 22 جويلية 1962.png', NULL, NULL, NULL),
('2024-10-05 17:19:22.021190', NULL, 356, NULL, NULL, NULL, NULL, '2024-10-05 17:19:22.021225', NULL, NULL, 'حمو الحاج- وزير الإعلام 1962-1963.png', 'src/main/resources/static/multimedia/حمو الحاج- وزير الإعلام 1962-1963.png', NULL, NULL, NULL),
('2024-10-05 17:20:16.720286', NULL, 357, NULL, NULL, NULL, NULL, '2024-10-05 17:20:16.720338', NULL, NULL, 'مولود بلهوان- وزير الإعلام 1963-1965.png', 'src/main/resources/static/multimedia/مولود بلهوان- وزير الإعلام 1963-1965.png', NULL, NULL, NULL),
('2024-10-05 17:21:07.720305', NULL, 358, NULL, NULL, NULL, NULL, '2024-10-05 17:21:07.720349', NULL, NULL, 'بشير بومعزة-وزير الإعلام 1965-1966.png', 'src/main/resources/static/multimedia/بشير بومعزة-وزير الإعلام 1965-1966.png', NULL, NULL, NULL),
('2024-10-05 17:22:15.531139', NULL, 359, NULL, NULL, NULL, NULL, '2024-10-05 17:22:15.531179', NULL, NULL, 'محمد صديق بن يحي- وزير الإعلام 1970-1966.png', 'src/main/resources/static/multimedia/محمد صديق بن يحي- وزير الإعلام 1970-1966.png', NULL, NULL, NULL),
('2024-10-05 17:23:14.113398', NULL, 360, NULL, NULL, NULL, NULL, '2024-10-05 17:23:14.113448', NULL, NULL, 'أحمد طالب الإبراهيمي- وزير الإعلام 1970-1977.png', 'src/main/resources/static/multimedia/أحمد طالب الإبراهيمي- وزير الإعلام 1970-1977.png', NULL, NULL, NULL),
('2024-10-05 17:50:10.424672', NULL, 361, NULL, NULL, NULL, NULL, '2024-10-05 17:50:10.424914', NULL, NULL, 'رضا مالك- وزير الإعلام و الثقافة 1979-1977.png', 'src/main/resources/static/multimedia/رضا مالك- وزير الإعلام و الثقافة 1979-1977.png', NULL, NULL, NULL),
('2024-10-05 17:57:44.108011', NULL, 362, NULL, NULL, NULL, NULL, '2024-10-05 17:57:44.108146', NULL, NULL, 'عبد الحميد مهري- وزير الإعلام و الثقافة 1979-1980.png', 'src/main/resources/static/multimedia/عبد الحميد مهري- وزير الإعلام و الثقافة 1979-1980.png', NULL, NULL, NULL),
('2024-10-05 17:59:07.266072', NULL, 363, NULL, NULL, NULL, NULL, '2024-10-05 17:59:07.266129', NULL, NULL, 'بوعلام بسايح- وزير الإعلام 1980-1984.png', 'src/main/resources/static/multimedia/بوعلام بسايح- وزير الإعلام 1980-1984.png', NULL, NULL, NULL),
('2024-10-05 18:00:54.109398', NULL, 364, NULL, NULL, NULL, NULL, '2024-10-05 18:00:54.109454', NULL, NULL, 'بشير رويس-وزير الإعلام 1984-1988.png', 'src/main/resources/static/multimedia/بشير رويس-وزير الإعلام 1984-1988.png', NULL, NULL, NULL),
('2024-10-05 18:01:42.100302', NULL, 365, NULL, NULL, NULL, NULL, '2024-10-05 18:01:42.100361', NULL, NULL, 'محمد علي عمار-وزير الإعلام و الثقافة 1988-1989.png', 'src/main/resources/static/multimedia/محمد علي عمار-وزير الإعلام و الثقافة 1988-1989.png', NULL, NULL, NULL),
('2024-10-05 18:07:56.945119', NULL, 366, NULL, NULL, NULL, NULL, '2024-10-05 18:07:56.945161', NULL, NULL, 'الشيخ بوعمران- وزير الاتصال والثقافة جوان- أكتوبر 1991.png', 'src/main/resources/static/multimedia/الشيخ بوعمران- وزير الاتصال والثقافة جوان- أكتوبر 1991.png', NULL, NULL, NULL),
('2024-10-05 18:08:48.790054', NULL, 367, NULL, NULL, NULL, NULL, '2024-10-05 18:08:48.790097', NULL, NULL, 'أبو بكر بلقايد- وزير الاتصال و الثقافة 1992-1991.png', 'src/main/resources/static/multimedia/أبو بكر بلقايد- وزير الاتصال و الثقافة 1992-1991.png', NULL, NULL, NULL),
('2024-10-05 18:10:08.782292', NULL, 368, NULL, NULL, NULL, NULL, '2024-10-05 18:10:08.782323', NULL, NULL, 'حبيب شوقي حمراوي- وزير الاتصال و الثقافة  -   - 1993-1992 1997-1998.png', 'src/main/resources/static/multimedia/حبيب شوقي حمراوي- وزير الاتصال و الثقافة  -   - 1993-1992 1997-1998.png', NULL, NULL, NULL),
('2024-10-05 18:10:59.255204', NULL, 369, NULL, NULL, NULL, NULL, '2024-10-05 18:10:59.255226', NULL, NULL, 'محمد مرزوق-وزير الاتصال سبتمبر - نوفمبر 1993.png', 'src/main/resources/static/multimedia/محمد مرزوق-وزير الاتصال سبتمبر - نوفمبر 1993.png', NULL, NULL, NULL),
('2024-10-05 18:11:55.327213', NULL, 370, NULL, NULL, NULL, NULL, '2024-10-05 18:11:55.327251', NULL, NULL, 'محمد بن عمر زرهوني- وزير الاتصال 1995-1994.png', 'src/main/resources/static/multimedia/محمد بن عمر زرهوني- وزير الاتصال 1995-1994.png', NULL, NULL, NULL),
('2024-10-05 18:12:42.714080', NULL, 371, NULL, NULL, NULL, NULL, '2024-10-05 18:12:42.714152', NULL, NULL, 'لمين بشيشي -وزير الاتصال 1995-1996.png', 'src/main/resources/static/multimedia/لمين بشيشي -وزير الاتصال 1995-1996.png', NULL, NULL, NULL),
('2024-10-05 18:14:09.352194', NULL, 372, NULL, NULL, NULL, NULL, '2024-10-05 18:14:09.352249', NULL, NULL, 'ميهوب ميهوبي- وزير الاتصال والثقافة 1996-1997.png', 'src/main/resources/static/multimedia/ميهوب ميهوبي- وزير الاتصال والثقافة 1996-1997.png', NULL, NULL, NULL),
('2024-10-05 18:15:31.626058', NULL, 373, NULL, NULL, NULL, NULL, '2024-10-05 18:15:31.626092', NULL, NULL, 'حبيب شوقي حمراوي- وزير الاتصال و الثقافة  -   - 1993-1992 1997-1998.png', 'src/main/resources/static/multimedia/حبيب شوقي حمراوي- وزير الاتصال و الثقافة  -   - 1993-1992 1997-1998.png', NULL, NULL, NULL),
('2024-10-05 18:24:26.861031', NULL, 374, NULL, NULL, NULL, NULL, '2024-10-05 18:24:26.861062', NULL, NULL, 'عبد العزيز رحابي- وزير الاتصال و الثقافة 1998-1999.png', 'src/main/resources/static/multimedia/عبد العزيز رحابي- وزير الاتصال و الثقافة 1998-1999.png', NULL, NULL, NULL),
('2024-10-05 18:25:12.419416', NULL, 375, NULL, NULL, NULL, NULL, '2024-10-05 18:25:12.419454', NULL, NULL, 'عبد المجيد تبون-وزير الاتصال والثقافة1999 -2000.png', 'src/main/resources/static/multimedia/عبد المجيد تبون-وزير الاتصال والثقافة1999 -2000.png', NULL, NULL, NULL),
('2024-10-05 18:26:05.497730', NULL, 376, NULL, NULL, NULL, NULL, '2024-10-05 18:26:05.497771', NULL, NULL, 'محي الدين عميمور- وزير الاتصال و الثقافة 2000-2001.png', 'src/main/resources/static/multimedia/محي الدين عميمور- وزير الاتصال و الثقافة 2000-2001.png', NULL, NULL, NULL),
('2024-10-05 18:27:08.417531', NULL, 377, NULL, NULL, NULL, NULL, '2024-10-05 18:27:08.417553', NULL, NULL, 'محمد عبو-وزير الاتصال والثقافة 2002-2001.png', 'src/main/resources/static/multimedia/محمد عبو-وزير الاتصال والثقافة 2002-2001.png', NULL, NULL, NULL),
('2024-10-05 18:29:34.054013', NULL, 378, NULL, NULL, NULL, NULL, '2024-10-05 18:29:34.054090', NULL, NULL, 'خليدة تومي- وزيرة الاتصال و الثقافة 2004-2002.png', 'src/main/resources/static/multimedia/خليدة تومي- وزيرة الاتصال و الثقافة 2004-2002.png', NULL, NULL, NULL),
('2024-10-05 18:30:54.080224', NULL, 379, NULL, NULL, NULL, NULL, '2024-10-05 18:30:54.080255', NULL, NULL, 'بوجمعة هيشور-وزير الاتصال 2006-2004.png', 'src/main/resources/static/multimedia/بوجمعة هيشور-وزير الاتصال 2006-2004.png', NULL, NULL, NULL),
('2024-10-05 18:32:06.631772', NULL, 380, NULL, NULL, NULL, NULL, '2024-10-05 18:32:06.631808', NULL, NULL, 'الهاشمي جيار- وزير الاتصال 2007-2006.png', 'src/main/resources/static/multimedia/الهاشمي جيار- وزير الاتصال 2007-2006.png', NULL, NULL, NULL);
INSERT INTO `multimedia` (`created_at`, `etablissement_id`, `id`, `presse_id`, `radio_id`, `text_juridique_id`, `tv_id`, `updated_at`, `user_id`, `doc_type`, `file_name`, `file_path`, `fromtable`, `type`, `minister_id`) VALUES
('2024-10-05 18:33:01.157309', NULL, 381, NULL, NULL, NULL, NULL, '2024-10-05 18:33:01.157346', NULL, NULL, 'عبد الرشيد بوكرزازة- وزير الاتصال 2008-2007.png', 'src/main/resources/static/multimedia/عبد الرشيد بوكرزازة- وزير الاتصال 2008-2007.png', NULL, NULL, NULL),
('2024-10-05 18:38:14.528302', NULL, 382, NULL, NULL, NULL, NULL, '2024-10-05 18:38:14.528366', NULL, NULL, 'عزالدين ميهوبي- كاتب دولة لدى الوزير الأول مكلف بالاتصال 2008-2010-.png', 'src/main/resources/static/multimedia/عزالدين ميهوبي- كاتب دولة لدى الوزير الأول مكلف بالاتصال 2008-2010-.png', NULL, NULL, NULL),
('2024-10-05 18:39:16.603728', NULL, 383, NULL, NULL, NULL, NULL, '2024-10-05 18:39:16.603764', NULL, NULL, 'ناصر مهل- وزير الاتصال 2010-2012.png', 'src/main/resources/static/multimedia/ناصر مهل- وزير الاتصال 2010-2012.png', NULL, NULL, NULL),
('2024-10-05 18:40:15.363040', NULL, 384, NULL, NULL, NULL, NULL, '2024-10-05 18:40:15.363064', NULL, NULL, 'محمد السعيد- وزير الاتصال سبتمبر 2012 - سبتمبر 2013.png', 'src/main/resources/static/multimedia/محمد السعيد- وزير الاتصال سبتمبر 2012 - سبتمبر 2013.png', NULL, NULL, NULL),
('2024-10-05 18:41:16.844347', NULL, 385, NULL, NULL, NULL, NULL, '2024-10-05 18:41:16.844375', NULL, NULL, 'عبدالقادر مساهل- وزير الاتصال من سبتمبر 2013 إلى ماي 2014.png', 'src/main/resources/static/multimedia/عبدالقادر مساهل- وزير الاتصال من سبتمبر 2013 إلى ماي 2014.png', NULL, NULL, NULL),
('2024-10-05 18:42:10.017462', NULL, 386, NULL, NULL, NULL, NULL, '2024-10-05 18:42:10.017491', NULL, NULL, 'حميد قر ين- وزير الاتصال ماي 2014 - ماي 2017.png', 'src/main/resources/static/multimedia/حميد قر ين- وزير الاتصال ماي 2014 - ماي 2017.png', NULL, NULL, NULL),
('2024-10-05 18:43:39.899361', NULL, 387, NULL, NULL, NULL, NULL, '2024-10-05 18:43:39.899387', NULL, NULL, 'جمال كعوان- وزير الاتصال 25 ماي 2017 الى 31 مارس 2019.png', 'src/main/resources/static/multimedia/جمال كعوان- وزير الاتصال 25 ماي 2017 الى 31 مارس 2019.png', NULL, NULL, NULL),
('2024-10-05 18:44:46.461179', NULL, 388, NULL, NULL, NULL, NULL, '2024-10-05 18:44:46.461221', NULL, NULL, 'حسن رابحي-وزير الاتصال الناطق الرسمي للحكومة ووزير الثقافة بالنيابة أوت 2019 - جانفي 2020.png', 'src/main/resources/static/multimedia/حسن رابحي-وزير الاتصال الناطق الرسمي للحكومة ووزير الثقافة بالنيابة أوت 2019 - جانفي 2020.png', NULL, NULL, NULL),
('2024-10-05 18:45:46.640543', NULL, 389, NULL, NULL, NULL, NULL, '2024-10-05 18:45:46.640575', NULL, NULL, 'عمار بلحيمر-وزير الاتصال جانفي 2020 - نوفمبر 2021.png', 'src/main/resources/static/multimedia/عمار بلحيمر-وزير الاتصال جانفي 2020 - نوفمبر 2021.png', NULL, NULL, NULL),
('2024-10-05 18:46:45.320268', NULL, 390, NULL, NULL, NULL, NULL, '2024-10-05 18:46:45.320317', NULL, NULL, 'محمد بوسليماني-وزير الاتصال نوفمبر2021 إلى جوان 2023.png', 'src/main/resources/static/multimedia/محمد بوسليماني-وزير الاتصال نوفمبر2021 إلى جوان 2023.png', NULL, NULL, NULL),
('2024-10-05 18:47:26.931022', NULL, 391, NULL, NULL, NULL, NULL, '2024-10-05 18:47:26.931061', NULL, NULL, 'محمد لعقاب- وزير الاتصال سبتمبر 2023 إلى يومنا هذا.png', 'src/main/resources/static/multimedia/محمد لعقاب- وزير الاتصال سبتمبر 2023 إلى يومنا هذا.png', NULL, NULL, NULL),
('2024-10-06 16:11:43.000000', 1565, 392, NULL, NULL, NULL, NULL, '2024-10-06 16:11:43.000000', NULL, 'etablissementDoc', '3b37512e-858c-45f9-a4b7-259e5acbcd19_CNDPI.png', 'images', NULL, 'image/png', NULL),
('2024-10-07 11:18:09.000000', NULL, 393, NULL, NULL, NULL, 1737, '2024-10-07 11:18:09.000000', NULL, 'profileDoc', 'f20f11ba-0649-4184-9408-7e857214c096_AL24_News_Logo.svg.png', 'images', NULL, 'image/png', NULL),
('2024-10-07 11:36:15.000000', NULL, 394, NULL, NULL, NULL, 1739, '2024-10-07 11:36:15.000000', NULL, 'profileDoc', 'c7d99c59-9be8-4e37-b62c-de36e093a9e1_logo-entv-tV9.png', 'images', NULL, 'image/png', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `presse`
--

DROP TABLE IF EXISTS `presse`;
CREATE TABLE IF NOT EXISTS `presse` (
  `complexe_id` bigint DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `categorieelec` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `localisation` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `site` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `typepbpr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `website` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `adresse_en` text COLLATE utf8mb4_general_ci,
  `adresse_fr` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaoretyhavt4aqy7vilaxfydp8` (`complexe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1119 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `presse`
--

INSERT INTO `presse` (`complexe_id`, `created_at`, `id`, `updated_at`, `adresse`, `categorieelec`, `email`, `fax`, `localisation`, `name`, `phone`, `site`, `typepbpr`, `website`, `description`, `adresse_en`, `adresse_fr`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
(1, '2024-04-23 16:08:02.000000', 1005, '2024-04-23 16:08:03.000000', 'دار الصحافة الطاهر جاوت 1 شارع بشير عطار أول ماي الجزائر العاصمة', '', 'webredact@elwatan-dz.com', '+21321 68 21 87', 'P3JV+7WX، Rue Zouioueche Farid, Kouba', 'El-Watan-dz الوطن', '+21321 68 21 83 ', 'https://elwatan-dz.com/', 'prive', 'https://elwatan-dz.com/', 'يومية جزائرية مستقلة', NULL, NULL, NULL, NULL, NULL, NULL),
(5, '2024-04-23 16:13:51.000000', 1006, '2024-04-23 16:13:51.000000', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر', '', 'info@echorouk.net', '+21323 71 39 82', 'P3FH+8MQ, Kouba', 'Echorouk online الشروق أونلاين', '+21323 71 39 90', 'https://www.echoroukonline.com/', 'prive', 'https://www.echoroukonline.com/', 'الشروق أونلاين موقع إخباري يصدر من الجزائر، ويوفر تغطية آنية ومستمرة للأحداث في الجزائر والعالم', NULL, NULL, NULL, NULL, NULL, NULL),
(2, '2024-04-23 16:20:11.000000', 1007, '2024-04-23 16:20:11.000000', 'بئر مراد رايس، الجزائر العاصمة', '', 'contact@ennahartv.tv', '+21323 59 91 14', 'CW 116, Bir Mourad Raïs', 'جريدة النهار', '+21323 59 91 14', 'https://nhar.tv/LQlnU', 'prive', 'https://nhar.tv/LQlnU', 'جريدة يومية جزائرية مستقلة، صدرت عام 2007', NULL, NULL, NULL, NULL, NULL, NULL),
(1, '2024-04-23 16:27:06.000000', 1008, '2024-04-23 16:27:06.000000', '20 شارع الحرية، الجزائر العاصمة', '', 'info@elmoudjahid.dz', '+21321.73.90.43', ' ', 'EL MOUDJAHID', '+21321.73.70.81', 'https://www.elmoudjahid.com/', 'public', 'https://www.elmoudjahid.com/', 'الأخبار اليومية الوطنية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:08:01.000000', 1010, '2024-04-23 17:08:02.000000', 'دار الصحافة الطاهر جاوت 1 شارع بشير عطار أول ماي الجزائر العاصمة', '', 'webredact@elwatan-dz.com', '+21321 68 21 87', 'P3JV+7WX، Rue Zouioueche Farid, Kouba', 'El-Watan-dz الوطن', '+21321 68 21 83 ', 'https://elwatan-dz.com/', 'prive', 'https://elwatan-dz.com/', 'يومية جزائرية مستقلة', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:19:15.000000', 1011, '2024-04-23 17:19:16.000000', 'بئر مراد رايس، الجزائر العاصمة', '', 'info@echorouk.net', '+21323713982', 'P3FH+8MQ, Kouba', 'Echorouk online الشروق أونلاين', '+21323 71 39 90', 'https://www.echoroukonline.com/', 'prive', 'https://www.echoroukonline.com/', 'الشروق أونلاين موقع إخباري يصدر من الجزائر، ويوفر تغطية آنية ومستمرة للأحداث في الجزائر والعالم', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:21:18.000000', 1012, '2024-04-23 17:21:19.000000', 'بئر مراد رايس، الجزائر العاصمة', '', 'contact@ennahartv.tv', '+21323 59 91 14', 'CW 116, Bir Mourad Raïs', 'جريدة النهار', '+21323 59 91 14', 'https://nhar.tv/LQlnU', 'prive', 'https://nhar.tv/LQlnU', 'جريدة يومية جزائرية مستقلة، صدرت عام 2007', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:23:21.000000', 1013, '2024-04-23 17:23:21.000000', '20 شارع الحرية، الجزائر العاصمة', '', 'info@elmoudjahid.dz', '+21321 73 90 43', ' ', 'EL MOUDJAHID', '+21321 73 70 81', 'https://www.elmoudjahid.com/', 'public', 'https://www.elmoudjahid.com/', 'الأخبار اليومية الوطنية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:25:36.000000', 1014, '2024-04-23 17:25:36.000000', 'دار الطاهر جعوط للصحافة، الجزائر العاصمة', '', ' ', '+21321  67 06 79', ' ', 'Alger républicain', '+21321 67 06 79', 'https://www.alger-republicain.com', 'prive', 'https://www.alger-republicain.com', 'الأخبار اليومية الوطنية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:27:24.000000', 1015, '2024-04-23 17:27:25.000000', '32 شارع الفتح ابن خلفان. الساحل السابق. حيدرة، الجزائر العاصمة، الجزائر', '', 'redaction@elkhabar.com', '+21323 47 71 43', ' ', 'Elkhabar جريدة الخبر', '+21323 47 71 79', 'www.elkhabar.com', 'prive', 'www.elkhabar.com', 'جريدة الخبر يومية وطنية مستقلة شعارها الصدق و المصداقية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-23 17:29:39.000000', 1016, '2024-04-23 17:29:39.000000', 'المساء دار الصحافة عبد القادر سفير – القبة – الجزائر العاصمة', '', 'elmassa51@yahoo.fr', '+21323 70 90 49', ' ', 'Elmassa', '+21323 70 96 31', 'https://www.el-massa.com/', 'public', 'https://www.el-massa.com/', 'تأسست \"المساء\" في 01 أكتوبر 1985 لإثراء الساحة الإعلامية التي كانت تعد أربعة عناوين صباحية باللغتين الوطنية و الفرنسية و كان ظهورها انطلاقة لأول تجربة للصحافة المسائية باللغة الوطنية.', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:03:06.000000', 1017, '2024-04-24 10:03:12.000000', 'شارع الأخوين بوادو بئر مراد رايس - الجزائر العاصمة الجزائر', '', 'contact@aps.dz', ' ', ' ', 'Algerie presse service وكالة الأنباء الجزائرية', ' ', ' ', 'prive', 'https://www.aps.dz/', 'مصدر المعلومات عبر كامل التراب الوطني، وتغطي الأخبار الواردة من أربع مديريات جهوية (البليدة، ورقلة، قسنطينة ووهران) وفي بشار قريبا جدا، والتي تنسق نشاط 58 مكتبا للولايات. وفي الخارج، الجمعية ممثلة في عدة عواصم (باريس، بروكسل، لندن، روما، مدريد، موسكو، عمان، القاهرة، داكار، تونس، نواكشوط وواشنطن).', NULL, NULL, NULL, NULL, NULL, NULL),
(4, '2024-04-24 10:05:35.000000', 1018, '2024-04-24 10:05:36.000000', 'عمارة رقم 2 شارع أحمد وبوعلام خالفي – الجزائر', '', 'eldjazair.pub@gmail.com', '+21321 63 04 50', '  ', 'El Djazair Online | الجزائر', '+21321 63 57 57', 'http://eldjazaironline.dz/Accueil/', 'prive', 'http://eldjazaironline.dz/Accueil/', 'صحيفة الأخبار اليومية والشؤون الجارية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:08:10.000000', 1019, '2024-04-24 10:08:10.000000', 'حي سعيدون محمد (بن عمر القبة)، فيلا رقم 113، الجزائر العاصمة، الجزائر', '', 'Elikhbaria@gmail.com', '+21323 71 40 27', ' ', 'الإخبارية Elikhbaria', '+21323 71 40 27', 'https://elikhbaria.dz/', 'prive', 'https://elikhbaria.dz/', '“الإخبارية” منصة إخبارية رقمية ومطبوعة توفر تغطية منوعة للأحداث في الجزائر، والعالم خاصة في منطقتي المغرب العربي والساحل الإفريقي..', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:25:54.000000', 1020, '2024-04-24 10:25:55.000000', 'حي 19 مارس 1954 الوادي، العقلة، الجزائر', '', 'journalaltahrir@gmail.com', '+21332 13 03 03', ' ', 'التحرير', '+21332.13.03.03', 'https://www.altahrironline.dz/ara/', 'prive', 'https://www.altahrironline.dz/ara/', 'يومية جزائرية وطنية إخبارية شاملة، شعارها:”نحن مع الحق وحيثما مال الحق ملنا معه”. تفخر بهويتها الوطنية والعربية،وتناضل من أجل القيم الإنسانية والعدالة الاجتماعية. غايتها المساهمة في التنوير ،وإصلاح، وتوحيد ولم شمل الأمة العربية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:27:56.000000', 1021, '2024-04-24 10:27:57.000000', 'حي 19 مارس 1954 الوادي، العقلة، الجزائر', '', 'eljadid.elyawmi@gmail.com', 'غير متوفر', ' ', 'الجديد اليومي', 'غير متوفر', 'https://eljadidelyawmi.dz/', 'prive', 'https://eljadidelyawmi.dz/', 'أول جريدة وطنية بالجنوب', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:31:57.000000', 1022, '2024-04-24 10:31:58.000000', 'دار الصحافة القبة الجزائر العاصمة', '', 'contact@elhayat.dz', 'غير متوفر', ' ', 'الحياة elhayat', 'غير متوفر', 'https://elhayat.dz/', 'prive', 'https://elhayat.dz/', 'موقع الحياة هو موقع إخباري جزائري مستقل وشامل يغطي كافة الأحداث السياسية والاجتماعية والرياضية والأمن', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:34:23.000000', 1023, '2024-04-24 10:34:23.000000', '24 شارع سفيان فوراسية المرادية الجزائر', '', 'elwassatjournal@gmail.com', 'غير متوفر', ' ', 'جريدة الوسط', 'غير متوفر', 'elwassat.dz', 'prive', 'elwassat.dz', 'جريدة الوسط : يومية وطنية اخبارية.. صوت المواطن الجزائري', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:36:18.000000', 1024, '2024-04-24 10:36:19.000000', 'مركز التجارة والأعمال- المحمدية مكتب رقم 1266- ص.ب الجزائر العاصمة', '', 'massaraziri@yahoo.fr', '+21323 80 40 34', ' ', 'المسار العربي', 'غير متوفر', 'https://elmassar-elarabi.dz/', 'prive', 'https://elmassar-elarabi.dz/', 'جريدة المسار العربي جريدة جزائرية متجددة على مدار الساعة٫', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 10:37:44.000000', 1025, '2024-04-24 10:37:44.000000', 'حي الزواتنة رقم 94 الطابق الاول القبة 16108', '', 'michouaralsseyassi@gmail.com', '+21323 53 46 60', ' ', 'المشوار السياسي الجزائرية Meshwar Seyassi', '+21323 53 46 60', 'www.alseyassi-dz.com', 'prive', 'www.alseyassi-dz.com', 'يومية وطنية جزائرية تنقل الاخبار العالمية و المحلية مع التركيز على انشغالات المواطن اليومية.', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 11:58:37.000000', 1026, '2024-04-24 11:58:37.000000', '39 شارع الشهاداء العاصمة الجزائر', '', 'contact@echaab.dz', 'غير متوفر', ' ', 'الشعب', '+21323 46 91 87', 'https://www.echaab.dz/', 'public', 'https://www.echaab.dz/', 'يومية‮ ‬وطنية‮ ‬إخبارية تأسست في 11 ديسمبر 1962.', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 12:06:13.000000', 1027, '2024-04-24 12:06:13.000000', 'المنطقة الصناعية \"بالما\" 24 فيفري 1956- قسنطينة - الجزائر', '', 'annasr.journal@gmail.com', '+21331 60 70 77', ' ', 'النصر', '+21331 60 70 78', 'http://www.annasronline.dz/', 'public', 'النصر', ' ', NULL, NULL, NULL, NULL, NULL, NULL),
(4, '2024-04-24 12:23:28.000000', 1028, '2024-04-24 12:23:29.000000', 'رقم 6, نهج ابن سنوسي حميدة ص.ب : 31000 وهران', '', 'djoumhouria@yahoo.fr', '+21341 36 20 76', ' ', 'الجمهورية', '+21341 36 20 73', 'https://www.eldjoumhouria.dz/', 'public', 'https://www.eldjoumhouria.dz/', 'الجمهورية هي صحيفة يومية جزائرية في شكل صحيفة شعبية أنشئت عام 1844 في وهران تحت اسم ليكو دوران. وهي من الصحف اليومية الأكثر مبيعا في الجزائر، وهي صحافة ناطقة باللغة العربية', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2024-04-24 12:29:06.000000', 1029, '2024-04-24 12:29:06.000000', '06 شارع بنسنوسي حميدة، وهران، الجزائر', '', 'redaction@horizons.dz', 'غير متوفر', ' ', 'Horizons - Quotidien national d\'information ', '+21323 50 21 19', 'https:// horizons.dz/', 'public', 'https:// horizons.dz/', 'آفاق هي صحيفة يومية جزائرية عامة باللغة الفرنسية. وهو أحد العناوين الستة للصحافة الحكومية في الجزائر منذ 1 أكتوبر 1985', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:26:31.386978', 1030, '2024-04-29 16:26:31.921878', ' ', '', ' ', ' ', ' ', '37DEGRES', '+21320 07 04 76', ' ', 'prive', 'https://37degres.dz/', ' الصحافة الالكترونية الاخبارية ', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:29:48.891449', 1031, '2024-04-29 16:29:48.954087', 'مركز الأعمال المحمدية مول الجزائر العاصمة', '', ' contact.aajil@gmail.com', ' ', ' ', 'AAJILNEWS', '+213669 33 24 59', 'https://www.aajilnews.dz/', 'prive', 'https://www.aajilnews.dz/', 'عاجل نيوز منصة رقمية إعلامية جزائرية تصدر عن مؤسسة عاجل نيوز للإعلام والإتصال مقرها الرئيسي في الجزائر العاصمة شعارها: \" كن أول من يعرف\". انطلق الموقع في العمل يوم 5 جويلية 2021، وتقدم بطلب اعتماد لوزارة الاتصال في 14 جويلية 2021، وحصل على شهادة تسجيل كجهاز للإعلام عبر الأنترنت في 24 ماي 2022. تراهن الجريدة الإلكترونية في خطها الافتتاحي على التقيد بما جاء به مضمون قانون الإعلام و المرسوم التنفيذي المحدد لشروط ممارسة نشاط الإعلام عبر الأنترنت..الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:32:07.877068', 1032, '2024-04-29 16:32:07.987239', 'حي السعادات، بناية 315/58 رقم 03 – الجلفة 17000', '', 'info@akhbardzair.dz', ' ', ' ', 'AKHBARDZAIR', '+21327 91 42 07', 'https://www.akhbardzair.dz/', 'prive', 'https://www.akhbardzair.dz/', 'أخبار دزاير: جريدة إلكترونية وطنية معتمدة  تصدر عن مؤسسة \"ديزاد ويب كوم\" للصحافة، الإعلام، النشر والإشهار', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:35:46.031367', 1033, '2024-04-29 16:35:46.130619', ' ', '', ' ', ' ', ' ', 'AKHERKHABAR', ' ', ' ', 'prive', 'غير متوفر', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:37:02.931178', 1034, '2024-04-29 16:37:02.979740', ' ', '', ' ', ' ', ' ', 'ALBNDZ', '+213550 16 46 42', ' ', 'prive', 'https://www.albndz.dz/', 'موقع إخباري جزائري متخصص في الشؤون الإقتصادية يصدر عن شركة \"الجزاير مان هود\" للصحافة يهتم بأخبار الإستثمار والأعمال في مختلف المجالات.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:39:19.190085', 1035, '2024-04-29 16:39:19.217420', ' ', '', ' ', ' ', ' ', 'ALG22', '+21323 18 74 92', ' ', 'prive', 'غير متوفر ', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:43:50.854023', 1036, '2024-04-29 16:43:50.884326', ' ', '', ' ', ' ', ' ', 'ALGERIAFIRST', '+213551 63 66 52', 'https://algeriafirst.dz/', 'prive', 'https://algeriafirst.dz/', 'موقع إخباري جزائري يصدر عن وكالة للصحافة والإتصال، وحاصل على اعتماد من وزارة الاتصال', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:48:23.058798', 1037, '2024-04-29 16:48:23.462400', ' ', '', 'AlgerianInfoexpress@gmail.com', ' ', ' ', 'ALGERIANEXPRESS', ' ', 'https://algerianexpress.dz/', 'prive', 'https://algerianexpress.dz/', 'ألجيريان إكسبرس” جريدة الكترونية تقدم الأخبار والمعلومات بدقة، بموضوعية وتوازن. نغطي الأحداث ذات الصلة بالجزائر، العالم العربي والعالم على مدار الساعة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:54:50.458583', 1038, '2024-04-29 16:54:50.575455', ' غير متوفر', '', 'Contact@algerie54.dz', ' غير متوفر', ' غير متوفر', 'ALGERIE54', ' غير متوفر', 'https://algerie54.dz/', 'prive', 'https://algerie54.dz/', 'Algerie54, est votre source incontournable d’actualités, offrant des informations nationales et internationales en temps réel.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 16:57:43.276114', 1039, '2024-04-29 16:57:43.347283', 'Ain Naadja lot 4 Bureau 7 . Gué de Constantine. Alger ', '', 'admin@algeriebrevesnews.com ', ' ', ' ', 'ALGERIEBREVESNEWS', '+213540 04 50 36', 'http://algeriebrevesnews.dz/', 'prive', 'http://algeriebrevesnews.dz/', 'ne équipe de journalistes avec à leur tête, Abdelkarim Alem qui se cherchait une part d’aventure dans ce vaste espace d’expression libre et d’informations objectives .  Après avoir fait le tour de pas moins de cinq grands quotidiens nationaux et appris le dur métier de journaliste dans un climat des plus hostiles, notre modeste parcours de 25 ans de presse écrite nous a guidés vers cette nouvelle forme d’information : la presse électronique.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 17:06:28.162230', 1040, '2024-04-29 17:06:28.242030', 'Maison de la Presse Abdelkader Safir, 16006 Kouba, Alger.', '', 'contact@algerieinvest.dz', ' ', ' ', 'ALGERIEINVEST', '+213 796 92 89 93', 'http:// ALGERIEINVEST.dz/', 'prive', 'http:// ALGERIEINVEST.dz/', 'Le journal online algerieinvest.com ambitionne d’occuper une place de choix dans le champ médiatique algérien, avec une prépondérance sur l’actualité économique du pays et un œil intéressé sur ce qui se passe dans le monde.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 17:09:16.339607', 1041, '2024-04-29 17:09:16.473518', 'Route nationale 05/centre Hamza 1er étage n°04, Bab-Ezzouar (ALGER)', '', 'algeriemedinfo.dz@gmail.com', ' ', ' ', 'ALGERIE–MEDINFO', '+213770 25 19 03 - +213561 73 03 96', 'https://algerie-medinfo.dz/', 'prive', 'https://algerie-medinfo.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-29 17:11:12.519521', 1042, '2024-04-29 17:11:12.610117', ' غير متوفر', '', '  غير متوفر', ' غير متوفر', ' ', 'ALGERIEPATRIOT', ' غير متوفر', 'http://algeriepatriot.dz/', 'prive', 'http://algeriepatriot.dz/', 'موقع يهتم ويمس الجانب الأمني للدفاع على أمن واستقرار البلاد ضد كل الحملات التحريضية التي تنشر عبر الصفحات الفايسبوكية مع مراقفة اعلامية لكل الأسلاك الأمنية ونقل الاخبار ساعة بساعة وتثمين دور الاسلاك الأمنية في الحفاظ على وحدة واستقرار البلاد', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:36:41.217330', 1043, '2024-04-30 09:36:41.381506', ' غير متوفر', '', 'contact@algeriescoop.com', ' غير متوفر', ' ', 'ALGERIESCOOP', '+21323 21 17 33', 'https://algeriescoop.dz/', 'prive', 'https://algeriescoop.dz/', 'تواجد \" الجزائر سكوب\" في الساحة الإعلامية منذ سبتمبر من سنة 2016، حيث يعمل بصفة دائمة متابعا أهم الأحداث الوطنية في مختلف المجالات السياسية والاقتصادية والثقافية والرياضية.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:38:20.555587', 1044, '2024-04-30 09:38:20.637410', 'غير متوفر', '', 'غير متوفر', 'غير متوفر', ' ', 'ALHAQIQADZ', 'غير متوفر', 'https://www.elhaqiqadz.dz/', 'prive', 'https://www.elhaqiqadz.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:42:19.213906', 1045, '2024-04-30 09:42:19.388618', ' غير متوفر', '', 'pub@alhirak.com', ' غير متوفر', ' ', 'ALHIRAKELIKHBARI', '+213561 67 87 75', 'https://alhirak-alikhbari.dz/about-us', 'prive', 'https://alhirak-alikhbari.dz/about-us', 'إن تأسيس موقع إلكتروني إخباري جزائري يكون في مستوى التطلعات، كان يراودنا منذ زمن، إلا أن البيئة التي كان يعيشها قطاع الإعلام لم تكن مناسبة إلى أن جاء الحراك الذي حرر الإعلام، وعليه قررنا بإذن الله إطلاق الحراك الإخباري ليكون لبنة جديدة لتأسيس عمل اعلامي إخباري يقدس الخبر ويحترم الرأي', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:44:36.283316', 1046, '2024-04-30 09:44:36.577060', 'غير متوفر', '', 'غير متوفر', 'غير متوفر', ' ', 'ALJAZAIR1', 'غير متوفر', 'غير متوفر', 'prive', 'https:// ALJAZAIR1.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:55:27.843047', 1047, '2024-04-30 09:55:27.948979', 'غير متوفر', '', 'غير متوفر', 'غير متوفر', ' ', 'ALJAZAIRALYOUM', '+21323 70 93 17', 'https://www.aljazairalyoum.dz/', 'prive', 'https://www.aljazairalyoum.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:57:23.084657', 1048, '2024-04-30 09:57:23.332184', '5 شارع علي حريشاد - الجزائر الوسطى - الجزائر -44 مكرر شارع فرح الله - البليدة -', '', 'contact@almasdar-dz.com ', ' ', ' ', 'ALMASDAR-DZ', '+213661 88 88 00', 'https://almasdar-dz.com/', 'prive', 'https://almasdar-dz.com/', 'موقع إخباري شامل تتابعون فيه مستجدات الأحداث العربية والعالمية على مدار الساعة تغطية مستمرة لأخبار السياسة والرياضة الاقتصاد ودبلـوماسـية أمـن وعـدالة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 09:59:42.704592', 1049, '2024-04-30 09:59:42.799262', 'غير متوفر', '', 'غير متوفر', 'غير متوفر', ' ', 'ALMIZANPRESS', 'غير متوفر', 'https://almizanpress.dz/', 'prive', 'https://almizanpress.dz/', 'الميزان برس جريدة الكترونية وطنية شاملة تصدر عن شركة الميزان برس', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:02:13.116476', 1050, '2024-04-30 10:02:13.228658', 'Maison de la presse 13Rue Meftah Kouider (Ex Chateau Neuf) Oran Algérie, Oran, Algeria', '', 'contact@alsahafi.dz', 'غير متوفر', ' ', 'ALSAHAFI', 'غير متوفر', 'https://alsahafi.dz/', 'prive', 'https://alsahafi.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:05:16.009203', 1051, '2024-04-30 10:05:16.219971', 'حي 917 سكن ن 18 ص 260 كاليتوس الجزائر العاصمة', '', 'contact@analgeria.dz', ' ', ' ', 'ANALGERIA', '+ 21323 97 05 25', 'https://analgeria.dz/', 'prive', 'https://analgeria.dz/', 'أول وكالة إخبارية جزائرية مستقلة - تصدر من الجزائر وتهتم بكل الأخبار السياسية والفنية والرياضية والتكنولوجيا. مدير النشر الإعلامي زبير فاضل. يصدر من الجزائر منذ شهر أكتوبر 2013، تحت شعار \"من حقك أن تعرف', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:08:49.442293', 1052, '2024-04-30 10:08:49.566884', 'تعاونية النهضة، بئر خادم – الجزائر', '', 'contact@anndz.dz', ' غير متوفر', ' ', 'ANNDZ', '+21323 54 59 44', 'https://anndz.dz/fr/accueil/', 'prive', 'https://anndz.dz/fr/accueil/', 'ANN (اختصارا للشبكة الجزائرية للأخبار ) هي صحيفة إخبارية إلكترونية مزدوجة اللغة تم إطلاق نسختها العربية في فبراير 2021 ، بينما النسخة الفرنسية أبصرت النور في فبراير 2023.  يطمح موقعنا أن يكون مصدرًا جادًا وموثوقًا للمعلومات و الاخبار التي تهم الجزائر في المقام الأول في جميع المجالات ، بما في ذلك السياسة والدبلوماسية والدفاع والاقتصاد والمجتمع ، و أيضًا الثقافة والرياضة والتكنولوجيات الحديثة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:10:26.634758', 1053, '2024-04-30 10:10:26.970749', 'واد تليلات، وهران', '', 'info@asdaalgharb.dz', ' غير متوفر', ' ', 'ASDAAELGHARB', '+213561 02 41 10', 'https://asdaalgharb.dz/', 'prive', 'https://asdaalgharb.dz/', '\"أصداء الغرب\" جريدة الكترونية جهوية تصدر عن شركة \" لاقازيتا الاتصال \" المتواجد مقرها الاجتماعي بمدينة وهران ، شعارها نسعى \" لتجسيد الحق في الإعلام \" ومن خلاله نسلط الضوء على مختلف القضايا ومستجدات الساحة الجهوية ناقلين بذلك انشغالات المواطن عبر جسر التواصل بينه وبين المسؤول لتحقيق التنمية المنشودة. يتمثل هدفنا في تحقيق إعلام جواري نموذج تضمن حق المواطن في الإعلام ، تعزيزا لمبادئ المواطنة كإنشاء وسلوك حضاري . \"أصداء الغرب\" هو الصوت الأقرب للمواطن وشريكه في نقله لتطلعاته و آراءه وفق ما تقتضيه أخلاقيات المهنة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:14:52.661695', 1054, '2024-04-30 10:14:52.866207', '12 جنان بن عمر القبة الجزائر', '', 'contact@autobip.com', ' غير متوفر', ' غير متوفر', 'AUTOBIP', '+213770 18 86 19', 'https://www.autobip.dz/', 'prive', 'https://www.autobip.dz/', 'أوتوبيب | أسعار السيارات الجديدة في الجزائر ، أسعار الدراجات النارية الجديدة ، العروض الخاصة والتخفيضات ، أسعار السيارات المستعملة ، أخبار السيارات', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:18:17.859773', 1055, '2024-04-30 10:18:18.156143', ' غير متوفر', '', 'contact@autojazair.dz', 'غير متوفر', ' غير متوفر', 'AUTOJAZAIR', '+213542 61 18 50', 'https://www.autojazair.dz', 'prive', 'https://www.autojazair.dz', 'AUTOJAZAIR.DZ (anciennement autodjaz.net) est un journal en ligne spécialisé en automobile, créé en août 2015 par Nadir Kerri, un journaliste aguerri dans la presse écrite, dont 8 ans dans le monde de l’automobile.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:23:32.101441', 1056, '2024-04-30 10:23:32.306477', 'المقر المركزي بالشراقة – الجزائر العاصمة', '', 'info@awras.com', ' غير متوفر ', ' غير متوفر', 'AWRAS', '+213552 47 44 31', 'https://www.awras.com/', 'prive', 'https://www.awras.com/', 'منصة أوراس الرقمية.. خدمة إخبارية جزائرية تُحاول نقل الحقيقة والوصول إلى عمق الأحداث باعتماد قوالب خبرية جديدة وجذابة عبر الموقع الإلكتروني أو المنصات الرقمية المحتلفة، مقرنا حاليا في العاصمة بمدينة الشراقة ونحاول التواجد عبر مختلف الولايات.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:26:03.168261', 1057, '2024-04-30 10:26:03.469677', ' حي قرمدي رابح حسين داي الجزائر العاصمة', '', 'info@bak-press.dz', ' غير متوفر', ' غير متوفر', 'BAK-PRESS', ' +1 212 602 9641', 'https://bak-press.dz/', 'prive', 'https://bak-press.dz/', 'جريدة إلكترونية جزائرية تتناول اخر الاخبار الوطنية والدولية ساعة بساعة شعارنا: صوت وصورة الجزائر عبر النت', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:27:45.781576', 1058, '2024-04-30 10:27:45.999264', 'حي كورتيس قطعة 16 شارع فرنان حنفي بلدية حسين داي', '', 'Barakanews213@gmail.com', ' غير متوفر', ' غير متوفر', 'BARAKANEWS', '+213793 66 99 97', 'https://barakanews.dz/', 'prive', 'https://barakanews.dz/', 'بركة نيوز الإلكترونية، جريدة جزائرية تصدر عن مؤسسة \"زهور الأقصى للإعلام\"، توفر تغطية آنية ومستمرة للأخبار الوطنية والدولية، وهي من أوائل الجرائد التي تخصص حيزا هاما للمجتمع المدني والشباب والمؤسسات الناشئة، والاستثمار في الجزائر.  ارتأينا أن نصدرها في يوم العلم بتاريخ 16 أفريل 2022، ترسيخا لأهمية العلم في ترقية المجتمعات، واقتداءً بشخصية رائد الإصلاح \"العلامة عبد الحميد بن باديس\".  نتطلع لتقديم إعلام هادف بفريق صحفي متميز ونقل الأخبار من قلب الحدث بدقة عالية لبلوغ أعلى سقف من الاحترافية والموضوعية والمصداقية.  كما نسعى لنقل أحسن صورة لوطننا في الداخل والخارج، وأن يكون منبرنا الإعلامي خير سفير للجزائر في العالم.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:30:36.304363', 1059, '2024-04-30 10:30:36.370574', ' غير متوفر', '', 'contact@bladi-info.dz', 'غير متوفر', ' ', 'BLADI-INFO', '+21321 60 73 37', 'https://bladi-info.dz/', 'prive', 'https://bladi-info.dz/', 'بلادي أنفو.. موقع إخباري جزائري شامل، أطلقه صحفيون جزائ', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:32:57.939113', 1060, '2024-04-30 10:32:57.979125', 'نهج الأمير عبد القادر، برج بوعريريج', '', 'contact@bordjnews.dz', 'غير متوفر', ' غير متوفر', 'BORDJNEWS', '+21335732929', 'https://bordjnews.dz/', 'prive', 'https://bordjnews.dz/', 'موقع \"برج نيوز\" جريدة إلكترونية وطنية شاملة تحمل العنوان الإلكتروني Bordjnews.dz ، أول جريدة إلكترونية وطنية بمقر اجتماعي ببرج بوعريريج. جريدتكم برج نيوز ، بوابتكم نحو المعلومة بشعار “أنتم في قلب الحدث” يعمل فريق برج نيوز على نقل المعلومة بإحترافية في آنها و بكل مصداقية في كل المجالات سياسة، إقتصاد، رياضة، ثقافة، مجتمع، مرأة، صحة، منوعات بالإضافة إلى مساهمات الأدباء و الباحثين و المفكرين.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:40:10.726474', 1061, '2024-04-30 10:40:10.809770', 'الشهيد حمدي عبد القادر فيلا 84 الطابق الأرضي', '', 'bcinfo.dz@gmail.com', 'غير متوفر', ' غير متوفر', 'ALGERIEDIRECT', '+213 552 163 209', 'https://www.algeriedirect.dz/', 'prive', 'https://www.algeriedirect.dz/', 'الجزائر مباشر\'\' موقع اخباري وطني ، تأسس في 11 ديسمبر 2016، من طرف صحفيين محترفين جزائريين يؤمنون بحق المواطن في إعلام كامل و موضوعي، و حق المواطن في الولوج للمعلومة الصحيحة، ودعم الصحافة الاستقصائية والتحري، وترقية صحافة المواطنا.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:44:00.184469', 1062, '2024-04-30 10:44:00.254180', ' غير متوفر', '', 'msaadi@carvision.dz', 'غير متوفر', ' غير متوفر', 'CARVISION', '+213661 56 93 20', 'https://www.carvision.dz/', 'prive', 'https://www.carvision.dz/', 'Autos, actualités, nouveautés, essais, prix du neuf, etc...', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:46:15.761444', 1063, '2024-04-30 10:46:15.898076', 'شارع أواه أواه مدني، وهران، الجزائر', '', ' chebabcontact@gmail.com', 'غير متوفر', ' غير متوفر', 'CHEBABTV', 'غير متوفر', 'https://chebabtv.dz/', 'prive', 'https://chebabtv.dz/', 'منصة إلكترونية رقمية ، ذات محتوى إعلامي متخصص بالشباب في كل المجالات', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:49:05.235645', 1064, '2024-04-30 10:49:05.343792', '21 حي عبدي عبدي -شرشال ولاية تيبازة', '', 'admin@cherchellnews.dz', '+21323 26 71 12', ' غير متوفر', 'CHERCHELLNEWS', '+213661 51 32 23', 'https://www.cherchellnews.dz/', 'prive', 'https://www.cherchellnews.dz/', 'شرشال نيوز – جريدة الكترونية جزائرية تصدر عن مؤسسة كابيكوم للدعاية والإعلام والاتصال', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:51:36.327056', 1065, '2024-04-30 10:51:36.353483', 'غير متوفر', '', 'غير متوفر', 'غير متوفر', 'غير متوفر', 'DJALIA', 'غير متوفر', 'https://djalia.dz/fr/', 'prive', 'https://djalia.dz/fr/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 10:53:49.623795', 1066, '2024-04-30 10:53:49.824018', 'محل أ بالطابق الأول، حي بن جرمة قسم 153 مجموعة 30 ، الجلفة', '', ' djelfa.info@gmail.com', '+21327 93 82 80', ' غير متوفر', 'DJELFAINFO', '+21327 93 82 80', 'https://djelfainfo.dz/ar/', 'prive', 'https://djelfainfo.dz/ar/', 'تأسس موقع الجلفة إنفو في 28 آفريل من عام 2006، و ينقسم إلى عدة أقسام، أهمها: - جريدة الكترونية تنشر باللغتين العربية والفرنسية وتهتم بالأخبار الوطنية وأخبار ولاية الجلفة وما حولها، وهي من بين أوائل الجرائد الإلكترونية على المستوى الوطني.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:03:36.433990', 1067, '2024-04-30 11:03:36.475153', ' غير متوفر', '', 'dzpresse54@gmail.com', 'غير متوفر', ' ', 'DZ54', '+213696 87 98 42', 'https://www.dz54.dz/', 'prive', 'https://www.dz54.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:16:21.848294', 1068, '2024-04-30 11:16:22.047166', 'مستشفى القبة زهون قاريدي عمارة ب حصة رقم 05 الجزائر', '', 'dzairtube13@gmail.com', '+21323785770', ' غير متوفر', 'DZAIR-TUBE', '+21323785770', 'https://www.dzair-tube.dz/', 'prive', 'https://www.dzair-tube.dz/', 'دزاير توب موقع إلكتروني إخباري منفتح على الجميع، وقناة إلكترونية بروح شبابية نسعى دوما إلى الإفادة بالمعلومة في شتى الميادين السياسية والرياضية والاقتصادية والاجتماعية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:20:10.434875', 1069, '2024-04-30 11:20:10.547573', ' غير متوفر', '', 'dzayernewsdz@gmail.com', 'غير متوفر', ' غير متوفر', 'DZAYERNEWS', '+213 549 00 54 37', 'https://dzayernews.dz/', 'prive', 'https://dzayernews.dz/', 'دزاير نيوز موقع إخباري إلكتروني يهتم بشؤون المواطن الجزائري بشكل عام', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:24:52.566546', 1070, '2024-04-30 11:24:52.730600', '148 حي الكاسطور برج الكيفان الجزائر', '', 'red@dzertic24.dz', 'غير متوفر', ' غير متوفر', 'DZERTIC24', '+213551 08 08 16', 'https://www.dzertic24.dz/', 'prive', 'https://www.dzertic24.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:26:46.323913', 1071, '2024-04-30 11:26:46.437591', ' غير متوفر', '', ' dzinfoline@gmail.com', 'غير متوفر', ' غير متوفر', 'DZINFOLINE', 'غير متوفر', 'https://dzinfoline.dz/', 'prive', 'https://dzinfoline.dz/', 'الصحافة الإخبارية الإليكترونية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:28:19.081970', 1072, '2024-04-30 11:28:19.147362', 'Alger-Centre , Algiers, Algeria', '', 'غير متوفر', ' غير متوفر', ' غير متوفر', 'DZLIVE', 'غير متوفر', 'https://www.dzlive.dz/', 'prive', 'https://www.dzlive.dz/', ' ', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:30:54.389665', 1073, '2024-04-30 11:30:54.749688', '95. تعاونية ليزيريس - بلدية القبة 16006 - الجزائر العاصمة', '', 'dizednews@gmail.com', 'غير متوفر', ' غير متوفر', 'DZNEWS', '+21321493515', 'https://dznews.dz/', 'prive', 'https://dznews.dz/', 'تحت شعار - أن يصلك الخبر - ديزادنيوز منصة كل الجزائريين لمتابعة الأخبار لحظة بلحظة وبالصوت والصورة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:34:38.041747', 1074, '2024-04-30 11:34:38.505962', ' غير متوفر', '', 'غير متوفر', 'غير متوفر', ' غير متوفر', 'ECO-ALGERIA', 'غير متوفر', 'https://www.eco-algeria.com/categories/le-fil-dinfos', 'prive', 'https://www.eco-algeria.com/categories/le-fil-dinfos', 'يكو ألجيريا هو موقع الكتروني جزائري إخباري متخصص في شؤون الاقتصاد وحركية الاستثمار.   تأسس إيكو ألجيريا في 5 جويلية 2016.   يعمل الموقع على المواكبة الحية لجميع الأحداث الاقتصادية وقت وقوعها، ويحرص إيكو ألجيريا على التموقع كأيقونة إخبارية تفاعلية آنية، فضلا عن التحليل والاستشراف.   يصدر إيكو ألجيريا عن شركة “إينافوس للاتصال والإشهار”، وتعدّ الأخيرة المالكة القانونية لحقوق النشر.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 11:39:21.557110', 1075, '2024-04-30 11:39:21.685218', ' غير متوفر', '', 'infos@edtech.dz', 'غير متوفر', ' غير متوفر', 'EDTECH', '+213542 642 550', 'https://edtech.dz/', 'prive', 'https://edtech.dz/', 'EdTech provides variety of technological tools and solutions to make education smarter than ever.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 16:14:34.115095', 1076, '2024-04-30 16:14:34.210831', '56 شارع العربي بن مهيدي – الجزائر العاصمة ', '', 'elghaddz@gmail.com', 'غير متوفر', ' ', 'الغد الجزائري', 'غير متوفر', 'https://elghadeldjazairi.dz', 'prive', 'https://elghadeldjazairi.dz', 'لغد الجزائري” مؤسسة إعلامية إخبارية جزائرية، شعارها “الغد يبدأ اليوم”، تصدر عن مؤسسة لوس ميديوس كومينيكاسيون، مقرها في الجزائر العاصمة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 16:16:23.157234', 1077, '2024-04-30 16:16:23.343079', 'دار الصحافة الطاهر جاووت 01 شارع بشير عطار ساحة أول ماي الجزائر العاصمة', '', 'غير متوفر', '+21321 65 02 68', ' غير متوفر', 'اللقاء', '+21321 65 02 68', 'https://elikaaonline.com/', 'prive', 'https://elikaaonline.com/', 'جريدة اللقاء الجزائرية – journal el Likaa يومية اخبارية وطنية تعنى بالاحداث المحلية والمغاربية و العالمية، تلتزم الدقة و المهنية في نقل الاخبار على مدار الساعة تصدر عن شركة أول بوب ALLPUB المدير العام مسؤول النشر بركان بودربالة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 16:18:07.435160', 1078, '2024-04-30 16:18:07.474308', 'مكتب العاصمة: شارع 22 محمد العياشي بلوزداد', '', 'غير متوفر', '+21323 50 10 11', ' غير متوفر', 'المستقبل المغاربي', '+213779 85 96 94 ', 'https://www.elmoustakbal-elmagharibi.dz/', 'prive', 'https://www.elmoustakbal-elmagharibi.dz/', 'ريدة المستقبل المغاربي يومية وطنية مستقلة تصدر عن شركة ذات الشخص الوحيد و ذات المسؤولية المحدودة \"ميديا كوم \" تأسست في 22 فيفري 1997 مديرها العام و مؤسسها المرحوم رابح قليل', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-04-30 16:21:32.165441', 1079, '2024-04-30 16:21:32.330165', 'الوحدة الجوارية رقم 5 علي منجلي فيلا رقم 137 ولاية قسنطينة - الجزائر', '', 'contact@aineldjazair.dz', '+21331 74 16 09', ' غير متوفر', 'عين الجزائر', '+21331 74 16 09', 'https://www.aineldjazair.dz', 'prive', 'https://www.aineldjazair.dz', 'عين الجزائر اون لاين هي جريدة يومية جزائرية إخبارية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 11:53:20.000000', 1080, '2024-05-02 11:53:21.000000', 'دار الصحافة عبد القادر سفير ، 22 شارع فريد زويوش رقم 24 عمار A القبة الجزائر', '', 'infoafricanewsdz@gmail.com', 'غير متوفر', ' غير متوفر', 'أفريكا نيوز', '+213561 89 24 34', 'https://africanews.dz/', 'prive', 'https://africanews.dz/', 'أفريكا نيوز يومية وطنية إخبارية شاملة تصدر عن مؤسسة ذات الشخص الوحيد و المسؤولية المحدودة بلولايت ميديا تأسست سنة 2020 ، تعنى بالأخبار السياسية و الاقتصادية و الثقافية و كل ما يهم المواطن الجزائري في محيطه الإفريقي و العربي و المتوسطي', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 12:35:29.000000', 1081, '2024-05-02 12:35:35.000000', '02 طريق زويوش فريد دار الصحافة القبة الجزائر', '', 'redaction@akhbarelwatane.dz', 'غير متوفر', ' غير متوفر', 'أخبار الوطن', '+21323 70 92 46', 'https://akhbarelwatane.dz/', 'prive', 'https://akhbarelwatane.dz/', 'شبكة إخبارية جزائرية متعددة الوسائط، أصدرها صحفيون جزائريون شباب في خضم الحراك الشعبي السلمي، وتأهب الجزائريين لبناء جزائر جديدة، تهدف إلى إعادة الاعتبار للممارسة الإعلامية، وإحداث تصالح بين القارئ والمشاهد والصحافة بصفة عامة من خلال المعلومة الصادقة، والخبر اليقين، والتحليل الموضوعي والمنهجي وفق القيم المهنية المتعارف عليها عالميا.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 12:37:39.000000', 1082, '2024-05-02 12:37:39.000000', 'حي العناصر 04 ـ عمارة 69، رقم 02 ـ القبة/ الجزائر العاصمة', '', 'akhbarelyoum1@gmail.com', '+21323 70 54 31', ' غير متوفر', 'أخبار اليوم', '+21323 70 54 31', 'https://akhbarelyoum.dz/', 'prive', 'https://akhbarelyoum.dz/', 'أخبار اليوم يومية إخبارية وطنية مستقلة تصدر عن شركة أخبار اليوم للنشر و الإعلام و التوزيع', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:06:40.000000', 1083, '2024-05-02 14:06:41.000000', 'حي سعيدون محمد (بن عمر القبة)، فيلا رقم 113، الجزائر العاصمة، الجزائر', '', 'redaction@elikhbaria.dz', '+21323 71 40 27', ' غير متوفر', 'الإخبارية', '+213766 50 81 77', 'https://elikhbaria.dz/', 'prive', 'https://elikhbaria.dz/', 'منصة إخبارية رقمية ومطبوعة توفر تغطية منوعة للأحداث في الجزائر، والعالم خاصة في منطقتي المغرب العربي والساحل الإفريقي..', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:09:30.000000', 1084, '2024-05-02 14:09:30.000000', 'دار الصحافة طاهر جاووت اول ماي الجزائر العاصمة', '', 'غير متوفر', ' غير متوفر', ' غير متوفر', 'آخر ساعة', 'غير متوفر', 'https://akhersaa.net/', 'prive', 'https://akhersaa.net/', 'مع آخر ساعة تابعوا لحظة بلحظة و بالصور والفيديو أخبار مدينتكم و أخبار الجزائر و العالم', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:11:41.000000', 1085, '2024-05-02 14:11:41.000000', ' غير متوفر', '', 'contact@eldjazaireldjadida.dz', 'غير متوفر', ' غير متوفر', 'الجزائر الجديدة', 'غير متوفر', 'https://www.eldjazaireldjadida.dz/', 'prive', 'https://www.eldjazaireldjadida.dz/', 'صحيفة يومية جزائرية شاملة مستقلة تصدر عن شركة ش.ذ.م.م دي أم براس للنشر والإشهار والطباعة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:14:25.000000', 1086, '2024-05-02 14:14:25.000000', 'جيجل الجزائر', '', 'غير متوفر', ' غير متوفر', ' غير متوفر', 'جيجل الجديدة', '+21334 49 66 80', 'https://jijeleljadida.dz/', 'public', 'https://jijeleljadida.dz/', 'هي شبكة لنقل الاخبار والمعلومات في الجزائر و العالم عبر عدة وسائط، تشمل الانترنت والهواتف المحمولة الصحيفة الرقمية و الصحيفة الورقية تصدر عن الجزائر العاصمة و تطبع بالمطبعة العمومية وسط SIA بباب الزوار بالعاصمة الجزائر .', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:16:47.000000', 1087, '2024-05-02 14:16:47.000000', 'لتعاونية العقارية لاروت، رقم 71. بئر خادم – الجزائر', '', 'elhiwardm@mail.com ', '+21323 59 73 03', ' غير متوفر', 'الحوار', '+21323 18 76 06 ', 'https://elhiwar.dz/', 'prive', 'https://elhiwar.dz/', 'إخباري شامل، يتناول المستجدات في الساحة الوطنية الجزائرية في مختلف المجالات، و كذا الساحة الدولية، بحياد، و مهنية.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:18:55.000000', 1088, '2024-05-02 14:18:55.000000', 'اسطوالي الجزائر العاصمة', '', 'contact@elraed.dz', 'غير متوفر', ' غير متوفر', 'الرائد', '+213561 61 25 01', 'https://www.elraed.dz/', 'prive', 'https://www.elraed.dz/', 'يومية اخبارية عامة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:23:11.000000', 1089, '2024-05-02 14:23:11.000000', 'قسنطينة ،الجزائر', '', 'errayajournal@gmail.com', 'غير متوفر', ' غير متوفر', 'الراية', '+21331 37 01 92', 'https://errayaonline.net/', 'public', 'https://errayaonline.net/', 'جـ.ـريدة «الــراية» يـ.ـومية جـ.ـزائرية وطـ.ـنية مستقلة يقـع مـ.ـقرها بقسنـ.ـطية', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:33:28.000000', 1090, '2024-05-02 14:33:28.000000', 'دار الصحافة – القبة  الجزائر العاصمة', '', 'غير متوفر', '+21323 70 94 42', ' غير متوفر', 'السلام اليوم', '+21323 70 94 41', 'https://www.pickyournewspaper.com/WORLD/AFRICA/Newspapers/Algeria/essalam-online.html', 'prive', 'https://www.pickyournewspaper.com/WORLD/AFRICA/Newspapers/Algeria/essalam-online.html', '“السلام اليوم” يومية جزائرية مستقلة  تصدر عن ش ذ م م “المسار  “.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:35:01.000000', 1091, '2024-05-02 14:35:01.000000', ' غير متوفر', '', 'غير متوفر', 'غير متوفر', ' غير متوفر', 'الشهاب', 'غير متوفر', ' ', 'prive', 'غير متوفر', 'الصحافة الإخبارية المكتوبة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:37:25.000000', 1092, '2024-05-02 14:37:26.000000', 'شارع إبن خلدون عنابة الجزائر', '', 'contact@sarih.dz', '+21338 45 91 78', ' غير متوفر', 'الصريح', '+21338 48 65 53', 'https://sarih.dz/', 'prive', 'https://sarih.dz/', 'الصريح جريدة ورقية وطنية شاملة، تصدر عن شركة الصريح ذات المسؤولية المحدودة، وتتخذ من عنابة مقرا لها، وقد انطلق المشروع بتاريخ 24 مارس 2016. نهتم بالأخبار ذات الصبغة الجوارية، ومتابعة أهم الأحداث المحلية والوطنية، سواء السياسية والاقتصادية والاجتماعية والثقافية والرياضية، كما نتناول التحليلات والتحقيقات وقضايا الرأي المختلفة.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:43:30.000000', 1093, '2024-05-02 14:43:30.000000', ' غير متوفر', '', 'assawt.net@gmail.com', 'غير متوفر', ' غير متوفر', 'الصوت الآخر', '+21323 50 21 49', 'https://www.assawtelakhar.dz/', 'prive', 'https://www.assawtelakhar.dz/', ' جريدة الصوت الآخر، وهي يومية مستقل. أنشئ الموقع سنة 2013، وهي نفس السنة التي أصرد فيها أول عدد من الجريدة، وخضع لعدة تحسينات، آخرها يوم 13 أوت 2016، حيث حصل على تصميم جديد عصري.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:48:57.000000', 1094, '2024-05-02 14:48:57.000000', 'المقر الاجتماعي حي افري جانت ولاية إليزي', '', 'journal.tassili.news@gmail.com', 'غير متوفر', ' غير متوفر', 'الطاسيلي نيوز', '+21329 48 13 17', 'https://tassilinews.dz/', 'prive', 'https://tassilinews.dz/', 'جريدة يومية اخبارية شاملة تصدر من عمق الجنوب الجزائري', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:52:34.000000', 1095, '2024-05-02 14:52:34.000000', ' غير متوفر', '', 'journalkawaliss@gmail.com', '+21336 76 11 06', ' غير متوفر', 'كواليس', '+21336 76 11 06', 'https://kawalissealdjadida.dz/', 'prive', 'https://kawalissealdjadida.dz/', 'جريدة كواليس يومية وطنية شاملة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 14:56:06.000000', 1096, '2024-05-02 14:56:06.000000', 'دار الصحافة الطاهر جاووت 01 شارع بشير عطار ساحة أول ماي الجزائر العاصمة', '', 'غير متوفر', '+21321 65 02 68', ' غير متوفر', 'اللقاء', '+21321 65 02 68', 'https://elikaaonline.com/', 'prive', 'https://elikaaonline.com/', 'جريدة اللقاء الجزائرية – journal el Likaa يومية اخبارية وطنية تعنى بالاحداث المحلية والمغاربية و العالمية، تلتزم الدقة و المهنية في نقل الاخبار على مدار الساعة تصدر عن شركة أول بوب ALLPUB المدير العام مسؤول النشر بركان بودربالة', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:02:00.000000', 1097, '2024-05-02 15:02:00.000000', 'دار الصحافة الطاهر جاووت 01 شارع بشير عطار ساحة أول ماي الجزائر العاصمة', '', 'contact@elmaouid.dz', 'غير متوفر', ' غير متوفر', 'الموعد اليومي', '+213549 30 43 03', 'https://elmaouid.dz/', 'public', 'https://elmaouid.dz/', '‎جريدة يومية وطنية تهتم بمتابعة القضايا المطروحة على الصعيد الوطني والإقليمي والدولي', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:09:33.000000', 1098, '2024-05-02 15:09:33.000000', 'Q3F5+C4H, Bd Mohamed khemisti, Alger Centre 16000', '', 'غير متوفر', 'غير متوفر', ' غير متوفر', 'الوسيط المغاربي', 'غير متوفر', 'https://www.wassitmag.dz/', 'prive', 'https://www.wassitmag.dz/', 'يومية سياسية تهتم بالأخبار الوطنية والمغاربية شعارها عين على ما وراء الخبر', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:15:09.000000', 1099, '2024-05-02 15:15:09.000000', ' شارع رقم 46 الأمير عبد القادر – عنابة', '', 'redactionseybouse@gmail.com', '+21338 80 48 56', ' غير متوفر', 'SEYBOUSE TIMES', '+21338 80 48 76', 'https://seybousetimes.dz/', 'prive', 'https://seybousetimes.dz/', 'Quotidien indépendant d’informations générales', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:18:27.000000', 1100, '2024-05-02 15:18:27.000000', 'دار الصحافة الطاهر جاووت 01 شارع بشير عطار ساحة أول ماي الجزائر العاصمة', '', 'contact@reporters.dz', 'غير متوفر', ' غير متوفر', 'REPORTERS', '+21321 66 20 08', 'https://reporters.dz/', 'prive', 'https://reporters.dz/', 'Suivez toute l\'information et réagissez à l\'actualité nationale et internationale sur la page off', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:23:32.000000', 1101, '2024-05-02 15:23:32.000000', 'المقر : 19 شارع بندهيبة بنعياد مستغانم', '', 'redaction@reflexion.dz', '+21345 41 33 22', ' غير متوفر', 'REFLEXION', '+213555 85 08 58', 'https://www.reflexion.dz/', 'prive', 'https://www.reflexion.dz/', 'Journalisme d\'information écrite', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:26:43.000000', 1102, '2024-05-02 15:26:43.000000', 'رقم 13 حي جمال,وهران , الجزائر', '', 'redaction@ouestribune-dz.com', '+21341 85 82 54', ' غير متوفر', 'OUEST TRIBUNE', '+21341 85 80 48', 'https://ouest-tribune.dz/', 'prive', 'https://ouest-tribune.dz/', 'Suivez toute l\'information et réagissez à l\'actualité nationale et internationale sur la page off', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:30:14.000000', 1103, '2024-05-02 15:30:14.000000', 'شارع رقم 26 ديدوش مراد,الجزائر العاصمة', '', 'غير متوفر', '+21321 63 79 14', ' غير متوفر', 'MIDI LIBRE', '+21321 63 80 82 ', 'www.lemidi-dz.com', 'prive', 'www.lemidi-dz.com', 'Journalisme d\'information écrite', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:35:23.000000', 1104, '2024-05-02 15:35:23.000000', 'شارع رقم01 بشير العطار ,ساحة أول ماي,الجزائر', '', 'info@lesoirdalgerie.com', '+21320 06 46 45', ' غير متوفر', 'LE SOIR D’ALGERIE', '+21320 06 49 47', 'https://www.lesoirdalgerie.com/', 'prive', 'https://www.lesoirdalgerie.com/', 'fait sienne cette citation de Joseph Pulitzer, fondateur du journalisme moderne : «Il (son journal, ndlr) combattra toujours pour le progrès et les réformes, ne tolérera jamais l’injustice et la corruption ; il attaquera toujours les démagogues de tous les partis, n’appartiendra à aucun parti, s’opposera aux classes privilégiées et aux exploiteurs du peuple, ne relâchera jamais sa sympathie envers les pauvres, demeurera toujours dévoué au bien public. Il maintiendra radicalement son indépendance, il n’aura jamais peur d’attaquer le mal, autant quand il provient de laploutocratie que de ceux qui se réclament de la pauvreté.»', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:39:12.000000', 1105, '2024-05-02 15:39:12.000000', 'قسنطينة ،الجزائر', '', 'infolequotidien25@gmail.com', 'غير متوفر', ' غير متوفر', 'LE REDACTEUR', 'غير متوفر', 'https://www.leredacteur.dz/', 'prive', 'https://www.leredacteur.dz/', 'Quotidien National d\'Information algérien', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:42:33.000000', 1106, '2024-05-02 15:42:33.000000', ' ص.ب رقم 110 شارع رقم 1 بوسي فيو الطيب 63 شارع دي لانب وهران-الجزائر', '', 'infos@lequotidien-oran.com', '+21341 23 25 20', ' غير متوفر', 'LE QUOTIDIEN D’ORAN', '+21341 23 25 22', 'https://www.lequotidien-oran.com/', 'prive', 'https://www.lequotidien-oran.com/', 'Le Quotidien d\'Oran est un quotidien généraliste en langue française', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:45:28.000000', 1107, '2024-05-02 15:45:28.000000', 'عنابة ,الجزائر', '', 'le-provincial@hotmail.fr', 'غير متوفر', ' غير متوفر', 'LE PROVINCIAL', '+21338 40 92 40', 'https://leprovincial.dz/', 'prive', 'https://leprovincial.dz/', 'Recevez tout au long de la journée, les meilleures informations sur les régions.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:47:48.000000', 1108, '2024-05-02 15:47:48.000000', 'شارع محمد الخامس - الجزائر العاصمة', '', 'lejourdalgerie@hotmail.fr', '+21321 78 14 15', ' غير متوفر', 'LE JOUR D’ALGERIE', '+21321 78 14 16 ', 'https://lejourdalgerie.com/', 'prive', 'https://lejourdalgerie.com/', 'site/journal d’information générale', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:50:42.000000', 1109, '2024-05-02 15:50:42.000000', 'دار الصحافة الطاهر جاووت 01 شارع بشير عطار ساحة أول ماي الجزائر العاصمة', '', 'infos@jeune-independant.net', 'غير متوفر', ' غير متوفر', 'LE JEUNE INDEPENDANT', '+21321 67 15 45', 'https://www.jeune-independant.net/', 'prive', 'https://www.jeune-independant.net/', 'Le Jeune indépendant est un quotidien généraliste algérien en langue française, fondé le 28 mars 1990', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:56:19.000000', 1110, '2024-05-02 15:56:20.000000', 'القبة , الجزائر', '', 'lecourrierdalgerie@yahoo.fr', 'غير متوفر', ' غير متوفر', 'LE COURRIER D’ALGERIE', '+21323 70 94 35', 'https://lecourrier-dalgerie.com/', 'prive', 'https://lecourrier-dalgerie.com/', 'Quotidien national d’information Edité par l’Eurl Millénium Presse', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 15:58:57.000000', 1111, '2024-05-02 15:58:57.000000', ' شارع رقم 16 دكتور بن زرجب - وهران', '', 'lecarrefourdoran@yahoo.fr', '+21341 30 73 41 ', ' غير متوفر', 'CARREFOUR D’ALGERIE', '+21341 30 73 39 ', 'https://lecarrefourdalgerie.dz/', 'prive', 'https://lecarrefourdalgerie.dz/', 'Quotidien National d\'Informations', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:02:34.000000', 1112, '2024-05-02 16:02:34.000000', 'شارع رقم01 بشير العطار ,سيدي محمد,الجزائر', '', 'lnr98redaction@yahoo.fr', '+21321 67 10 75', ' غير متوفر', 'LA NOUVELLE REPUBLIQUE', '+21321 67 10 44', 'https://www.lnr-dz.com/', 'prive', 'https://www.lnr-dz.com/', 'La NR (La Nouvelle République) a été fondée par les principaux animateurs du journal Le Matine', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:06:16.000000', 1113, '2024-05-02 16:06:16.000000', 'شارع بنويس كدابولت وهران – الجزائر', '', 'INFOLANATION@GMAIL.COM', '+21341 82 49 75', ' غير متوفر', 'LA NATION ARABE', '+21341 82 49 70', 'https://lanationarabe.dz/', 'prive', 'https://lanationarabe.dz/', 'Quotidien National d\'Information algérien', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:09:02.000000', 1114, '2024-05-02 16:09:02.000000', ' ', '', 'lanationquotidien@gmail.com', 'غير متوفر', ' غير متوفر', 'LA NATION', '+21323 46 32 76', 'https://journal-lanation.com/', 'prive', 'https://journal-lanation.com/', 'Quotidien national d\'information créé en 1992.', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:16:34.000000', 1115, '2024-05-02 16:16:35.000000', 'دار الصحافة عبد القادر سفير ، 22 شارع فريد زويوش رقم 24 عمار A القبة الجزائر', '', 'laredaction@lexpressiondz.com', '+21323 70 94 00', ' غير متوفر', 'L’EXPRESSION', '+21323 70 94 01', 'https://www.lexpressiondz.com/', 'prive', 'https://www.lexpressiondz.com/', 'Journal national d’information', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:19:18.000000', 1116, '2024-05-02 16:19:19.000000', 'عنابة ,الجزائر', '', 'lest.annaba@gmail.com', 'غير متوفر', ' غير متوفر', 'L’EST REPUBLICAIN', '+21338 45 90 15', 'https://lestrepublicain.com/', 'prive', 'https://lestrepublicain.com/', 'Avec L\'Est Républicain, suivez en continu, en images et en vidéo, l\'actualité dans votre région', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:23:14.000000', 1117, '2024-05-02 16:23:14.000000', 'حي الفلاوسين - إقامة \"دجباري\" - وهران', '', 'غير متوفر', '+21341 75.54.67', ' غير متوفر', 'L’ECHO D’ORAN', '21341 75 54 65', 'https://www.echodoran.com/', 'prive', 'https://www.echodoran.com/', 'Quotidien National d\'Information', NULL, NULL, NULL, NULL, NULL, NULL),
(NULL, '2024-05-02 16:25:54.000000', 1118, '2024-05-02 16:25:55.000000', ' شارع رقم 23 موبيج – الجزائر العاصمة', '', 'غير متوفر', '+21323 54 23 02', ' غير متوفر', 'L’ECHO D’ALGERIE', '+21323 54 23 23 ', 'https://lechodalgerie.dz/', 'prive', 'https://lechodalgerie.dz/', 'L’écho d’Algérie, Quotidien National d’Information édité par Echo Médias Algérie Sarl, venu enrichir la presse écrite, jeune par son âge certes mais en réalité c’est le prolongement d’un idéal, d’un combat, d’un rêve.', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `presse_categorie`
--

DROP TABLE IF EXISTS `presse_categorie`;
CREATE TABLE IF NOT EXISTS `presse_categorie` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `descriptio_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `presse_categorie`
--

INSERT INTO `presse_categorie` (`created_at`, `id`, `updated_at`, `name`, `description`, `descriptio_en`, `description_fr`, `name_en`, `name_fr`) VALUES
('2024-04-02 12:33:46.000000', 1, '2024-04-02 12:33:46.000000', 'مكتوبة', NULL, NULL, NULL, NULL, NULL),
('2024-04-02 12:33:46.000000', 2, '2024-04-02 12:33:46.000000', 'رقمية', NULL, NULL, NULL, NULL, NULL),
('2024-04-02 12:34:23.000000', 3, '2024-04-02 12:34:23.000000', 'رقمية/مكتوبة', NULL, NULL, NULL, NULL, NULL),
('2024-04-03 12:58:46.000000', 4, '2024-04-03 12:58:52.000000', 'غير متوفر', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `presse_pressecatrgorie`
--

DROP TABLE IF EXISTS `presse_pressecatrgorie`;
CREATE TABLE IF NOT EXISTS `presse_pressecatrgorie` (
  `presse_id` bigint NOT NULL,
  `pressecatrgorie_id` bigint NOT NULL,
  KEY `FKjq9h8cefjywb5f7ux0ywu8279` (`pressecatrgorie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `presse_pressecatrgorie`
--

INSERT INTO `presse_pressecatrgorie` (`presse_id`, `pressecatrgorie_id`) VALUES
(1005, 2),
(1006, 3),
(1007, 3),
(1008, 3),
(1009, 2),
(1010, 1),
(1011, 1),
(1012, 1),
(1015, 1),
(1016, 1),
(1018, 1),
(1019, 1),
(1020, 1),
(1021, 1),
(1022, 1),
(1023, 1),
(1024, 1),
(1025, 1),
(1026, 1),
(1027, 1),
(1013, 1),
(1028, 1),
(1029, 1),
(1030, 2),
(1031, 2),
(1032, 2),
(1033, 2),
(1034, 2),
(1035, 2),
(1036, 2),
(1037, 2),
(1038, 2),
(1039, 2),
(1040, 2),
(1041, 2),
(1042, 2),
(1043, 2),
(1044, 2),
(1045, 2),
(1046, 2),
(1047, 2),
(1048, 2),
(1049, 2),
(1050, 2),
(1051, 2),
(1052, 2),
(1053, 2),
(1054, 2),
(1055, 2),
(1056, 2),
(1057, 2),
(1058, 2),
(1059, 2),
(1060, 2),
(1061, 2),
(1062, 2),
(1063, 2),
(1064, 2),
(1065, 2),
(1066, 2),
(1067, 2),
(1068, 2),
(1069, 2),
(1070, 2),
(1071, 2),
(1072, 2),
(1073, 2),
(1074, 2),
(1075, 2),
(1076, 1),
(1077, 1),
(1078, 1),
(1079, 1),
(1080, 1),
(1081, 1),
(1082, 1),
(1083, 1),
(1084, 1),
(1085, 1),
(1087, 1),
(1088, 1),
(1090, 1),
(1091, 1),
(1092, 1),
(1093, 1),
(1094, 1),
(1095, 1),
(1096, 1),
(1098, 1),
(1099, 1),
(1100, 1),
(1101, 1),
(1102, 1),
(1103, 1),
(1104, 1),
(1105, 1),
(1106, 1),
(1107, 1),
(1108, 1),
(1109, 1),
(1110, 1),
(1111, 1),
(1112, 1),
(1113, 1),
(1114, 1),
(1115, 1),
(1116, 1),
(1117, 1),
(1118, 1),
(1005, 2),
(1006, 3),
(1007, 3),
(1008, 3),
(1009, 2),
(1010, 1),
(1011, 1),
(1012, 1),
(1015, 1),
(1016, 1),
(1018, 1),
(1019, 1),
(1020, 1),
(1021, 1),
(1022, 1),
(1023, 1),
(1024, 1),
(1025, 1),
(1026, 1),
(1027, 1),
(1013, 1),
(1028, 1),
(1029, 1),
(1030, 2),
(1031, 2),
(1032, 2),
(1033, 2),
(1034, 2),
(1035, 2),
(1036, 2),
(1037, 2),
(1038, 2),
(1039, 2),
(1040, 2),
(1041, 2),
(1042, 2),
(1043, 2),
(1044, 2),
(1045, 2),
(1046, 2),
(1047, 2),
(1048, 2),
(1049, 2),
(1050, 2),
(1051, 2),
(1052, 2),
(1053, 2),
(1054, 2),
(1055, 2),
(1056, 2),
(1057, 2),
(1058, 2),
(1059, 2),
(1060, 2),
(1061, 2),
(1062, 2),
(1063, 2),
(1064, 2),
(1065, 2),
(1066, 2),
(1067, 2),
(1068, 2),
(1069, 2),
(1070, 2),
(1071, 2),
(1072, 2),
(1073, 2),
(1074, 2),
(1075, 2),
(1076, 1),
(1077, 1),
(1078, 1),
(1079, 1),
(1080, 1),
(1081, 1),
(1082, 1),
(1083, 1),
(1084, 1),
(1085, 1),
(1087, 1),
(1088, 1),
(1090, 1),
(1091, 1),
(1092, 1),
(1093, 1),
(1094, 1),
(1095, 1),
(1096, 1),
(1098, 1),
(1099, 1),
(1100, 1),
(1101, 1),
(1102, 1),
(1103, 1),
(1104, 1),
(1105, 1),
(1106, 1),
(1107, 1),
(1108, 1),
(1109, 1),
(1110, 1),
(1111, 1),
(1112, 1),
(1113, 1),
(1114, 1),
(1115, 1),
(1116, 1),
(1117, 1),
(1118, 1);

-- --------------------------------------------------------

--
-- Structure de la table `radio`
--

DROP TABLE IF EXISTS `radio`;
CREATE TABLE IF NOT EXISTS `radio` (
  `complexe_id` bigint DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `categorie` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `localisation` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `streaminglink` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `website` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `adresse_en` text COLLATE utf8mb4_general_ci,
  `adresse_fr` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKisi1wxcawcfe4irb6mdvwp1mt` (`complexe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2067 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `radio`
--

INSERT INTO `radio` (`complexe_id`, `created_at`, `id`, `updated_at`, `adresse`, `categorie`, `email`, `fax`, `localisation`, `name`, `phone`, `streaminglink`, `type`, `website`, `description`, `adresse_en`, `adresse_fr`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
(4, '2024-04-23 15:59:59.000000', 1996, '2024-10-06 14:44:55.496980', '21 شارع الشهداء الجزائر العاصمة', 'national', 'chaine1@radioalgerie.dz', '021 69 12 19', '21 شارع الشهداء الجزائر العاصمة', 'الإذاعة الجزائرية القناة الأولى ', '021 69 12 19', 'https://webradio.tda.dz/Bouira_64K.mp3', 'public', 'my.radioalgerie.dz/chaine1', 'قناة الجزائر الأولى هي محطة إذاعية جزائرية عامة للتعبير العربي وهي جزء من الإذاعة الجزائرية. ويقدم كل يوم ثلاثين لقاء من الخدمات الإعلامية والإنتاجية والرياضية.', NULL, NULL, '', 'Canal Algérie 1 est une station de radio publique algérienne d\'expression arabe, considérée comme une partie intégrante de la radio algérienne. Cette chaine assure quotidiennement une trentaine de rendez-vous des services médiatiques, productifs et sportifs', '', 'Chaine 1'),
(4, '2024-04-24 10:28:58.000000', 1998, '2024-10-06 14:45:41.815284', '21 شارع الشهداء الجزائر العاصمة', 'national', 'chaine2@radioalgerie.dz', '023 50 03 01', '21 شارع الشهداء الجزائر العاصمة', ' الإذاعة الجزائرية القناة الثانية', '023 50 03 01', 'https://my.radioalgerie.dz/player/chaine2.html', 'public', 'https://my.radioalgerie.dz/ar/chaine2', '.هي محطة إذاعية جزائرية تبث باللغة الأمازيغية', NULL, NULL, '', 'Une station de radio algérienne d’expression berbère (Amazigh)', '', 'chaine2'),
(4, '2024-04-24 10:39:47.000000', 1999, '2024-10-06 14:46:33.243372', '21 شارع الشهداء الجزائر العاصمة', 'national', 'chaine3@radioalgerie.dz', '021 48 15 15', '21 شارع الشهداء الجزائر العاصمة', 'الإذاعة الجزائرية القناة الثالثة', '021 48 15 15', 'https://my.radioalgerie.dz/player/chaine3.html', 'public', 'https://my.radioalgerie.dz/ar/chaine3', 'هي محطة إذاعية جزائرية تبث برامجها باللغة الفرنسية.', NULL, NULL, '', 'Une station de radio algérienne d’expression française.', '', 'chaine3'),
(4, '2024-04-24 10:45:28.000000', 2000, '2024-10-06 14:49:42.340404', '21 شارع الشهداء الجزائر العاصمة', 'national', 'radioalgerie@gmail.com', '023 50 03 01', '21 شارع الشهداء الجزائر العاصمة', 'إذاعة الجزائر الدولية', '023 50 03 01', 'https://my.radioalgerie.dz/player/rai.html', 'public', 'https://my.radioalgerie.dz/ar/rai', 'إذاعة الجزائر الدولية هي إذاعة جزائرية بدأت بث برامجها في 19 مارس 2007، وتبث برامجها يومياً من منتصف النهار وحتى منتصف الليل بتوقيت الجزائر، مستخدمة الموجة القصيرة محليا، في حين تتوجه إلى البلدان العربية عبر القمرين الصناعيين عربسات ونايل سات، وللدول الأفريقية عبر قمر إن إن إس 7، ولأوروبا عبر قمر هوتبيرد، وأميركا الشمالية عبر غالاكسي. وتعتمد الإذاعة العربية كلغة رئيسية للتواصل، إضافة إلى بثها باللغات الفرنسية والإنجليزية والإسبانية، تبث إذاعة الجزائر الدولية برامج إخبارية متنوعة، سياسية واقتصادية ورياضية إلى جانب تحاليل وطنية ودولية..', NULL, NULL, '', 'Radio Algérie Internationale est une radio algérienne qui a commencé à diffuser ses programmes le 19 mars 2007, elle propose une programmation quotidienne diffusant ses contenus de midi à minuit, heure d\'Algérie. Elle émet sur ondes courtes localement, tout en atteignant les pays arabes via les satellites Arabsat et Nilesat, et les pays africains via le satellite NN S7, l\'Europe par le satellite Hotbird et l\'Amérique du Nord via Galaxy. Radio Algérie utilise la langue arabe comme langue principale de communication, par ailleurs au français, à anglais et à l’espagnol. Radio Algérie Internationale propose une variété de programmes couvrant l\'information, la politique, l’économie et le sport, tout en offrant des analyses nationales et internationales. ', '', 'Radio Algérie Internationale '),
(4, '2024-04-24 10:50:55.000000', 2001, '2024-10-06 14:51:53.709663', '2 شارع فريد زويوش، القبة، الجزائر العاصمة، الجزائر', 'national', 'radiocoran2022@gmail.com', '023 70 90 12', '2 شارع فريد زويوش، القبة، الجزائر العاصمة، الجزائر', 'إذاعة القرآن الكريم', '023 70 90 12', 'https://my.radioalgerie.dz/player/coran.html', 'public', 'https://my.radioalgerie.dz/coran', 'إذاعة القرآن الكريم هي إذاعة جزائرية تقوم بتقديم برامج دينية مختلفة كالدروس و المواعظ تلاوات للقرآن الكريم', NULL, NULL, '', 'Radio Coran est une radio algérienne dédiée à la diffusion de divers programmes religieux, proposant des cours, des sermons et des récitations du Saint Coran.', '', 'Radio Coran '),
(4, '2024-04-24 11:08:28.000000', 2002, '2024-10-06 14:53:12.921373', '21 شارع الشهداء الجزائر العاصمة', 'national', 'radioalgerie@gmail.com', '023 50 03 01', '21 شارع الشهداء الجزائر العاصمة', 'الإذاعة الثقافية', '023 50 03 01', 'https://my.radioalgerie.dz/player/culture.html', 'public', 'https://my.radioalgerie.dz/ar/culture', 'الإذاعة الثقافية هي إذاعة جزائرية وكما يدل اسمها تقوم بتقديم برامج وحصص تثقيفية متنوعة.', NULL, NULL, '', 'Radio Culture est une radio algérienne, qui, comme son nom l\'indique, se consacre à la diffusion de programmes et de cours éducatifs variés.', '', 'Radio Culture'),
(4, '2024-04-24 11:13:01.000000', 2003, '2024-10-06 14:54:11.562940', '12 شارع شكسبير المرادية 16209', 'local', 'jilfm@algerian-radio.dz', '023 47 37 37', '12 شارع شكسبير المرادية 16209', 'جيل أف أم', '023 47 37 37', 'https://my.radioalgerie.dz/player/jilfm.html ', 'public', ' https://my.radioalgerie.dz/ar/jilfm', 'جيل أف أم هي إذاعة محلية بالجزائر تبث برامجها باللغة العربية وباللغة الفرنسية ', NULL, NULL, '', 'Jil FM est une station de radio locale algérienne qui propose une programmation variée en arabe et en français.', '', 'Jil FM'),
(4, '2024-04-24 11:15:44.000000', 2004, '2024-10-06 14:56:36.364081', '02 شارع فريد زوياش القبة، القبة، الجزائر العاصمة، الجزائر', 'national', 'radioalgerie@gmail.com', '023 70 90 90', '02 شارع فريد زوياش القبة، القبة، الجزائر العاصمة، الجزائر', 'إذاعة البهجة', '023 70 90 90', 'https://my.radioalgerie.dz/player/bahdja.html', 'public', 'https://my.radioalgerie.dz/ar/bahdja', 'إذاعة البهجة هي إذاعة الجزائريين المفضلة. تبث الإذاعة برامجها من العاصمة الجزائرية و هي برامج متنوعة ذات نوعية جيدة و راقية تلقى الإعجاب و الإستماع لدى العديد من المستمعين الجزائريين', NULL, NULL, '', 'Radio Al Bahja est la radio préférée des Algériens. Emettant depuis la capitale algérienne, elle offre une programmation diversifiée, reconnue pour sa qualité exceptionnelle, en plus de séduire un grand nombre d’auditeurs algériens.', '', 'Radio Al Bahja '),
(4, '2024-04-24 11:18:34.000000', 2005, '2024-10-06 14:57:36.150038', '21 شارع الشهداء الجزائر العاصمة', 'national', 'radioalgerie@gmail.com', '023 50 03 01', '21 شارع الشهداء الجزائر العاصمة', 'زمان FM', '023 50 03 01', 'https://my.radioalgerie.dz/player/zamanfm.html', 'public', 'https://my.radioalgerie.dz/ar/zamanfm', 'زمان راديو إف إم\" تعنى بتثمين وتعريف المستمعين بالحصص و البرامج الإذاعية ', NULL, NULL, '', 'Radio Zaman FM s’engage à valoriser et à faire découvrir à ses auditeurs des cours et des programmes radiophoniques.', '', 'Radio Zaman FM'),
(4, '2024-04-24 11:33:53.000000', 2006, '2024-10-06 14:43:09.338483', 'شارع الشهيد سعيدي 309 تيليلان 01000 أدرار، الجزائر.', 'local', 'radioadrar2017@gmail.com', '049 36 89 03', 'شارع الشهيد سعيدي 309 تيليلان 01000 أدرار، الجزائر.', ' 01-أدرار', '049 36 89 03', 'https://static.infomaniak.ch/infomaniak/radio/html/ufc_player.html', 'public', 'https://radioalgerie.dz/player/fr/content/ufc', 'إذاعة أدرار هي إذاعة محلية تبث من منطقة أدرار بالجزائر منذ سنة 1995. تقترح العديد من البرامج الإخبارية و الثقافية و الترفيهية. تحضى باستحسان العديد من المستمعين و خاصة من تلك الجهة', NULL, NULL, '', 'Radio Adrar est une radio locale émettant depuis 1995 dans la région d’Adrar en Algérie. Elle propose une programmation variée alliant information, culture et divertissement. Elle jouit notamment d’une bonne réputation auprès des auditeurs locaux. ', '01-ADRAR', '01-ADRAR'),
(4, '2024-04-24 11:39:35.000000', 2007, '2024-10-06 14:43:44.628249', 'الشلف، الجزائر', 'local', 'radiochlef2018@gmail.com', '027 77 48 63', 'الشلف، الجزائر', '02-الشلف', '027 77 78 32', 'https://my.radioalgerie.dz/player/chlef.html', 'public', 'https://radioalgerie.dz/player/ar/live/02-Chlef', 'إذاعة الشلف هي إذاعة جزائرية محلية من الشلف تقترح العديد من البرامج الإخبارية و الثقافية و الموسيقية التي تشد اهتمام العديد من المستمعين و المستمعات و خاصة من تلك الجهة .', NULL, NULL, '', 'Radio Chlef est une radio algérienne locale basée à Chlef, qui offre une riche palette de programmes d\'information, culturels et musicaux, suscitant un vif intérêt parmi les auditeurs notamment de cette région, hommes et femmes confondues. ', '02-Chlef', '02-Chlef'),
(4, '2024-04-24 11:51:37.000000', 2008, '2024-10-06 14:44:26.568519', 'الأغواط، الجزائر', 'local', 'elguoual@yahoo.fr', '029 14 53 86', 'الأغواط، الجزائر', '03-الأغواط', '029 14 51 56', 'https://my.radioalgerie.dz/player/laghouat.html', 'public', 'https://radioalgerie.dz/player/ar/live/03-Laghouat', 'إذاعة الأغواط هي إذاعة جزائرية محلية تخصص محتوى برامجها لاكتشاف و نشر التراث و الثقافة الجزائرية و العادات و التقاليد الخاصة بالجزائر و تلك الجهة خصوصا .', NULL, NULL, '', 'Radio Laghouat est une radio locale algérienne dédiée à la valorisation du patrimoine et de la culture algérienne, ses programmes mettent en lumière les coutumes et les traditions tant au niveau national qu’au niveau régional.', '03-Aghouate', '03-Aghouate'),
(4, '2024-04-24 11:56:12.000000', 2009, '2024-10-06 14:46:27.030501', 'شارع هواري بومدين ام بواغي', 'local', 'radiooumelbouaghi@gmail.com', '032 54 12 22', 'شارع هواري بومدين ام بواغي', '04-أم البواقي', '032 54 12 15', 'https://my.radioalgerie.dz/player/oumelbouaghi.html', 'public', 'radioalgerie.dz/player/fr/live/04-Oum-Bouaghi', 'إذاعة أم البواقي هي إذاعة محلية جزائرية تقدم لمستمعيها العديد من البرامج الإخبارية و الثقافية و ذلك منذ سنة 2008. تلاقي هذه الإذاعة استحسان العديد من المستمعين لما تحتويه برامجها من دقة و مصداقية.', NULL, NULL, '', 'Radio Oum El Bouaghi est une radio locale algérienne qui propose à ses auditeurs de nombreux programmes d\'information et de culture, active depuis 2008. Elle se distingue par la précision et la crédibilité de ses programmes ce qui lui a valu l’accueil d’un grand nombre d’auditeurs.', '04-Om al-Bawaqi', '04-Om al-Bawaqi'),
(4, '2024-04-24 12:01:46.000000', 2010, '2024-10-06 14:47:01.515700', 'باتنة', 'local', 'radiobatna05@gmail.com', '033 80 70 08', 'باتنة', '05-باتنة', '033 80 52 46', 'https://my.radioalgerie.dz/player/batna.html', 'public', 'https://radioalgerie.dz/player/ar/live/05-Batna', 'إذاعة باتنة هي إذاعة جزائرية محلية تبث من منطقة الأوراس الجزائرية و هي إذاعة مهمة لدى المستمعين في تلك المنطقة إذ أنها تقدم برامج متنوعة إخبارية و ثقافية و ترفيهية و تلعب دورا هاما في ربط المنطقة بالعالم الخارجي', NULL, NULL, '', 'Radio Batna est une radio algérienne locale émettant depuis la région algérienne des Aurès. Elle propose divers programmes d’information, de culture et de divertissement, jouant le rôle de parcelle entre la région et le monde extérieur, ce qui la rend importante aux yeux de son auditoire.', '05-Batna', '05-Batna'),
(1, '2024-04-24 12:04:30.000000', 2011, '2024-10-06 14:53:16.420033', 'نهج يوسف بوشباح، (06) بجاية / بجاية، 06000', 'local', 'soummam6@gmail.com', '034 21 29 90', 'نهج يوسف بوشباح، (06) بجاية / بجاية، 06000', '06-بجاية', '034 21 99 98 ', 'https://my.radioalgerie.dz/player/bejaia.html', 'public', 'https://radioalgerie.dz/player/ar/live/06-Bejaia', 'أذاعة بجاية هي إذاعة محلية جزائرية تبث منذ 1996. تبث برامجها باللغة الأمازيغية. تقترح العديد من البرامج الثقافية و الإخخبارية لتنقل الأحداش و المستجدات لمستمعي المنطقة كما تخصص فقرات موسيقية تبث خلالها العديد من المقاطع الموسيقية المحلية و العالمية .', NULL, NULL, '', 'Radio Bejaia est une radio locale algérienne qui émet depuis 1996, d’expression berbère (Amazigh). Elle offre de nombreux programmes culturels et d\'information visant à tenir ses auditeurs régionaux informés des événements et de l’actualité. Elle consacre également des émissions musicales à la diffusion de clips musicaux locaux et internationaux', '06-Bejia', '06-Bejia'),
(1, '2024-04-24 12:06:41.000000', 2012, '2024-10-06 14:54:27.202665', 'بسكرة، الجزائر', 'local', 'toptenonairbiskra@gmail.com', '033 73 18 50', 'بسكرة، الجزائر', '07-بسكرة', '033 73 11 07', 'https://my.radioalgerie.dz/player/biskra.html', 'public', 'https://radioalgerie.dz/player/ar/live/07-Biskra', 'إذاعة بسكرة هي إذاعة محلية شبابية جزائرية تبث موجاتها منذ 2012. تقترح عليكم برامج ترفيهية و موسيقية يهدفون من خلالها الوصول إلى الكثير من المستمعين و المستمعات من تلك الجهة .', NULL, NULL, '', 'Radio Biskra est une radio locale de jeunesse algérienne qui émet depuis 2012. Elle vous propose des programmes de divertissement et de musique dans l’objectif d’atteindre un grand nombre d’auditeurs régionaux, hommes et femmes, confondues.', '07-Beskra', '07-Beskra'),
(4, '2024-04-24 12:11:18.000000', 2013, '2024-10-06 14:55:36.108155', 'بشار', 'local', 'radioalgerie@gmail.com', '049 21 73 13', 'بشار', '08- بشار', '049 21 68 02  ', 'https://my.radioalgerie.dz/player/bechar.html', 'public', 'https://radioalgerie.dz/player/ar/live/08-Bechar', 'إذاعة بشار الجهوية هي إذاعة جزائرية تقترح العديد من البرامج الجدية و الهادفة. تختلف مواضيعها من الأخبار و السياسة إلى الموسيقى و الترفيه. كما تحضى باهتمام العديد من المستمعين و المستمعات منذ سنة 1991 .', NULL, NULL, '', 'Radio Bechar est une radio algérienne régionale qui, depuis 1991, propose une programmation pertinente et concrète, abordant des thèmes allant de l\'actualité, de la politique à la musique et au divertissement. Elle attire notamment l’attention de nombreux auditeurs et auditrices.', '08- Bachar', '08- Bachar'),
(6, '2024-04-24 12:16:09.000000', 2014, '2024-10-06 14:56:56.078293', 'البليدة، الجزائر', 'local', 'blidafminfo@gmail.com', '025 41.23.04', 'البليدة، الجزائر', '09- البليدة', '025 41.23.04', 'https://my.radioalgerie.dz/player/blida.html', 'public', 'https://radioalgerie.dz/player/ar/live/09-Blida', 'إذاعة البليدة الجزائرية هي إذاعة محلية من الجزائر تبث موجاتها من بليدة الجزائرية. تقترح هذه الإذاعة برامج متنوعة تتناول أخبار الجهة و تنقل المستجدات الإجتماعية و السياسية حينيا كما تقد العديد من الفقرات الترفيهية و الموسيقية التي تنال اعجاب المستمعين', NULL, NULL, '', 'Radio Blida est une radio locale algérienne qui émet depuis Blida. Cette radio propose divers programmes concernant l\'actualité régionale, sociale et politique. Elle présente également de nombreuses émissions de divertissement et musicaux qui captivent son auditoire.  ', '09 -Blida', '09 -Blida'),
(6, '2024-04-24 12:19:29.000000', 2015, '2024-10-06 14:59:33.900520', 'عمروش مولود البويرة، البويرة، الجزائر', 'local', '	radioalgerie@gmail.com', '026 94 17 98', 'عمروش مولود البويرة، البويرة، الجزائر', '10- البويرة', '026 94 18 55 ', 'https://my.radioalgerie.dz/player/bouira.html', 'public', 'https://radioalgerie.dz/player/ar/live/10-Bouira', 'إذاعة البويرة هي الإذاعة المحلية لولاية البويرة الجزائرية. تقع ولاية البويرة شمال الجزائر و تبعد مائة كلم عن العاصمة الجزائرية. تتخصّص الإذاعة بنقل الأخبار المحليّة و الجهويّة, و تبث أيضا برامج ثقافيّة و ترفيهيّة تلاقي رضاء المستمعين, إذ تشهد الإذاعة أكثر من أربعة آلاف مستمع يوميّا| ', NULL, NULL, '', 'Radio Bouira est une radio locale sise à Bouira. La wilaya de Bouira se situe au nord de l\'Algérie, à 100 km de la capitale algérienne. La radio est spécialisée dans la transmission d\'informations locales et régionales et diffuse également des programmes culturels et de divertissement qui répondent aux attentes de ses auditeurs. Elle accueille quotidiennement plus de quatre mille auditeurs.', '10 - Bouira', '10 - Bouira'),
(6, '2024-04-24 12:23:26.000000', 2016, '2024-10-06 15:00:57.847297', 'تمنراست، الجزائر', 'local', 'radioahaggar@gmail.com', '029 32 03 03', 'تمنراست، الجزائر', '11- تمنراست', '029 32 01 37  ', 'https://my.radioalgerie.dz/player/tamanrasset.html', 'public', 'https://radioalgerie.dz/player/ar/live/11-Tamenrasset', 'إذاعة تمنراست هي إذاعة محلية تابعة لمجموعة الإذاعات الرسمية الجزائرية. هي إذاعة محلية تقترح على مستمعيها العديد من البرامج الإخبارية تتناول السياسة و الرياضة و الترفيه و أيضا الموسيقى. تنال هذه اعجاب العديد من المستمعين من تلك الجهة', NULL, NULL, '', 'Radio Tamanrasset est une radio locale relevant du groupe radios algériennes, offrant à ses auditeurs de nombreux programmes d\'information couvrant la politique, le sport, le divertissement, et notamment la musique. Cette diversité de contenus est particulièrement appréciée par de nombreux auditeurs de la région.', '11- Tamanrasset', '11- Tamanrasset'),
(6, '2024-04-24 12:31:30.000000', 2017, '2024-10-06 15:02:45.996362', 'مدينة 200 وحدة سكنية تبسة الجزائر', 'local', 'tebessa.radiofm@gmail.com', '037 48 43 43', 'مدينة 200 وحدة سكنية تبسة الجزائر', '12- تبسة', '037 48 15 21  ', 'https://my.radioalgerie.dz/player/tebessa.html', 'public', 'https://radioalgerie.dz/player/ar/live/12-Tebessa', 'إذاعة تبسة هي إذاعة محلية جزائرية تبث موجاتها على مدار الساعة. تقترح عليكم العديد من البرامج الإخبارية و الثقافية. تنال هذه الإذاعة استحسان الكثير من المستمعين و خاصة من تلك الجهة حيث يجدون في هذه البرامج ما يشد اهتمامهم', NULL, NULL, '', 'Radio Tebessa est une radio locale algérienne qui émet 24 heures sur 24. Nous vous proposons de nombreux programmes d\'information et culturels. Très appréciée par de nombreux auditeurs, notamment ceux de la région, elle parvient à éveiller leur intérêt avec des contenus pertinents. ', '12-Tebessa ', '12-Tébessa '),
(6, '2024-04-24 12:34:12.000000', 2018, '2024-10-06 15:03:59.702242', 'تلمسان، الجزائر', 'local', 'radio.tlemcen@yahoo.com', '043 41 74 00', 'تلمسان، الجزائر', '13- تلمسان', '043 41 74 02  ', 'https://my.radioalgerie.dz/player/tlemcen.html', 'public', 'https://radioalgerie.dz/player/ar/live/13-Tlemcen', 'إذاعة تلمسان هي إذاعة جهوية جزائرية من تلمسان. تقترح هذه الإذاعة العديد من البرامج المتنوعة المحتوى تتناول من خلالها الأخبار المحلية و الوطنية و تعالج مشاكل الجهة كما تقدم أيضا لمستمعيها برامج ثقافية و ترفيهية.', NULL, NULL, '', 'Radio Tlemcen est une radio régionale algérienne située à Tlemcen. Cette radio propose de nombreux programmes aux contenus diversifiés traitant l’actualité locale et nationale tout en se penchant sur les problématiques de la région. Radio Tlemcen offre également à ses auditeurs des programmes culturels et de divertissement.', '13- Tlemcen', '13- Tlemcen'),
(6, '2024-04-24 12:37:30.000000', 2019, '2024-10-06 15:05:06.722184', 'ساحة محمد بوضياف , Tiaret, Algeria', 'local', 'socialmedia@radiotiaret.net', '046 41 62 27', 'ساحة محمد بوضياف , Tiaret, Algeria', '14-تيارت', '046 41 62 34', 'https://my.radioalgerie.dz/player/tiaret.html', 'public', 'https://radioalgerie.dz/player/ar/live/14-Tiaret', 'إذاعة تيارت هي إذاعة محلية جزائرية تبث برامج متنوعة باللغة العربية. تقترح برامج متنوعة تتناول الأخبار الإجتماعية و السياسية و الرياضية للتباحثها مع المستمعين لتفتح لهم الباب لابداء آراءهم ', NULL, NULL, '', 'Radio Tiaret est une radio locale algérienne qui diffuse divers programmes en langue arabe. Elle offre des émissions sur l\'actualité sociale, politique et sportive favorisant l’interaction avec les auditeurs en leur permettant d’exprimer leurs opinions. ', '14- Tiaret', '14- Tiaret'),
(6, '2024-04-24 12:47:22.000000', 2020, '2024-10-06 15:06:21.270667', 'شارع الشيخي عمار، تيزي وزو، الجزائر', 'local', 'radiotiziouzou15@gmail.com', '026 22 90 39', 'شارع الشيخي عمار، تيزي وزو، الجزائر', '15-تيزي وزو', '026 22 90 39', 'https://my.radioalgerie.dz/player/tiziouzou.html', 'public', 'https://radioalgerie.dz/player/ar/live/15-Tizi-Ouzou', 'إذاعة تزي وزو هي إذاعة محلية جزائرية مشهورة خاصة في تلك الجهة. تقترح برامج إخبارية و ثقافية جدية تلقى اهتماما كبيرا خاصة من الشباب الذي يجد من خلالها مصدرا موثوقا للمعلومات و الأخبار .', NULL, NULL, '', 'Radio Tizi Ouzou est une radio locale algérienne, reconnue pour sa réputation dans la région. Elle propose des programmes d\'information et culturels de qualité suscitant un vif intérêt, notamment parmi les jeunes, qui y découvrent une source fiable d\'informations et d\'actualités.', '15- Tizi Ouzou', '15- Tizi Ouzou'),
(6, '2024-04-24 12:58:33.000000', 2021, '2024-10-06 15:08:18.490066', 'حي الفلاح ص.ب 117, الجلفة, الجزائر', 'local', 'contact@radioalgerie.dz', '027 87 61 72', 'حي الفلاح ص.ب 117, الجلفة, الجزائر', '17- الجلفة', '027 87 41 41 ', 'https://my.radioalgerie.dz/player/djelfa.html', 'public', 'https://radioalgerie.dz/player/ar/live/17-Djelfa', 'إذاعة الجلفة هي إذاعة جزائرية محلية من الجلفة. تبث هذه الإذاعة برامج مختلفة باللغة العربية تتناول من خلالها العديد من المواضيع التي تهم المستمعين و خاصة من تلك الجهة كما تقترح فقرات موسيقية و ترفيهية .', NULL, NULL, '', 'Radio Djelfa est une radio locale algérienne située à Djelfa. Elle diffuse une variété de programmes en langue arabe abordant de nombreux sujets qui suscitent particulièrement l\'intérêt des auditeurs, de cette région. Elle propose également des émissions musicales et de divertissement.', '17- Djelfa', '17- Djelfa'),
(4, '2024-04-24 13:03:42.000000', 2022, '2024-10-06 15:09:10.818436', 'جيجل، الجزائر', 'local', 'contact@radioalgerie.dz', '034 49 55 66', 'جيجل، الجزائر', '18- جيجل ', '034 49 84 37 ', 'https://my.radioalgerie.dz/player/jijel.html', 'public', 'https://radioalgerie.dz/player/ar/live/18-Jijel', 'إذاعة الجيجل هي إذاعة جزائرية جهوية تقترح برامج متنوعة و ثرية المحتوى موجهة لجميع الشرائح العمرية للمستمعين و خاصة من تلك الجهة فهي تبث برامج إخبارية ترفيهية و موسيقية لتناسب جميع الأذواق و الخيارات ', NULL, NULL, '', 'Radio Jijel est une radio régionale algérienne qui propose des programmes diversifiés et des contenus riches s’adressant à tous les groupes d\'âge, en particulier ceux de la région. Elle diffuse des programmes d\'information, de divertissement et de musique répondant ainsi à une multitude de goûts et de préférences.', '18 - Jijel', '18 - Jijel'),
(NULL, '2024-04-24 14:25:44.000000', 2029, '2024-10-06 15:10:26.689855', 'سطيف الجزائر .', 'local', 'infos.radiosetif@gmail.com', '036 51 40 93', 'سطيف الجزائر .', '19- سطيف', '036 51 44 55 ', 'https://my.radioalgerie.dz/player/setif.html	', 'public', 'https://radioalgerie.dz/player/ar/live/19-Setif', 'إذاعة سطيف هي إذاعة جهوية جزائرية تبث برامج من سطيف منذ 1992. تحتوي برامجها على العديد من المواضيع الحساسة و التي تهم العديد من المستمعين و خاصة من تلك الجهة كما تبث أيضا برامج ترفيهية و موسيقية تلاقي استحسان المستمعين', NULL, NULL, '', 'Radio Sétif est une radio régionale algérienne qui émet depuis Sétif depuis 1992. Elle propose des programmes abordant de nombreux sujets sensibles qui captivent un large auditoire, notamment dans la région. Elle diffuse également des programmes de divertissement et musicaux appréciés par ses auditeurs.', '19 -Setif', '19 -Sétif'),
(NULL, '2024-04-24 14:34:16.000000', 2030, '2024-10-06 15:11:32.384649', '04 شارع الاستقلال - المركز الثقافي سابقا , سعيدة، الجزائر', 'local', 'radiosaida@gmail.com.', '048 41 18 24 ', '04 شارع الاستقلال - المركز الثقافي سابقا , سعيدة، الجزائر', '20- سعيدة', '048411820', 'https://my.radioalgerie.dz/player/saida.html', 'public', 'https://radioalgerie.dz/player/ar/live/20-Saida', 'إذاعة سعيدة الجزائرية هي إذاعة محلية تبث برامجها باللغة العربية و ذلك من الساعة السابعة صباحا إلى الساعة الثامنة ليلا. تقترح هذه الإذاعة العديد من البرامج الثقافية و الإخبارية كما تقدم فقرات موسيقية و ترفيهية .', NULL, NULL, '', 'Radio Saida Algérie est une radio locale qui diffuse ses programmes en arabe, et ce, de sept heures du matin à huit heures du soir. Cette radio propose de nombreux programmes culturels et d\'information et propose également des émissions musicales et de divertissement.', '20 -Saida, Algeria', '20 - Saida, Algeria'),
(NULL, '2024-04-24 14:47:29.000000', 2031, '2024-10-06 15:12:29.159974', 'حي باب الاوراس سكيكدة 21000، سكيكدة، الجزائر', 'local', 'Skikdafmskikda@gmail.com', '038 75 77 55', 'حي باب الاوراس سكيكدة 21000، سكيكدة، الجزائر', '21- سكيكدة', '038 75 77 54 ', 'https://my.radioalgerie.dz/player/skikda.html', 'public', 'https://radioalgerie.dz/player/ar/live/21-Skikda', 'إذاعة سكيكدة هي إذاعة محلية جزائرية من سكيكدة. هي إذاعة إخبارية تأخذ على عاتقها نقل الأخبار للمستمعين حينيا و تفسح لهم المجال في التعبير عن آراءهم و مشاغلهم. كما تقترح فقرات ترفيهية و موسيقية .', NULL, NULL, '', 'Radio Skikda est une radio locale algérienne située à Skikda. Dédiée à l\'information, elle s\'engage à transmettre quotidiennement l\'actualité aux auditeurs tout leur offrant un espace pour exprimer leurs opinions et leurs préoccupations. Radio Skikda suggère également des émissions de divertissement et de musique.', '21 -Skikda', '21 -Skikda'),
(NULL, '2024-04-24 14:51:49.000000', 2032, '2024-10-06 15:13:29.028356', 'شارع بنديدة محمد، سيدي بلعباس 22002', 'local', 'radiosbainfo@gmail.com', '048 55 85 01', 'شارع بنديدة محمد، سيدي بلعباس 22002', ' 22 - سيدي بلعباس', '048 55 23 23 ', 'https://my.radioalgerie.dz/player/sidibelabbes.html', 'public', 'https://radioalgerie.dz/player/ar/live/22-Sidi-Bel-Abbes', 'إذاعة بلعباس الجزائرية هي إذاعة محلية تبث برامج إخبارية ثقافية و رياضية. تحاول من خلال هذه البرامج الإستماع إلى مشاغل شعب الجهة و تتطرحها للتحاليل العلمية و الاجتماعية. كما تقدم أيضا فقرات ترفيهية و موسيقية تناسب جميع الأذواق', NULL, NULL, '', 'Radio Bel-Abbès est une station locale algérienne qui diffuse des programmes d\'information, culturels et sportifs. Elle s’engage, à travers ses émissions, à prendre en compte les préoccupations de la population locale et de les analyser sous des perspectives scientifiques et sociales. En outre, Radio Bel-Abbès propose également des émissions de divertissement et de musique, adaptés à tous les goûts, enrichissant ainsi l\'expérience de ses auditeurs.', '22 - Sidi Bel Abbes', '22 - Sidi Bel Abbes'),
(4, '2024-04-24 14:54:52.000000', 2033, '2024-10-06 15:14:41.302727', 'شارع باجي مختار عنابة', 'local', 'annabafm@gmail.com', '038 40 54 90', 'شارع باجي مختار عنابة', '23 - عنابة', '038-40-53-53 ', 'https://my.radioalgerie.dz/player/annaba.html', 'public', 'https://radioalgerie.dz/player/ar/live/23-Annaba', 'تأسست إذاعة عنابة المحلية سنة 1997 و هي إذاعة جزائرية تبث برامجها من السابعة صباحا إلى الثامنة مساءا. تقدم برامج متنوعة تتناول العديد من المواضيع التي تشد اهتمام الكثير من المستمعين و المستمعات .', NULL, NULL, '', 'Radio Annaba a été créée en 1997 et est une radio algérienne locale qui émet de sept heures du matin à huit heures du soir. Elle propose divers programmes abordant de nombreux thématiques qui suscitent l’intérêt de nombreux auditeurs et auditrices. Radio Guelma est une radio algérienne qui émet depuis la région de Guelma. Elle propose une variété d’émissions destinées à ses auditeurs fidèles, notamment ceux de la région, dans l’objectif de mettre en lumière leurs problèmes et de proposer des solutions pratiques.', '23 - Annaba', '23 - Annaba'),
(NULL, '2024-04-24 14:58:26.000000', 2034, '2024-10-06 15:16:03.691336', 'التكنولوجيا بومعزة قالمة 24000', 'local', 'kalamafm@gmail.com', '037 14 31 75', 'التكنولوجيا بومعزة قالمة 24000', '24- قالمة', '037 14 31 30 ', 'https://my.radioalgerie.dz/player/guelma.html', 'public', 'https://radioalgerie.dz/player/ar/live/24-Guelma', 'إذاعة قالمة المحلية هي إذاعة جزائرية تبث موجاتها من جهة قالمة. تقترح العديد من البرامج المتنوعة و التي تتوجه بها نحو مستمعيها و مستمعاتها الأوفياء و خاصة من تلك الجهة حتى تحاول طرح مشاكلهم إيجاد حلول عملية لها.', NULL, NULL, '', 'Radio Guelma est une radio algérienne qui émet depuis la région de Guelma. Elle propose une variété d’émissions destinées à ses auditeurs fidèles, notamment ceux de la région, dans l’objectif de mettre en lumière leurs problèmes et de proposer des solutions pratiques.', '24 - Guelma ', '24 - Guelma '),
(NULL, '2024-04-24 14:58:32.000000', 2035, '2024-10-06 15:30:14.577770', 'التكنولوجيا بومعزة قالمة 24000', 'local', 'kalamafm@gmail.com', '037 14 31 75', 'التكنولوجيا بومعزة قالمة 24000', '24- قالمة', '037 14 31 30 ', 'https://my.radioalgerie.dz/player/guelma.html', 'public', 'https://radioalgerie.dz/player/ar/live/24-Guelma', 'إذاعة قالمة المحلية هي إذاعة جزائرية تبث موجاتها من جهة قالمة. تقترح العديد من البرامج المتنوعة و التي تتوجه بها نحو مستمعيها و مستمعاتها الأوفياء و خاصة من تلك الجهة حتى تحاول طرح مشاكلهم إيجاد حلول عملية لها.', NULL, NULL, '', 'Radio Guelma est une radio algérienne qui émet depuis la région de Guelma. Elle propose une variété d’émissions destinées à ses auditeurs fidèles, notamment ceux de la région, dans l’objectif de mettre en lumière leurs problèmes et de proposer des solutions pratiques.', '24 -Guelma ', '24 -Guelma '),
(NULL, '2024-04-24 15:01:18.000000', 2036, '2024-10-06 15:18:51.602754', '19 شارع بلعيب باب القنطرة 25000', 'local', 'radiocirtafmconstantine@gmail.com', ' 031 88 39 38', '19 شارع بلعيب باب القنطرة 25000', '25- قسنطينة', '031 88 39 36', 'https://my.radioalgerie.dz/player/constantine.html', 'public', 'https://radioalgerie.dz/player/ar/live/25-Constantine', 'هي محطة للتعبير العام وهي جزء من الإذاعة الجزائرية. ويقدم برنامج متنوع من الخدمات والمعلومات. تتكون إذاعة سيدي بلعباس من مجموعة شابة جادة وديناميكية وذات خبرة.', NULL, NULL, '', 'Radio Constantine est une station de radio d\'expression publique intégrée au réseau de la radio algérienne. Elle propose un programme diversifié de services et d\'informations. Radio Constantine est composée d’une équipe jeune, dynamique et expérimentée.', '25 -Constantine', '25 -Constantine'),
(NULL, '2024-04-24 15:11:31.000000', 2037, '2024-10-06 15:20:09.381433', 'المدية، الجزائر', 'local', 'radiotitri@gmail.com', '025 78 50 03', 'المدية، الجزائر', '26- المدية', '025 78 50 29', 'https://my.radioalgerie.dz/player/medea.html', 'public', 'https://radioalgerie.dz/player/ar/live/26-Medea', 'إذاعة المدية هي إذاعة جزائرية محلية تبث موجاتها منذ سنة 2010. تقترح على مستمعيها برامج متنوعة و ثرية ذات محتوى جدي و هادف إلى تنمية حس المواطنة و التقدم في مستمعيها . كما تخصص أيضا برامج تثقيفية للأطفال .', NULL, NULL, '', 'Radio Médéa est une station locale algérienne qui émet depuis 2010. Elle offre à ses auditeurs une programmation diversifiée et enrichissante, axée sur des contenus sérieux visant à promouvoir le sentiment de citoyenneté et de progrès chez ses auditeurs.  En outre, Radio Médéa propose également des programmes éducatifs destinés aux enfants.', '26 -Medea', '26 -Médea'),
(NULL, '2024-04-24 15:13:47.000000', 2038, '2024-10-06 15:21:12.124132', 'يستشهد 5 يوليو مستغانم، مستغانم، الجزائر', 'local', 'contact@radiomostaganem.net', ' 045 41 01 09', 'يستشهد 5 يوليو مستغانم، مستغانم، الجزائر', '27- مستغانم', '045 41 01 77 ', 'https://my.radioalgerie.dz/player/mostaganem.html', 'public', 'https://radioalgerie.dz/player/ar/live/27-Mostaganem', 'إذاعة مستغانم هي إذاعة محلية بولاية مستغانم الجزائرية تبث برامجها باللغة العربية على موجة أف أم انطلق بثها بتاريخ 10 فبراير 2004 حيث تم تدشينها من طرف فخامة الرئيس عبد العزيز بوتفليقة. تقدم هذه الإذاعة العديد من البرامج المتنوعة و الثرية بمحتوى جدي و هادف', NULL, NULL, '', 'Radio Mostaganem est une station locale algérienne, située à Mostaganem. Elle diffuse ses programmes en arabe sur la bande FM. Radio Mostaganem a été inaugurée le 10 février 2004 par son excellence le président Abdelaziz Bouteflika, proposant une large gamme de programmes variés, avec un contenu sérieux et pertinent.', '27 -Mostaganem', '27 -Mostaganem'),
(NULL, '2024-04-24 15:17:33.000000', 2039, '2024-10-06 15:26:45.635162', 'ص.ب 1400 البريد المركزي المسيلة، المسيلة (28)، الجزائر', 'local', 'radiomsila@gmail.com', '035 54 82 32', ' المسيلة ، الجزائر', '28- المسيلة', '035 547414 ', 'https://my.radioalgerie.dz/player/msila.html', 'public', 'https://radioalgerie.dz/player/ar/live/28-M%27sila', 'إذاعة المسيلة المحلية هي إذاعة جزائرية تبث موجاتها منذ سنة 2003 . تقدم الإذاعة برامج متنوعة تتناول من خلالها مواضيع مثيرة للاهتمام كما تقدم فقرات ترفيهية و موسيقية تناسب جميع أذواق المستمعين .', NULL, NULL, '', 'Radio M\'sila est une station algérienne en activité depuis 2003. Elle propose une programmation diversifiée, abordant des sujets captivants, tout en intégrant des émissions de divertissement et de musique qui convient à tous les goûts des auditeurs.', '28 -M\'Sila', '28 -M\'Sila'),
(NULL, '2024-04-24 15:21:19.000000', 2040, '2024-10-06 15:23:08.102651', 'شارع نصر الدين، معسكر.', 'local', 'radiomascara@gmail.com', '045 80 48 95', 'شارع نصر الدين، معسكر.', '29- معسكر', '045 82 54 91', 'https://my.radioalgerie.dz/player/mascara.html', 'public', 'https://radioalgerie.dz/player/ar/live/29-Mascara', 'محطة تعبير عام وهي جزء من الإذاعة الجزائرية. ويقدم برنامج متنوع من الخدمات والمعلومات.', NULL, NULL, '', 'Une station de radio d\'expression publique qui fait partie du réseau des radios algériennes. Elle propose une programmation variée de services et d\'informations.', '29 -Maskar', '29 -Maskar'),
(NULL, '2024-04-24 15:24:35.000000', 2041, '2024-10-06 15:28:50.437750', 'ورقلة الجزائر', 'local', 'radioouargla@gmail.com.', '029 70 88 88', 'ورقلة الجزائر', '30- ورقلة', '029 70 14 14', 'https://my.radioalgerie.dz/player/ouargla.html', 'public', 'https://radioalgerie.dz/player/ar/live/30-Ouargla', 'إذاعة ورقلة هي إذاعة جزائرية محلية تبث برامجها منذ سنة 1995. تقترح على مستمعيها العديد من البرامج الثرية و الغنية بمواضيع هامة و مثيرة تشد انتباه المستمعين و المستمعات خاصة من تلك الجهة.', NULL, NULL, '', 'Radio Ouargla est une station locale algérienne qui émet depuis 1995. Elle propose une vaste gamme d\'émissions riches, traitant de sujets importants et captivants qui attirent l\'attention de son auditoire, hommes et femmes, confondues, en particulier au niveau régional.', '30 -Ouargla', '30 -Ouargla'),
(1, '2024-04-24 15:27:04.000000', 2042, '2024-10-06 15:03:21.536858', '04 مكان عيسى المسعودي وهران، الجزائر.', 'local', 'oranradio@gmail.com', '041 28 17 17', '04 مكان عيسى المسعودي وهران، الجزائر.', '31- وهران', '041 45 21 21 / 45 16 15', 'https://my.radioalgerie.dz/player/oran.html', 'public', 'https://radioalgerie.dz/player/ar/live/31-Oran', 'إذاعة وهران هي من أشهر الإذاعات المحاية الجزائرية فهي تتميز ببرامجها الغنية و الفريدة من نوعها. كما تخصص العديد من الفقرات الموسيقية و الترفيهية التي تنال اعجاب العديد من المستمعين .', NULL, NULL, '', 'Radio Oran est l\'une des stations de radio algériennes les plus reconnues, réputée pour la qualité et la diversité de ses programmes. Elle consacre également une part importante de sa programmation à des émissions musicaux et de divertissement, ce qui lui permet de susciter l\'intérêt d\'un large public d\'auditeurs.', '', 'Radio Oran'),
(6, '2024-04-24 15:32:16.000000', 2043, '2024-10-06 15:04:38.874781', 'شارع رحماني عبد القادر, البيض, الجزائر, 32000.', 'local', ' radiofm.elbayadh@gmail.com', '049 61 37 75', 'شارع رحماني عبد القادر, البيض, الجزائر, 32000.', '32- البيض', '049 61 36 26 ', 'https://my.radioalgerie.dz/player/elbayadh.html', 'public', 'https://radioalgerie.dz/player/ar/live/32-El-Bayadh', 'أذاعة البيض هي إذاعة محلية جزائرية تبث موجاتها من الساعة السابعة صباحا إلى الساعة الثامنة مساء. تخصص برمجياتها لنقل و بث الأخبار المحلية الوطنية و العالمية و إيصالها حينيا للمستمعين الأوفياء لها.', NULL, NULL, '', 'Radio El Bayadh est une station locale algérienne qui émet de sept heures du matin à huit heures du soir. Sa programmation est exclusivement dédiée à la transmission et à la diffusion d\'informations locales, nationales et internationales, à ses fidèles auditeurs.', '', 'Radio El Bayadh'),
(1, '2024-04-24 15:34:49.000000', 2044, '2024-10-06 15:06:04.149809', 'حي الوئام , إليزي, الجزائر', 'local', ' radioillizi33@gmail.com', '029 41 00 06', 'حي الوئام , إليزي, الجزائر', '33- اليزي', '029 41 00 03', 'https://my.radioalgerie.dz/player/illizi.html', 'public', 'https://radioalgerie.dz/player/ar/live/33-Illizi', 'إذاعة إليزي المحلية هي إذاعة جزائرية تبث برامجها على مدار الساعة و باللغة العربية. تقترح برامج متنوعة تتضمن فقرات إخبارية ثقافية ترفيهية و موسيقية لتناسب جميع أذواق المستمعين و تستقطب العديد منهم .', NULL, NULL, '', 'Radio Ilizi est une station locale algérienne qui émet 24 heures sur 24 en langue arabe. Elle propose une programmation variée, incluant des émissions d\'information, des programmes culturels, de divertissement et de musique, afin de répondre à tous les goûts des auditeurs et d\'attirer un large public.', '', 'Radio Ilizi'),
(1, '2024-04-24 15:38:17.000000', 2045, '2024-10-06 15:06:52.450716', 'برج بوعريريج، برج بوعريريج، الجزائر', 'local', 'radiobba@hotmail.fr', '035 74 83 37', 'برج بوعريريج، برج بوعريريج، الجزائر', '34- برج بوعريرج', '035 68 33 22', 'https://my.radioalgerie.dz/player/bordjbouarreridj.html', 'public', 'https://radioalgerie.dz/player/ar/live/34-Bordj-Bou-Arreridj', 'الإذاعة المحلية برج بوعريريج هي إذاعة جزائرية تبث برامجها. تتكون من فريق شبابي جاد و كاد في العمل يسهر على تقديم أرقى البرامج و الفقرات المتنوعة لينال استحسان المستمعين و المستمعات .', NULL, NULL, '', 'Radio Bordj Bou Arreridj est une station algérienne qui émet.  Constituée d\'une équipe jeune et dynamique, qui s\'efforce de proposer des émissions variées et de qualité, visant à satisfaire les attentes de ses auditeurs.', '', 'Radio Bordj Bou Arreridj'),
(NULL, '2024-04-24 15:41:22.000000', 2046, '2024-10-06 15:07:49.782256', 'حي فراتز فانون, بومرداس, الجزائر', 'local', 'radioboumerdes@gmail.com', ' 024 94 14 23', 'حي فراتز فانون, بومرداس, الجزائر', '35- بومرداس', '024 94 10 10 ', 'https://my.radioalgerie.dz/player/boumerdes.html', 'public', 'https://radioalgerie.dz/player/ar/live/35-Boumerdes', 'إذاعة بومرداس المحلية هي إذاعة جزائرية شبابية تقترح العديد من البرامج المتنوعة و الثرية ذات محتوى مثير للاهتمام كما تسمح المجال لمستمعيها للتدخل المباشر و تفتح لهم باب النقاش و الحوار .', NULL, NULL, '', 'Radio Boumerdès est une radio locale algérienne dédiée à la jeunesse, proposant une vaste gamme de programmes variés et enrichissants, axés sur des contenus captivants. Elle permet également à ses auditeurs d\'intervenir directement, créant ainsi un espace de discussion et de dialogue constructif.', '', 'Radio Boumerdès'),
(NULL, '2024-04-24 15:44:59.000000', 2047, '2024-10-06 15:08:54.583406', 'الطارف، الجزائر', 'local', 'contact@radioalgerie.dz', '038 60 05 34', 'الطارف، الجزائر', '36- الطارف', '038 60 20 95', 'https://my.radioalgerie.dz/player/eltarf.html', 'public', 'https://radioalgerie.dz/player/ar/live/36-El-Tarf', 'إذاعة الطارف هي إذاعة محليّة . تهتمّ هذه الإذاعة بنقل الأخبار المحليّة و الوطنيّة كما تخصّص فقرات تثقيفيّة و ترفيهيّة. تضمّ الإذاعة فريق إعداد و تقديم شبابيّ يطرحون خلال برامجهم العديد من المواضيع الجديّة و يفتحون من خلالها باب الحوار و التّعبير في محاولة للاستماع للشّباب و تشريكهم في الحياة السّياسية و الإجتماعية. تلاقي هذه الإذاعة اهتماما كبيرا من المستمعين من جميع الأعمار.', NULL, NULL, '', 'Radio El Taraf est une station de radio locale algérienne dédiée à la diffusion d\'actualités tant locales que nationales. Elle propose également des émissions éducatives et de divertissement. L\'équipe de préparation et de présentation, composée de jeunes professionnels, aborde des thématiques sérieuses et favorise le dialogue, permettant ainsi aux jeunes de s\'exprimer et de participer activement à la vie politique et sociale. Radio El Taraf éveille un intérêt considérable de la part d\'un public de tout âge.', '', 'Radio El Taraf'),
(NULL, '2024-04-24 15:48:43.000000', 2048, '2024-10-06 15:09:49.491154', 'حي البدر تندوف،  الجزائر', 'local', 'radio.tindouf1999@gmail.com', '049 92 34 63', 'حي البدر تندوف، الجزائر', '37- تندوف', '049 92 34 66', 'https://my.radioalgerie.dz/player/tindouf.html', 'public', 'https://radioalgerie.dz/player/ar/live/37-Tindouf', 'إذاعة تندوف الجزائرية هي إذاعة محلية تبث موجاتها من جهة تندوف و تعمل على تقديم برامج و فقرات متنوعة تحتوي على مواضيع مهمة و خاصة في تلك الجهة فهي تلاقي استحسانا كبيرا من المستمعين .', NULL, NULL, '', 'Radio Tindouf est une station de radio locale algérienne émettant depuis la région de Tindouf, proposant de fournir une programmation diversifiée, traitant des thématiques importantes et pertinentes pour cette région, elle bénéficie d\'un accueil très favorable de la part de ses auditeurs.', '', 'Radio Tindouf'),
(NULL, '2024-04-24 15:52:37.000000', 2049, '2024-10-06 15:10:57.191042', '15 نهج بن بديس, تيسمسيلت, الجزائر', 'local', 'radio38000@gmail.com', '046 49 67 67', '15 نهج بن بديس, تيسمسيلت, الجزائر', '38- تيسمسيلت', '046 49 63 63', 'https://my.radioalgerie.dz/player/tissemsilt.html', 'public', 'https://radioalgerie.dz/player/ar/live/38-Tissemsilt', 'إذاعة تيسلميست المحلية هي إذاعة جزائرية تبث العديد من البرامج المتنوعة إخبارية و ثقافية و ترفيهية لتحاول الوصول بها إلى جميع الشرائح العمرية للمستمعين و المستمعات و تنال استحسانهم .', NULL, NULL, '', 'Radio Tissemsilt est une station locale algérienne qui propose une programmation diversifiée, englobant des émissions d\'information, des contenus culturels et de divertissement. Son objectif est de s\'adresser à toutes les tranches d\'âge des auditeurs, en veillant à satisfaire leurs attentes et à stimuler leur intérêt.', '', 'Radio Tissemsilt'),
(NULL, '2024-04-24 15:55:48.000000', 2050, '2024-10-06 15:11:47.236124', 'حي الرمال الوادي', 'local', 'radiosouf@gmail.com', '032 24 09 69', 'حي الرمال الوادي', '39- الوادي', '032 24 04 64', 'https://my.radioalgerie.dz/player/eloued.html', 'public', 'https://radioalgerie.dz/player/ar/live/39-El-Oued', 'إذاعة الوادي هي إذاعة محلية جزائريّة تبثّ موجاتها عبر الأثير و الأنترنت. تهتم هذه الإذاعة بنقل الأخبار المحليّة و الوطنيّة و فتح المجال لتدارس الأوضاع الصحيّة و الإجتماعيّة و الإقتصاديّة. تخصص الإذاعة برامجها لبث برامج هادفة تمدّ مستمعيها بآخر المستجدّات و تفتح لهم المجال للتّعبير عن ما يخالجهم في محاولة للقيام بدور همزة الوصل بين الشّعب و آخذي القرار.', NULL, NULL, '', 'Radio El Oued est une station locale algérienne qui diffuse ses programmes par voie hertzienne et par Internet. Elle s\'engage à fournir des informations locales et nationales tout en abordant des thématiques essentielles telles que la santé, les questions sociales et économiques. La station propose des émissions spécifiques qui informent ses auditeurs des dernières actualités, tout en leur offrant un espace d\'expression pour partager leurs préoccupations. Ainsi, Radio El Oued vise à établir un lien constructif entre la population et les décideurs.', '', 'Radio El Oued'),
(NULL, '2024-04-24 15:58:15.000000', 2053, '2024-10-06 15:13:43.617137', 'خنشلة الجزائر', 'local', 'radio.khenchela.fb@gmail.com', '032 72 75 72', 'خنشلة', '40 -خنشلة', '032 31 86 33 ', 'https://my.radioalgerie.dz/player/khenchela.html', 'public', 'https://radioalgerie.dz/player/ar/live/40-Khenchla', 'إذاعة خنشلة المحلية هي إذاعة جزائرية توجه برامجها و مواضيعها نحو الشباب. تقدم لهم فقرات إخبارية و ثقافية هادفة و مثيرة للاهتمام كما تقترح فقرات ترفيهية و موسيقية تنال استحسانهم .', NULL, NULL, '', 'Radio Khenchela est une station locale algérienne qui oriente ses programmes et ses thématiques principalement vers un public jeune. Elle propose des émissions d\'information et des contenus culturels à la fois pertinents et stimulants, tout en offrant des émissions de divertissement et des sélections musicales appréciées par ses auditeurs.', '', 'Radio Khenchela'),
(NULL, '2024-04-24 15:58:30.000000', 2058, '2024-10-06 15:13:00.412158', 'سوق \n أهراس الجزائر', 'local', 'radioahras@gmail.com', '037 32 95 95', 'سوق أهراس', '41-سوق اهراس', '037 82 47 65 / 82 47 66', 'https://my.radioalgerie.dz/player/soukahras.html', 'public', 'أذاعة منوعات', 'سوق أهراس هي إذاعة جزائرية محلية مهمة جدا للمستمعين و خاصة في تلك الجهة نظرا لجدية برامجها و مصداقيتها الإخبارية و تعاملها مع المشاكل المعصرة للجهة. كما تقترح أيضا برامج ترفيهية و ثقافية غنية بالمعلومات و الإفادة', NULL, NULL, '', 'Radio Souk Ahras est une station locale algérienne d\'une importance considérable pour ses auditeurs, en particulier dans cette région, étant donné la rigueur de ses programmes et à la fiabilité de ses informations. Elle traite des problématiques contemporaines spécifiques à la région tout en proposant des émissions de divertissement et des contenus culturels enrichis d\'informations pertinentes et utiles. ', '', 'Radio Souk Ahras'),
(NULL, '2024-04-24 16:40:31.000000', 2060, '2024-10-06 15:14:38.750696', 'المدينة الإدارية 42000 تيبازة تيبازة الجزائر', 'local', 'inforadiotipaza@gmail.com', '024 37 62 61', 'المدينة الإدارية 42000 تيبازة تيبازة الجزائر', '42- تيبازة', '024 37 63 74 ', 'https://my.radioalgerie.dz/player/tipaza.html', 'public', 'https://radioalgerie.dz/player/ar/live/42-Tipaza', 'إذاعة تيبازة المحلية هي إذاعة فريدة من نوعها في تلك الجهة من الجزائر إذ أنها تبث برامجها باللغتين العربية و المحلية. تقترح العديد من البرامج الإخبارية و الثقافية التي تنال استحسان المستمعين', NULL, NULL, '', 'Radio Tipaza est une station locale distincte dans cette région de l\'Algérie, diffusant ses programmes en arabe ainsi qu\'en langue locale. Elle propose une gamme variée de contenus d\'information et culturels qui suscitent un intérêt marqué auprès de ses auditeurs.', '', 'Radio Tipaza'),
(NULL, '2024-04-24 16:44:20.000000', 2061, '2024-10-06 15:15:46.754600', '14 شارع القدس، ميلة، الجزائر', 'local', 'radiomilev@gmail.com', ' 031 47 47 01', '14 شارع القدس، ميلة، الجزائر', '43- ميلة', '031 47 47 03 ', 'https://my.radioalgerie.dz/player/mila.html', 'public', 'https://radioalgerie.dz/player/ar/live/43-Mila', 'إذاعة ميلة هي إذاعة محلية من الجزائر من جهة ميلة. تبث لمستمعيها فقرات إخبارية لزودهم بآخر الأخبار و المستجدات على الصعيد الوطني و العالمي كما تقترح العديد من الفقرات الموسيقية تبث من خلالها المموسيقى المحلية و العالمية', NULL, NULL, '', 'Radio Mila est une station locale algérienne basée à Mila. Elle s\'engage à fournir à ses auditeurs des émissions d\'information, les tenant ainsi informés des dernières actualités sur le plan national et international. Radio Mila propose une gamme variée de programmes musicaux, mettant en avant tant la musique locale et internationale.', '', 'Radio Mila'),
(NULL, '2024-04-24 16:46:19.000000', 2062, '2024-10-06 15:16:39.344579', 'عين الدفلئ الجزائر', 'local', ' ', ' 027 60 16 66', 'عين الدفلئ', '44-عين الدفلى', '027 60 58 58', 'https://my.radioalgerie.dz/player/aindefla.html', 'public', 'https://radioalgerie.dz/player/ar/live/44-Ain-Defla', 'إذاعة عين الدفلى الجزائرية هي إذاعة محلية تبث برامج متنوعة تهدف إلى الوصول إلى المستمعين و مشاركتهم حياتهم و تفتح باب الحوار و التعبير بكل حرية. كما تقدم فقرات موسيقية و ترفيهية شيقة ', NULL, NULL, '', 'Radio Ain Defla est une station locale algérienne qui offre une programmation diversifiée, visant à établir un lien étroit avec ses auditeurs et à les impliquer dans leur quotidien, tout en favorisant le dialogue et l\'expression libre. La station propose également des émissions musicales et de divertissement qui sont captivants', '', 'Radio Ain Defla'),
(NULL, '2024-04-24 16:47:24.000000', 2063, '2024-10-06 15:17:29.992815', 'ساحة الشهداء الأربعة, النعامة', 'local', 'direction@radionaamafm.com', '049 79 73 00', 'ساحة الشهداء الأربعة, النعامة', '45- النعامة', '049 79 73 01', 'https://my.radioalgerie.dz/player/naama.html', 'public', 'https://radioalgerie.dz/player/ar/live/45-Naama', 'إذاعة النعامة هي إذاعة محلية تبث موجاتها من جهة النعامة بالجزائر. تقترح عليكم العديد من البرامج المتنوعة و الثرية بمحتوى ثقافي و تنويري. كما تتناول الأحداث السياسية و الإجتماعية و تعالجها و خاصة التابعة لتلك الجهة .', NULL, NULL, '', 'Radio Naama est une station locale algérienne qui diffuse depuis la région de Naama. Elle offre une programmation variée, riche en contenus culturels et éducatifs. La station aborde et analyse des événements politiques et sociaux, notamment ceux relatifs à la région', '', 'Radio Naama'),
(NULL, '2024-04-24 16:48:59.000000', 2064, '2024-10-06 15:18:15.896139', ' عين تموشنت الجزائر', 'local', ' ', '043 61 30 69', ' عين تيموشنت', '46-عين تيموشنت ', '043 60 99 66', 'https://my.radioalgerie.dz/player/aintemouchent.html', 'public', 'https://radioalgerie.dz/player/ar/live/46-Ain-Timouchent', 'إذاعة عين تموشنت هي إذاعة محلية من من غرب الجزائر من منطقة عين تموشنت. تقترح هذه الإذاعة العديد من البرامج ذات محتوى جدي و راقي ههي الأكثر استماعا لها في تلك المنطقة إذ تغطي أكثر من نصف مساحة الولاية.', NULL, NULL, '', 'Radio Ain Témouchent est une station locale située dans l\'ouest de l\'Algérie, dans la région d\'Ain Témouchent. Elle propose une gamme variée de programmes au contenu sérieux et de haute qualité, ce qui en fait l\'une des stations les plus écoutées de la région, couvrant plus de la moitié de la superficie de la wilaya.', '', 'Radio Ain Témouchent'),
(NULL, '2024-04-24 16:49:59.000000', 2065, '2024-10-06 15:19:15.293405', 'غرداية, الجزائر', 'local', 'proradio47@gmail.com', '029 88 19 00', 'غرداية, الجزائر', '47- غرداية', '029 88 52 53', 'https://my.radioalgerie.dz/player/ghardaia.html', 'public', 'https://radioalgerie.dz/player/ar/live/47-Ghardaia', 'إذاعة غرداية الجزائرية هي إذاعة محلية شبابية مهتمة بشأن الشباب. تقترح العديد من البرامج التي تنال اعجاب الشباب و تحاول من خلالها تحصيل الإفادة لهم في مجالات متعددة مما يجعل منها إذاعة مسموعة جدا في تلك الجهة .', NULL, NULL, '', 'Radio Ghardaïa est une station locale algérienne spécifiquement orientée vers la jeunesse. Elle propose une gamme variée de programmes qui répondent aux intérêts des jeunes, tout en s\'efforçant de leur fournir des connaissances utiles dans divers domaines, ce qui la rend la radio la plus écoutée de la région.', '', 'Radio Ghardaïa'),
(NULL, '2024-04-24 16:51:19.000000', 2066, '2024-10-06 15:22:01.723954', ' غليزان الجزائر', 'local', 'contact@radiorelizane.net', '046 71 83 83', ' غليزان', '48- غليزان', '046 71 87 87 ', 'https://my.radioalgerie.dz/player/relizane.html', 'public', 'https://radioalgerie.dz/player/ar/live/48-Relizane', 'إذاعة غليزان الجزائرية التابعة للإذاعة الجزائرية هي إذاعة محلية تبث موجاتها من العاصمة الجزائرية تقترح العديد من البرامج ذات محتوى غني بالفقرات الإخبارية الثقافية الموسيقية الترفيهية و الرياضية.', NULL, NULL, '', 'Radio Relizane relevant de la radio algérienne, est une station locale qui diffuse ses programmes depuis la capitale algérienne. Elle propose une gamme variée de contenus, incluant des émissions d\'information, des programmes culturels, musicaux, de divertissement et sportifs.', '', 'Radio Relizane');

-- --------------------------------------------------------

--
-- Structure de la table `textjuridique`
--

DROP TABLE IF EXISTS `textjuridique`;
CREATE TABLE IF NOT EXISTS `textjuridique` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `lois_id` bigint DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `path` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2l1t2o3rqxoh8k48ajpi6oa6b` (`lois_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `textjuridique`
--

INSERT INTO `textjuridique` (`created_at`, `id`, `lois_id`, `updated_at`, `name`, `path`, `description`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
('2024-04-24 13:02:13.000000', 2, 2, '2024-04-24 13:02:13.000000', 'الصحافة المكتوبة والصحافة الإلكترونية', ' ', ' قانون رقم 23- 19مؤرخ في 18 جمادى الأولى عام 1445 الموافق  2ديسمبر سنة 2023-، يتعلق بالصحافة المكتوبة والصحافة الإلكترونية', NULL, 'Loi n°23-19 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la presse écrite et électronique.', NULL, 'Presse ecrite et Presse électronique'),
('2024-04-24 13:51:53.000000', 3, 2, '2024-04-24 13:51:53.000000', 'القانون العضوي للاعلام', ' ', 'قانون عضوي رقم 23-14 مؤرخ في 10 صفر عام 1445 الموافق 27 غشت سنة 2023,يتعلق بالاعلام', NULL, 'Loi organique n°23-14 du 10 Safar 1445 correspondant au 27 août 2023, relative aux médias.', NULL, 'Loi sur les médias organiques'),
('2024-04-24 13:55:55.000000', 4, 2, '2024-04-24 13:55:56.000000', 'قانون النشاط السمعي البصري', ' ', '	قانون رقم 23-20 مؤرخ في 18 جمادى الاولى عام 1445 الموافق 2 ديسمبر سنة 2023 , يتعلق بالنشاط السمعي البصري', NULL, 'Loi n°23-20 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à l\'activité audiovisuelle.', NULL, 'Droit de l\'activité audiovisuelle'),
('2024-04-28 10:40:32.000000', 5, 5, '2024-04-28 10:40:33.000000', 'مرسوم تنفيذي رقم91-102 المؤرخ في 5 شوال عام 1411 الموافق ل 20 أبريل بسنة 1991 يحول المؤسسة الوطنية للإذاعة المسموعة إلى المؤسسة عمومية للإذاعة العمومية', ' ', 'مرسوم تنفيذي رقم91-102 المؤرخ في 5 شوال عام 1411 الموافق ل 20 أبريل بسنة 1991 يحول المؤسسة الوطنية للإذاعة المسموعة إلى المؤسسة عمومية للإذاعة العمومية', NULL, 'Décret exécutif n° 91-102 du 5 Shawwal 1411, correspondant au 20 avril 1991, transformant la Société nationale de radiodiffusion en société publique de radiodiffusion.', NULL, 'Décret exécutif n° 91-102 du 5 Shawwal 1411, correspondant au 20 avril 1991, transformant la Société nationale de radiodiffusion en société publique de radiodiffusion.'),
('2024-04-28 11:08:35.000000', 6, NULL, '2024-04-28 11:08:36.000000', 'مرسوم تنفيذي رقم91-104 المؤرخ في 5 شوال عام 1411 الموافق ل 20 أبريل بسنة 1991 يحول الوكالة الوطنية البرقية للصحافة ( وكالة الأنباء الجزائرية ) إلى مؤسسة ذات طابع صناعي و تجاري', ' ', ' ', NULL, NULL, NULL, NULL),
('2024-04-28 11:12:36.000000', 7, 5, '2024-04-28 11:12:36.000000', 'مرسوم تنفيذي رقم91-104 المؤرخ في 5 شوال عام 1411 الموافق ل 20 أبريل بسنة 1991 يحول الوكالة الوطنية البرقية للصحافة ( وكالة الأنباء الجزائرية ) إلى مؤسسة ذات طابع صناعي و تجاري', ' ', ' ', NULL, 'Le décret exécutif n° 91-104 du 5 Chawal 1411 correspondant au 20 avril 1991 transforme la Presse Télégraphique Nationale (Agence Algérienne de Presse) en une institution à caractère industriel et commercial.', NULL, 'Le décret exécutif n° 91-104 du 5 Chawal 1411 correspondant au 20 avril 1991 transforme la Presse Télégraphique Nationale (Agence Algérienne de Presse) en une institution à caractère industriel et commercial.'),
('2024-09-24 13:41:40.000000', 8, 5, '2024-09-24 13:41:40.000000', 'مرسوم تنفيذي رقم 24-250 مؤرخ  في 23 يوليو 2024 يحدد أحكام دفتر الشروط العامة المفروضة على خدمات الاتصال السمعي البصري', '', 'مرسوم تنفيذي رقم 24-250 مؤرخ  في 23 يوليو 2024 يحدد أحكام دفتر الشروط العامة المفروضة على خدمات الاتصال السمعي البصري', NULL, NULL, NULL, NULL),
('2024-09-24 13:43:51.000000', 9, 6, '2024-09-24 13:43:51.000000', 'قرار مؤرخ  في 30 يناير 2024 يعدل القرار المؤرخ في 22 جمادى الثانية عام 1443 الموافق 25 جانفي سنة 2022 والمتضمن تشكيلة لجنة الطعن لدى الإدارة المركزية لوزارة الاتصال', '', 'قرار مؤرخ  في 30 يناير 2024 يعدل القرار المؤرخ في 22 جمادى الثانية عام 1443 الموافق 25 جانفي سنة 2022 والمتضمن تشكيلة لجنة الطعن لدى الإدارة المركزية لوزارة الاتصال', NULL, 'Loi n°23-21 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la publicité.', NULL, 'Loi sur la publicité'),
('2024-09-24 13:44:13.000000', 10, 6, '2024-09-24 13:44:14.000000', 'قرار مؤرخ  في 30 يناير 2024  يعدل ويتمم القرار المؤرخ في 22 جمادى الثانية عام 1443 الموافق 25 جانفي سنة 2022 والمتضمن تشكيلة اللجان الإداية المتساوية الأعضاء لدى الإدارة المركزية لوزارة الاتصال', '', 'قرار مؤرخ  في 30 يناير 2024  يعدل ويتمم القرار المؤرخ في 22 جمادى الثانية عام 1443 الموافق 25 جانفي سنة 2022 والمتضمن تشكيلة اللجان الإداية المتساوية الأعضاء لدى الإدارة المركزية لوزارة الاتصال', NULL, 'Décret exécutif n° 23-200 du 10 Safar 1445 correspondant au 27 août 2023, fixant les conditions d\'exercice de l\'activité de presse.', NULL, 'Décret exécutif n° 23-200 du 10 Safar 1445 correspondant au 27 août 2023, fixant les conditions d\'exercice de l\'activité de presse.'),
('2024-09-24 13:44:34.000000', 11, 6, '2024-09-24 13:44:35.000000', 'قرار وزاري مشترك مؤرخ  في 23 يناير 2024 ي حدد قائمة صفقات المنتجات والخدمات الخاصة بقطاع الاتصال التي يتطلب استيرادها السرعة في اتخاذ القرار', '', 'قرار وزاري مشترك مؤرخ  في 23 يناير 2024 ي حدد قائمة صفقات المنتجات والخدمات الخاصة بقطاع الاتصال التي يتطلب استيرادها السرعة في اتخاذ القرار', NULL, 'Loi n°23-22 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la régulation des médias.', NULL, 'Loi relative à la régulation des médias'),
('2024-09-24 13:45:04.000000', 12, 6, '2024-09-24 13:45:04.000000', 'قرار مؤرخ  في 16 يناير 2024 يحدد نموذج التصريح لإصدار نشرية دورية أو ممارسة نشاط الصحافة الإلكترونية والوثائق المطلوبة', '', 'قرار مؤرخ  في 16 يناير 2024 يحدد نموذج التصريح لإصدار نشرية دورية أو ممارسة نشاط الصحافة الإلكترونية والوثائق المطلوبة', NULL, 'Décret exécutif n° 23-201 du 10 Safar 1445 correspondant au 27 août 2023, fixant les modalités de mise en œuvre des obligations des entreprises de presse.', NULL, 'Décret exécutif n° 23-201 du 10 Safar 1445 correspondant au 27 août 2023, fixant les modalités de mise en œuvre des obligations des entreprises de presse.'),
('2024-09-24 13:45:54.000000', 13, 2, '2024-09-24 13:45:54.000000', 'قانون رقم 23-20 مؤرخ  في 02 ديسمبر 2023 يتعلق بالنشاط السمعي البصري', '', 'قانون رقم 23-20 مؤرخ  في 02 ديسمبر 2023 يتعلق بالنشاط السمعي البصري', NULL, 'Loi organique n°23-23 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative au droit à l\'information.', NULL, 'Loi organique sur le droit à l\'information'),
('2024-09-24 13:46:16.000000', 14, 5, '2024-09-24 13:46:17.000000', '(النص التطبيقي للقانون  رقم 23-20 )  مرسوم تنفيذي رقم 24-250 مؤرخ  في 23 يوليو 2024 يحدد أحكام دفتر الشروط العامة المفروضة على خدمات الاتصال السمعي البصري', '', '(النص التطبيقي للقانون  رقم 23-20 )  مرسوم تنفيذي رقم 24-250 مؤرخ  في 23 يوليو 2024 يحدد أحكام دفتر الشروط العامة المفروضة على خدمات الاتصال السمعي البصري', NULL, 'Décret exécutif n° 23-202 du 10 Safar 1445 correspondant au 27 août 2023, fixant les obligations des entreprises audiovisuelles.', NULL, 'Décret exécutif n° 23-202 du 10 Safar 1445 correspondant au 27 août 2023, fixant les obligations des entreprises audiovisuelles.'),
('2024-09-24 13:46:36.000000', 15, 2, '2024-09-24 13:46:36.000000', 'قانون رقم 23-19 مؤرخ  في 02 ديسمبر 2023 يتعلق بالصحافة المكتوبة والصحافة الإلكترونية', '', 'قانون رقم 23-19 مؤرخ  في 02 ديسمبر 2023 يتعلق بالصحافة المكتوبة والصحافة الإلكترونية', NULL, 'Loi n°23-24 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la protection des données personnelles.', NULL, 'Loi sur la protection des données personnelles'),
('2024-09-24 13:46:49.000000', 16, 6, '2024-09-24 13:46:49.000000', '(النص التطبيقي للقانون  رقم 23-19  )  قرار مؤرخ  في 16 يناير 2024 يحدد نموذج التصريح لإصدار نشرية دورية أو ممارسة نشاط الصحافة الإلكترونية والوثائق المطلوبة ', '', '(النص التطبيقي للقانون  رقم 23-19  )  قرار مؤرخ  في 16 يناير 2024 يحدد نموذج التصريح لإصدار نشرية دورية أو ممارسة نشاط الصحافة الإلكترونية والوثائق المطلوبة ', NULL, 'Décret exécutif n° 23-203 du 10 Safar 1445 correspondant au 27 août 2023, portant création de l\'Autorité de régulation des communications.', NULL, 'Décret exécutif n° 23-203 du 10 Safar 1445 correspondant au 27 août 2023, portant création de l\'Autorité de régulation des communications.'),
('2024-09-24 13:47:04.000000', 17, 2, '2024-09-24 13:47:04.000000', 'قانون عضوي رقم 23-14 مؤرخ  في 27 غشت 2023 تعلق بالإعلام', '', 'قانون عضوي رقم 23-14 مؤرخ  في 27 غشت 2023 تعلق بالإعلام', NULL, 'Loi n°23-25 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la liberté d\'expression.', NULL, 'Loi sur la liberté d\'expression'),
('2024-09-24 13:47:20.000000', 18, 6, '2024-09-24 13:47:21.000000', 'قرار وزاري مشترك مؤرخ  في 20 أبريل 2023 يحدد قائمة إيرادات ونفقات حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', '', 'قرار وزاري مشترك مؤرخ  في 20 أبريل 2023 يحدد قائمة إيرادات ونفقات حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', NULL, 'Décret exécutif n° 23-204 du 10 Safar 1445 correspondant au 27 août 2023, fixant les conditions de création des services d\'information.', NULL, 'Décret exécutif n° 23-204 du 10 Safar 1445 correspondant au 27 août 2023, fixant les conditions de création des services d\'information.'),
('2024-09-24 13:47:35.000000', 19, 6, '2024-09-24 13:47:36.000000', 'قرار وزاري مشترك مؤرخ  في 19 يونيو 2023 يحدد كيفيات متابعة وتقييم حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', '', 'قرار وزاري مشترك مؤرخ  في 19 يونيو 2023 يحدد كيفيات متابعة وتقييم حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', NULL, 'Loi n°23-26 du 18 Joumada al-Awwal 1445 correspondant au 2 décembre 2023, relative à la régulation des contenus numériques.', NULL, 'Loi relative à la régulation des contenus numériques'),
('2024-09-24 13:47:48.000000', 20, 5, '2024-09-24 13:47:49.000000', 'مرسوم تنفيذي رقم 23-88 مؤرخ  في 04 مارس 2023 يحدد كيفيات تسيير حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', '', 'مرسوم تنفيذي رقم 23-88 مؤرخ  في 04 مارس 2023 يحدد كيفيات تسيير حساب التخصيص الخاص رقم 051-302 الذي عنوانه \"صندوق تخصيص الرسوم المخصصة للمؤسسات السمعية البصرية', NULL, 'Décret exécutif n° 23-205 du 10 Safar 1445 correspondant au 27 août 2023, portant création d\'une commission d\'éthique des médias.', NULL, 'Décret exécutif n° 23-205 du 10 Safar 1445 correspondant au 27 août 2023, portant création d\'une commission d\'éthique des médias.');

-- --------------------------------------------------------

--
-- Structure de la table `tv`
--

DROP TABLE IF EXISTS `tv`;
CREATE TABLE IF NOT EXISTS `tv` (
  `categorie_chaine_id` bigint DEFAULT NULL,
  `complexe_id` bigint DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `localisation` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `streaminglink` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `website` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `adresse_en` text COLLATE utf8mb4_general_ci,
  `adresse_fr` text COLLATE utf8mb4_general_ci,
  `description_en` text COLLATE utf8mb4_general_ci,
  `description_fr` text COLLATE utf8mb4_general_ci,
  `name_en` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name_fr` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpny5gwqm9eo9ey8oos8wi7pan` (`categorie_chaine_id`),
  KEY `FKdad0jmisj9hfap0ag4u5p5ks3` (`complexe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1740 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `tv`
--

INSERT INTO `tv` (`categorie_chaine_id`, `complexe_id`, `created_at`, `id`, `updated_at`, `adresse`, `email`, `fax`, `localisation`, `name`, `phone`, `streaminglink`, `type`, `website`, `description`, `adresse_en`, `adresse_fr`, `description_en`, `description_fr`, `name_en`, `name_fr`) VALUES
(1, 6, '2024-04-24 10:45:36.000000', 1721, '2024-10-06 13:52:47.830337', ' ', 'webtv@entv.dz', '023 53 10 10', ' ', 'كنال ألجيري ', '023 53 10 10', 'http://www.elahmad.com/tv/algeria_live.php?id=algerie', 'public', 'https://www.entv.dz/', 'ثاني قناة تلفزيونية عمومية جزائرية للمؤسسة العمومية للتلفزيون تأسست سنة 1994، وهي موجهة للجالية الجزائرية بالخارج ', NULL, NULL, 'The second Algerian public television channel of the Établissement Public de Télévision (EPTV), it was created in 1994 and is targeted at the Algerian community abroad.', 'La deuxième chaîne de télévision publique algérienne de l’Établissement Public de Télévision, (EPTV), elle a été créée en 1994 et est destinée à la communauté algérienne à l\'étranger.', 'Canal Algérie', 'Canal Algérie'),
(1, 8, '2024-04-24 11:04:11.000000', 1722, '2024-10-06 20:30:08.133312', 'بئر مراد رايس، الجزائر العاصمة', 'publicite@ennahartv.tv', '+21323 59 91 14', 'بئر مراد رايس، الجزائر العاصمة', 'النهار ', '+21323 59 91 14', 'http://www.elahmad.com/tv/algeria_live.php?id=ennahartv', 'prive', 'http://www.elahmad.com/tv/algeria_live.php?id=ennahartv', 'هي قناة جزائرية مستقلة، انطلق البث التجريبي يوم 6 مارس 2012 بأول نشرة إخبارية قدمت من طرف الثنائي الإعلامي رياض بن عمر ونور اليقين مغريش.[2] اتخذت القناة مقرها الرئيسي بالعاصمة الجزائرية الجزائر ليبدأ البث من هناك', 'Bir Mourad Rais, Algiers', 'Bir Mourad Raïs, Alger', 'An independent Algerian channel that launched its trial broadcast on March 6, 2012, with its first news bulletin presented by the media duo Ryad Ben Omar and Nour El Yakine Meghriche. The channel is headquartered in the Algerian capital Algiers, from where it began broadcasting.', 'Une chaîne algérienne indépendante, dont la diffusion expérimentale a débuté le 6 mars 2012 avec le premier journal télévisé présenté par le duo médiatique Ryad Benamor et Nour El Yakine Meghriche. La chaîne a établi son siège à Alger, d\'où elle a commencé sa diffusion.', 'Ennahar', 'Ennahar'),
(1, 6, '2024-04-24 11:09:45.000000', 1723, '2024-10-06 13:56:07.652796', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz', '023 53 10 10', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'الجزائرية الثالثة', '023 53 10 10', 'http://www.elahmad.com/tv/algeria_live.php?id=algeria3', 'public', 'https://www.entv.dz/', 'ثالث قناة عمومية انبثقت عن المؤسسة الوطنية للتلفزيون، تتوجه هذه القناة إلى العالم العربي تركز في محتواها على الجزائر وذلك بتوليد رابطة دائمة بين مختلف الجاليات الجزائرية في العالم العربي مع موطنهم الأصلي..', NULL, NULL, 'The third public channel to emerge from the National Television Establishment, it  addresses the Arab world and focuses its content on Algeria, creating a permanent link between various Algerian communities in the Arab world and their homeland.', 'Troisième chaîne publique issue de l’Établissement Public de Télévision (EPTV), Elle s\'adresse au monde arabe et met l\'accent sur l\'Algérie dans son contenu, en créant un lien permanent entre les différentes communautés algériennes dans le monde arabe et leur pays d\'origine.', 'Thalitha A3', 'Thalitha A3'),
(1, 6, '2024-04-24 11:16:06.000000', 1724, '2024-10-06 13:59:48.729218', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz', '023 53 10 10', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'الأمازيغية', '023 53 10 10', 'http://www.elahmad.com/tv/algeria_live.php?id=algerie4', 'public', 'https://www.entv.dz/', 'قناة جزائرية حكومية، رابع قناة للمؤسسة العمومية للتلفزيون تأسست في سنة 2009، وهي عبارة عن قناة ناطقة بالأمازيغية بمختلف لهجاتها القبائلية، الشاوية، التارقية، الشنوية والمزابية.', NULL, NULL, 'A government Algerian channel, the fourth channel of the Public Television Establishment, founded in 2009, broadcasting in Amazigh in its various dialects: Kabyle, Chaoui, Touareg, Chaoui, and Mozabite.', 'Chaîne algérienne gouvernementale, quatrième chaîne de l’Établissement Public de Télévision (EPTV), créée en 2009 et diffusant en tamazight avec ses différents dialectes : kabyle, chaoui, touareg, chaoui et mozabite.', 'Amazigh TV4', 'Amazigh TV4'),
(3, 6, '2024-04-24 11:18:07.000000', 1725, '2024-10-06 14:02:26.548621', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz', '023 53 10 10', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'القرأن الكريم', '023 53 10 10', 'http://www.elahmad.com/tv/algeria_live.php?id=algerie5', 'public', 'https://www.entv.dz/', 'أطلقت كبث تجريبي من قبل التلفزيون الجزائري يوم الأربعاء 18 مارس 2009، مخصصة للقرآن الكريم وعلومه وتبث 24 ساعة يوميا.', NULL, NULL, 'It was launched as an experimental broadcast by Algerian television on Wednesday, March 18, 2009, dedicated to the Holy Quran and its sciences, broadcasting 24 hours a day.', '1725	أطلقت كبث تجريبي من قبل التلفزيون الجزائري يوم الأربعاء 18 مارس 2009، مخصصة للقرآن الكريم وعلومه وتبث 24 ساعة يوميا.	قناة القرأن الكريم	Lancée en tant que diffusion expérimentale par la télévision algérienne le mercredi 18 mars 2009, cette chaîne est consacrée au Saint Coran et à ses sciences, diffusant 24 heures sur 24.	It was launched as an experimental broadcast by Algerian television on Wednesday, March 18, 2009, dedicated to the Holy Quran and its sciences, broadcasting 24 hours a day.	public	3	6', 'Quran', 'Quran'),
(1, 6, '2024-04-24 11:20:18.000000', 1726, '2024-10-06 20:28:29.497294', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz', '023 53 10 10', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'الجزائرية السادسة', '023 53 10 10', 'http://www.elahmad.com/tv/algeria_live.php?id=algerie6', 'public', 'https://www.entv.dz/', 'وتعرف أيضا باسم تلفزيون السادسة، وهي سادس قناة عمومية انبثقت عن المؤسسة الوطنية للتلفزيون، تتوجه هذه القناة إلى الجمهور الجزائري تركز في محتواها على الجزائر.', '21 Martyrs Street, Algiers, Algeria', '21 rue des Martyrs, Alger, Algérie', '1726	وتعرف أيضا باسم تلفزيون السادسة، وهي سادس قناة عمومية انبثقت عن المؤسسة الوطنية للتلفزيون، تتوجه هذه القناة إلى الجمهور الجزائري تركز في محتواها على الجزائر.	القناة الجزائرية السادسة	Également connue sous le nom de TV6, c\'est la sixième chaîne publique issue de l\'établissement national de la télévision (EPTV). Cette chaîne s\'adresse au public algérien et met l\'accent sur l\'Algérie dans son contenu.	Also known as TV6, it is the sixth public channel to emerge from the National Television Establishment. This channel addresses the Algerian audience and focuses its content on Algeria.	public	1	6', 'Également connue sous le nom de TV6, c\'est la sixième chaîne publique issue de l\'établissement national de la télévision (EPTV). Cette chaîne s\'adresse au public algérien et met l\'accent sur l\'Algérie dans son contenu.', 'Algeria TV6', 'Algérie TV6'),
(1, 5, '2024-04-24 11:20:21.000000', 1727, '2024-10-06 14:05:31.443268', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر\n', 'info@echorouk.net\n', '023 71 39 82\n', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر\n', 'الشروق تي في', '023 71 39 90\n', 'https://echorouk.dzsecurity.net/embed/echorouk.php', 'prive', 'https://tv.echoroukonline.com/echorouk-tv/\n', 'قناة تلفزيونية جزائرية خاصة تابعة لمؤسسة الشروق، ضمن باقة الشروق.', NULL, NULL, '1727	قناة تلفزيونية جزائرية خاصة تابعة لمؤسسة الشروق، ضمن باقة الشروق. 	الشروق تي في 	Chaîne de télévision privée algérienne affiliée à Echorouk, faisant partie du bouquet Echorouk.	A private Algerian television channel affiliated to Echorouk, part of the Echorouk package.	prive	1	5', 'Chaîne de télévision privée algérienne affiliée à Echorouk, faisant partie du bouquet Echorouk.', 'El Chourouk ', 'El Chourouk '),
(2, 5, '2024-04-24 11:52:29.000000', 1728, '2024-10-06 20:33:57.756523', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر', 'info@echorouk.net', '023 71 39 82', 'حي سعيدون محمد فيلا رقم 166 - القبة، الجزائر', 'الشروق نيوز', '023 71 39 90', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3197.967323721775!2d3.0743512890386477!3d36.7233460005375!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x128fad411d576601%3A0x64ee732d057ac60e!2sEchourouk%20News%20TV!5e0!3m2!1sfr!2sdz!4v171397160', 'prive', 'https://tv.echoroukonline.com/echorouk-tv/', 'قناة تلفزيونية إخبارية جزائرية مقرها الجزائر العاصمة، تابعة لمؤسسة الشروق.انطلق البث الرسمي للقناة يوم 19 مارس 2014 في احتفالية خاصة بمناسبة السنة الثانية لإطلاق أول قناة تابعة لمؤسسة الشروق ، لتكون الشروق الإخبارية ثاني قنوات الباقة.', 'Saidoun Mohamed neighborhood, Villa No. 166 - Kouba, Algeria', 'Quartier Saidoun Mohamed, Villa N°166 - Kobba, Algérie', 'Algerian news television channel based in Algiers, affiliated to the Echorouk Foundation. The official broadcast of the channel began on 19 March 2014 during a special celebration to mark the second anniversary of the launch of the first channel owned by the Echorouk institution, making Echorouk News the second channel in the Echorouk package.  ', 'Chaîne de télévision d\'information algérienne basée à Alger, affiliée à la Fondation Echorouk. La diffusion officielle de la chaîne a débuté le 19 mars 2014 lors d\'une célébration spéciale à l\'occasion du deuxième anniversaire du lancement de la première chaîne appartenant à l\'institution Echorouk, faisant d\'Echorouk News la deuxième chaîne du bouquet d\'Echorouk.', 'El Chourouk News', 'El Chourouk  News'),
(3, 9, '2024-04-24 11:57:05.000000', 1729, '2024-10-06 14:06:55.883523', ' ', 'alanistv.dz@gmail.com', '0 23 52 83 36', ' ', 'الأنيس', '0 23 52 83 36', ' http://www.elahmad.com/tv/algeria_live.php?id=alanis_tv', 'prive', NULL, 'قناة تلفزيونية جزائرية تربوية هادفة، تأسست بتزكية كوكبة من العلماء والمفكرين الجزائريين في شهر جوان سنة 2014 بمدينة وهران عاصمة الغرب الجزائري. مقرها الحالي بالجزائر العاصمة.', NULL, NULL, '1729	قناة تلفزيونية جزائرية تربوية هادفة، تأسست بتزكية كوكبة من العلماء والمفكرين الجزائريين في شهر جوان سنة 2014 بمدينة وهران عاصمة الغرب الجزائري. مقرها الحالي بالجزائر العاصمة.	الأنيس	Une chaîne de télévision algérienne éducative et constructive, fondée avec la recommandation d\'un groupe de savants et de penseurs algériens en juin 2014 dans la ville d\'Oran, capitale de l\'ouest algérien. Son siège actuel est à Alger.	An Algerian educational and constructive television channel, founded with the endorsement of a group of Algerian scholars and thinkers in June 2014 in the city of Oran, the capital of western Algeria. Its current headquarters are in Algiers. 	privé	3	9', 'Une chaîne de télévision algérienne éducative et constructive, fondée avec la recommandation d\'un groupe de savants et de penseurs algériens en juin 2014 dans la ville d\'Oran, capitale de l\'ouest algérien. Son siège actuel est à Alger.', 'Alanees', 'Alanees'),
(1, 10, '2024-04-24 12:02:13.000000', 1730, '2024-10-06 14:07:54.562540', ' ', ' ', ' ', ' ', 'الهقار تي في', ' ', ' ', 'prive', 'https://hogartv.net/', 'هي قناة جزائرية مستقلة تم افتتاحها في شهر ماي[1] 2012، يوجد مقر بثها في لندن.', NULL, NULL, '1730	هي قناة جزائرية مستقلة تم افتتاحها في شهر ماي[1] 2012، يوجد مقر بثها في لندن.	الهقار تي في	Une chaîne algérienne indépendante, inaugurée en mai 2012, dont le siège de diffusion est situé à Londres.	An independent Algerian channel inaugurated in May 2012, with its broadcasting headquarters located in London.	privé	1	10', 'Une chaîne algérienne indépendante, inaugurée en mai 2012, dont le siège de diffusion est situé à Londres.', 'Hogar TV', 'Hogar TV'),
(1, 11, '2024-04-24 12:05:53.000000', 1731, '2024-10-06 20:34:42.352585', 'شارع ديدوش مراد الجزائر العاصمة - الطابق الرابع 52', 'elbiladonline.net@gmail.com', '021 64 54 45', 'شارع ديدوش مراد الجزائر العاصمة - الطابق الرابع 52', 'البلاد                                                                   ', '021 64 42 70', 'http://www.elahmad.com/tv/algeria_live.php?id=elbilad', 'prive', 'https://www.elbilad.net/profile/%D9%82%D9%86%D8%A7%D8%A9-%D8%A7%D9%84%D8%A8%D9%84%D8%A7%D8%AF', 'قناة اخبارية جزائرية شرعت في البث رسميا يوم 19 مارس 2014، اشتهرت بالبرامج الحوارية والتحقيقات الحصرية وبرامج رياضية وثقافية واجتماعية وترفيهية عديدة، كما أنها تقدم نشرات اخبارية على رأس كل ساعة، مديرها العام هو السيد يوسف جمعة ومقرها 52 شارع ديدوش مراد بالعاصمة.', 'Didouche Mourad Street, Algiers - 4th floor 52', 'Rue Didouche Mourad, Alger, 4ème étage 52', 'An Algerian news channel officially began broadcasting on March 19, 2014. known for its talk shows, exclusive investigations, and various sports, cultural, social, and entertainment programs. It also provides news bulletins at the top of every hour. Its general director is Mr. Youcef Djouma, and its headquarters is located at 52 Didouche Mourad Street, in Algiers the capital.', 'Une chaîne d\'information algérienne qui a commencé sa diffusion officielle le 19 mars 2014, connue pour ses talk-shows, ses enquêtes exclusives et de nombreux programmes sportifs, culturels, sociaux et de divertissement. Elle propose également des bulletins d\'information au début de chaque heure. Son directeur général est M. Youcef Djouma et son siège est situé au 52, rue Didouche Mourad, à la capitale, Alger.', 'El bilad ', 'El bilad '),
(2, 12, '2024-04-24 12:14:31.000000', 1732, '2024-10-06 14:09:50.708049', ' ', 'redaction@numidianews.com', '021 30 72 18', ' ', 'نوميديا نيوز', '021 30 72 18', ' http://www.azrotv.com/pyr/?id=http://ipc.proipciptv.com:8000/live/res-ms/HOLdsuB57gT/8752.ts', 'prive', 'http://www.numidianewstv.com/', 'قناة إخبارية جزائرية مستقلة، وقد اتخذت هذا الاسم تيمنا بمملكة نوميديا الأمازيغية التي قامت في عصور ما قبل الميلاد وهي الجزائر حاليا. انطلق بثها في 11 ديسمبر 2012، في الذكرى الأولى لانطلاق وكالة نوميديا نيوز وهو تاريخ يصادف يوم خروج الجزائريين طلباً للتحرر سنة 1961. وتهتم ببث آخر المستجدات السياسية والرياضية على الساحة الجزائرية، العربية والدولية. وهي قناة إخبارية كون معظم برامجها ذات صبغة إخبارية إلى جانب بعض البرامج الحوارية والتفاعلية والاجتماعية.', NULL, NULL, 'An independent Algerian news channel, named after the Amazigh kingdom of Numidia, which existed in prehistoric times and is today Algeria. It began broadcasting on December 11, 2012, on the first anniversary of the Numidia News Agency, a date that coincides with the Algerians\' quest for freedom in 1961. It is centered on broadcasting the latest political and sports news on the Algerian, Arab, and international scene. It is a news channel, as most of its programs are informative in nature, along with some talk shows, interactive, and social programs.', 'Une chaîne d\'information algérienne indépendante, nommée d\'après le royaume amazigh de Numidie, qui existait à l\'époque préhistorique et qui est aujourd’hui l\'Algérie. Elle a commencé sa diffusion le 11 décembre 2012, à l\'occasion du premier anniversaire de l\'Agence Numidia News, une date qui coïncide avec la sortie des Algériens en quête de liberté en 1961. Elle est centrée sur la diffusion des dernières actualités politiques et sportives sur la scène algérienne, arabe et internationale. C\'est une chaîne d\'information, car la plupart de ses programmes sont de nature informative, en plus de quelques émissions de débat, interactives et sociales.', 'Numidia news', 'Numidia news'),
(2, 13, '2024-04-24 12:20:40.000000', 1733, '2024-10-06 14:11:55.331630', ' ', 'dizednews@gmail.com', '021 49 35 15', ' ', 'دزاير نيوز', '021 49 35 15', ' http://www.elahmad.com/tv/algeria_live.php?id=dzair_tv', 'prive', 'https://dzayernews.dz/', 'قناة تلفزيونية فضائية جزائرية تصنف ضمن القنوات الإخبارية. هذه القناة هي ملك للمجموعة الإعلامية «GROUP MEDIA TEMPS NOUVEAU » والتي تمتلك أيضا جريدتين يوميتين إحداهما بالعربية والأخرى بالفرنسية إلى جانب قناة تلفزيونية عامة هي دزاير تي في.', NULL, NULL, '1733	قناة تلفزيونية فضائية جزائرية تصنف ضمن القنوات الإخبارية. هذه القناة هي ملك للمجموعة الإعلامية «GROUP MEDIA TEMPS NOUVEAU » والتي تمتلك أيضا جريدتين يوميتين إحداهما بالعربية والأخرى بالفرنسية إلى جانب قناة تلفزيونية عامة هي دزاير تي في.	دزاير نيوز	Une chaîne de télévision satellite algérienne classée parmi les chaînes d\'information. Cette chaîne appartient au groupe médiatique « GROUP MEDIA TEMPS NOUVEAU », qui possède également deux journaux quotidiens, l\'un en arabe et l\'autre en français, ainsi qu\'une chaîne de télévision générale :Dzaïr TV.	A satellite television channel in Algeria classified as a news channel. This channel belongs to the media group \'GROUP MEDIA TEMPS NOUVEAU,\' which also owns two daily newspapers, one in Arabic and the other in French, as well as a general television channel: Dzair TV.	prive	2	13', '1733	قناة تلفزيونية فضائية جزائرية تصنف ضمن القنوات الإخبارية. هذه القناة هي ملك للمجموعة الإعلامية «GROUP MEDIA TEMPS NOUVEAU » والتي تمتلك أيضا جريدتين يوميتين إحداهما بالعربية والأخرى بالفرنسية إلى جانب قناة تلفزيونية عامة هي دزاير تي في.	دزاير نيوز	Une chaîne de télévision satellite algérienne classée parmi les chaînes d\'information. Cette chaîne appartient au groupe médiatique « GROUP MEDIA TEMPS NOUVEAU », qui possède également deux journaux quotidiens, l\'un en arabe et l\'autre en français, ainsi qu\'une chaîne de télévision générale :Dzaïr TV.	A satellite television channel in Algeria classified as a news channel. This channel belongs to the media group \'GROUP MEDIA TEMPS NOUVEAU,\' which also owns two daily newspapers, one in Arabic and the other in French, as well as a general television channel: Dzair TV.	prive	2	13', 'Dzair News', 'Dzair News'),
(4, 14, '2024-04-24 12:25:21.000000', 1734, '2024-10-06 14:11:16.218238', ' ', 'contact@elheddaf.com', ' ', ' ', 'الهداف تي في', ' ', 'http://www.elahmad.com/tv/algeria_live.php?id=elheddaf', 'prive', 'https://elheddaftv.com/', 'قناة فضائية عربية جزائرية تبث من الجزائر العاصمة، وهي تابعة لجريدة الهداف. تأسست سنة 2014، تنقل آخر أخبار كرة القدم بشكل خاص، إضافة إلى قيامها بمقابلات صحفية مع عدد من اللاعبين ومدربي الفرق المحلية الجزائرية كما تقوم بنقل ربورتاجات تخص الفرق العالمية الكبرى ولاعبيها.', NULL, NULL, '1734	قناة فضائية عربية جزائرية تبث من الجزائر العاصمة، وهي تابعة لجريدة الهداف. تأسست سنة 2014، تنقل آخر أخبار كرة القدم بشكل خاص، إضافة إلى قيامها بمقابلات صحفية مع عدد من اللاعبين ومدربي الفرق المحلية الجزائرية كما تقوم بنقل ربورتاجات تخص الفرق العالمية الكبرى ولاعبيها.	الهداف تي في	Chaîne de télévision satellite arabe algérienne diffusant depuis Alger, elle est affiliée au journal El Heddaf. Fondée en 2014, elle diffuse les dernières nouvelles du football, en particulier, et réalise des interviews avec plusieurs joueurs et entraîneurs des équipes locales algériennes. Elle propose également des reportages sur les grandes équipes mondiales et leurs joueurs.	An Arabic satellite television channel broadcasting from Algiers, it is affiliated with the newspaper El Heddaf. Founded in 2014, it reports the latest football news, in particular, and conducts interviews with several players and coaches from local Algerian teams. It also offers reports on major global teams and their players.	prive	4	14', '1734	قناة فضائية عربية جزائرية تبث من الجزائر العاصمة، وهي تابعة لجريدة الهداف. تأسست سنة 2014، تنقل آخر أخبار كرة القدم بشكل خاص، إضافة إلى قيامها بمقابلات صحفية مع عدد من اللاعبين ومدربي الفرق المحلية الجزائرية كما تقوم بنقل ربورتاجات تخص الفرق العالمية الكبرى ولاعبيها.	الهداف تي في	Chaîne de télévision satellite arabe algérienne diffusant depuis Alger, elle est affiliée au journal El Heddaf. Fondée en 2014, elle diffuse les dernières nouvelles du football, en particulier, et réalise des interviews avec plusieurs joueurs et entraîneurs des équipes locales algériennes. Elle propose également des reportages sur les grandes équipes mondiales et leurs joueurs.	An Arabic satellite television channel broadcasting from Algiers, it is affiliated with the newspaper El Heddaf. Founded in 2014, it reports the latest football news, in particular, and conducts interviews with several players and coaches from local Algerian teams. It also offers reports on major global teams and their players.	prive	4	14', 'El haddaf TV', 'El haddaf TV'),
(5, 15, '2024-04-24 12:27:37.000000', 1735, '2024-10-06 14:12:35.827249', ' ', 'samiratvwebcast@gmail.com', ' ', ' ', 'سميرة تي في', '0556 38 01 00', 'http://www.elahmad.com/tv/algeria_live.php?id=samira_tv', 'prive', 'https://samiratv.dz/home/', 'قناة تلفزيونية جزائرية على قمر نايل سات وهي موجهة للمرأة الجزائرية والعربية. وتهتم بالطبخ الجزائري، إضافة إلى انها تبث حصص خاصة بالخياطة والتفصيل والتدبير المنزلي وكل ما يخص شؤون البيت، كما أنها تحافظ على عادات وتقاليد المجتمع الجزائري. يقع مقر القناة بالجزائر العاصمة. وتعد أول قناة متخصصة في الطبخ في الجزائر، كما تعد مالكتها أول امرأة تطلق قناة في الجزائر بهذا الحجم.', NULL, NULL, 'An Algerian television channel on Nilesat, targeting Algerian and Arab women. It is centered on Algerian cuisine and also broadcasts programs on sewing, dressmaking, and all related to household affairs, as well as the preservation of Algerian customs and traditions. Its headquarters are located in Algiers. It is the first channel specialized in cooking in Algeria, and its owner is the first woman to launch a channel of such scale in the country.', 'Une chaîne de télévision algérienne sur Nilesat, qui s\'adresse aux femmes algériennes et arabes. Elle est axée sur la cuisine algérienne et diffuse également des émissions sur la couture, la confection de vêtements, tout ce qui a trait aux affaires de la maison, ainsi que sur la préservation des coutumes et traditions de la société algérienne. Son siège est situé à Alger. Elle est la première chaîne spécialisée dans la cuisine en Algérie, et sa propriétaire est la première femme à lancer une chaîne de cette envergure en Algérie.', 'Samira TV', 'Samira TV'),
(1, 16, '2024-04-24 12:42:42.000000', 1736, '2024-10-06 14:13:12.184873', ' ', 'bahiatv.cont@gmail.com', '041 75 56 05', ' ', 'الباهية', '041 75 56 05', ' ', 'prive', ' ', 'قناة فضائية جزائرية، تهتم بالبرامج السياسية ، الترفيهية ، الإخبارية ، الرياضية والاجتماعية', NULL, NULL, 'An Algerian satellite channel that is centered on political, entertainment, news, sports, and social programs.', 'Chaîne satellitaire algérienne, axée sur des programmes politiques, de divertissement, d’actualité, de sport et de société.', 'Bahia', 'Bahia'),
(1, 6, '2024-10-07 11:18:09.000000', 1737, '2024-10-07 11:22:52.000000', 'منطقة النشاطات رقم 20 ص.ب 63, سعيد حمدين ، بئر مراد رايس، الجزائر العاصمة', 'regiepub@al24news.com', 'غير متوفر', ' غير متوفر', 'AL 24', '0661411947', 'https://www.elahmad.com/tv/algeria_live.php?id=al24news', 'public', 'https://al24news.com/', 'قناة الجزائر الدولية هي قناة التلفزيونية أخبارية جزائرية. عامة تم إطلاقها في 30 أكتوبر 2021. وهي مستقلة عن المؤسسة العمومية للتلفزيون الجزائري ولها مكاتب في الجزائر وباريس وواشنطن وبكين وموسكو. ويرأسها سليم أغار', 'Activity Zone No. 20 P.O. Box 63, Said Hamdine, Bir Mourad Rais, Algiers', 'Zone d\'activités n°20, B.P. 63, Saïd Hamdine, Bir Mourad Raïs, Alger', 'Canal Djazair International is an Algerian news television channel. It was launched on October 30, 2021. It is independent of the Algerian Public Television Corporation and has offices in Algiers, Paris, Washington, Beijing and Moscow. It is headed by Salim Aghar.', 'Algérie International est une chaîne de télévision d\'information algérienne. Général Elle a été lancée le 30 octobre 2021. Elle est indépendante de la Société de Télévision Publique Algérienne et possède des bureaux en Algérie, à Paris, Washington, Pékin et Moscou. Il est dirigé par Salim Agar', 'AL 24', 'AL 24'),
(1, 6, '2024-10-07 11:31:04.000000', 1738, '2024-10-07 11:31:05.000000', '1 شارع الشهداء، الجزائر العاصمة، الجزائر', ' webtv@entv.dz', ' غير متوفر', ' غير متوفر', 'القناة الجزائرية السابعة', '023 53 10 11', 'https://www.elahmad.com/tv/algeria_live.php?id=algerie7', 'public', 'https://www.entv.dz/', 'المعرفية', NULL, NULL, NULL, NULL, NULL, NULL),
(1, 6, '2024-10-07 11:36:15.000000', 1739, '2024-10-07 11:36:15.000000', '21 شارع الشهداء، الجزائر العاصمة، الجزائر', 'webtv@entv.dz', '023 53 10 13', ' غير متوفر', 'القناة الجزائرية التاسعة', '023 53 10 13', ' ', 'public', ' https://www.entv.dz/', 'البرلمانية', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `created_at` datetime(6) DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `updated_at` datetime(6) DEFAULT NULL,
  `addressoffice` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `firstname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fonction` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lastname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `mobile` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phoneoffice` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `role` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`created_at`, `id`, `updated_at`, `addressoffice`, `email`, `firstname`, `fonction`, `lastname`, `mobile`, `password`, `phoneoffice`, `role`, `username`) VALUES
('2024-04-23 09:53:02.000000', 1, '2024-04-23 09:53:02.000000', NULL, 'ayoub20104@live.com', 'Sidi', 'ENG', 'Ahmed', '213792300752', '123', NULL, 'admin', 'admin');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `caracteristique`
--
ALTER TABLE `caracteristique`
  ADD CONSTRAINT `FK5d7jdnxcusvdaulf94k706dvv` FOREIGN KEY (`tv_id`) REFERENCES `tv` (`id`),
  ADD CONSTRAINT `FK6lrlshlcqe75wn0cqobxwos3k` FOREIGN KEY (`radio_id`) REFERENCES `radio` (`id`);

--
-- Contraintes pour la table `complexe_agrument`
--
ALTER TABLE `complexe_agrument`
  ADD CONSTRAINT `FKaaq6ue4im06m21545xapadpdi` FOREIGN KEY (`agrument_id`) REFERENCES `agrument` (`id`),
  ADD CONSTRAINT `FKcx832gfsnj6t4617ayn6a6gk2` FOREIGN KEY (`complexe_id`) REFERENCES `complexe` (`id`);

--
-- Contraintes pour la table `etablissement`
--
ALTER TABLE `etablissement`
  ADD CONSTRAINT `FKhtd5sbdcb0igsspcdq0m4ogct` FOREIGN KEY (`complexe_id`) REFERENCES `complexe` (`id`);

--
-- Contraintes pour la table `minister`
--
ALTER TABLE `minister`
  ADD CONSTRAINT `FK76c3iqxc6nd488w9s51vi5dfo` FOREIGN KEY (`profile_picture_id`) REFERENCES `multimedia` (`id`);

--
-- Contraintes pour la table `multimedia`
--
ALTER TABLE `multimedia`
  ADD CONSTRAINT `FK430s9iwxejdhgykl5mksxiwnc` FOREIGN KEY (`etablissement_id`) REFERENCES `etablissement` (`id`),
  ADD CONSTRAINT `FK6ke2068jfg5ygjmey2u59r39o` FOREIGN KEY (`radio_id`) REFERENCES `radio` (`id`),
  ADD CONSTRAINT `FK841iiluy2pexb2qg6exqhbws0` FOREIGN KEY (`tv_id`) REFERENCES `tv` (`id`),
  ADD CONSTRAINT `FKg0hfeer38vyuwtit258wamuce` FOREIGN KEY (`text_juridique_id`) REFERENCES `textjuridique` (`id`),
  ADD CONSTRAINT `FKqetdote85qjqxe9namkmfygww` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKs37vceteeeh5w6sf235bk8rtm` FOREIGN KEY (`minister_id`) REFERENCES `minister` (`id`),
  ADD CONSTRAINT `FKthv4bidn8m41cugevxi64rhhb` FOREIGN KEY (`presse_id`) REFERENCES `presse` (`id`);

--
-- Contraintes pour la table `presse`
--
ALTER TABLE `presse`
  ADD CONSTRAINT `FKaoretyhavt4aqy7vilaxfydp8` FOREIGN KEY (`complexe_id`) REFERENCES `complexe` (`id`);

--
-- Contraintes pour la table `presse_pressecatrgorie`
--
ALTER TABLE `presse_pressecatrgorie`
  ADD CONSTRAINT `FKjq9h8cefjywb5f7ux0ywu8279` FOREIGN KEY (`pressecatrgorie_id`) REFERENCES `presse_categorie` (`id`);

--
-- Contraintes pour la table `radio`
--
ALTER TABLE `radio`
  ADD CONSTRAINT `FKisi1wxcawcfe4irb6mdvwp1mt` FOREIGN KEY (`complexe_id`) REFERENCES `complexe` (`id`);

--
-- Contraintes pour la table `textjuridique`
--
ALTER TABLE `textjuridique`
  ADD CONSTRAINT `FK2l1t2o3rqxoh8k48ajpi6oa6b` FOREIGN KEY (`lois_id`) REFERENCES `lois` (`id`);

--
-- Contraintes pour la table `tv`
--
ALTER TABLE `tv`
  ADD CONSTRAINT `FKdad0jmisj9hfap0ag4u5p5ks3` FOREIGN KEY (`complexe_id`) REFERENCES `complexe` (`id`),
  ADD CONSTRAINT `FKpny5gwqm9eo9ey8oos8wi7pan` FOREIGN KEY (`categorie_chaine_id`) REFERENCES `categorie_chaine` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
