<?php $p = $_GET['p'];?>
<!-- NAVEGAÇÃO -->
<nav class="navbar navbar-expand-lg" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.html">
            <img src="img\logos\logomenor2.png" alt="Logotipo da nofilter.">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "Home") echo "active"; ?>" aria-current="page" href="index.php?p=inicio">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "About") echo "active"; ?>" href="index.php?p=sobrenos">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "Produtos") echo "active"; ?>" href="index.php?p=produtos">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "Contacto") echo "active"; ?>" href="index.php?p=Contacto">Contacto</a>
                </li>
                </li>
            </ul> 
            <form class="d-flex" role="search">
                <i class="bi bi-search  py-1" type="search" placeholder="Search" aria-label="Search"></i>
            
                <!--<input class="form-control" type="search" placeholder="Search" aria-label="Search">
                <button class="btn my-auto  py-0" type="submit">Search</button>-->


                
            </form>
        </div>
    </div>
</nav>