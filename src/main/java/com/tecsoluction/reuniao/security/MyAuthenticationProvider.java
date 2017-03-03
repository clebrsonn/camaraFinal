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
	            throw new AuthenticationServiceException("Erro na localização do LOGIN!!!");
	        } 


	        //Aqui eu pego as informações do usuário pelo próprio spring security
	        UserDetails usuario = userDetailService.loadUserByUsernameAndPassword(login, senha);

	        try{
	             //Se o usuário não for null, eu o autentico no sistema
	            if(usuario != null){
	                return new MyAuthenticationToken(usuario.getUsername(), usuario.getPassword(), usuario.getAuthorities());

	            }else{
	                throw new AuthenticationServiceException("Usuário não autenticado.");
	            }

	        }catch(AuthenticationServiceException e){
	            throw e;
	        }catch(Throwable e){
	            throw new AuthenticationServiceException("Ocorreu um erro no ato da autenticação.", e);
	        }
	    }


	@Override
	public boolean supports(Class<?> arg0) {
		
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(arg0)
	                && arg0.equals(UsernamePasswordAuthenticationToken.class);
	}

}
