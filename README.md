L'application que j'ai  développée est un système de gestion de capteurs et de données. Elle vise à faciliter la collecte, le suivi et l'analyse des données provenant de différents capteurs. L'objectif principal de cette application est de fournir aux utilisateurs un moyen efficace de gérer et d'exploiter les informations capturées par les capteurs.
Dans un monde de plus en plus connecté et axé sur les données, la disponibilité d'informations en temps réel est cruciale pour de nombreuses industries et secteurs d'activité. Notre application offre une solution complète pour la surveillance et l'analyse des données provenant de capteurs dans des domaines tels que l'environnement, la santé, l'industrie, etc.
L'objectif de cette application consiste à collecter, à stocker, à visualiser et à gérer des données envoyées par des capteurs.
Cette application doit permettre aux utilisateurs de consulter les données. 
Capteur : un capteur est un système électronique ou mécanique qui permet de mesurer une grandeur physique telle que la température, l’humidité, etc.
Passerelle : un dispositif informatique qui permet de connecter des réseaux ou des systèmes informatiques différents, son rôle est de récupérer les données du capteur et les envoyer vers un serveur cloud.
Serveur cloud : est un serveur informatique utilisé pour héberger notre application de gestion des capteurs. 
Les étapes sont :
 Le capteur envoie les données vers la passerelle.
 La passerelle envoie les données vers le serveur cloud.
 L’utilisateur peut consulter les données qui sont dans le serveur cloud.
Acquisition de données :
Le module d'acquisition de données permet :
L'utilisation d'une API REST.
Les passerelles doivent appeler cette API REST pour envoyer les données.
Gestion des utilisateurs :
L’application doit permettre :
L’authentification des utilisateurs via Login.
L’attribution des droits d’accès des utilisateurs selon les profils.
Profil administrateur :
 Le profil d’administrateur peut :
Gérer les droits d'accès des différents utilisateurs et capteurs.
Modifier, supprimer ou ajouter des informations au système. 
Profil utilisateur normal :
  Le profil d’utilisateur normal peut :
·Gérer les données des capteurs (nom, valeur, données reçues).
·Accéder à l'historique des données.
·Chercher.
·Exporter les enregistrements sous forme fichier Csv, Excel…
Gestion des capteurs :
  L'application doit permettre aux administrateurs de :
Configurer les droits d'accès aux utilisateurs normaux sur les données remontées par les capteurs.
Visualisation de données :
L’application doit permettre aux utilisateurs normaux de :
Visualiser les données envoyées par les capteurs.
Visualiser l’état des réceptions des données.
