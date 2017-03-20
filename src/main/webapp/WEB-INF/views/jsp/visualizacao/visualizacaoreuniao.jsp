<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">
<h2> Visualização Reunião </h2> 
 			<form id="ds" class="form-labels-on-top" action="${pageContext.request.contextPath}/reuniao/add"
				ModelAttribute="reuniao" method="POST">



				<div class="leftColumn" style="width: 50%; float: left">

					<div class="form-row">
						<label> <span>Ativo?</span> <input id="isAtivo"
							name="isAtivo" type="checkbox" checked="${reuniao.isAtivo }" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Id</span> <input id="id" name="id"
							type="text" value="${reuniao.id }" />
						</label>
					</div>



					<div class="form-row">
						<label> <span>numero</span> <input id="numero"
							name="numero" type="text" value="${reuniao.numero }"/>
						</label>
					</div>

					<div class="form-row">
						<label> <span>Tipo de Reuniao</span> <select id="tipo"
							name="tipo">
							
						<option value="${reuniao.tipo}">${reuniao.tipo}</option>
							
								<optgroup label="Tipos de Reuniao">

									<option value="ORDINARIA">ORDINARIA</option>
									<option value="EXTRAORDINARIA">EXTRAORDINARIA</option>
									<option value="SOLENE">SOLENE</option>


								</optgroup>
						</select>

						</label>
					</div>

					<div class="form-row">
						<label> <span>Data</span> <input id="data" name="data"
							type="text" value="${reuniao.data}"/>
						</label>
					</div>

			</div>
			
	<div class="rightColumn" style="width: 50%; float: left">
			
					<div class="form-row">
						<label> <span>Local</span> <input id="local" name="local"
							type="text" value="${reuniao.local}" />
						</label>


					</div>
					
				


					<div class="form-row">
						<label> <span>Hora</span> <input id="hora" name="hora"
							type="text"  value="${reuniao.hora}" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Presidente</span> <input id="presidente"
							name="presidente" type="text" value="${reuniao.presidente}"/>
						</label>
					</div>

					<div class="form-row">
						<label> <span>Primeiro Secretário</span> <input
							id="primeirosecretario" name=primeirosecretario type="text" value="${reuniao.primeirosecretario}"/>
						</label>
					</div>

				</div>


				<div class="form-row">
					<button type="submit">Adicionar</button>
					<button type="reset">Apagar</button>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
					
				</div>





			</form>
</div>

