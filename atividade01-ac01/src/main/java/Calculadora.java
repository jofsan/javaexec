
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jofss
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número correspondente a operação desejada: ");
        Integer numeroSel = leitor.nextInt();
        
        if(numeroSel<5&&numeroSel!=0){
        System.out.println("Digite um número inteiro: ");
        Integer numeroOp = leitor.nextInt();
        
        for (int x = 1; x <= 10; x++) {
            Integer resSoma = numeroOp + x;
            Integer resMult = numeroOp * x;
            Integer resDiv = numeroOp / x;
            Integer resSub = numeroOp - x;
            String fraseSoma = String.format("%d + %d = %d ", numeroOp, x, resSoma);
            String fraseMult = String.format("%d X %d = %d ", numeroOp, x, resMult);
            String fraseDiv = String.format("%d / %d = %d ", numeroOp, x, resDiv);
            String fraseSub = String.format("%d - %d = %d ", numeroOp, x, resSub);
        
            switch (numeroSel) {
                case 1:
                    System.out.println(fraseSoma);
                    break;
                case 2:
                    System.out.println(fraseMult);
                    break;
                case 3:
                    System.out.println(fraseDiv);
                    break;
                case 4:
                    System.out.println(fraseSub);
                    break;
                case 0:
                    break;
            }
            }
        }
        if(numeroSel.equals(0)){
            System.out.println("Até logo");
        }else if(numeroSel!=0&&numeroSel>4){
            System.out.println("Opção invalida, tente novamente!");
    }
}
}
