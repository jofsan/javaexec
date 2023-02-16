
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero de 0 a 10: ");
        Integer numero = leitor.nextInt();

        Integer numeroSorteado
                = ThreadLocalRandom.current().nextInt(0, 10);

        System.out.println("numeros sorteados:" + numeroSorteado);
        int cont = 0;
        while (numeroSorteado != numero) {
            cont++;
            System.out.println(numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10));
        }
        System.out.println("Acertou");
        if(cont<=3){
            System.out.println("Você é muito sortudo");
        }else if(cont>=4&&cont<=10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar e apostar e voltar ao trabalho!");
        }
    }
}
