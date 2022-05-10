/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valida;

/**
 *
 * @author CEDUP14
 */
public class VerificaCPF {
    public static boolean verificar(String CPF) {
        // considera-se erro VerificaCPF's formados por uma sequencia de numeros iguais
        
        if (CPF.equals("000.000.000-00") ||
            CPF.equals("111.111.111-11") ||
            CPF.equals("222.222.222-22") || CPF.equals("333.333.333-33") ||
            CPF.equals("444.444.444-44") || CPF.equals("555.555.555-55") ||
            CPF.equals("666.666.666-66") || CPF.equals("777.777.777-77") ||
            CPF.equals("888.888.888-88") || CPF.equals("999.999.999-99") ||
            (CPF.length() != 14))
            return(false);

        int cont=10;
        int soma=0;
        for(int i=0; i<11;i++){
            
            if((CPF.charAt(i)=='.')||CPF.charAt(i)=='-'){
                
            }else{
                int n=Integer.parseInt(""+CPF.charAt(i));
                soma=soma+n*cont;
                cont--;
            }
            System.out.println(CPF.charAt(i)+" - "+cont+" - "+soma);
        }
        int primeiro=(soma*10)%11;
        
        cont=11;
        soma=0;
        for(int i=0; i<13;i++){
            
            if((CPF.charAt(i)=='.')||CPF.charAt(i)=='-'){
                
            }else{
                int n=Integer.parseInt(""+CPF.charAt(i));
                soma=soma+n*cont;
                cont--;
            }
            System.out.println(CPF.charAt(i)+" - "+cont+" - "+soma);
        }
        int segundo=(soma*10)%11;
        System.out.println(primeiro+" - "+segundo);
        System.out.println(CPF.charAt(12)+"-"+CPF.charAt(13));
        if((Integer.parseInt(""+CPF.charAt(12))==primeiro)&&(Integer.parseInt(""+CPF.charAt(13))==segundo))
        {
            System.out.println("CPF Válido");
            return(true);
        }else
        {
            System.out.println("CPF Inválido");
            return(false);
        }
    }
}

