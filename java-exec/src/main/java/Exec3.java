
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor da unidade do produto:");
        Double valorUni = leitor.nextDouble();
        System.out.println("Informe a quantidade vendida:");
        Integer qtdVendida = leitor.nextInt();
        System.out.println("Informe o valor pago pelo cliente: ");
        Double valorPago = leitor.nextDouble();
        
        Double total = valorUni*qtdVendida;
        Double troco = valorPago-total;
        System.out.printf("O troco será de: %s \n ", troco);
    }
}
