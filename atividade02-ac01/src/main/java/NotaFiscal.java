/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class NotaFiscal {
    void ExibirNotaFiscal(String linha, Double produto, Integer quantidade, Double valorDes){
        
        System.out.println("------------------------------------------------------------------------"+linha);
        System.out.format("Valor do produto: R$ %.2f  ",produto);
        System.out.format("\nQuantidade: %d ", quantidade);
        System.out.println("\n------------------------------------------------------------------------"+linha);
        System.out.format("valor com desconto: R$ %.2f   ",valorDes);
    }
}
