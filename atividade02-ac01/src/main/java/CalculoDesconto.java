/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class CalculoDesconto {
     //valorDesconto = valor - ((valor*desconto)/100);
    Double calcularDesconto(Double valor, Integer quantidade){
        if(quantidade.equals(1)){
             valor = valor - ((valor*10)/100);
        }else if(quantidade.equals(2)){
             valor = valor - ((valor*20)/100);
        }else if(quantidade !=0 && quantidade>=3){
             valor = valor - ((valor*30)/100);
        }
        return(valor*quantidade);
    }
}
