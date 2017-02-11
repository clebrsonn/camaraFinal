<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
	
      
      <table class="flatTable">
    			
    			<tr class="titleTr">
				    <td class="titleTd">REUNIÕES</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="4"></td>
				    <td><a href="#cadastroadd" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
                <tr class="headingTr">
				    <td>Id</td>
				    <td>Data</td>
				    <td>Numero</td>
				    <td>Local</td>
				    <td>Hora</td>
				     <td>Presidente</td>
<!-- 				    <td>Primeiro Secretário</td> -->
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
<%-- 		                     	<td>${reuniao.primeirosecretario}</td> --%>
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
<%-- 		                     	<td>${reuniao.primeirosecretario}</td> --%>
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

<div class="window" id="cadastroadd">
    <a href="#" class="fechar"><img alt="" src="${pageContext.request.contextPath}/resources/images/exitt.png"></a>
    
    <h2> Cadastro Reuniao </h2> 
<div id="form"> 
 
 <form id="formUsuario" action="add" method="POST">
 
 
 
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
		
		<legend>Dados da Reuniao</legend>

			<p>Id Reuniao
				<input id="id" name="id" type="text" readonly="readonly"/>
			</p>
			
			<p>Data
				<input id="data" name="data" type="text" />
			</p>
			<p>Numero
				<input id="numero" name="numero" type="text" />
			</p>
			
  
			<p>Local
				<input id="local" name="local" type="text" />
			</p>
			
			<p>Hora
				<input id="hora" name="hora" type="text" />
			</p>
			
				<p>Presidente
				<input id="presidente" name="presidente" type="text" />
			</p>
			
				<p>Primeiro Secretário
				<input id="primeirosecretario" name="primeirosecretario" type="text" />
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

