// Aluno: Thiago Luiz Miorelli
// TP1 Projeto de Bloco

import java.util.Scanner;

public class BibliotecaUniversitaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== BIBLIOTECA UNIVERSITARIA =====");
            System.out.println("1 - Consultar acervo");
            System.out.println("2 - Realizar emprestimo");
            System.out.println("3 - Devolver exemplar");
            System.out.println("4 - Reservar livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consulta ao acervo selecionada.");
                    break;

                case 2:
                    System.out.println("Realizar emprestimo selecionado.");
                    break;

                case 3: {
                    int prazoPadrao = 14;
                    double multaPorDia = 2.00;

                    int diaRetirada;
                    int diaDevolucao;
                    int diaLimite;
                    int diasAtraso;
                    // Para esse TP1, irei considerar datas como números inteiros.
                    // Nas próximas etapas pretendo aperfeiçoar usando localdate.
                    System.out.print("Informe o dia da retirada: ");
                    diaRetirada = sc.nextInt();

                    System.out.print("Informe o dia da devolucao: ");
                    diaDevolucao = sc.nextInt();

                    if (diaDevolucao < diaRetirada) {
                        System.out.println("Erro: a devolucao nao pode ser antes da retirada.");
                    } else {
                        diaLimite = diaRetirada + prazoPadrao;
                        diasAtraso = diaDevolucao - diaLimite;

                        if (diasAtraso > 0) {
                            double multa = diasAtraso * multaPorDia;

                            System.out.println("Devolucao com atraso.");
                            System.out.println("Dias de atraso: " + diasAtraso);
                            System.out.printf("Valor da multa: R$ %.2f%n", multa);

                        } else {
                            System.out.println("Devolucao realizada dentro do prazo.");
                        }
                    }

                    break;
                }

                case 4:
                    System.out.println("Reserva de livro selecionada.");
                    break;

                case 5: