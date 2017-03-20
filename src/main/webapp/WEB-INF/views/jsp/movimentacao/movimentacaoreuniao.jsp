<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<div id="conteudo" class="conteudo">


	<table class="flatTable">

		<tr class="titleTr">
			<td class="titleTd">REUNIÕES</td>
			<td class="search"><input type="text"></td>
			<td colspan="6"></td>
			<td><a href="${pageContext.request.contextPath}/reuniao/cadastrar"><img
					src="${pageContext.request.contextPath}/resources/images/add.png"></a></td>
		</tr>

		<tr class="headingTr">
			<td>Id</td>
			<td>Data</td>
			<td>Numero</td>
			<td>Tipo</td>
			<td>Local</td>
			<td>Hora</td>
			<td>Presidente</td>
			<!-- 				    <td>Primeiro Secretário</td> -->
			<td>isAtivo</td>
			<td>Ação</td>


			<!-- 				    <td></td> -->
		</tr>

		<c:forEach var="reuniao" items="${reuniaoList}" varStatus="id">

			<c:choose>
				<c:when test="${reuniao.id % 2 == 0}">


					<tr>
						<td>${reuniao.id}</td>
						<td>${reuniao.data}</td>
						<td><input type="text" value="${reuniao.numero}"></td>
						<td>${reuniao.tipo}</td>
						
						<td>${reuniao.local}</td>
						<td>${reuniao.hora}</td>
						<td>${reuniao.presidente}</td>
						<%-- 		                     	<td>${reuniao.PrimeiroSecretario}</td> --%>
						<td>${reuniao.isAtivo}</td>

						<td class="options-width"><a
							href="${pageContext.request.contextPath}/reuniao/visualizacao?id=${reuniao.id}"
							title="Edit"><img
								src="${pageContext.request.contextPath}/resources/images/visualizar.png"
								alt="X" /></a> <a
							href="${pageContext.request.contextPath}/reuniao/editar?id=${reuniao.id}"
							title="aaa"><img
								src="${pageContext.request.contextPath}/resources/images/editar.png"
								alt="placeholder icon" /></a> <a
							href="${pageContext.request.contextPath}/reuniao/delete?id=${reuniao.id}"
							title="bbb"><img
								src="${pageContext.request.contextPath}/resources/images/excluir.png"
								alt="placeholder icon" /></a>
								
								
								
												<a
							href="${pageContext.request.contextPath}/reuniao/tocar?id=${reuniao.id}"
							title="bbb">
							
<!-- 							<img -->
<%-- 								src="${pageContext.request.contextPath}/resources/images/play3.png" --%>
<!-- 								alt="placeholder icon" />	 -->
								
								<audio src="${pageContext.request.contextPath}/resources/audio/audio.mp3" controls="controls">
								<p>Seu navegador não suporta o elemento audio </p>
								</audio></a>
							
								</td>
					</tr>




				</c:when>
				<c:when test="${reuniao.id % 2 != 0}">
					<tr>
						<td>${reuniao.id}</td>
						<td>${reuniao.data}</td>
						<td><input type="text" value="${reuniao.numero}"></td>
						<td>${reuniao.tipo}</td>
						<td>${reuniao.local}</td>
						<td>${reuniao.hora}</td>
						<td>${reuniao.presidente}</td>
						<%-- 		                     	<td>${reuniao.PrimeiroSecretario}</td> --%>
						<td>${reuniao.isAtivo}</td>

						<td class="options-width"><a
							href="${pageContext.request.contextPath}/reuniao/visualizacao?id=${reuniao.id}"
							title="Edit"><img
								src="${pageContext.request.contextPath}/resources/images/visualizar.png"
								alt="X" /></a> <a
							href="${pageContext.request.contextPath}/reuniao/editar?id=${reuniao.id}"
							title="aaa"><img
								src="${pageContext.request.contextPath}/resources/images/editar.png"
								alt="placeholder icon" /></a> <a
							href="${pageContext.request.contextPath}/reuniao/delete?id=${reuniao.id}"
							title="bbb"><img
								src="${pageContext.request.contextPath}/resources/images/excluir.png"
								alt="placeholder icon" /></a>
								
								
								
								
											<a
							href="${pageContext.request.contextPath}/reuniao/tocar?id=${reuniao.id}"
							title="bbb">
							
<!-- 							<img -->
<%-- 								src="${pageContext.request.contextPath}/resources/images/play3.png" --%>
<!-- 								alt="placeholder icon" />	 -->
								
								<audio src="${pageContext.request.contextPath}/resources/audio/audio.mp3" controls="controls">
								<p>Seu navegador não suporta o elemento audio </p>
								</audio></a>
								
								</td>
					</tr>


				</c:when>

			</c:choose>

		</c:forEach>
	</table>
	
<%-- 	<audio src="${pageContext.request.contextPath}/resources/audio/audio.mp3" controls autoplay loop> --%>
<!-- <p>Seu navegador não suporta o elemento audio </p> -->
<!-- </audio> -->

</div>

