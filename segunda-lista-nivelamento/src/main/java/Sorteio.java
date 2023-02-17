
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
public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 100 para um sorteio único : ");
        Integer numero = leitor.nextInt();
        Integer nSorte = ThreadLocalRandom.current().nextInt(1, 100) ;
        
        Integer pares = 0;
        Integer impar = 0;
        Integer position = 0;
        int cont = 0;
        
        while(cont<200){
            cont++;
            System.out.println(nSorte=ThreadLocalRandom.current().nextInt(1, 100));
            if(nSorte.equals(numero)&&position.equals(0)){
                position=cont;
                
            }
           if(nSorte%2==0){
               pares++;
           } 
           if(nSorte%2!=0){
               impar++;
           }
        }
        System.out.println("o número foi sorteado pela 1ª vez: "+position);
        System.out.println("Números pares Sorteados: "+pares);
        System.out.println("Números impares Sorteados: "+impar);
    }
}
