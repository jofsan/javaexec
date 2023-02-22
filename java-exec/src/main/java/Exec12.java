
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Exec12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String userOk = "admin";
        String passOk = "2022<2023";

        System.out.println("Informe o usuário: ");
        String user = leitor.nextLine();

        System.out.println("Informe a senha: ");
        String passWord = leitor.nextLine();

        while (user != userOk && passWord != passOk) {

            System.out.println("Login e/ou senha inválidos");
            System.out.println("Informe o usuário: ");
            user = leitor.nextLine();
            System.out.println("Informe a senha: ");
            passWord = leitor.nextLine();

            if (user.equals(userOk) && passWord.equals(passOk)) {
                System.out.println("Login realizado com sucesso");
                break;
            }
        }

    }
}
