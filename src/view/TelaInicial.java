package view;


import java.util.Scanner;

public class TelaInicial {
    public void inicial() {

        System.out.println(" ====================================== ");
        System.out.println("|------------SEJA BEM VINDO------------|");
        System.out.println("|======================================|");
        System.out.println("|    SELECIONE UMA DAS OPÇÕES ABAIXO   |");
        System.out.println("|======================================|");
        System.out.println("| Digite 1 para Acessar Conta Corrente |");
        System.out.println("| Digite 2 para Acessar Conta Poupança |");
        System.out.println("| Digite 3 para Sair                   |");
        System.out.println(" ====================================== ");

        Scanner entrada = new Scanner(System.in);
        int opcaoInicial = entrada.nextInt();


        switch (opcaoInicial) {
            case 1 -> {
                TelaContaCorrente telaContaCorrente = new TelaContaCorrente();
                telaContaCorrente.contaCorrente();
            }
            case 2 -> {
                TelaContaPoupanca telaContaPoupanca = new TelaContaPoupanca();
                telaContaPoupanca.contaPoupanca();
            }
            case 3 -> {
                System.out.println(" ====================================== ");
                System.out.println("|-------------VOLTE SEMPRE-------------|");
                System.out.println(" ====================================== ");
                System.exit(0);
            }
            default -> {
                System.out.println(" ====================================== ");
                System.out.println("|---------!!!OPÇÃO INVÁLIDA!!!---------|");
                System.out.println(" ====================================== ");
                inicial();
            }
        }
    }

}
