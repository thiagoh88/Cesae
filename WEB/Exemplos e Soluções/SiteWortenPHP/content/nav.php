<?php
$p = $_GET['p'];
?>
<!-- NAVEGAÇÃO -->
<nav class="navbar navbar-expand-lg" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.html">
            <img src="img/logos/logo_worten.svg" alt="Logotipo da Worten">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "inicio") echo "active"; ?>" aria-current="page" href="index.php?p=inicio">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "sobrenos") echo "active"; ?>" href="index.php?p=sobrenos">Sobre nós</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "produtos") echo "active"; ?>" href="index.php?p=produtos">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "promocoes") echo "active"; ?>" href="index.php?p=promocoes">Promoções</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "contacto") echo "active"; ?>" href="index.php?p=contacto">Contacto</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="O que estás a procura?" aria-label="Search">
                <button class="btn" type="submit">Pesquisar</button>
            </form>
        </div>
    </div>
</nav>