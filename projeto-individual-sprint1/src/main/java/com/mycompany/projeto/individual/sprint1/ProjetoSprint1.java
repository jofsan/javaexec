/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.individual.sprint1;

import java.util.Scanner;

/**
 *
 * @author jofsa
 */
public class ProjetoSprint1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer userOption;

        Boolean tentar = true;
        int cont = 0;

        while (tentar) {

            System.out.println("\nBem-vindo ao programa\n");
            System.out.println("Digite a opção desejada:\n"
                    + "1- Quantas horas vou gastar assistindo série.\n"
                    + "2 - Forrest Gump Quiz\n"
                    + "3- Contabilizar Filmes/séries\n"
                    + "0- Sair.\n");
            userOption = leitor.nextInt();

            if (userOption > 3) {
                System.out.println("vamos tentar novamente.\n");
            }

            switch (userOption) {
                case 1:

                    String nomeSerie = leitor.nextLine();
                    System.out.println("Informe o nome da serie:");
                    nomeSerie = leitor.nextLine();
                    System.out.println("Digite quantos edisódios pretente assistir:");
                    Integer qtdEp = leitor.nextInt();
                    System.out.println("Informe a duração (em minutos) aproximada de cada episódio: ");
                    Integer duracaoEp = leitor.nextInt();

                    Integer totalHoras = 0;
                    Integer totalMinutos = 0;
                    totalHoras = (qtdEp * duracaoEp) / 60;
                    totalMinutos = (qtdEp * duracaoEp) % 60;
                    System.out.println(String.format("Assistir %d episodios de %s, vai gastar %d H e %d Min do seu tempo.",
                            qtdEp, nomeSerie, totalHoras, totalMinutos));
                    break;
                case 2:
                    System.out.println("Bem-vindo ao Forrest Quiz\n");
                    String respostaUsuarioNasc = leitor.nextLine();

                    System.out.println("Em qual cidade o personagem Forrest Gump nasceu?\n"
                            + " a-)Texas\n b-)Nova Iorque\n c-)Alabama");
                    respostaUsuarioNasc = leitor.nextLine();

                    String anoForrest = "a";
                    String nasceuForrest = "c";
                    String esporteForrest = "c";
                    Integer pontos = 0;
                    Integer respostaCorreta = 0;
                    String respostaUsuarioAno;

                    if (respostaUsuarioNasc.equalsIgnoreCase(nasceuForrest)) {
                        System.out.println("Respota correta");
                        respostaCorreta += 10;
                        pontos = respostaCorreta;

                    } else {
                        System.out.println("A respota correta é a alternativa: c");
                    }

                    System.out.println("Em que ano lançou o filme Forrest Gump\n a-)1994\n b-)1996\n c-)1999");
                    respostaUsuarioAno = leitor.nextLine();

                    if (respostaUsuarioAno.equalsIgnoreCase(anoForrest)) {
                        System.out.println("Respota correta");
                        respostaCorreta += 10;
                        pontos = respostaCorreta;
                    } else {
                        System.out.println("A respota correta é a alternativa: a");
                    }
                    System.out.println("Qual esporte Forest competiu contra a china? \n"
                            + " a-)golf\n b-)xadrez Iorque\n c-)ping-pong");
                    String respostaUsuarioEsporte = leitor.nextLine();
                    if (respostaUsuarioEsporte.equalsIgnoreCase(esporteForrest)) {
                        System.out.println("Respota correta");
                        respostaCorreta += 10;
                        pontos = respostaCorreta;
                    } else {
                        System.out.println("A respota correta é a alternativa: c");
                    }

                    System.out.println(String.format("\nPontuação total: %d pontos", pontos));
                    String feedBack = (pontos < 20) ? "Que tal assistir Forrest Gump!" : "Pelo visto você já assistiu Forrest Gump!!";
                    System.out.println(feedBack);
                    break;
                case 3:
                    String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                        "Julho", "agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
                    Integer total = 0;
                    for (int i = 0; i < mes.length; i++) {
                        System.out.println("Quantos filmes/série aproximadamente você assistiu em " + mes[i] + ":");
                        Integer qtdConteudo = leitor.nextInt();
                        total += qtdConteudo;

                    }
                    System.out.println(String.format("Você assistiu um total de : %d séries/filmes em um ano.", total));
                    break;
                case 0:
                    System.out.println("programa finalizado!");
                    tentar = false;
                    break;
            }
        }

    }
}
