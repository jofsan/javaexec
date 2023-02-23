
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class CalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        Double nota1aluno = leitor.nextDouble();
        System.out.println("Informe a segunda nota: ");
        Double nota2aluno = leitor.nextDouble();
        
        Calculo calc = new Calculo();
        Double media = calc.calcularMedia(nota1aluno, nota2aluno);
        
        System.out.println(String.format("Sua média é: %.1f " ,media));
    }
}
