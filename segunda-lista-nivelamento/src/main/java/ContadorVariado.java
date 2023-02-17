/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class ContadorVariado {
    public static void main(String[] args) {
        
        for(double x=0;x<=5;){
            x+=0.15;
            String frase=String.format("%.2f",x);
            System.out.println(frase);
        }
     
    }
}
