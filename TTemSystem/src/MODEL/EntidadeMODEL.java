/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import POJO.EntidadePOJO;

 
public class EntidadeMODEL {
    public void verificar_campos(EntidadePOJO entidadepojo) throws IllegalArgumentException {    
   
        if(entidadepojo.getCODIGOE()== 0 ){
            throw new IllegalArgumentException("CODIGO");
}
        if(entidadepojo.getTIPO()== 0 ){
            throw new IllegalArgumentException("TIPO");
}
        if(entidadepojo.getSTATUS()== 0 ){
            throw new IllegalArgumentException("STATUS");
}
        if(entidadepojo.getNOME().equals("")||entidadepojo.getNOME().equals(null)){
            throw new IllegalArgumentException("NOME");
}
        if(entidadepojo.getCPF().equals("")||entidadepojo.getCPF().equals(null)){
            throw new IllegalArgumentException("CPF");
}
        if(entidadepojo.getTELEFONE().equals("")||entidadepojo.getTELEFONE().equals(null)){
            throw new IllegalArgumentException("TELEFONE");   
}
        if(entidadepojo.getCEP().equals("")||entidadepojo.getCEP().equals(null)){
            throw new IllegalArgumentException("CEP");
}
        if(entidadepojo.getENDERECO().equals("")||entidadepojo.getENDERECO().equals(null)){
            throw new IllegalArgumentException("ENDERECO");
}
        if(entidadepojo.getBAIRRO().equals("")||entidadepojo.getBAIRRO().equals(null)){
            throw new IllegalArgumentException("BAIRRO");
}
        if(entidadepojo.getCIDADE().equals("")||entidadepojo.getCIDADE().equals(null)){
            throw new IllegalArgumentException("CIDADE");
}
        if(entidadepojo.getNUMERO().equals("")||entidadepojo.getNUMERO().equals(null)){
            throw new IllegalArgumentException("NUMERO");
}
        if(entidadepojo.getUF().equals("")||entidadepojo.getUF().equals(null)){
            throw new IllegalArgumentException("UF");            
}}}