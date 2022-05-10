/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import POJO.ProdutoPOJO;

/**
 *
 * @author CEDUP14
 */
public class ProdutoMODEL {
    public void verificar_campos(ProdutoPOJO produtopojo) throws IllegalArgumentException {    
    
        //if(produtopojo.getCODIGOP()== 0 ){
            //throw new IllegalArgumentException("CODIGO DO VENDEDOR");
//}
        if(produtopojo.getQTDE()== 0 ){
            throw new IllegalArgumentException("Quantidade");
}
        if(produtopojo.getPRECO().equals("")||produtopojo.getPRECO().equals(null)){
            throw new IllegalArgumentException("Preco");
}
        if(produtopojo.getDESCRICAO().equals("")||produtopojo.getDESCRICAO().equals(null)){
            throw new IllegalArgumentException("Descricao");
}
        if(produtopojo.getMODELO().equals("")||produtopojo.getMODELO().equals(null)){
            throw new IllegalArgumentException("Modelo");
}
/*        if(produtopojo.getDESC_MARCA().equals("")||produtopojo.getDESC_MARCA().equals(null)){
            throw new IllegalArgumentException("NOME DO CLIENTE");   
}
        if(produtopojo.getDESC_COR().equals("")||produtopojo.getDESC_COR().equals(null)){
            throw new IllegalArgumentException("NOME DO CLIENTE");*/
}}