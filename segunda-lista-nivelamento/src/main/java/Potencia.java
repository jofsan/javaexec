
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int b,e,res=1;
        System.out.println("Informe um numero inteiro para a base: ");
        b=leitor.nextInt();
        System.out.println("Informe um numero inteiro para o expoente: ");
        e=leitor.nextInt();
        
        for(int i =e;i>=1;i--){
            res = res*b;
        }
        System.out.println("resultado: "+ res);
    }
}
