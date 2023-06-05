package view;

import model.Cliente;
import model.ContaCorrente;
import repository.BancoDeDados;
import java.util.Scanner;

public class TelaContaCorrente {

    ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Usuario","121212145411","usuario@gmail.com"));
    BancoDeDados bancoDeDados = new BancoDeDados();

    static Scanner entrada = new Scanner(System.in);
    public void contaCorrente() {


        System.out.println(" ====================================== ");
        System.out.println("|------------CONTA CORRENTE------------|");
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
                contaCorrente.telaSaque();
                double valorSaque = entrada.nextDouble();
                contaCorrente.sacar(valorSaque);
                contaCorrente();
            }
            case 2 -> {
                contaCorrente.telaDeposito();
                double valorDeposito = entrada.nextDouble();
                contaCorrente.depositar(valorDeposito);
                contaCorrente();
            }
            case 3 -> {
                contaCorrente.transferir();
                contaCorrente();
            }
            case 4 -> {
                contaCorrente.mostrarSaldo();
                contaCorrente();
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
                contaCorrente();
            }
        }
    }
}
