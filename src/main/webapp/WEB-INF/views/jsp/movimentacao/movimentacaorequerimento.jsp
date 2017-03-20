<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Requerimento</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="4"></td>
				    <td><a href="${pageContext.request.contextPath}/requerimento/cadastrar" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Numero</td>
				    <td>Descricao</td>
				    <td>Autor</td>
				     <td>IsAtivo</td>
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="requerimento" items="${requerimentoList}" varStatus="id">

		<c:choose>
		  <c:when test="${requerimento.id % 2 == 0}">
    <tr class="trow">
			     <td>${requerimento.id}</td>
		                     <td><input type="date" value="${requerimento.data}"></td>
				    <td>${requerimento.numero}</td>
		                     <td>${requerimento.descricao}</td>
		                    <td>${requerimento.autor}</td>
		                      <td>${requerimento.isAtivo}</td>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                       <a href="${pageContext.request.contextPath}/requerimento/visualizacao?id=${requerimento.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/requerimento/editar?id=${requerimento.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/requerimento/delete?id=${requerimento.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${requerimento.id % 2 != 0}">
<tr class="trow">
			     <td>${requerimento.id}</td>
		                     <td><input type="date" value="${requerimento.data}"></td>
				    <td>${requerimento.numero}</td>
		                     <td>${requerimento.descricao}</td>
		                    <td>${requerimento.autor}</td>
		                      <td>${requerimento.isAtivo}</td>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                       <a href="${pageContext.request.contextPath}/requerimento/visualizacao?id=${requerimento.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/requerimento/editar?id=${requerimento.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/requerimento/delete?id=${requerimento.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>
            
    
    
</div>




