<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastrar Reuniao </h2> 
<div id="form"> 
 
 	<form id="ds" class="form-labels-on-top" action="${pageContext.request.contextPath}/reuniao/add"
				ModelAttribute="reuniao" method="POST">



				<div class="leftColumn" style="width: 50%; float: left">

					<div class="form-row">
						<label> <span>Ativo?</span> <input id="isAtivo"
							name="isAtivo" type="checkbox" checked="checked" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Id</span> <input id="id" name="id"
							type="text" />
						</label>
					</div>



					<div class="form-row">
						<label> <span>numero</span> <input id="numero"
							name="numero" type="text" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Tipo de Reuniao</span> <select id="tipo"
							name="tipo">
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
							type="text" />
						</label>
					</div>

			</div>
			
	<div class="rightColumn" style="width: 50%; float: left">
			
					<div class="form-row">
						<label> <span>Local</span> <input id="local" name="local"
							type="text" />
						</label>


					</div>
					
				


					<div class="form-row">
						<label> <span>Hora</span> <input id="hora" name="hora"
							type="text" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Presidente</span> <input id="presidente"
							name="presidente" type="text" />
						</label>
					</div>

					<div class="form-row">
						<label> <span>Primeiro Secretário</span> <input
							id="primeirosecretario" name="primeirosecretario" type="text" />
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
</div>

