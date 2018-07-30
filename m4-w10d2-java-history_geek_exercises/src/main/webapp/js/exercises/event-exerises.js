/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

	$("#SameShipping").on('click', function(){
		if(this.checked == true){
			$("#ShippingAddress1").val($("#BillingAddress1").val());
			$("#ShippingAddress2").val($("#BillingAddress2").val());
			$("#ShippingCity").val($("#BillingCity").val());
			$("#ShippingState").val($("#BillingState").val());
			$("#ShippingPostalCode").val($("#BillingPostalCode").val());
		}
	});
	
	$("input[name='ShippingType']").on('click', function(event){
		var checkBox = $(this); //Grab this object
		var checkShipping = checkBox.attr('data-cost'); //get attributes('data-cost') of this object
		$('#shipping > .price').text('$' + checkShipping); //.text for content
		
		var subttl = $('#subtotal > .price').text().substring(1);
		$('#grandtotal > .price').text('$' + (parseFloat(checkShipping) + parseFloat(subttl)).toFixed(2));
		
	});
		
//	Pirate Explorer Game
	window.addEventListener("keydown", function (event) {
		  if (event.defaultPrevented) {
		    return; // Do nothing if the event was already processed
		  }

		  switch (event.key) {
		    case "ArrowDown":
		      // Do something for "down arrow" key press.
		    		var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().next().children(stuff).addClass("ship");
		      break;
		    case "ArrowUp":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().prev().children(stuff).addClass("ship");
		      // Do something for "up arrow" key press.
		      break;
		    case "ArrowLeft":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().children(stuff).prev().addClass("ship");
		      // Do something for "left arrow" key press.
		      break;
		    case "ArrowRight":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().children(stuff).next().addClass("ship");
		      // Do something for "right arrow" key press.
		      break;
		    case "Enter":
		    	$(".ship").removeClass("ship");
		      // Resets ship
		      break;
		    default:
		      return; // Quit when this doesn't handle the key event.
		  }

		  // Cancel the default action to avoid it being handled twice
		  event.preventDefault();
		}, true);
});
