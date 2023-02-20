
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Elevadror {
   // • Seja executável.
//• Solicite ao usuário o limite de peso de um elevador (número real).
//• Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
//• Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real).
//• Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
//• Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real).
    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o limite de peso do elevador: ");
        Double limitePeso = leitor.nextDouble();
        
        System.out.println("Informe o limite de pessoas em um elevador: ");
        Integer limitePessoa = leitor.nextInt();
        
        System.out.println("Informe o peso da 1° pessoa que entrou no elevador: ");
        Double pessoa1 = leitor.nextDouble();
        
         System.out.println("Informe o peso da 1° pessoa que entrou no elevador: ");
         Double pessoa2 = leitor.nextDouble();
         
          System.out.println("Informe o peso da 1° pessoa que entrou no elevador: ");
        Double pessoa3 = leitor.nextDouble();
        
        Double pesoTotal = pessoa1+pessoa2+pessoa3;
        
        String frase = String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas"
        +" O peso total no elevador é de %.2f KG, sendo que ele suporta %.2f KG;", limitePessoa,pesoTotal,limitePeso);
        
        
        
        if(pesoTotal>limitePeso){
            System.out.println("Vamos cair!");
        }else{
            System.out.println(frase);
        }
    }
}
