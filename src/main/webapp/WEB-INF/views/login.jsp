<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page session="true"%>

<!-- </div> -->
<div class="main">
    <div class="login-form">
        <h1>Usuario</h1>
        <div class="head">
            <img src="resources/images/userlogin.png" alt=""/>
        </div>
        <form id="formlogin" action="login" method="post">
            <input type="text" id="username" name="username" class="text" value="">
            <input type="password" id="senha" name="senha" value="">
            <div class="submit">
                <input type="submit" value="login">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

            </div>
            <p><a href="#">Forgot Password ?</a></p>
        </form>
    </div>
    <!--//End-login-form-->
    <!-----start-copyright---->
    <div class="copy-right">
        <p>Copyright (c) . All rights reserved. <a href="http://w3layouts.com"> Designed by TecSolution for Sistemas</a>
        </p>
    </div>
    <!-----//end-copyright---->
</div>

