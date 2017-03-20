<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Expedientes</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="3"></td>
				    <td><a href="${pageContext.request.contextPath}/expediente/cadastrar"  ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Numero</td>
				    <td>Reuniao</td>
				     <td>isAtivo</td>
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="expediente" items="${expedienteList}" varStatus="id">

		<c:choose>
		  <c:when test="${expediente.id % 2 == 0}">
		    <tr class="trow">
			     <td>${expediente.id}</td>
		                     <td><input type="date" value="${expediente.data}"></td>
				    <td>${expediente.numero}</td>
		                     <td>${expediente.reuniao}</td>
		                    <td>${expediente.isAtivo}</td>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/expediente/visualizacao?id=${expediente.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/expediente/editar?id=${expediente.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/expediente/delete?id=${expediente.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                            
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${expediente.id % 2 != 0}">
		           <tr class="trow">
			     <td>${expediente.id}</td>
		                     <td><input type="date" value="${expediente.data}"></td>
				    <td>${expediente.numero}</td>
		                     <td>${expediente.reuniao}</td>
		                    <td>${expediente.isAtivo}</td>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/expediente/visualizacao?id=${expediente.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/expediente/editar?id=${expediente.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/expediente/delete?id=${expediente.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                            
                        
                    </td>
			  </tr>
			  
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>

    
</div>




