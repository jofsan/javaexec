/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class ValidacaoNumerica {
    boolean verificarPrimo(Integer numero){
        if(numero<=1){
            System.out.format("O numero %d não é primo!\n ",numero);
            return false;
        }for(int i = 2;i<=Math.sqrt(numero);i++){
            if(numero% i ==0){
                System.out.format("O numero %d não é primo\n",numero);
                return false;
            }
        }
        
        System.out.format("O numero %d é primo\n",numero);
        return true;
    }
}

