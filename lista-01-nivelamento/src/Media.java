
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Media {
   // • Seja executável
//• Solicite o nome e duas notas ao usuário.
//• As notas são números reais.
//• Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
//• Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA"
//• Use Interpolação com 1 casa decimal para a média.
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Nota 1: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Nota 2:");
         Double nota2 = leitor.nextDouble();
         
         Double media = (nota1+nota2)/2;
         String frase = String.format("Ola %s. Sua média foi %.1f" , nome, media);
         
         System.out.println(frase);
         
         if(media<6){
             System.out.println("Precisa estudar mais!");
         }else if(media <=8){
             System.out.println("Está indo bem!");
    }else{
             System.out.println("Você é o cara!");
         }
    }
}
