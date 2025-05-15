package facede;

import model.*;
import repository.ContaRepository;
import service.BancoService;
import java.util.List;

public class Banco {
	private final BancoService service;

	public Banco(ContaRepository repo) {
		this.service = new BancoService(repo);
	}

	public ContaCorrente criarContaCorrente(Cliente cliente) {
		return service.criarContaCorrente(cliente);
	}

	public ContaPoupanca criarContaPoupanca(Cliente cliente) {
		return service.criarContaPoupanca(cliente);
	}

	public List<Conta> listarContas() {
		return service.listarContas();
	}

	public Conta buscarConta(int numero) {
		return service.buscarConta(numero);
	}
}
