
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Salario {
   //• A classe deve ser executável
//• O programa solicita o salário bruto
//• O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
//• O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
//• O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho.
//• O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de
//condução ida x 2 x 22.
//• Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT 
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o seu salário bruto: ");
           Double salarioBruto = leitor.nextDouble();
        System.out.println("Informe o valor da condução só de ida de casa para o trabalho: ");
         Double valorBus = leitor.nextDouble();
     
       
        Double descontoImposto = (salarioBruto*30)/100;
        Double valorTotalBus= (valorBus*2)*22;
        Double totalDesconto = descontoImposto+valorTotalBus;
        Double salarioLiquido = (salarioBruto - descontoImposto) - valorTotalBus;
        
        String frase = String.format("Seu salário bruto é R$ %.2f, tem um total de R$ %.2f em descontos "
                + "e receberá um líquido de R$ %.2f", salarioBruto, totalDesconto, salarioLiquido);
        System.out.println(frase);
        
        
        
    }
}
