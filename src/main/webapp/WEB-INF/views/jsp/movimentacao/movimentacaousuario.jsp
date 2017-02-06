<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

      <table class="flatTable">
    			
    			<tr class="titleTr">
				    <td class="titleTd">USUARIOS</td>
				     <td class="search"> <input type="text"></td>
				    <td colspan="2"></td>
				    <td class="plusTd"></td>
  				</tr>
  				
  				
  				<tr class="headingTr">
  				    <td>Id</td>
				    <td>Nome</td>
				    <td>Senha</td>
				    <td>Email</td>
				    <td>Ação</td>
				    
				    </tr>

     
  <c:forEach var="usuario" items="${usuarioList}" varStatus="id">

		<c:choose>
		  <c:when test="${usuario.id % 2 == 0}">
		    <tr>
			      <td>${usuario.id}</td>
                  <td>${usuario.nome}</td>
                  <td ><input type="password" value="${usuario.senha}"></td>
                  <td>${usuario.email}</td>

	 <td class="options-width">
			        
			     
                        <a href="edicao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		  </c:when>
		  
		  <c:when test="${usuario.id % 2 != 0}">
		           	    <tr>
			     <td>${usuario.id}</td>
		                     <td>${usuario.nome}</td>
		                    <td ><input type="password" value="${usuario.senha}"></td>
		                     <td>${usuario.email}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			    <td class="options-width">
			        
			     
                        <a href="edicao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
			  
		  </c:when>
		
		</c:choose>

    </c:forEach>             
            </table>
          
</div>




</div>


</div>