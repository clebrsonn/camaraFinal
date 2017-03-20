<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Ordem Dia</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="2"></td>
				    <td><a href="${pageContext.request.contextPath}/ordemdia/cadastrar" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Reuniao</td>
				    <td>isAtivo</td>
<!-- 				    <td>Hora</td> -->
<!-- 				     <td>Presidente</td> -->
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="ordemdia" items="${ordemdiaList}" varStatus="id">

		<c:choose>
		  <c:when test="${ordemdia.id % 2 == 0}">
		    <tr class="trow">
			     <td>${ordemdia.id}</td>
		                     <td><input type="date" value="${ordemdia.data}"></td>
				    <td>${ordemdia.reuniao}</td>
		                     <td>${ordemdia.isAtivo}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
		     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/ordemdia/visualizacao?id=${ordemdia.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/ordemdia/editar?id=${ordemdia.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/ordemdia/delete?id=${ordemdia.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                            
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${ordemdia.id % 2 != 0}">
		           		    <tr class="trow">
			     <td>${ordemdia.id}</td>
		                     <td><input type="date" value="${ordemdia.data}"></td>
				    <td>${ordemdia.reuniao}</td>
		                     <td>${ordemdia.isAtivo}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
		     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/ordemdia/visualizacao?id=${ordemdia.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/ordemdia/editar?id=${ordemdia.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/ordemdia/delete?id=${ordemdia.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                            
                        
                    </td>
			  </tr>
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>
            
    
    
</div>




