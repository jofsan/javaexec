
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class CalculoRenda {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos filhos possui de 0 a 3 anos: ");
        Integer filho0A3 = leitor.nextInt();

        System.out.println("Informe quantos filhos possui de 4 a 16 anos: ");
        Integer filho4A16 = leitor.nextInt();

        System.out.println("Informe quantos filhos possui de 17 A 18 anos: ");
        Integer filho17A18 = leitor.nextInt();

        Double renda1 = filho0A3 * 25.12;
        Double renda2 = filho4A16 * 15.88;
        Double renda3 = filho17A18 * 12.44;
        Integer totalFilhos = filho0A3 + filho4A16 + filho17A18;

        Double rendaTotal = renda1 + renda2 + renda3;
        String frase = String.format("Você tem um total de %d filhos e vai receber R$ %.2f de bolsa. ",
                 totalFilhos, rendaTotal);
        
        System.out.println(frase);
    }
}
