<?php $p = $_GET['p'];?>
<!-- NAVEGAÇÃO -->
<nav class="navbar navbar-expand-lg" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.php?p=inicio">
            <img src="img\logos\logomenor2.png" alt="Logotipo da nofilter.">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "tshirt") echo "active"; ?>" href="index.php?p=tshirt" href="index.php?p=inicio">T-shirt</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "bag") echo "active"; ?>" href="index.php?p=bag">Tote Bag</a>
                </li>        
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "Contacto") echo "active"; ?>" href="index.php?p=Contacto">Contacto</a>
                </li>
                </li>        
                <li class="nav-item">
                    <a class="nav-link <?php if ($p == "promocoes") echo "active"; ?>" href="index.php?p=promocoes">promocoes</a>
                </li>
                </li>
            </ul> 
            <form class="form d-flex" role="search">
                <i button class="bi bi-search  py-1" type="submit" placeholder="Search" aria-label="Search"></i>
                
                           
            </form>
        </div>
    </div>
</nav>