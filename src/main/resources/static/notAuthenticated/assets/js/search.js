/***
 * 
 *  videos function
 */

$(document).ready(function(){
  $('#querysearch').on('click',function(){
      var query=$("#query").val()
      window.location.href='/search/'+query;
  })
})
  /***
   * 
   * end video function
   * 
   */
  