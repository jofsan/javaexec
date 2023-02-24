
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class DescontoProgressivo {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      CalculoDesconto calDes = new CalculoDesconto();
      NotaFiscal fisc = new NotaFiscal();
        System.out.println("Bem-vindo ao sistema de desconto Progressivo! \n");
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Digite a quantidade : ");
        Integer quantidadeProduto = leitor.nextInt();
        Double valorTotal = calDes.calcularDesconto(valorUnitario, quantidadeProduto);
        String frase = "";
        fisc.ExibirNotaFiscal(frase, valorUnitario, quantidadeProduto, valorTotal);
        
       
        System.out.println(frase);
    }
}
