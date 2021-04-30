<!DOCTYPE html>
<html lang="en">
<head>

    <!-- LINK -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/header.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&family=Open+Sans+Condensed:ital,wght@1,300&display=swap" rel="stylesheet">

</head>

<body> 
    
    <!-- HEADER -->
    <header>
    
        <div class="app-header__image">
            <img class="app-header__logo" src="logo.jpeg" alt="logo">
        </div>
    
        <!-- MENU -->
        <div class="app-header__menu">
            <nav>
                <a href="<c:url value="accueil"/>">Accueil</a>
                <a href="<c:url value="aLaffiche"/>">A l'affiche </a>
                <a href="<c:url value="infosPratiques"/>">Infos Pratiques </a>
                <a href="<c:url value="quizz"/>">Quizz </a>
                <a href="<c:url value="contacts"/>">Contacts </a>
            </nav>
        </div>
    
        <!-- CONNEXIONS -->
        <div class="app-header__compte">
            <a href="<c:url value="monCompte"/>">Mon compte </a>
            <a href="<c:url value="espacePro"/>">Espace Pro </a>
        </div>
    
    </header>
</body>

</html>