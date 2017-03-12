<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Editar Ordem Dia </h2> 
<div id="form"> 
 
<form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/ordemdia/editar" ModelAttribute="ordemdia" method="POST">
 
 
 
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
			
				<div class="row-half">
				  
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${ordemdia.isAtivo}"/>
					</label>
					
					</div>
					
		  	<div class="row-half">
				   <label>
				  	<span>Id Expediente</span>
						<input id="id" name="id" type="number" value="${ordemdia.id}"/>
					</label>
			 </div>
					
					
					
			 </div>
			 
		
		 	  <div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="date" value="${ordemdia.data}" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Reuniao</span>
						<input id="reuniao" name="reuniao" type="text" value="${ordemdia.reuniao}" />					
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
		 	 
		 
			
	
			
	
	
			
			<div id="botoes">
				<button class="button">Editar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>
</div>

