package repository;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    //public List<Cliente> ArrayList;
    public List<Cliente> clientes = new ArrayList<>();
    public static List<Conta> contas = new ArrayList<>();



    public BancoDeDados(){

        clientes.add(new Cliente("Adalberto", "54685895611", "adalberto@gmail.com"));
        clientes.add(new Cliente("Xavier", "65895842422", "xavier@email.com"));
        clientes.add(new Cliente("Catarina", "21254585687", "catarina@email.com"));

        for (Cliente cliente : clientes) {
            contas.add(new ContaCorrente(cliente));
        }

        for (Cliente cliente : clientes) {
            contas.add(new ContaPoupanca(cliente));
        }

    }


    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }




}
