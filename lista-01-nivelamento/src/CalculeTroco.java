
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class CalculeTroco {
    //Seja executável.
    //Solicite o valor unitário de um produto.
    //Solicite a quantidade vendida.
    //Solicite o valor pago pelo cliente.
    //Calcule e exiba o troco com a seguinte frase: "Seu troco será de R$ X"
    //"X" é o valor a ser devolvido ao cliente.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor unitario do produto: ");
        Double valorUn = leitor.nextDouble();
        
        System.out.println("Informe a quantidade vendida: ");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Informe o valor pago pelo cliente: ");
        Double valorPago = leitor.nextDouble();
        
        Double valorTotal=qtdVendida*valorUn;
        Double troco = valorPago-valorTotal;
        
       
        
        if(valorPago.equals(valorTotal)){
            System.out.println("Não tem troco a ser devolvido");
        }else if(valorPago<valorTotal){
            Double resto = valorTotal-valorPago;
          
            String fraseRest = String.format("Não há troco, favor pagar o montante restante de R$: %.2f " ,resto);
            System.out.println(fraseRest);
        }else{
             String frase = String.format("Seu troco será de R$ %.2f ", troco);
        System.out.println(frase);
        }
    }
   
}
