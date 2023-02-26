
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class TesteValidacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica valid = new ValidacaoNumerica();
        System.out.println("Digite um número: ");
        Integer numeroUser = leitor.nextInt();
        int cont = 0;
       
       
       while(numeroUser>=0){
                cont++;
                System.out.println("Digite um número: ");
                numeroUser = leitor.nextInt();
                System.out.println(valid.verificarPrimo(numeroUser));
            }
       if(numeroUser<0){
            System.out.println("Programa finalizado!");
       }
           
        }
        }
    

