<main class="container text-center p-3 shadow rounded">
  <div id="carouselExampleCaptions" class="carousel slide">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
      
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="img\logos\logo.png" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h5>bag</h5>
          <p>€19,99</p>
        </div>
      </div>
      <div class="carousel-item">
        <img src="img\logos\logo.png" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h5>bag</h5>
          <p>€19,99</p>
        </div>
      </div>
      <div class="carousel-item">
        <img src="img\logos\logo.png" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h5>bag</h5>
          <p>€19,99</p>
        </div>
      </div>
      <div class="carousel-item">
        <img src="img\logos\logo.png" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h5>bag</h5>
          <p>€19,99</p>
        </div>
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>

  <style media="screen">
  .multi-item-carousel .carousel-inner > .item {
  transition: 500ms ease-in-out left;
}
.multi-item-carousel .carousel-inner .active.left {
  left: -33%;
}
.multi-item-carousel .carousel-inner .active.right {
  left: 33%;
}
.multi-item-carousel .carousel-inner .next {
  left: 33%;
}
.multi-item-carousel .carousel-inner .prev {
  left: -33%;
}
@media all and (transform-3d), (-webkit-transform-3d) {
  .multi-item-carousel .carousel-inner > .item {
    transition: 500ms ease-in-out left;
    transition: 500ms ease-in-out all;
    -webkit-backface-visibility: visible;
            backface-visibility: visible;
    -webkit-transform: none!important;
            transform: none!important;
  }
}
.multi-item-carousel .carouse-control.left,
.multi-item-carousel .carouse-control.right {
  background-image: none;
}
body {
  background: #333;
  color: #ddd;
}
h1 {
  color: white;
  font-size: 2.25em;
  text-align: center;
  margin-top: 1em;
  margin-bottom: 2em;
  text-shadow: 0px 2px 0px #000000;
}

</style>
<script type="text/javascript">
  // Instantiate the Bootstrap carousel
$('.multi-item-carousel').carousel({
  interval: false
});

// for every slide in carousel, copy the next slide's item in the slide.
// Do the same for the next, next item.
$('.multi-item-carousel .item').each(function(){
  var next = $(this).next();
  if (!next.length) {
    next = $(this).siblings(':first');
  }
  next.children(':first-child').clone().appendTo($(this));

  if (next.next().length>0) {
    next.next().children(':first-child').clone().appendTo($(this));
  } else {
  	$(this).siblings(':first').children(':first-child').clone().appendTo($(this));
  }
});
</script>
</body>

</main>