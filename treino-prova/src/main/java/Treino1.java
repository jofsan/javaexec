
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
public class Treino1 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Digite um número entre 0 e 10: ");
         Integer numeroUser = leitor.nextInt();
         //variavel que contem o número sorteado
         Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
         
         System.out.println("numero sorteado: \n"+numeroSorteado);
         int cont =0;
         while(numeroSorteado!=numeroUser){
             cont++;
             //o print que mostrara os numeros sorteados enquanto for diferente do escolhido
             System.out.println(numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11));
            
           
         }
         //condições fora do while definindo a sorte do usuario
         System.out.println("Acertou!");
           if(cont<=3){
                 System.out.println("Você é muito sortudo!");
             }else if (cont>=4&&cont<=10){
                 System.out.println("você é sortudo");
             }else{
                 System.out.println("É melhor você parar de apostar e ir trabalhar!");
             }
    }
   
    
}
