
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o login: ");
        String login = leitor.nextLine();
        System.out.println("Informe a senha: ");
        String senha = leitor.nextLine();

        String logOk = "admin";
        String passOk = "#SPtech2022";

        
            while(login != logOk && senha != passOk){
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Informe o login: ");
            login = leitor.nextLine();
            System.out.println("Informe a senha: ");
            senha = leitor.nextLine();
            
            if(login.equals(logOk)&&senha.equals(passOk)){
                break;
            }
            }

        
        
        System.out.println("Login realizado com sucesso");
    }
}
