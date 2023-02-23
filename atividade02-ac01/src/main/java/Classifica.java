/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Classifica {
    void classificaIdade(int i, String frase){
        if(i<=2){
            frase = "bebe";
            System.out.println(frase);
        }else if(i>=3&&i<=11){
            frase="criança";
            System.out.println(frase);
        }else if(i>=12&&i<=19){
            frase="adolescente";
            System.out.println(frase);
            
        }else if(i>=20&&i<=30){
            frase = "jovem";
            System.out.println(frase);
        }else if(i>=30&&i<=60){
            frase="adulto";
            System.out.println(frase);
            
        }else{
            frase="idoso";
            System.out.println(frase);
        }
    }
}
