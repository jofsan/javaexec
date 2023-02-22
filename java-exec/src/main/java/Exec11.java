
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec11 {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        Integer numeroUser = leitor.nextInt();
        Integer soma = 0;
         
        for(int x = numeroUser; x>0;x--){
            
            soma+=x;
           
            
        }
        String frase = String.format("A soma dos numeros é %d ", soma);
        System.out.println(frase);
    }
}
