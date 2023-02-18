
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class VotacaoPizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Responda a pesquisa: \n 5 - Mussarela  \n 25 - Calabresa \n 50 - Quatro queijos");
        
        int cont=0;
        int muss =0;
        int cal =0;
        int queijo=0;
        Integer bestTaste = leitor.nextInt();
        switch(bestTaste){
            case 5:
                System.out.println("Mussarela");
                break;
            case 25: 
                System.out.println("Calabresa");
                break;
            case 50:
                System.out.println("Quatro queijos");
                break;
        }
        while(cont<10){
            
           cont++;
          
            System.out.println("Responda a pesquisa: \n 5 - Mussarela  \n 25 - Calabresa \n 50 - Quatro queijos");
             bestTaste = leitor.nextInt();
             
            
             if(bestTaste.equals(5)){
                 muss++;
             }
             if(bestTaste.equals(25)){
                 cal++;
             }
             if(bestTaste.equals(50)){
                 queijo++;
             
        }
        
        }
        System.out.println("quantidade de votos Sabor mussarela: "+muss);
        System.out.println("quantidade de votos Sabor calabresa: "+ cal);
        System.out.println("quantidade de votos Sabor queijo: " +queijo);
        
        if(muss>cal&&muss>queijo){
                 System.out.println("Mussarela  é o sabor favorito.");
             }else if(cal>muss&&cal>queijo){
                 System.out.println("Calabresa  é o sabor favorito.");
             }else if(queijo>cal&&queijo>muss){
                 System.out.println("Quatro queijos  é o sabor favorito.");
             }else{
                 System.out.println("Opa, tivemos algum empate!");
             }
    }
}
