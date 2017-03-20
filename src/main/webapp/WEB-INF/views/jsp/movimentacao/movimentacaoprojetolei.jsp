<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Projetos de Lei</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="4"></td>
				    <td><a href="${pageContext.request.contextPath}/projetolei/cadastrar" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></a></td>
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
  				 
  				 
      
  <c:forEach var="projetolei" items="${projetoleiList}" varStatus="id">

		<c:choose>
		  <c:when test="${projetolei.id % 2 == 0}">
		    <tr class="trow">
			     <td>${projetolei.id}</td>
		                     <td><input type="date" value="${projetolei.data}"></td>
				    <td>${projetolei.numero}</td>
		                     <td>${projetolei.descricao}</td>
		                    <td>${projetolei.autor}</td>
		                      <td>${projetolei.isAtivo}</td>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                       <a href="${pageContext.request.contextPath}/projetolei/visualizacao?id=${projetolei.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/projetolei/editar?id=${projetolei.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/projetolei/delete?id=${projetolei.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${projetolei.id % 2 != 0}">
		           <tr class="trow">
			    <td>${projetolei.id}</td>
		                     <td><input type="date" value="${projetolei.data}"></td>
				    <td>${projetolei.numero}</td>
		                     <td>${projetolei.descricao}</td>
		                    <td>${projetolei.autor}</td>
		                      <td>${projetolei.isAtivo}</td>
<%-- 		                     <td>${vereador.email}</td> --%>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
              	     
                       <a href="${pageContext.request.contextPath}/projetolei/visualizacao?id=${projetolei.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/projetolei/editar?id=${projetolei.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/projetolei/delete?id=${projetolei.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                        
                        
                    </td>
			  </tr>
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>

</div>
    





