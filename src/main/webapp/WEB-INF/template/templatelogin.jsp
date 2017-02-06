<!DOCTYPE HTML>
<%-- <%@ include file="/WEB-INF/views/home.jsp" %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
    <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
	<head>


<!-- chef -->


<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" type="text/css" media="screen" title="default" />
<!--  jquery core -->
<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

<!-- Custom jquery scripts -->
<script src="${pageContext.request.contextPath}/resources/js/jquery/custom_jquery.js" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>

<script type="text/javascript">
$(document).ready(function () {
	$(".forgot-pwd").click(function () {
	$("#loginbox").hide();
	$("#forgotbox").show();
	return false;
	});

});

$(document).ready(function () {
	$(".back-login").click(function () {
	$("#loginbox").show();
	$("#forgotbox").hide();
	return false;
	});
});
</script>

	</head>
    <body>

    	
			<tiles:insertAttribute name="login" />
<%-- 			<tiles:insertAttribute name="footer" /> --%>


	</body>
</html>