alert("Hello World");

$( "h1" ).hover(
		  function() {
		    $( this ).append( $( "<span> ***</span>" ) );
		  }, function() {
		    $( this ).find( "span:last" ).remove();
		  }
		);