<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    			<tr class="titleTr">
				    <td class="titleTd">VEREADORES</td>
				       <td class="search"> <input type="text"></td>
				    	<td colspan="2"></td>
				 
				    <td class="plusTd"></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Nome</td>
				    <td>Telefone</td>
				    <td>Email</td>
<!-- 				    <td>Hora</td> -->
<!-- 				     <td>Presidente</td> -->
<!-- 				    <td>Primeiro Secret�rio</td> -->
<!-- 				    <td>Status</td> -->
				    <td>A��o</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="vereador" items="${vereadorList}" varStatus="id">

		<c:choose>
		  <c:when test="${vereador.id % 2 == 0}">
		    <tr class="trow">
			     <td>${vereador.id}</td>
		                     <td>${vereador.nome}</td>
		                    <td ><input type="text" value="${vereador.telefone}"></td>
		                     <td>${vereador.email}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="edicao?id=${vereador.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${vereador.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${vereador.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${vereador.id % 2 != 0}">
		           <tr class="trow">
			     <td>${vereador.id}</td>
		                     <td>${vereador.nome}</td>
		                    <td ><input type="text" value="${vereador.telefone}"></td>
		                     <td>${vereador.email}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="edicao?id=${vereador.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${vereador.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${vereador.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>
            
<!--      <div id="sForm" class="sForm sFormPadding"> -->
<!--         <span id="button close" class="button close"><img src="http://i.imgur.com/nnzONel.png" alt="X"  class="" /></span> -->
<!--         <h2 class="title">Adicionar Nova Reuni�o</h2>   -->
<!--     </div> -->
            
</div>



