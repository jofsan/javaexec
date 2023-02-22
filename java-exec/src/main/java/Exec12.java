
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

        String user = "";

        String passWord = "";

        while (user != userOk && passWord != passOk) {

            System.out.println("Informe o usuário: ");
            user = leitor.nextLine();
            System.out.println("Informe a senha: ");
            passWord = leitor.nextLine();

            System.out.println("Login e/ou senha inválidos");

            if (user.equals(userOk) && passWord.equals(passOk)) {
                System.out.println("Login realizado com sucesso");
                break;

            }

        }

    }
}
