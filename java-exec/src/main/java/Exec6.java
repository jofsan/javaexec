
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Exec6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número para tabuada:");
        Integer numero = leitor.nextInt();
        for(Integer x =0;x<11;x++){
            Integer res = numero*x;
            System.out.printf("%d X %d = %d \n ", numero , x, res);
        }
    }
}
