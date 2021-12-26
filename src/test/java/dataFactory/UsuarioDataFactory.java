package dataFactory;

import pojo.ProdutoPojo;
import pojo.UsuarioPojo;

public class UsuarioDataFactory {

    public static UsuarioPojo logarUsuarioValidoAdmin(String usuarioLogin, String usuarioSenha){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin(usuarioLogin);
        usuario.setUsuarioSenha(usuarioSenha);

        return usuario;
    }

}
