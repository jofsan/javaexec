
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */

//Crie uma classe chamada Acumulador que:
//• Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para
//usar vetor).
//• Exiba: "A soma dos números é x"
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        Integer numero = leitor.nextInt();
        int soma = 0;
        for(int i = numero;i>0;i--){
            soma+=i;
            String frase = String.format("A soma dos numeros é: %d ", soma);
            System.out.println(frase);
        }
    }
}
