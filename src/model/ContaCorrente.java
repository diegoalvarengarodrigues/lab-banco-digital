package model;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {

        super(cliente);
    }

    @Override
    public String toString() {
        return "Conta Corrente{ " +
                "Agência=" + agencia +
                ", Número da Conta=" + numero +
                ", Nome = " + this.cliente.getNome() +
                ", CPF = " + this.cliente.getCpf() +
                ", Saldo= " + saldo +
                '}';
    }
}
