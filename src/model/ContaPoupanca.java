package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){

        super(cliente);
    }

    @Override
    public String toString() {
        return "Conta Poupança{ " +
                "Agência=" + agencia +
                ", Número da Conta=" + numero +
                ", Nome = " + this.cliente.getNome() +
                ", CPF = " + this.cliente.getCpf() +
                ", Saldo= " + saldo +
                '}';
    }
}
