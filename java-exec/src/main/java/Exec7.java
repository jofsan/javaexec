
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //comparação entre o 1 e 2 número informado
        //Se é igual, diferente, maior ou menor
        Integer numero1, numero2;
        boolean Igual = false, Diferente = false, Maior = false, Menor = false;
        
        System.out.println("Informe um numero");
        numero1= leitor.nextInt();
        
        System.out.println("Informe mais um numero:");
        numero2=leitor.nextInt();
        
        if(numero1==numero2) Igual=true;
        if(numero1!=numero2) Diferente=true;
        if(numero1>numero2) Maior=true;
        if(numero1<numero2) Menor=true;
        
        System.out.println("Igual " + Igual);
        System.out.println("Diferente "+ Diferente);
        System.out.println("Maior "+ Maior);
        System.out.println("Menor "+Menor);
        
    }
}
