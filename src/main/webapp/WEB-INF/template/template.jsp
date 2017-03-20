  <!DOCTYPE HTML>
<%-- <%@ include file="/WEB-INF/views/home.jsp" %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<head>


<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js' type="text/javascript"></script>

    <script src="../resources/js/index.js" type="text/javascript"></script>

<%-- <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-1.4.1.min.js" --%>
<!-- 	type="text/javascript"></script>  -->




<!-- <script src="../resources/js/default.js" type="text/javascript"></script> -->



<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/screen.css" type="text/css" />


<script type="text/javascript">
	
// 	//funfa para o cadastro
// 	$(document).ready(function () {

		
// // 		alert('');
		
		
// 		$("#valoritem").focusout(function(){
			
// 			var valor = $("#valoritem").val();
// 		  	var qtd =$("#quantidadeitem").val();
		  	
// 			$("#valortotal").val(valor*qtd);
			
// 			var totali = $("#valortotal").val();

			
// 			var totalp = $("#totalpedido").val();
// 			var total =parseFloat(totalp+totali);

// 			$("#subtotal").val(total);


			
// 		});
		
// 		$("#valoritem").focusout(function(){
			
// 			var valor = $("#valoritem").val();
// 		  	var qtd =$("#quantidadeitem").val();
		  	
// 			$("#valortotal").val(valor*qtd);
			
// 			var totali = $("#valortotal").val();

			
// 			var totalp = $("#totalpedido").val();
// 			var total =parseFloat(totalp+totali);

// 			$("#subtotal").val(total);


			
// 		});
		
// 		$("#blink").css("opacity","0.4");//define opacidade inicial
// 		setInterval(function() {
// 		       if($("#blink").css("opacity") == 0){
// 		  $("#blink").css("opacity","1");
// 		 }else{
// 		  $("#blink").css("opacity","0");
// 		 }  }, 200);
		
// 	});


// $(".button").click(function () {
//  $("#sForm").toggleClass("open");   


// });

// $(".controlTd").click(function () {
//  $(this).children(".settingsIcons").toggleClass("display"); 
//  $(this).children(".settingsIcon").toggleClass("openIcon"); 
// });

$(document).ready(function(){
    $("a[rel=modal]").click( function(ev){
        ev.preventDefault();
 
        var id = $(this).attr("href");
 
        var alturaTela = $(document).height();
        var larguraTela = $(window).width();
     
        //colocando o fundo preto
        $('#mascara').css({'width':larguraTela,'height':alturaTela});
        $('#mascara').fadeIn(1000); 
        $('#mascara').fadeTo("slow",0.8);
 
        var left = ($(window).width() /2) - ( $(id).width() / 2 );
        var top = ($(window).height() / 2) - ( $(id).height() / 2 );
     
        $(id).css({'top':top,'left':left});
        $(id).show();   
    });
 
    $("#mascara").click( function(){
        $(this).hide();
        $(".window").hide();
    });
 
    $('.fechar').click(function(ev){
        ev.preventDefault();
        $("#mascara").hide();
        $(".window").hide();
    });
});
  
 </script> 
 
 
 
 
 
 
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
       <script type="text/javascript">
           var contador = 1;
             
           //Adiciona um novo item na tabela
              function adiciona(){

              var vid = $('#roless option:selected').val();
              
              
              var vname = $('#roless option:selected').text();

              
              //var vname = $('#role.name').val();
                    

              
//               document.getElementById("roless").options[document.getElementById("Pais").selectedIndex].text

              
//               $('#roles').append('<li>'+vid+'</li>' +
		   $('#roles').append('<li>'+vname+'</li>');
//                                                                        '<td><input type=text name="role['+contador+'].name" id="role['+contador+'].name" value="'+vname+'"></td>'+
//                                                                        '<td><button  value="Delete"  onclick="javascript:removeLinha(this)"/></td></tr>');
              contador++;

              
              
              
              
              //                      $('#rolesAdicionados').append('<tr><td><input type="text" name="roles['+ contador +'].id" id="role['+ contador +'].id" value="' + vid +'"></td>'+
// //                                                                               '<td><input type=text name="role['+contador+'].name" id="role['+contador+'].name" value="'+vname+'"></td>'+
//                                                                               '<td><button  value="Delete"  onclick="javascript:removeLinha(this)"/></td></tr>');
//                      contador++;
                     
                     
                     
              }

              //Remove o item da tabela
        function removeLinha(row) {
//               $(row).parent().parent().remove();

            $(row).parent().remove();

        }
       
    </script>
 	
 
</head>
<body>

	<div id="all">




		<tiles:insertAttribute name="topo" />


		<%-- 		<tiles:insertAttribute name="barra_usuario_topo" /> --%>
		
		<tiles:insertAttribute name="menulateral" />


		<tiles:insertAttribute name="menu" />



		<tiles:insertAttribute name="conteudo" />


		<tiles:insertAttribute name="footer" />

	</div>

</body>
</html>