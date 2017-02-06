<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
	
      
      <table class="flatTable">
    			
    			<tr class="titleTr">
				    <td class="titleTd">REUNIÕES</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="5"></td>
				    <td class="plusTd"></td>
  				</tr>
  				
                <tr class="headingTr">
				    <td>Id</td>
				    <td>Data</td>
				    <td>Numero</td>
				    <td>Local</td>
				    <td>Hora</td>
				     <td>Presidente</td>
				    <td>Primeiro Secretário</td>
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    
<!-- 				    <td></td> -->
			  </tr>
                 
  <c:forEach var="reuniao" items="${reuniaoList}" varStatus="id">

		<c:choose>
		  <c:when test="${reuniao.id % 2 == 0}">
		    
		   		
			  <tr>
			     <td>${reuniao.id}</td>
		                     <td>${reuniao.datareuniao}</td>
		                    <td ><input type="text" value="${reuniao.numero}"></td>
		                     <td>${reuniao.local}</td>
		                    <td>${reuniao.hora}</td>
		                      <td>${reuniao.presidente}</td>
		                     	<td>${reuniao.primeirosecretario}</td>
			    <td class="options-width">
     
                        <a href="edicao?id=${reuniao.id}"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${reuniao.id}" ><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${reuniao.id}" ><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
			    </td>
			  </tr>
		    
		    
		    
		    
		  </c:when>
		  <c:when test="${reuniao.id % 2 != 0}">
		            <tr>
			     <td>${reuniao.id}</td>
		                     <td>${reuniao.datareuniao}</td>
		                    <td ><input type="text" value="${reuniao.numero}"></td>
		                     <td>${reuniao.local}</td>
		                    <td>${reuniao.hora}</td>
		                      <td>${reuniao.presidente}</td>
		                     	<td>${reuniao.primeirosecretario}</td>
			    <td class="options-width">
			        
			     
                        <a href="edicao?id=${reuniao.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${reuniao.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${reuniao.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			      
			
			  </tr>
		    
		    
		  </c:when>
		
		</c:choose>

    </c:forEach>             
            </table>
            
<!--      <div id="sForm" class="sForm sFormPadding"> -->
<!--         <span id="button close" class="button close"><img src="http://i.imgur.com/nnzONel.png" alt="X"  class="" /></span> -->
<!--         <h2 class="title">Adicionar Nova Reunião</h2>   -->
<!--     </div> -->
            
</div>


