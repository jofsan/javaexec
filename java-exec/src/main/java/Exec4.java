
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o salário liquido: ");
        Double salarioLiquido = leitor.nextDouble();
        System.out.println("Informe o valor da condução:");
        Double valorPass = leitor.nextDouble();
        System.out.println("Informe a quantidade de vezes no mês que vai ao trabalho:");
        Integer qtdVezes = leitor.nextInt();
        System.out.println("Informe quantas conduções paga no dia:");
        Double qtdPass = leitor.nextDouble();
        System.out.println("Informe o valor total do seu VR no mes: ");
        Double vrMes = leitor.nextDouble();
        
        Double vtDia = qtdPass*valorPass;
        Double vtMes = vtDia*qtdVezes;
        Double vrDia= vrMes/qtdVezes;
        
        System.out.printf("Seu salário é %s, você gasta de VT por dia %s, e por mês: %s, Seu VR mensal é: %s e diário: %s \n"
        , salarioLiquido, vtDia, vtMes, vrMes, vrDia);
    }
}
