/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var main = function(){
    $('.dropdown-toggle').click(function() {
    $('.dropdown-menu').toggle();
  });
};

$(document).ready(main);