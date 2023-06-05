package view;

import model.Cliente;
import model.ContaPoupanca;
import repository.BancoDeDados;

import java.util.Scanner;

public class TelaContaPoupanca {
    TelaContaPoupanca(){}
    BancoDeDados bancoDeDados = new BancoDeDados();
    ContaPoupanca contaPoupanca = new ContaPoupanca(new Cliente("Usuario","121212145411","usuario@gmail.com"));
    static Scanner entrada = new Scanner(System.in);
    public void contaPoupanca() {
        System.out.println(" ====================================== ");
        System.out.println("|------------CONTA POUPANÇA------------|");
        System.out.println("|======================================|");
        System.out.println("|    SELECIONE UMA DAS OPÇÕES ABAIXO   |");
        System.out.println("|======================================|");
        System.out.println("| Digite 1 para Sacar                  |");
        System.out.println("| Digite 2 para Depositar              |");
        System.out.println("| Digite 3 para Transferir             |");
        System.out.println("| Digite 4 para Ver Saldo              |");
        System.out.println("| Digite 5 para Voltar                 |");
        System.out.println("| Digite 6 para Encerrar               |");
        System.out.println(" ====================================== ");


        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1 -> {
                contaPoupanca.telaSaque();
                double valorSaque = entrada.nextDouble();
                contaPoupanca.sacar(valorSaque);
                contaPoupanca();
            }
            case 2 -> {
                contaPoupanca.telaDeposito();
                double valorDeposito = entrada.nextDouble();
                contaPoupanca.depositar(valorDeposito);
                contaPoupanca();
            }
            case 3 -> {
                contaPoupanca.transferir();
                contaPoupanca();
            }
            case 4 -> {
                contaPoupanca.mostrarSaldo();
                contaPoupanca();
            }
            case 5 -> {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.inicial();
            }
            case 6 -> {
                System.out.println(" ====================================== ");
                System.out.println("|-------------VOLTE SEMPRE-------------|");
                System.out.println(" ====================================== ");
                System.exit(0);
            }
            default -> {
                System.out.println(" ====================================== ");
                System.out.println("|---------!!!OPÇÃO INVÁLIDA!!!---------|");
                System.out.println(" ====================================== ");
                contaPoupanca();
            }
        }
    }
}
