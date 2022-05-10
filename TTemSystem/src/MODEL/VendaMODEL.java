/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
  
import POJO.VendaPOJO;

/**
 *
 * @author CEDUP14
 */
public class VendaMODEL {
    public void verificar_campos(VendaPOJO vendapojo) throws IllegalArgumentException {     
        if(vendapojo.getQTDE()== 0 ){
            throw new IllegalArgumentException("INSIRA UMA QUANTIDADE");
}         
        if(vendapojo.getCODIGOE()== 0 ){
            throw new IllegalArgumentException("INSIRA UM CLIENTE");
}            
        if(vendapojo.getCODIGOU()== 0 ){
            throw new IllegalArgumentException("INSIRA UM VENDEDOR");
}
        //if(vendapojo.getCLIENTE().equals("")||vendapojo.getCLIENTE().equals(null)){
            //throw new IllegalArgumentException("INSIRA UM CLIENTE");
//}
        if(vendapojo.getMARCA().equals("")||vendapojo.getMARCA().equals(null)){
            throw new IllegalArgumentException("INSIRA UM VENDEDOR");
}
       // if(vendapojo.getCODIGOP().equals("")||vendapojo.geStCODIGO().equals(null)){
            //throw new IllegalArgumentException("INSIRA UM CÓDIGO DE PRODUTO");
//}
        if(vendapojo.getCOR().equals("")||vendapojo.getCOR().equals(null)){
            throw new IllegalArgumentException("COR É OBRIGATÓRIO");           
}
        if(vendapojo.getMODELO().equals("")||vendapojo.getMODELO().equals(null)){
            throw new IllegalArgumentException("MODELO É OBRIGATÓRIO");
  }}}