package model;

import repository.BancoDeDados;
import java.util.Scanner;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    //public Conta() {}

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    //Método para ação de depositar
    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(this.saldo + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito");
        }
    }


    //Método para a ação de sacar
    public void sacar(Double valor) {
        if(valor > 0 && saldo >= valor) {
            setSaldo(saldo - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
    }

    //Método para a ação de transferir
    public void transferir() {

        listarContas();
        telaTransferirConta();
        Scanner input = new Scanner(System.in);
        int numeroContaDestino = input.nextInt();
        Conta contaDestino = encontrarConta(numeroContaDestino);
        telaTransferirValor();
        Double valor = input.nextDouble();

        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaDestino.saldo = contaDestino.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso");
        }else {
            System.out.println("Não foi possível realizar a transferência");
        }
        //listarContas();
    }

    //Método para encontrar a conta no Banco de Dados atrvés do numero da conta
    private static Conta encontrarConta(int contaDestino) {
        Conta conta = null;
        if(BancoDeDados.contas.size() > 0) {
            for(Conta c: BancoDeDados.contas) {
                if(c.getNumero() == contaDestino) {
                    conta = c;
                }
            }
        }
        return conta;
    }

    //Metodo usado para listar as contas do Banco de Dados para exemplificar a funcionalidade do método de transferir.
    public void listarContas() {
        if (BancoDeDados.contas.size() > 0) {
            for (Conta conta : BancoDeDados.contas) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não há contas cadastradas");
        }
    }


    public void telaTransferirValor() {
        System.out.println("|======================================|");
        System.out.println("|     QUAL VALOR DESEJA TRANSFERIR ?   |");
        System.out.println("|======================================|");
    }
    public void telaTransferirConta() {
        System.out.println("|======================================|");
        System.out.println("|     PARA QUEM DESEJA TRANSFERIR ?    |");
        System.out.println("|       Digite o número da conta       |");
        System.out.println("|======================================|");
    }
    public void mostrarSaldo(){
        System.out.println("|======================================|");
        System.out.println("|SALDO ATUAL: R$ " + this.getSaldo()     );
        System.out.println("|======================================|");
    }
    public void telaSaque(){
        System.out.println("|======================================|");
        System.out.println("|       QUAL VALOR DESEJA SACAR ?      |");
        System.out.println("|======================================|");
    }
    public void telaDeposito() {
        System.out.println("|======================================|");
        System.out.println("|     QUAL VALOR DESEJA DEPOSITAR ?    |");
        System.out.println("|======================================|");

    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Agência=" + agencia +
                ", Número da Conta=" + numero +
                ", Nome = " + this.cliente.getNome() +
                ", CPF = " + this.cliente.getCpf() +
                ", Saldo= " + saldo +
                '}';
    }

}
