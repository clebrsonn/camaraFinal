package com.tecsoluction.reuniao.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import com.tecsoluction.reuniao.security.impl.UserDetailServiceImpl;

@Controller
public class MyAuthenticationProvider implements AuthenticationProvider {


    private UserDetailServiceImpl userDetailService;

	
	
	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {

		 	String login = (String) arg0.getPrincipal();
	        String senha = (String) arg0.getCredentials();

	        // Excecao de usuario nao autenticado
	        if (StringUtils.isEmpty(login) || StringUtils.isEmpty(senha)) {
	            throw new AuthenticationServiceException("Erro na localiza��o do LOGIN!!!");
	        } 


	        //Aqui eu pego as informa��es do usu�rio pelo pr�prio spring security
	        UserDetails usuario = userDetailService.loadUserByUsernameAndPassword(login, senha);

	        try{
	             //Se o usu�rio n�o for null, eu o autentico no sistema
	            if(usuario != null){
	                return new MyAuthenticationToken(usuario.getUsername(), usuario.getPassword(), usuario.getAuthorities());

	            }else{
	                throw new AuthenticationServiceException("Usu�rio n�o autenticado.");
	            }

	        }catch(AuthenticationServiceException e){
	            throw e;
	        }catch(Throwable e){
	            throw new AuthenticationServiceException("Ocorreu um erro no ato da autentica��o.", e);
	        }
	    }


	@Override
	public boolean supports(Class<?> arg0) {
		
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(arg0)
	                && arg0.equals(UsernamePasswordAuthenticationToken.class);
	}

}
