
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Treino3 {

    public static void main(String[] args) {
        String mainLogin = "admin";
        String mainPass = "hello123";
        Scanner leitor = new Scanner(System.in);
        String senha = "";
        String login = "";
        System.out.println("Digite o login: ");
        login = leitor.nextLine();
        System.out.println("Digite a senha: ");
        senha = leitor.nextLine();
        if (login.equals(mainLogin) && senha.equals(mainPass)) {
            System.out.println("Login realizado");
        } else {

            while (login != mainLogin && senha != mainPass) {
                System.out.println("Login e/ou senha inválidos");
                System.out.println("Digite o login: ");
                login = leitor.nextLine();
                System.out.println("Digite a senha: ");
                senha = leitor.nextLine();
                if (login.equals(mainLogin) && senha.equals(mainPass)) {
                    System.out.println("Login realizado");
                    break;
                }
            }
        }

    }
}
