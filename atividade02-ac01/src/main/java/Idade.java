
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Classifica classi = new Classifica();
        System.out.println("Informe a idade: ");
        
        Integer idade = leitor.nextInt();
        String frase = "";
        classi.classificaIdade(idade, frase);
        
        System.out.println(frase);
    }
}
