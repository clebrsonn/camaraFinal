<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">Atas</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="1"></td>
				    <td><a href="#cadastro" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				 <tr class="headingTr">
  				    <td>Id</td>
				    <td>Data</td>
				    <td>Reuniao</td>
<!-- 				    <td>Email</td> -->
<!-- 				    <td>Hora</td> -->
<!-- 				     <td>Presidente</td> -->
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
<%-- 		                     <td>${vereador.email}</td> --%>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="edicao?id=${ata.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${ata.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${ata.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		    
		  </c:when>
		  <c:when test="${ata.id % 2 != 0}">
		           <tr class="trow">
			     <td>${ata.id}</td>
		                     <td><input type="date" value="${ata.data}"></td>
				    <td>${ata.reuniao}</td>
<%-- 		                     <td>${vereador.email}</td> --%>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			     <td class="options-width">
			        
			     
                        <a href="edicao?id=${ata.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${ata.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${ata.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
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
   <h2> Cadastro Atas </h2> 
<div id="form"> 
 
 <form id="formAtas" action="add" method="POST">
 
 
 
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
			
			
	<fieldset>
		
		<legend>Dados da Ata</legend>

			<p>Id 
				<input id="id" name="id" type="text" readonly="readonly"/>
			</p>
			
			<p>Data
				<input id="data" name="data" type="text" />
			</p>
<!-- 			<p>Telefone -->
<!-- 				<input id="telefone" name="telefone" type="text" /> -->
<!-- 			</p> -->
			
           
<!-- 			<p>Email -->
<!-- 				<input id="email" name="email" type="text" /> -->
<!-- 			</p> -->
			<p>Reunião
				<input id="reuniao" name="reuniao" type="text" />
			</p>
			
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
			</div>
			
	</fieldset>
				

				

</form>
</div>
</div>
    
    <div id="mascara"></div>
    
    
</div>




