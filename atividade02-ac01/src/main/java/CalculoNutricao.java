
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class CalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoImc calcImc = new CalculoImc();

        Double pesoUser = 0.0;
        Double alturaUser = 0.0;

        int cont = 0;

        while (cont < 5) {
            cont++;

            System.out.println("Digite o peso (Kg):");
            pesoUser = leitor.nextDouble();

            System.out.println("Digite a altura: ");
            alturaUser = leitor.nextDouble();

            String imc = String.format(" IMC é: %.2f", calcImc.calculaIMC(pesoUser, alturaUser));
            System.out.println(imc);

        }

    }

}
