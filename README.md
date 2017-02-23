# Curl-Java-Wrapper
Projet Cours Java

Curl Java Wrapper: LP Schaub & Chloé Monnin

 Réalisation d'un wrapper pour la commande curl pour pouvoir faire des requêtes REST ( et par exemple de 
 scraper Facebook via son API Rest). Le json du résultat des requêtes sera analysé, placé dans des objets
 Java . Il sera ainsi disponible  pour  d'autres applications.
 
 
 Binôme 1: Le wrapper
 -Il s'agit d'utiliser les classes https://docs.oracle.com/javase/7/docs/api/java/lang/ProcessBuilder.html  et 
 https://docs.oracle.com/javase/7/docs/api/java/lang/Process.html#getInputStream() pour lancer une
 commande curl ( adéquatement ) formattée pour faire une requête REST et récupérer le résultat.
  -Une autre solution pour faire la même chose est d'utiliser : https://projects.apache.org/project.html?commons-exec
 Ad libitum. L'intérêt de la première solution est qu'elle ne nécessite aucune librairie extérieure. La seconde solution
 est peut être plus simple à mettre en œuvre
 
 Binôme 2: Le traitement du résultat d'une requête.
 Il s'agit d'utiliser la librairie Java JsonSimple http://juliusdavies.ca/json-simple-1.1.1-javadocs/overview-summary.html 
 ( ou une autre de votre choix ) pour analyser la String json retournée.
 Pour tester sans attendre les résultats de Binôme 1, il suffira de lancer une requête à la main, mettre le 
 résultat dans une String et de travailler sur cette String.
 
 Application (en commun)  :
 
 Assemblage des travaux ci dessus pour récupérer du texte via https://developers.facebook.com/docs/graph-api/using-graph-api.
