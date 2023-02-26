/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jofss
 */
public class ValidacaoNumerica {

    String verificarPrimo(Integer numero, String frase, String frase2) {
        frase = String.format("O numero %d não é primo!", numero);
        frase2 = String.format("O numero %d é primo", numero);
        
        if (numero <= 1) {

            return frase;

        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {

                return frase;
            }
        }

        return frase2;
    }
}
