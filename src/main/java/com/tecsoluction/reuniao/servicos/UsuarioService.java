package com.tecsoluction.reuniao.servicos;

import com.tecsoluction.reuniao.entidade.Usuario;

public interface UsuarioService {
	
	public Usuario buscaPorLoginESenha(String login, String senha);


}
