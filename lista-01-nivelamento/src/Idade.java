
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
   // • Seja executável.
//• Solicite que o usuário digite o seu nome.
//• Em seguida, o programa deverá exibir a mensagem: “Olá, Fulano! Qual o ano de
//seu nascimento?”.
//• Depois, o programa deverá exibir: “Em 2030 você terá 25 anos” (sendo "Fulano" o
//nome digitado pelo usuário e "xx" a idade do usuário)
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Olá "+nome +"! Qual o ano de seu nascimento? ");
        Integer anoNasc = leitor.nextInt();
        
        Integer ano = 2030-anoNasc;
        String frase = String.format("Em 2030 você terá %d anos", ano);
        
        System.out.println(frase+".");
        
        if(ano<10){
            System.out.println("que cheiro de danone!");
        }else if(ano>=10&&ano<18){
            System.out.println("Tem espinha ai?");
    }else if(ano>=18&&ano<25){
            System.out.println("Bem-vindo(a) a vida adulta");
    }else if(ano>=25&&ano<40){
            System.out.println("Se não resolveu a vida ainda, então comece!");
    }else if(ano>=40&&ano<60){
            System.out.println("ai ai ai ta chegando a hora!");        
    }else{
            System.out.println("Se levantar as mãos Deus puxa!");
    }
}
}