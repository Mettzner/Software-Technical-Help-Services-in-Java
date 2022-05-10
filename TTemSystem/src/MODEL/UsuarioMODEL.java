/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import POJO.UsuarioPOJO;


/**
 *
 * @author Thiago
 */
public class UsuarioMODEL {
    public void verificar_campos(UsuarioPOJO usuariopojo) throws IllegalArgumentException {        
        if(usuariopojo.getACESSO()== 0 ){
            throw new IllegalArgumentException("acesso");
    }
        if(usuariopojo.getNOME().equals("")||usuariopojo.getNOME().equals(null)){
            throw new IllegalArgumentException("Nome");                  
    }   
        if(usuariopojo.getUSUARIO().equals("")||usuariopojo.getUSUARIO().equals(null)){
            throw new IllegalArgumentException("Usuário");
    }
        if(usuariopojo.getSENHA().equals("")||usuariopojo.getSENHA().equals(null)){
            throw new IllegalArgumentException("Senha");
    }
    }
}