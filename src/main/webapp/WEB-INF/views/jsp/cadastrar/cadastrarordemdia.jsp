<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastrar Ordem Dia </h2> 
<div id="form"> 
 
  
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/ordemdia/add"  method="POST">
 
 
 
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


		    <div class="leftColumn" style="width: 50%; float:left">

			
			
		<div class="form-row">
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="checked"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Ordem Dia</span>
						<input id="id" name="id" type="number" value="${ordemdia.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  
		 	  <div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="text" value="${ordemdia.data}" />
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
            
            </div>
		 	 
			<div class="rightColumn" style="width: 50%; float:left">
    

            
            
            <div class="form-row">
                <label>
                    <span>Projetos de Leis</span>
	                    <select id="projetosleis"name="projetosleis" multiple="multiple">
	                                  <optgroup label="Escolha os Projetos de Leis">
		           			<c:forEach var="projetolei" items="${projetoleiList}">
		           			
		           				<option value="${projetolei.id}">${projetolei.descricao}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
<!--                     		<button type="reset" >Add</button> -->
                    
                </label>
            </div>
            
             <div class="form-row">
                <label>
                    <span>Requerimento</span>
	                    <select id="requerimentos"name="requerimentos" multiple="multiple">
	                                  <optgroup label="Escolha os Requerimentos">
		           			<c:forEach var="requerimento" items="${requerimentoList}">
		           			
		           				<option value="${requerimento.id}">${requerimento.descricao}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
<!--                     		<button type="reset" >Add</button> -->
                    
                </label>
            </div>
            
                         <div class="form-row">
                <label>
                    <span>Mocao</span>
	                    <select id="mocoes"name="mocoes" multiple="multiple">
	                                  <optgroup label="Escolha as Mocoes">
		           			<c:forEach var="mocao" items="${mocaoList}">
		           			
		           				<option value="${mocao.id}">${mocao.descricao}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
<!--                     		<button type="reset" >Add</button> -->
                    
                </label>
            </div>
            
            </div>
	
	
			
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>
</div>

