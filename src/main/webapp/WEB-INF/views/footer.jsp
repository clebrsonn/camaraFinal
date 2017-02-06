<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>


<div id="footer">

	<p>
		Copyright (c)
		<fmt:formatDate pattern="yyyy" value="${empresaAtt.dataabertura}" />
		${empresaAtt.nomefantasia}. All rights reserved. Designed by <a
			href="http://www.nodethirtythree.com/">TecSolution</a> for <a
			href="http://www.freecsstemplates.org/">Sistemas</a>.
	</p>
</div>
