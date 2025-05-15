package service;

import model.*;
import repository.*;
import java.util.List;

public class BancoService {
    private final ContaRepository repo;
    private int nextAgencia = 1;
    private int nextNumero  = 1;

    public BancoService(ContaRepository repo) {
        this.repo = repo;
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        ContaCorrente cc = new ContaCorrente(cliente, nextAgencia, nextNumero++);
        repo.save(cc);
        return cc;
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        ContaPoupanca cp = new ContaPoupanca(cliente, nextAgencia, nextNumero++);
        repo.save(cp);
        return cp;
    }

    public List<Conta> listarContas() {
        return repo.findAll();
    }

    public Conta buscarConta(int numero) {
        return repo.findByNumero(numero);
    }
}
