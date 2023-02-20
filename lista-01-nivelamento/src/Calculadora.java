
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Calculadora {
    //Seja executável (possui o método main).
    //Solicite um número para o usuário (número real).
    //Solicite outro número para o usuário (número real).
    //Calcule e exiba a soma dos dois números digitados.
    //Calcule e exiba a subtração do primeiro número pelo segundo.
    //Calcule e exiba a multiplicação do primeiro número pelo segundo.
    //Calcule e exiba a divisão do primeiro número pelo segundo.
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número real: ");
        Double numero1 = leitor.nextDouble();
        
        System.out.println("Informe outro número real: ");
        Double numero2 = leitor.nextDouble();
        
        double soma = numero1+numero2;
        double sub = numero2-numero1;
        double mult = numero1*numero2;
        double div = numero1/numero2;
        
        String frase = String.format("Resultado da soma: %.0f\n"
                + "Resultado da subtração %.0f \n" +" Resultado da multiplicação: %.0f \n"
        +"Resultado da divisão: %.2f" , soma, sub, mult, div);
        
        System.out.println(frase);
    }
}
