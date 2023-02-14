
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
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("digite sua primeira nota:");
        Double nota1 = leitor.nextDouble();
        System.out.println("digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();
        System.out.println("digite a terceira nota: ");
        Double nota3 = leitor.nextDouble();
        Double media = ((nota1+nota2+nota3)/3);
        System.out.printf("Ola %s sua média é: %s \n", nome,  media);
        
    }
}
