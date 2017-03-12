<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Moções</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="5"></td>
				    <td><a href="#cadastro" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
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
            
<!--      <div id="sForm" class="sForm sFormPadding"> -->
<!--         <span id="button close" class="button close"><img src="http://i.imgur.com/nnzONel.png" alt="X"  class="" /></span> -->
<!--         <h2 class="title">Adicionar Nova Reunião</h2>   -->
<!--     </div> -->

<div class="window" id="cadastro">
    <a href="#" class="fechar"><img alt="" src="${pageContext.request.contextPath}/resources/images/exitt.png"></a>
<div id="form"> 
 
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/mocao/add"  method="POST">
 
 
 
   <!-- 				DADOS DO REGISTRO DIVIDIDOS EM DOIS PARAGRAFOS	 -->
			
<!-- 			<fieldset> -->
				
<!-- 				<legend>Dados do Registro</legend> -->
			
			
<!-- 				<p>Data Criacao: -->
<!-- 					<input name="datacriacao" type="date" class="inp-form" /> -->
<%-- 					<fmt:formatDate type="date"  value="${registro.data}" pattern="dd/MM/yyyy"/> --%>
				
				
<!-- 				Usuario Criou: -->
<!-- 				<input name="usuario" type="date" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/> --%>
				
			
<!-- 				Data Ultima Modificacao: -->
<!-- 				<input name="datamodificacao" type="date" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.datamodificacao}" pattern="dd/MM/yyyy"/> --%>
				
<!-- 				</p> -->
				
<!-- 				<p> -->
				
<!-- 				Usuario Modificou: -->
<!-- 				<input name="usuario" type="text" class="inp-form"/> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/> --%>
				
				
<!-- 				Status: -->
<!-- 				<input name="status" type="text" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/> --%>
				
<!-- 			</p> -->
			
<!-- 			</fieldset> -->
			
			
	<div class="form-row">
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${mocao.isAtivo}"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Mocao</span>
						<input id="id" name="id" type="number" value="${mocao.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>Numero</span>
						<input id="numero" name="numero" type="text" value="${mocao.numero}"/>
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Descricao</span>
						<input id="descricao" name="descricao" type="text" value="${mocao.descricao}"/>					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="text" value="${mocao.data}"/>					
					</label>
		 	 </div>
		 	 
		 	 	 			<div class="form-row">
			   		<label>
			  		<span>Autor</span>
						<input id="autor" name="autor" type="text" value="${mocao.autor}" />					
					</label>
		 	 </div>
		 	 
		 	 	 	 			<div class="form-row">
			   		<label>
			  		<span>Homenageado</span>
						<input id="homenageado" name="homenageado" type="text" value="${mocao.homenageado}" />					
					</label>
		 	 </div>
			
	
			
			<div class="form-row">
				<button class="button">Salvar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>
</div>
    
    <div id="mascara"></div>
    
    
</div>




