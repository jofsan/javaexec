
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class exec10 {
    //• Solicite apenas uma vez número entre 0 e 10 para o usuário.
//• Tente adivinhar o número digitado através de números randômicos.
//• A cada iteração exiba o número sorteado. 
//• Quando acontecer o “acerto” se a quantidade de vezes necessárias for: 
 //Até 3: exiba "Você é MUITO sortudo"
 //Entre 4 e 10: exiba "Você é sortudo"
 //Mais de 10: exiba "É melhor você parar de apostar e ir trabalhar"
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número entre 0 e 10: ");
        Integer numeroUser = leitor.nextInt();
        
         Integer numeroSorte = ThreadLocalRandom.current().nextInt(0, 11);
         
         System.out.println("Numeros sorteados \n "+numeroSorte);
         int cont = 0;
         while(numeroSorte!=numeroUser){
             cont++;
            System.out.println(numeroSorte = ThreadLocalRandom.current().nextInt(0, 11));
         }
         System.out.println("Acertou");
        if(cont<=3){
            System.out.println("Você é muito sortudo");
        }else if(cont>=4&&cont<=10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar e apostar e voltar ao trabalho!");
    }
    }
}
