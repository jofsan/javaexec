
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
           System.out.println("Informe o login: ");
           String login = leitor.nextLine();
           
           System.out.println("Informe a senha: ");
           String senha = leitor.nextLine();
           
           System.out.println("Quantas vezes será permitido errar a senha, até ser bloqueado:");
           Integer qtdErro = leitor.nextInt();
           
           String frase = String.format("Seu login é %s, e sua senha: %s. Você tem %d"
                   + " tentativas até ser bloqueado",login,senha,qtdErro);
           
           
           System.out.println(frase);
    }
}
