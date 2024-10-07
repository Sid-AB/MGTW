/***
 * 
 *  videos function
 */

function openVideo() {
    var modal = document.getElementById("videoModal");
    var video = document.getElementById("videoPlayer");
    
    // Show the modal
    modal.style.display = "block";
    
    // Play the video
    video.play();
  }
  
  // Function to close the video modal
  function closeVideo() {
    var modal = document.getElementById("videoModal");
    var video = document.getElementById("videoPlayer");
    
    // Hide the modal
    modal.style.display = "none";
    
    // Pause and reset the video
    video.pause();
    video.currentTime = 0;
  }
  
  /***
   * 
   * end video function
   * 
   */
  