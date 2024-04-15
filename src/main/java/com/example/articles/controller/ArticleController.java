package com.example.articles.controller;

import com.example.articles.model.BlogArticle;
import com.example.articles.model.Commentaire;
import com.example.articles.service.BlogArticleService;
import com.example.articles.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/article")
@Controller

public class ArticleController {
    private final BlogArticleService blogArticleService ;
    private final CommentaireService commentaireService ;

    @Autowired
    public ArticleController(BlogArticleService blogArticleService, CommentaireService commentaireService) {
        this.blogArticleService = blogArticleService;
        this.commentaireService = commentaireService;
        blogArticleService.create(new BlogArticle(0L,"Les patrons de conception",
                "https://user.oc-static.com/upload/2020/11/12/16051678148864_4C4_Testez%20et%20d%E2%94%9C%C2%AEployez%20votre%20application.png",
                "Créez une application Java avec Spring Boot.............................."));

        blogArticleService.create(new BlogArticle(1L,"Comment créer un formulaire de contact? ",
                "",
                ""));

        blogArticleService.create(new BlogArticle(2L,"Expression de la motivation",
                "https://www.esce.fr/wp-content/uploads/sites/11/2022/03/reflexion-dossier-sesame.jpg",
                "<h2>Lettre de motivation pour job d'été </h2>" +
                        "<div style=\" margin: 20px auto; padding:10px; border: 0.2px solid gray; \">" +
                        "<div >\n" +
                        "[Ton prénom et nom]<br/>\n" +
                        "[Ton adresse]<br/>\n" +
                        "[Ton téléphone]<br/>\n" +
                        "[Ton email]<br/>\n" +
                        "</div>\n" +
                        "\n" +
                        "<div style=\" text-align: right ; \">\n" +
                        "\n" +
                        "[Nom de l’entreprise]<br/>\n" +
                        "[Adresse de l’entreprise]<br/>\n" +
                        "<br/>\n" +
                        "À [Ville], le [date]<br/>\n" +
                        "</div>\n" +
                        "\n" +
                        "<div>\n" +
                        "\n" +
                        "Madame, Monsieur,<br/><br/>\n" +
                        "\n" +
                        "Actuellement étudiant(e) en [FILIÈRE], je suis à la recherche d’un emploi d’été dans l’optique de financer mes études. Je suis disponible sur la période du [DATE DE DÉBUT] au [DATE DE FIN] compris, pour apporter ma polyvalence et ma motivation à votre équipe !\n" +
                        "<br/><br/>\n" +
                        "En effet, j’ai pris connaissance de votre offre d’emploi en tant que [POSTE] au sein de votre entreprise [NOM DE L’ENTREPRISE] et me permets de vous proposer ma candidature. Ayant pour ambition de devenir [MÉTIER], travailler pour votre enseigne serait pour moi l’opportunité de développer mes compétences commerciales.\n" +
                        "<br/><br/>\n" +
                        "D’autre part, j’ai acquis lors de ma première année de formation des capacités relationnelles que j’aimerais appliquer concrètement en entreprise cet été. Dynamique, organisé(e) et autonome, je saurais prendre au sérieux les missions que vous me confierez.\n" +
                        "<br/><br/>\n" +
                        "Déterminée à décrocher ce poste, j’espère avoir l’occasion de vous présenter mes motivations de vive voix à l’occasion d’un entretien.\n" +
                        "<br/><br/>\n" +
                        "Dans l’attente de votre réponse, je reste à votre disposition pour tout entretien et vous adresse mes sincères salutations.\n" +
                        "</div>\n" +
                        "\n" +
                        "<br/>\n" +
                        "<div style=\"text-align: right ; \">\n" +
                        "\n" +
                        "[Prénom, nom et signature]\n" +
                        "</div></div>"));

        blogArticleService.create(new BlogArticle(3L,"Comment rédiger un cahier des charges",
                "https://www.lafabriquedunet.fr/wp-content/uploads/2022/11/objectifs-smart-art-rediger-cahier-des-charges.png",
                "\n" +
                        "<h2>Définition du cahier des charges fonctionnel</h2>\n" +
                        "\n" +
                        "Un cahier des charges fonctionnel est un document rassemblant l'ensemble des éléments liés à un projet. Le besoin, les prestations attendues et les objectifs y sont détaillés, ainsi que les différentes contraintes (techniques, juridiques ou budgétaires). On y retrouve la liste des intervenants, leurs tâches respectives et le planning global.\n" +
                        "<h2>6 étapes pour rédiger un cahier des charges fonctionnel</h2>" +
                        "<ol><li>Présenter le contexte du projet</li>" +
                        "<li>Définir le besoin avec précision</li>" +
                        "<li>Identifier les résultats attendus</li>" +
                        "<li>Cadrer les contraintes du projet</li>" +
                        "<li>Lister les ressources nécessaires</li>" +
                        "<li>Fixer des délais clairs et réalistes</li>" +
                        "</ol>"));

        blogArticleService.create(new BlogArticle(4L,"How Do Web Sessions Work? | Hazelcast",
                "https://hazelcast.com/wp-content/uploads/2021/12/diagram-Web-Sessions.png",
                "<h2>Une session c'est quoi? </h2>" +
                        "Une session est un mécanisme technique permettant de sauvegarder temporairement sur le serveur des informations relatives à un internaute. Ce système a notamment été inventé pour palier au fait que le protocole HTTP agit en mode non connecté. A chaque ouverture de nouvelle session, l'internaute se voit attribué un identifiant de session. Cet identifiant peut-être transmis soit en GET (PHPSESSID ajouté à la fin de l'url), POST ou Cookie (cookie sur poste client) selon la configuration du serveur. Les informations seront quant à elles transférées de page en page par le serveur et non par le client. Ainsi, la sécurité et l'intégrité des données s'en voient améliorées ainsi que leur disponibilité tout au long de la session. Une session peut contenir tout type de données : nombre, chaîne de caractères et même un tableau." +
                        "https://apprendre-php.com/tutoriels/tutoriel-14-les-sessions.html "));

        blogArticleService.create(new BlogArticle(5L,"Deployment definition & fonctionnement ",
                "https://www.weodeo.com/wp-content/uploads/2021/11/Virtualisation.jpg",
                ""));

        blogArticleService.create(new BlogArticle(6L,"Clean Code",
                "https://online.edhec.edu/wp-content/uploads/2022/07/pexels-luis-gomes-546819-1-1920x1275.jpg",
                "<h2>Clean Code, les trois principes de base</h2>" +
                        "Le code parfait n’existe pas mais il doit bien être bien conçu (Craftmanship*)" +
                        "</br></br>Ce qui est fait n’est plus à faire. " +
                        "</br></br>Votre code ne vous appartient pas !" +
                        "</br></br>(  Une code propre peut s’appuyer sur les principes du S.O.L.I.D ) "));

        blogArticleService.create(new BlogArticle(7L,"Les cookies",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYvCKucG5SZAdKlbRKa0Schyj5D1tKozDGww&s",
                "Un cookie est un petit fichier stocké par un serveur dans le terminal (ordinateur, téléphone, etc.) d’un utilisateur et associé à un domaine web (c’est à dire dans la majorité des cas à l’ensemble des pages d’un même site web).  Ce fichier est automatiquement renvoyé lors de contacts ultérieurs avec le même domaine.\n" +
                        "</br></br>\n" +
                        "Les cookies ont de multiples usages : ils peuvent servir à mémoriser votre identifiant client auprès d'un site marchand, le contenu courant de votre panier d'achat, la langue d’affichage de la page web, un identifiant permettant de tracer votre navigation à des fins statistiques ou publicitaires, etc. Certains de ces usages sont strictement nécessaires aux fonctionnalités expressément demandées par l’utilisateur ou bien à l’établissement de la communication et donc exemptés de consentement. D’autres, qui ne correspondent pas à ces critères, nécessitent un consentement de l’utilisateur avant lecture ou écriture.\n" +
                        "</br></br>\n" +
                        "La distinction entre cookies « tiers » (ou « third party ») et cookie « internes » (ou « first-party ») est technique. </br></br>\n" ));

        blogArticleService.create(new BlogArticle(8L,"Protocole HTTP",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR59yYzlLJlZ3GL7ykUCtoc0vlVphzWVc2QQMrdjye6AQ&s",
                "<h2>Définition</h2></br></br>" +
                        "Le protocole HTTP, pour HyperText Transfer Protocol, est un protocole de communication client-serveur qui permet d'accéder à des ressources situées sur un serveur Web. Aujourd'hui, on lui préfère le HTTPS, dont le S signifie Secured, il s'agit d'une variante sécurisée du protocole HTTP et qui s'appuie sur les protocoles TLS pour chiffrer les échanges entre le client et le serveur.\n" +
                        "</br></br>\n" +
                        "Pour communiquer avec un serveur Web au travers du protocole HTTP, on s'appuiera sur un client HTTP. Au quotidien, ce client HTTP prend la forme d'un navigateur Internet (Firefox, Chrome, Edge, etc...), même s'il existe de nombreux outils, notamment en ligne de commandes, capable d'effectuer des requêtes Web.\n" +
                        "</br></br>\n" +
                        "Depuis les débuts de l'Internet, le protocole HTTP (et maintenant le HTTPS) est utilisé sur les serveurs Web, notamment pour héberger un site Internet, que ce soit un blog, un site vitrine, ou un site d'e-commerce. Le HTTPS est recommandé, car il est sécurisé (échanges chiffrés) contrairement au HTTP.</br></br>" +
                        "</br> <h2>Quel est le port utilisé par le HTTP ?</h2></br></br>\n" +
                        "\n" +
                        "Pour les communications entre un client HTTP et un serveur Web, le port 80 est utilisé lorsque le protocole HTTP sert à établir la connexion. Autrement dit, le serveur Web écoute sur le port 80 pour recevoir les requêtes HTTP émises par les clients.\n" +
                        "\n" +
                        "</br></br>C'est le seul numéro de port associé au protocole HTTP. Ainsi, lorsque l'on se connecte sur une page Web, par exemple \"http://www.domaine.fr\", le navigateur sait qu'il doit envoyer sa requête sur le port 80 du serveur Web. Néanmoins, il est possible d'utiliser un port d'écoute différent sur son serveur Web, dans ce cas il faudra le spécifier au niveau de la requête. Si le port 80 est remplacé par le port 8080, il faudra utiliser la syntaxe suivante : http://www.domaine.fr:8080.\n" +
                        "\n" +
                        "</br></br>Pour information, le protocole HTTPS utilise un numéro de port différent puisqu'il s'appuie sur le port 443." +
                        "https://www.it-connect.fr/le-protocole-http-pour-les-debutants/?utm_content=cmp-true "));

        blogArticleService.create(new BlogArticle(9L,"Méthode Scrum ",
                "https://bubbleplan.net/blog/wp-content/uploads/2018/05/430.jpeg",
                ""));

        blogArticleService.create(new BlogArticle(10L,"Méthode Agile ",
                "https://etcdigital.fr/wp-content/uploads/2022/01/MicrosoftTeams-image-10.jpg",
                ""));

        blogArticleService.create(new BlogArticle(11L,"Référencement SEO",
                "https://f.maformation.fr/edito/sites/3/2022/01/apprendre-referencement.jpeg",
                "Le référencement naturel, ou l’optimisation pour les moteurs de recherche (en anglais SEO pour Search Engine Optimization), est une stratégie incontournable pour les TPE et PME qui cherchent à se démarquer en ligne afin d’atteindre leur public cible. En effet, le SEO permet d'améliorer la visibilité d'un site web sur les moteurs de recherche et d'attirer une audience qualifiée de clients potentiels. C’est en ligne que les consommateurs d’aujourd’hui effectuent leurs recherches avant d'effectuer un achat ou de faire appel à un service. Il est donc crucial de comprendre et d'appliquer les bonnes pratiques du SEO." +
                        "</br></br>" +
                        "<h2>La balise <title> pour optimiser le titre de votre page</h2>" +
                        "<h3>Bonnes pratiques pour optimiser votre balise title</h3>" +
                        "<ol>" +
                        "<li> <strong>Soyez descriptif et pertinent :</strong> rédigez un titre précis et descriptif qui reflète le contenu de votre page. Choisissez des mots-clés pertinents pour aider les moteurs de recherche à comprendre le sujet principal.</li>" +
                        "<li> <strong>Limitez la longueur :</strong> gardez votre balise <title> concise, idéalement entre 50 et 60 caractères. Cela garantit que le titre s'affiche correctement dans les résultats de recherche et attire l'attention des utilisateurs.</li>" +
                        "<li> <strong>Choisissez les mots-clés stratégiquement : </strong>placez les mots-clés importants au début de votre balise <title> pour maximiser leur impact.</li>" +
                        "<li> <strong>Soyez accrocheur : </strong>utilisez des mots ou des expressions accrocheurs pour inciter les utilisateurs à cliquer sur votre lien dans les résultats de recherche et augmenter ainsi votre taux de clics.</li>" +
                        "<li> </li>" +
                        "</ol>" +
                        "<h2>Structuration du contenu avec les balises <Hn></h2>" +
                        "<h2>Utilisation des balises de liste <ul> et <ol> pour une meilleure lisibilité</h2>" +
                        ""

        ));

        blogArticleService.create(new BlogArticle(12L,"Test de connaissance Informatique ",
                "https://blog.lesjeudis.com/wp-content/uploads/2022/03/bilan-test-competences-informatiques.jpg",
                ""));

        blogArticleService.create(new BlogArticle(13L,"Différence entre Angular & React ",
                "https://integrio.net/static/img%20react%20vs%20angular-153402ea67e4341b0cf0e7effd693593.png",
                "<h2>Qu’est-ce qu’Angular ?</h2>" +
                        "Angular est une plateforme open source basée sur TypeScript et un framework d’application web développé par une équipe\n" +
                        "de Google. Le framework aide à créer des applications à page unique en utilisant TypeScript et HTML. Angular est la\n" +
                        "technologie que vous voulez si vous cherchez à créer des applications pour le mobile et le web.\n" +
                        "<br />\n" +
                        "\n" +
                        "Contrairement à d’autres frameworks, Angular offre une liaison de données bidirectionnelle. Cela signifie que si vous\n" +
                        "modifiez une valeur dans la zone de saisie, cela mettra automatiquement à jour la valeur de la propriété ajoutée de la\n" +
                        "classe du composant. En d’autres termes, cela créera une synchronisation des données en temps réel et sans faille entre\n" +
                        "le modèle et la vue.\n" +
                        "<br />\n" +
                        "\n" +
                        "Vous êtes peut-être déjà au courant de ce fait, mais cela vaut la peine de le répéter pour les nouveaux développeurs qui\n" +
                        "pourraient confondre Angular et AngularJS : ils sont différents.\n" +
                        "<br />\n" +
                        "\n" +
                        "La principale différence entre Angular et AngularJS est que le premier utilise TypeScript (un exposant pour JavaScript)\n" +
                        "comme cœur, tandis que le second utilise JavaScript. En pratique, Angular est plutôt une version actualisée\n" +
                        "d’AngularJS.<br />\n" +
                        "\n" +
                        "<h2>Pourquoi devriez-vous utiliser Angular ?</h2>\n" +
                        "\n" +
                        "<li>Soutien de Google</li>\n" +
                        "<li>Documentation détaillée</li>\n" +
                        "\n" +
                        "<li>Réduction du code</li>\n" +
                        "\n" +
                        "<h2>Qui utilise Angular ?</h2>\n" +
                        "\n" +
                        "\n" +
                        "<li>Google</li>\n" +
                        "<li>Microsoft</li>\n" +
                        "<li>IBM</li>\n" +
                        "<li>PayPal</li>\n" +
                        "<li>Upwork</li>\n" +
                        "<li>Deutsche Bank</li>\n" +
                        "<li>Samsung</li>\n" +
                        "<li> Forbes</li>\n" +
                        "<li>The Guardian</li>\n" +
                        "<li>Rockstar Games</li>\n" +
                        "\n" +
                        "\n" +
                        "<h2>Qu’est-ce que React ?</h2>\n" +
                        "\n" +
                        "\n" +
                        "React est une bibliothèque JavaScript open source développée par une équipe de Facebook. React est couramment utilisé\n" +
                        "pour créer des interfaces utilisateur pour des applications à page unique à partir de composants isolés.\n" +
                        "<br />\n" +
                        "Il peut gérer les couches de vues des applications web et mobiles. Ainsi, React prend en charge le développement\n" +
                        "d’applications web et mobiles. Ce framework flexible permet aussi de créer des applications complexes si vous l’utilisez\n" +
                        "avec d’autres bibliothèques prises en charge.\n" +
                        "<br />\n" +
                        "React a une liaison de données unidirectionnelle, ce qui signifie que sa structure passe du parent à l’enfant.\n" +
                        "Cependant, pour une liaison de données bidirectionnelle, React propose LinkedStateMixin, qui met en place le modèle\n" +
                        "général de boucle de flux de données.\n" +
                        "<br />\n" +
                        "Dans le flux de données traditionnel, pour chaque nouvelle entrée de données, il fallait recharger toute la page pour\n" +
                        "voir les modifications. Dans React, un rechargement n’est pas nécessaire. C’est parce que React ne crée pas de modèles\n" +
                        "d’objets de document (DOM) supplémentaires comme le ferait un flux de données traditionnel en acceptant de nouvelles\n" +
                        "mises à jour de données.\n" +
                        "<br />\n" +
                        "<h2>Pourquoi devriez-vous utiliser React ?</h2>\n" +
                        "\n" +
                        "    <li>Facile à apprendre</li>\n" +
                        "    <li>Code réduit</li>\n" +
                        "    <li>Soutien de Facebook</li>\n" +
                        "\n" +
                        "\n" +
                        "    <h2>Qui utilise React ?</h2>\n" +
                        "\n" +
                        "    <li>Facebook</li>\n" +
                        "    <li>Instagram</li>\n" +
                        "    <li>WhatsApp</li>\n" +
                        "    <li>Netflix</li>\n" +
                        "    <li>Yahoo</li>\n" +
                        "    <li>New York Times</li>\n" +
                        "    <li>Discord</li>\n" +
                        "    <li>Dropbox</li>\n" +
                        "    <li>Ubereats</li>\n" +
                        "    <li>Atlassian</li>\n" +
                        "\n" +
                        "\n" +
                        "    <h2>Angular vs React : Une comparaison en profondeur</h2>\n" +
                        "\n" +
                        "    <h3>Similitudes</h3>\n" +
                        "    <h3>Utilité</h3>\n" +
                        "    <h3>Caractéristiques</h3>\n" +
                        "    <h3>Frameworks</h3>\n" +
                        "    <h3>Courbe d’apprentissage</h3>\n" +
                        "    <h3>Injection de dépendances (Depedency Injection ou DI)</h3>\n" +
                        "    <h3>Liaison de données</h3>\n" +
                        "    <h3>Gestion des états</h3>\n" +
                        "    <h3>Outils essentiels</h3>\n" +
                        "    <h3>Performances</h3>\n" +
                        "    <h3>Popularité</h3>\n" +
                        "    <h3>Communauté</h3>"));

        blogArticleService.create(new BlogArticle(14L,"10 conseils pour sécuriser son site internet",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Cybersecurity.png/1200px-Cybersecurity.png",
                "<h2>\n" +
                        "1. Installez un certificat SSL</h2>\n" +
                        "Pour garantir la sécurité de votre site internet, l’installation d’un certificat SSL (Secure Socket Layer) est fondamentale. Ce certificat crée une connexion chiffrée entre le serveur de votre site et le navigateur de l’utilisateur, assurant la confidentialité comme l’intégrité des données échangées. C’est le fameux « s » qui suit le « HTTP ». En passant votre site en HTTPS (HyperText Transfer Protocol Secure), vous protégez les informations sensibles de vos visiteurs contre les tentatives malveillantes d’interceptions. Vous renforcez la confiance des utilisateurs et améliorez le référencement de votre site sur les moteurs de recherche, car ces derniers favorisent les sites sécurisés. L’obtention du protocole HTTPS est notamment l’un des critères de référencement utilisé par Google.\n" +
                        "\n" +
                        "<h2>2. Sécurisez votre mot de passe de connexion</h2>\n" +
                        "\n" +
                        "Un mot de passe ne peut pas être considéré comme sécurisé si vous le définissez simplement par « 123456 » ou « prénom nom » par exemple. Choisissez-en un assez long et intégrant des majuscules, des chiffres, des caractères spéciaux, sans lien de préférence avec votre date de naissance, le prénom de votre animal de compagnie ou le nom de votre rue. Élaborez un mot de passe sans lien avec vous, ni avec des informations publiquement accessibles et pensez à activer l’authentification à deux facteurs. Cette méthode ajoute une étape supplémentaire via un autre appareil pour accéder à votre compte. Enfin, renouvelez votre mot de passe tous les trois à six mois pour éviter les piratages. Si plusieurs personnes peuvent accéder à votre site, veillez à ce qu’elles utilisent toutes un mot de passe différent.\n" +
                        "\n" +
                        "<h2>3. Définissez des droits spécifiques pour les comptes utilisateurs</h2>\n" +
                        "\n" +
                        "Vérifier la sécurité d’un site internet passe aussi par une gestion renforcée des comptes. Chaque personne qui utilise votre site doit avoir des droits spécifiques et restreints à ses dossiers personnels. Évitez de donner à trop d’utilisateurs trop de droits d’accès, d’écriture ou modification. Le mieux est donc de limiter les autorisations des utilisateurs au minimum afin d’éviter les erreurs humaines. Seuls quelques administrateurs ont la totalité des accès et chacun un compte, qui ne doit bien sûr pas être partagé.\n" +
                        "<h2>4. Pensez à sauvegarder votre site</h2>\n" +
                        "\n" +
                        "Pour protéger votre site internet, mettez en place des mesures de sauvegarde efficaces. Les sauvegardes régulières sont essentielles : elles doivent inclure les fichiers du site et sa base de données, et être stockées sur un serveur distant ou encore dans un cloud pour une sécurité maximale. En cas d’attaque, ces sauvegardes permettent une restauration rapide et réduisent les interruptions d’activité. Enfin, mettez en place un plan de récupération pour assurer une continuité de service en cas d’attaque.\n" +
                        "<h2>5. Mettez à jour votre CMS</h2>\n" +
                        "\n" +
                        "Des failles de sécurité sont découvertes régulièrement, il est donc indispensable de mettre votre système à jour tous les trois mois. Sans se précipiter sur les premières versions qui ont bien souvent une sécurité limitée, attendez les premiers retours et mettez à jour votre CMS. \n" +
                        "\n" +
                        "Pensez à mettre également à jour vos fonctionnalités, vous nettoierez ainsi les anciennes, devenues obsolètes. Ces correctifs vous permettent de rester à jour en matière de sécurité et de protection des données et de vous assurer du bon fonctionnement de votre site. Dans le cas d’une augmentation soudaine du trafic sur votre site, autrement appelée montée en charge, en raison d’une campagne de publicité par exemple, votre site sera ainsi plus robuste pour accueillir tous ces nouveaux visiteurs.\n" +
                        "\n" +
                        "Comment sécuriser un site web WordPress ?\n" +
                        "\n" +
                        "Les thèmes et plugins WordPress sont parfois des copies piratées de plugins officiels et de thèmes premium dont les fonctionnalités de vérification de licence ont été désactivées ou supprimées, susceptibles de contenir des portes dérobées (ou backdoors) permettant ces attaques. Utilisez des plugins et thèmes disposant d’une bonne réputation, c’est-à-dire qui ont déjà été testés par des utilisateurs de la communauté WordPress (référez-vous aux avis) et qui sont compatibles avec le thème que vous avez choisi pour votre site.\n" +
                        "<h2>6. Protégez votre serveur</h2>\n" +
                        "\n" +
                        "Comment sécuriser un site web contre les risques de vols de données et de perturbations du fonctionnement de votre site ? En plus des mises à jour, songez à restreindre l’accès à votre site en bloquant les adresses IP suspectes, à interdire l’accès aux fichiers les plus sensibles ou dangereux vis-à-vis de votre activité, et à mettre en place des blocages de requêtes pour contrer les différents types d’attaques potentielles. Parmi elles, on note les attaques DDos (Distributed Denial of Service, les attaques par déni de service, c’est-à-dire qui rendent indisponibles un service), le piratage de données, l’injection de code, l’installation de logiciels malveillants, le phishing (hameçonnage en français, cette méthode consiste à obtenir via un e-mail ou un SMS, d’apparence légitime, les données sensibles du destinataire comme ses coordonnées bancaires ou ses identifiants de connexion à des services financiers). D’après le baromètre 2023 du CESIN (Club des Experts de la Sécurité de l’Information et du Numérique), c’est par cette dernière méthode que 74 % des entreprises touchées par des cyberattaques ont été approchées.\n" +
                        "<h2>7. Vérifiez la fiabilité de vos outils tiers</h2>\n" +
                        "\n" +
                        "Lorsque vous exploitez un site internet, assurez-vous de la fiabilité de vos outils tiers. Optez pour des fournisseurs renommés et dignes de confiance pour éviter toutes les vulnérabilités potentielles, et effectuez une évaluation minutieuse des protocoles de sécurité qu’ils mettent en place. Assurez-vous que ces fournisseurs suivent, comme vous, des normes strictes en matière de protection des données et de confidentialité. Il est recommandé de vérifier leur historique en matière de sécurité et de consulter les avis d’autres utilisateurs.\n" +
                        "<h2>8. Validez manuellement les commentaires</h2>\n" +
                        "\n" +
                        "La validation manuelle des commentaires sur votre site internet vous permet de prévenir les publications indésirables contenant des liens de spam et d’hameçonnage, en filtrant toutes les contributions, y compris celles potentiellement nuisibles, de manière proactive. Cette pratique vous apporte un contrôle total sur ce qui est publié sur votre site. Chaque avis a vocation à être examiné pour détecter tout contenu malveillant ou comportement suspect. \n" +
                        "<h2>9. Faites des audits de sécurité</h2>\n" +
                        "\n" +
                        "L’audit de sécurité est une étape essentielle pour garantir la protection de votre site internet. En plus des pratiques courantes de sécurité, l’utilisation de plugins de monitoring peut être bénéfique pour surveiller les activités sur votre CMS, y compris les mises à jour d’articles et les connexions au back office. Vous pouvez ainsi être prévenu de toute activité anormale et réagir rapidement en cas de menace potentielle. Cependant, si malgré toutes les précautions prises, votre serveur reste vulnérable aux failles de sécurité, il est impératif d’envisager un audit de sécurité des infrastructures. Des entreprises spécialisées peuvent vous aider à élaborer un plan sur mesure pour renforcer la sécurité de vos systèmes.\n" +
                        "\n" +
                        "    Sécuriser les achats en ligne : comment rassurer ses utilisateurs ?\n" +
                        "\n" +
                        "<h2>10. Formez-vous</h2>\n" +
                        "\n" +
                        "Pour terminer, formez-vous et vos équipes régulièrement sur la sécurité de votre site, via des ressources en ligne. Rappelez-vous qu’il est aussi nécessaire d’être bien entouré au niveau de vos prestataires (développeurs, agences) pour garantir un niveau de sécurisation à la hauteur de vos attentes.\n" +
                        "\n" +
                        "La sécurité d’un site web est un processus continu. Restez vigilant, mettez en place des pratiques de sécurité solides et tenez-vous informé des dernières menaces et des meilleures pratiques, afin de bien vous protéger sur le long terme et de garantir une expérience en ligne sûre à vos utilisateurs."));

        blogArticleService.create(new BlogArticle(15L,"Animation en CSS",
                "https://media.dev.to/cdn-cgi/image/width=1000,height=420,fit=cover,gravity=auto,format=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2Fulvbh5kb1wurvegzz7bs.png",
                "" +
                        "\n" +
                        "<style> \n" +
                        "#animation {\n" +
                        "  width: 100px;\n" +
                        "  height: 100px;\n" +
                        "  background-color: red;\n" +
                        "  animation-name: example;\n" +
                        "  animation-duration: 4s;\n" +
                        "}\n" +
                        "\n" +
                        "@keyframes example {\n" +
                        "  from {background-color: red;}\n" +
                        "  to {background-color: yellow;}\n" +
                        "}\n" +
                        "</style>\n" +

                        "\n" +
                        "<h2>Exemple 1</h2>\n" +
                        "\n" +
                        "<div class='d-flex flex-row align-items-center justify-content-center flex-wrap'>" +
                        "<div id='animation'></div>\n" +
                        "\n" +
                        " <div style='width:80%; padding:15px;' ><p><b>Note:</b> When an animation is finished, it goes back to its original style.</p>\n" +
                        "" +
                        " <code> /* The animation code */\n" +
                        "@keyframes example {\n" +
                        "  from {background-color: red;}\n" +
                        "  to {background-color: yellow;}\n" +
                        "}\n" +
                        "\n" +
                        "/* The element to apply the animation to */\n" +
                        "div {\n" +
                        "  width: 100px;\n" +
                        "  height: 100px;\n" +
                        "  background-color: red;\n" +
                        "  animation-name: example;\n" +
                        "  animation-duration: 4s;\n" +
                        "} </code>" +
                        "</div>" +
                        "</div>" +
                        "" +
                        ""));


    }


    @GetMapping(value= "{id}", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String article(@PathVariable(name = "id") Long id , Model model) {
            //  th:object="${foo}" in template and thymeleaf
            model.addAttribute("commentaire", new Commentaire());
            commentaireService.create(new Commentaire(1L, "Yilmaz",
                "yilmaz@gmail.com", "C'était très utile",
                1L));

        return "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\"><head>\n" +
                "    <title>Article</title>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                "" +
                  "<style> #display-article{ margin: 50px auto; padding :30px;   text-align: center; width:800px; }"+
                " #display-article #titre{ margin-bottom: 70px; text-align:center;}" +
                " #display-article #image{ width:700px; height:auto; object-fit:cover;}" +
                " #display-article #contenu{ padding: 30px 0;   text-align: left;} " +
                "h2{ margin-top: 25px;}"+

                "#formCreationComments{ width:800px; margin: 50px auto; padding :30px;}" +
                ".div-all-comments{width:800px; margin: 50px auto; padding :30px;}" +
                ".div-all-comments h2{border-bottom: 0.2px solid black; padding: 8px 0; }" +
                ".div-all-comments .div-un-commentaire{ border-bottom: 0.2px solid black; margin: 15px 0;}" +
                ".div-all-comments .div-un-commentaire #auteur{color: #555;}" +
                ".div-all-comments .div-un-commentaire #message{ padding: 8px 0;}" +
                " </style>"+
                "</head>\n" +
                "<body>\n" +
                blogArticleService.getArticle(id).toHTMLPage()+
                commentaireService.ToHTMLListeCommentaires(id)+
                commentaireService.toCreateFormHTML()+
                "</body>\n" +
                "</html>";




    }


}


