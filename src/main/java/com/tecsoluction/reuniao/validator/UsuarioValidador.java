package com.tecsoluction.reuniao.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;



@Component
@Scope("request")
public class UsuarioValidador implements Validator {

	
	@Autowired
    private UsuarioServicoImpl userService;
	
	
	
	
	
	@Override
	public boolean supports(Class<?> aClass) {

		return Usuario.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors erros) {

		 Usuario user = (Usuario) o;

		
		
		 ValidationUtils.rejectIfEmptyOrWhitespace(erros, "userName", "NotEmpty");
	        if (user.getUserName().length() < 6 || user.getUserName().length() > 32) {
	            erros.rejectValue("userName", "Size.Usuario.username");
	        }
	        if (userService.buscaPorUserName(user.getUserName()) != null) {
	            erros.rejectValue("userName", "Duplicate.Usuario.username");
	        }

	        ValidationUtils.rejectIfEmptyOrWhitespace(erros, "senha", "NotEmpty");
	        if (user.getSenha().length() < 8 || user.getSenha().length() > 32) {
	            erros.rejectValue("senha", "Size.Usuario.senha");
	        }

//	        if (!user.getPasswordConfirm().equals(user.getPassword())) {
//	            erros.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
//	        }
		
		
	}

}
