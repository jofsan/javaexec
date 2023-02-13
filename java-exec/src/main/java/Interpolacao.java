
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Interpolacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Informe sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.printf("%s tem %d anos \n", nome, idade);
    }
}
