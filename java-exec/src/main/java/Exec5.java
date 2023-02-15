
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número:");
        Integer numero =leitor.nextInt();
        Integer ant = numero-1;
        Integer suc = numero+1;
        System.out.printf("Numero antecessor de %d é: %d, e o sucessor é: %d",
                numero, ant, suc);
    }
}
