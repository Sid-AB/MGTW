/**
* Template Name: Arsha
* Updated: Jan 29 2024 with Bootstrap v5.3.2
* Template URL: https://bootstrapmade.com/arsha-free-bootstrap-html-template-corporate/
* Author: BootstrapMade.com
* License: https://bootstrapmade.com/license/
*/

/**
 * 
 */



/** 
 * 
*/
function changeDirection(language) {
  if (language === 'ar') {
      console.log('testing '+language)
      document.documentElement.setAttribute("dir", "rtl");  // Set direction to 'rtl' for Arabic
      $(".portfolio-info ul li span a").css('direction','ltr')
    
  } else {
      document.documentElement.setAttribute("dir", "ltr");
          document.documentElement.style.fontFamily = "Helvetica, Arial, sans-serif";
          document.body.style.fontFamily = "Helvetica, Arial, sans-serif";
        //  document.getElementById('main').style.fontFamily="Helvetica, Arial, sans-serif";
          $("#main").find("*").css("font-family", "Helvetica, Arial, sans-serif");
          $("#hero").find("*").css("font-family", "Helvetica, Arial, sans-serif");
          $("#footer").find("*").css("font-family", "Helvetica, Arial, sans-serif"); 
          $(".portfolio-info ul li span a").css('direction','rtl') 
          $(".header-main").css('background-position','right')
          //document.getElementById('breadcrumbs').style.fontFamily="Helvetica, Arial, sans-serif";
          //document.getElementById('skills').style.fontFamily="Helvetica, Arial, sans-serif";
      console.log('testing '+language)  // Set direction to 'ltr' for other languages
  }
}


(function() {
  "use strict";

  /**
   * Easy selector helper function
   */
  const select = (el, all = false) => {
    el = el.trim()
    if (all) {
      return $(el).toArray(); // Returns all selected elements as an array
    } else {
      return $(el)[0]; // Returns the first element
    }
  }

  /**
   * Easy event listener function
   */
  const on = (type, el, listener, all = false) => {
    let selectEl = select(el, all)
    if (selectEl) {
      if (all) {
        $(selectEl).each(function() {
          $(this).on(type, listener)
        })
      } else {
        $(selectEl).on(type, listener)
      }
    }
  }

  /**
   * Easy on scroll event listener 
   */
  const onscroll = (el, listener) => {
    $(el).on('scroll', listener)
  }

  /**
   * Navbar links active state on scroll
   */
  let navbarlinks = select('#navbar .scrollto', true)
  const navbarlinksActive = () => {
    let position = $(window).scrollTop() + 200
    $(navbarlinks).each(function() {
      let navbarlink = this
      if (!navbarlink.hash) return
      let section = select(navbarlink.hash)
      if (!section) return
      if (position >= $(section).offset().top && position <= ($(section).offset().top + $(section).outerHeight())) {
        $(navbarlink).addClass('active')
      } else {
        $(navbarlink).removeClass('active')
      }
    })
  }
  $(window).on('load', navbarlinksActive)
  onscroll(document, navbarlinksActive)

  /**
   * Scrolls to an element with header offset
   */
  const scrollto = (el) => {
    let header = select('#header')
    let offset = header.offsetHeight

    let elementPos = select(el).offsetTop
    window.scrollTo({
      top: elementPos - offset,
      behavior: 'smooth'
    })
  }

  /**
   * Toggle .header-scrolled class to #header when page is scrolled
   */
  let selectHeader = select('#header')
  if (selectHeader) {
    const headerScrolled = () => {
      if ($(window).scrollTop() > 100) {
        $(selectHeader).addClass('header-scrolled')
      } else {
        $(selectHeader).removeClass('header-scrolled')
      }
    }
    $(window).on('load', headerScrolled)
    onscroll(document, headerScrolled)
  }

  /**
   * Back to top button
   */
  let backtotop = select('.back-to-top')
  if (backtotop) {
    const toggleBacktotop = () => {
      if ($(window).scrollTop() > 100) {
        $(backtotop).addClass('active')
      } else {
        $(backtotop).removeClass('active')
      }
    }
    $(window).on('load', toggleBacktotop)
    onscroll(document, toggleBacktotop)
  }

  /**
   * Mobile nav toggle
   */
 /* on('click', '.mobile-nav-toggle', function(e) {
    console.log('inserted')
    $('#navbar').addClass('navbar-mobile')
    $(this).addClass('bi-list bi-x')
  })

  /**
   * Mobile nav dropdowns activate
   */
 /* on('click', '.navbar .dropdown > a', function(e) {
    if ($('#navbar').hasClass('navbar-mobile')) {
      e.preventDefault()
      $(this).next().addClass('dropdown-active')
    }
  }, true)*/




  /**
   * Scroll with offset on links with a class name .scrollto
   */
  on('click', '.scrollto', function(e) {
    if ($(this.hash).length) {
      e.preventDefault()

      let navbar = $('#navbar')
      if (navbar.hasClass('navbar-mobile')) {
        navbar.removeClass('navbar-mobile')
        let navbarToggle = $('.mobile-nav-toggle')
        navbarToggle.toggleClass('bi-list bi-x')
      }

      $('html, body').animate({
        scrollTop: $(this.hash).offset().top
      }, 1000, 'easeInOutExpo');
    }
  }, true)

  /**
   * Scroll with offset on page load with hash links in the url
   */
  $(window).on('load', () => {
    if (window.location.hash && $(window.location.hash).length) {
      $('html, body').animate({
        scrollTop: $(window.location.hash).offset().top
      }, 1000, 'easeInOutExpo');
    }
  });

  /**
   * Preloader
   */
  let preloader = select('#preloader');
  if (preloader) {
    $(window).on('load', () => {
      $(preloader).remove()
    });
  }

  /**
   * Initiate glightbox 
   */
  const glightbox = GLightbox({
    selector: '.glightbox'
  });

  /**
   * Skills animation
   */
  let skillsContent = select('.skills-content');
  if (skillsContent) {
    new Waypoint({
      element: skillsContent,
      offset: '80%',
      handler: function(direction) {
        let progress = select('.progress .progress-bar', true);
        $(progress).each(function() {
          $(this).css('width', $(this).attr('aria-valuenow') + '%');
        });
      }
    })
  }

  /**
   * Portfolio isotope and filter
   */
  $(window).on('load', () => {
    let portfolioContainer = select('.portfolio-container');
    if (portfolioContainer) {
      let portfolioIsotope = new Isotope(portfolioContainer, {
        itemSelector: '.portfolio-item'
      });

      let portfolioFilters = select('#portfolio-flters li', true);

      on('click', '#portfolio-flters li', function(e) {
        e.preventDefault();
        $(portfolioFilters).removeClass('filter-active');
        $(this).addClass('filter-active');

        portfolioIsotope.arrange({
          filter: $(this).attr('data-filter')
        });
        portfolioIsotope.on('arrangeComplete', function() {
          AOS.refresh()
        });
      }, true);
    }
  });

  /**
   * Initiate portfolio lightbox 
   */
  const portfolioLightbox = GLightbox({
    selector: '.portfolio-lightbox'
  });

  /**
   * Portfolio details slider
   */
  new Swiper('.portfolio-details-slider', {
    speed: 400,
    loop: true,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false
    },
    pagination: {
      el: '.swiper-pagination',
      type: 'bullets',
      clickable: true
    }
  });

  /**
   * Animation on scroll
   */
  $(window).on('load', () => {
    AOS.init({
      duration: 1000,
      easing: "ease-in-out",
      once: true,
      mirror: false
    });
  });

})();


 // On page load, set direction based on current locale
 document.addEventListener("DOMContentLoaded", function() {
  var currentLang = document.documentElement.getAttribute("lang");  // Get the lang attribute
  changeDirection(currentLang);
});
/*
window.addEventListener('load', function() {
  const flashContainer = document.getElementById('flash-container');
  const mainContent = document.getElementById('main-content');
  const flashVideo = document.getElementById('flash-video');

 /* flashVideo.addEventListener('ended', () => {
    flashContainer.classList.add('fade-out');
    mainContent.classList.add('show-content');
}); */
  // Set a timeout to hide the flash video after a few seconds
  /*setTimeout(() => {
      // Add fade-out effect to the video container
      flashContainer.classList.add('fade-out');
      // Show the main content after the video fades out
      mainContent.classList.add('show-content');
  }, 5000); // Video will play for 5 seconds before fading out
  
});*/


$(document).ready(function(){
  var click=0;
  $('.mobile-nav-toggle').on('click',function(){
    click++;
    $('#navbar').addClass('navbar-mobile')
    $(this).addClass('bi-list')
    $(this).addClass('bi-x')
    if($(this).has('bi-x') && click > 1)
    {
      $('#navbar').removeClass('navbar-mobile')
      $(this).removeClass('bi-x')
      click=0;
    }
  })
  $('.navbar .dropdown > a').on('click',function(){
    click++;
    if($('#navbar').hasClass('navbar-mobile'))
    {
      $(this).next().addClass('dropdown-active')
      $(this).next().attr('id','showed')
     
    }
    if(click > 1)
    {
      console.log('testing'+click)
      $(this).next().removeClass('dropdown-active')
      click=0;
    }
  })
 
}) 