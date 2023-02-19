
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Calorias {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe em minutos (inteiro) quanto passou se aquecendo: ");
        Integer minAq = leitor.nextInt();
        System.out.println("Informe em minutos (inteiro) quanto fez de aeróbicos: ");
        Integer minAer = leitor.nextInt();
        System.out.println("Informe em minutos (inteiro) quanto fez de musculação: ");
        Integer minMus = leitor.nextInt();

        Integer caloriaAq = minAq * 12;
        Integer caloriaAer = minAer * 20;
        Integer caloriaMus = minMus * 25;
        Integer totalMin = minAq + minAer + minMus;

        Integer totalCaloria = caloriaAq + caloriaAer + caloriaMus;
        
        String frase = String.format("Olá, Jorge. Você fez  um total de %d minutos de exercícios "
                + " e perdeu cerca de %d calorias ", totalMin, totalCaloria);
        
        System.out.println(frase);

    }
}
