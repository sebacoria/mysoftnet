<html> 
<head> 
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" /> 
	<title>Polygon Creator</title>
	<meta name="keywords" content="polygon,creator,google map,v3,draw,paint">
	<meta name="description" content="Google Map V3 Polygon Creator">
	
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style.css">
	
	
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/polygon.js"></script>
	
	<script type="text/javascript">
	$(function(){
		  //create map

		 var myOptions = {
		  	zoom: 16,
		  	center: new google.maps.LatLng(-32.938646,-60.679658), 
		  	mapTypeId: google.maps.MapTypeId.ROADMAP
		  }
		 map = new google.maps.Map(document.getElementById('main-map'), myOptions);
		 
		 var creator = new PolygonCreator(map, 'maps/territory/new');

		 //reset
		 $('#reset').click(function(){ 
		 		creator.destroy();
		 		creator=null;
		 		
		 		creator=new PolygonCreator(map);
		 });		 
		 
		 
		 //show paths
		 $('#showData').click(function(){ 
		 		$('#dataPanel').empty();
		 		if(null==creator.showData()){
		 			$('#dataPanel').append('Please first create a polygon');
		 		}else{
		 			$('#dataPanel').append(creator.showData());
		 		}
		 });
		 
		 //show color
		 $('#showColor').click(function(){ 
		 		$('#dataPanel').empty();
		 		if(null==creator.showData()){
		 			$('#dataPanel').append('Please first create a polygon');
		 		}else{
		 				$('#dataPanel').append(creator.showColor());
		 		}
		 });
	});	
	</script>
</head>

<body>
	<div id="header">
	   <p>
		<span class="instruction">Instruction:</span>
		Left click on the map to create markers, when last marker meets first marker, it will form a polygon.
		Right click on the polygon to change its color.
		</p>
	</div>
	<div id="main-map">
	</div>
	<div id="side">
		<input id="reset" value="Reset" type="button" class="navi"/>
		<input id="showData"  value="Show Paths (class function) " type="button" class="navi"/>
		<input id="showColor"  value="Show Color (class function) " type="button" class="navi"/>
		<div   id="dataPanel">
		</div>
	</div>
</body>
