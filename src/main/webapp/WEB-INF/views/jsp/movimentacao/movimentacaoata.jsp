<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Atas</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="4"></td>
				    <td><a href="#cadastro" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Reuniao</td>
				    <td>Status</td>
				    <td>Responsavel</td>
				     <td>isAtivo</td>
<!-- 				    <td>Primeiro Secretário</td> -->
<!-- 				    <td>Status</td> -->
				    <td>Ação</td>
				    
				    </tr>
  				 
  				 
      
  <c:forEach var="ata" items="${ataList}" varStatus="id">

		<c:choose>
		  <c:when test="${ata.id % 2 == 0}">
		    <tr class="trow">
			     <td>${ata.id}</td>
		           <td><input type="date" value="${ata.data}"></td>
				    <td>${ata.reuniao}</td>
		                     <td>${ata.status}</td>
		                    <td>${ata.responsavel}</td>
		                      <td>${ata.isAtivo}</td>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/ata/visualizacao?id=${ata.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/ata/editar?id=${ata.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/ata/delete?id=${ata.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                                  
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${ata.id % 2 != 0}">
		           <tr class="trow">
			    	     <td>${ata.id}</td>
		           <td><input type="date" value="${ata.data}"></td>
				    <td>${ata.reuniao}</td>
		                     <td>${ata.status}</td>
		                    <td>${ata.responsavel}</td>
		                      <td>${ata.isAtivo}</td>
			     <td class="options-width">
			        
			     
                        <a href="${pageContext.request.contextPath}/ata/visualizacao?id=${ata.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/ata/editar?id=${ata.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/ata/delete?id=${ata.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                              
                        
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

<form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/ata/add"  method="POST">
 
 
 
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
				  	<span>Id Ata</span>
						<input id="id" name="id" type="number" value="${ata.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  
		 	  <div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="text" value="${ata.data}" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
                <label>
                    <span>Reuniao</span>
	                    <select id="reuniao"name="reuniao">
	                                  <optgroup label="Escolha a Reuniao">
		           			<c:forEach var="reuniao" items="${reuniaoList}">
		           			
		           				<option value="${reuniao.id}">${reuniao.numero}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
<!--                     		<button type="reset" >Add</button> -->
                    
                </label>
            </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Status</span>
						<input id="status" name="status" type="text"  value="${ata.status}"/>					
					</label>
		 	 </div>
			
	 			<div class="form-row">
			   		<label>
			  		<span>Responsavel</span>
						<input id="responsavel" name="responsavel" type="text"  value="${ata.responsavel}"/>					
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
    




