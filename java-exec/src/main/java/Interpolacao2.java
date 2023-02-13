
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Interpolacao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu primeiro nome: ");
        String primeiroNome = leitor.nextLine();
        System.out.println("Informe o sobrenome: ");
        String sobrenome = leitor.nextLine();
        System.out.println("Informe ano de nascimento: ");
        Integer anoNasc = leitor.nextInt();
        System.out.println("Informe sua idade atual: ");
        Integer idade = leitor.nextInt();
        
        System.out.printf("Seu nome é %s e seu sobremnome é: %s , nasceu em %d e sua idade é: %d anos \n",
        primeiroNome, sobrenome, anoNasc, idade);
    }
}
