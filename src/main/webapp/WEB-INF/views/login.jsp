<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">


<!-- </div> -->
	 <div class="main">
		<div class="login-form">
			<h1>Usuário</h1>
					<div class="head">
						<img src="resources/images/userlogin.png" alt=""/>
					</div>
				<form id="formlogin" action="login" method="post">
						<input type="text" id="login" name="login"class="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'USERNAME';}" >
						<input type="password" id="senha" name="login" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
						<div class="submit">
							<input type="submit" onclick="myFunction()" value="login" >
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
				
					</div>	
					<p><a href="#">Forgot Password ?</a></p>
				</form>
			</div>
			<!--//End-login-form-->
			 <!-----start-copyright---->
   					<div class="copy-right">
						<p>Copyright (c) . All rights reserved. <a href="http://w3layouts.com"> Designed by TecSolution for Sistemas</a></p> 
					</div>
				<!-----//end-copyright---->
		</div>

