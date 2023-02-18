

import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec8 {
    public static void main(String[] args) {
        
        Integer numeroSel = ThreadLocalRandom.current().nextInt(1, 4);

        
        switch(numeroSel){
            
            case 1:
                System.out.println("Nunca desista");
                break;
            case 2: 
                System.out.println("Tenha um ótimo dia");
                break;
            case 3:
                System.out.println("Você é iluminada(o)");
                break;
            case 4: 
                System.out.println("2023 é o seu ano!");
                break;
        }
    }
}
