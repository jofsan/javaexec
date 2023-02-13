
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o login:");
        String login = leitor.nextLine();
        
        System.out.println("Informe a senha:");
        String senha = leitor.nextLine();
        
        System.out.println("O login informado é: " +login+ " e a senha: " +senha);
    }
}
