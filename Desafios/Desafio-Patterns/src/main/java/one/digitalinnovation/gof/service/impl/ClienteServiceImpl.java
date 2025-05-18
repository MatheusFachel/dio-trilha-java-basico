package one.digitalinnovation.gof.service.impl;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.builder.ClienteBuilder;
import one.digitalinnovation.gof.factory.ClienteFactory;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.handler.ClienteHandler;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ClienteFactory clienteFactory;

	@Autowired
	@Qualifier("persistenciaHandler")
	private ClienteHandler persistenciaHandler;

	@PostConstruct
	private void initChain() {
		// Caso queira adicionar outros handlers, faça aqui:
		// persistenciaHandler.setNext(outroHandler);
	}

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
	}

	@Override
	public void inserir(Cliente cliente) {
		// Cria usando factory
		Cliente novoCliente = clienteFactory.create(
				cliente.getNome(),
				cliente.getEndereco().getCep());

		// Constrói com builder se precisar de transformações adicionais
		Cliente clienteConstruido = new ClienteBuilder()
				.nome(novoCliente.getNome())
				.endereco(novoCliente.getEndereco())
				.build();

		// Executa cadeia de responsabilidade
		persistenciaHandler.handle(clienteConstruido);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		cliente.setId(id);
		Cliente atualizado = clienteFactory.create(
				cliente.getNome(),
				cliente.getEndereco().getCep());
		Cliente clienteConstruido = new ClienteBuilder()
				.nome(atualizado.getNome())
				.endereco(atualizado.getEndereco())
				.build();
		persistenciaHandler.handle(clienteConstruido);
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}
}
