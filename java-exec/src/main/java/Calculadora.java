
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
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        Integer numero1 = leitor.nextInt();
        System.out.println("Informe mais um número inteiro:");
        Integer numero2 = leitor.nextInt();
        Integer soma = numero1 + numero2;
        Integer sub = numero1 - numero2;
        Integer mult = numero1 * numero2;
        Integer div = numero1/numero2;
        
        System.out.printf("Resultado da soma: %d Resultado da subtração: %d Resultado da multiplicação: %d  Resultado da divisão: %d \n",
                
           soma, sub, mult, div);
    }
}
