<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">VEREADORES</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="2"></td>
				    <td><a href="#cadastro" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Nome</td>
				    <td>Telefone</td>
				    <td>Email</td>
<!-- 				    <td>Hora</td> -->
<!-- 				     <td>Presidente</td> -->
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
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
			        
			     
                        <a href="${pageContext.request.contextPath}/vereador/visualizacao?id=${vereador.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/vereador/editar?id=${vereador.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/vereador/delete?id=${vereador.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                            
                        
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
			        
			     
                         <a href="${pageContext.request.contextPath}/vereador/visualizacao?id=${vereador.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/vereador/editar?id=${vereador.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/vereador/delete?id=${vereador.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                         
                        
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
<!--    <h2> Cadastro Vereadores </h2>  -->
<div class="main-content"> 
 
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/vereador/add"  method="POST">
 
 
 
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
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="checked"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Vereador</span>
						<input id="id" name="id" type="number"/>
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>Nome</span>
						<input id="nome" name="nome" type="text" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Telefone</span>
						<input id="telefone" name="telefone" type="text" />					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Email</span>
						<input id="email" name="email" type="text" />					
					</label>
		 	 </div>
			
	
			
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>
</div>
    
    <div id="mascara"></div>
    
    
</div>




