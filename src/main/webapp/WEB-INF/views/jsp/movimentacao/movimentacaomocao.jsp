<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Moções</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="5"></td>
				    <td><a href="${pageContext.request.contextPath}/mocao/cadastrar" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Numero</td>
				    <td>Descricao</td>
				    <td>Autor</td>
				   	<td>Homenageado</td>
				     <td>IsAtivo</td>
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="mocao" items="${mocaoList}" varStatus="id">

		<c:choose>
		  <c:when test="${mocao.id % 2 == 0}">
		   <tr class="trow">
			     <td>${mocao.id}</td>
		                     <td><input type="date" value="${mocao.data}"></td>
				    <td>${mocao.numero}</td>
		                     <td>${mocao.descricao}</td>
		                    <td>${mocao.autor}</td>
		                    <td>${mocao.homenageado}</td>
		                      <td>${mocao.isAtivo}</td>
		                     	
			     <td class="options-width">
			        
			     
                       <a href="${pageContext.request.contextPath}/mocao/visualizacao?id=${mocao.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/mocao/editar?id=${mocao.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/mocao/delete?id=${mocao.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${mocao.id % 2 != 0}">
		          <tr class="trow">
			     <td>${mocao.id}</td>
		                     <td><input type="date" value="${mocao.data}"></td>
				    <td>${mocao.numero}</td>
		                     <td>${mocao.descricao}</td>
		                    <td>${mocao.autor}</td>
		                    <td>${mocao.homenageado}</td>
		                      <td>${mocao.isAtivo}</td>
			     <td class="options-width">
			        
			     
                       <a href="${pageContext.request.contextPath}/mocao/visualizacao?id=${mocao.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/mocao/editar?id=${mocao.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/mocao/delete?id=${mocao.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		  </c:when>
		
		</c:choose>
            
     </c:forEach>             
            </table>
            
    
</div>




