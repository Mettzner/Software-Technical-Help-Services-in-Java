/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import POJO.FornecedorPOJO;

/**
 *
 * @author CEDUP14
 */
public class FornecedorMODEL {
    
    public void verificar_campos(FornecedorPOJO fornecedorpojo) throws IllegalArgumentException {     
        if(fornecedorpojo.getID_PESSOA()== 0 ){
            throw new IllegalArgumentException("VENDA");
}         
        if(fornecedorpojo.getID_PESSOA()== 0 ){
            throw new IllegalArgumentException("CLIENTE");
}            
        if(fornecedorpojo.getOBSERVACAO().equals("")||fornecedorpojo.getOBSERVACAO().equals(null)){
            throw new IllegalArgumentException("SITUAÇAO");
}}}
