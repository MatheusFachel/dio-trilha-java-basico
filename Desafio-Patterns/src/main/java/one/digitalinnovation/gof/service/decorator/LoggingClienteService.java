package one.digitalinnovation.gof.service.decorator;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

public class LoggingClienteService implements ClienteService {

    private final ClienteService delegate;

    public LoggingClienteService(ClienteService delegate) {
        this.delegate = delegate;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        System.out.println("[LOG] Buscando todos os clientes...");
        return delegate.buscarTodos();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        System.out.println("[LOG] Buscando cliente com id: " + id);
        return delegate.buscarPorId(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        System.out.println("[LOG] Inserindo cliente: " + cliente.getNome());
        delegate.inserir(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        System.out.println("[LOG] Atualizando cliente com id: " + id);
        delegate.atualizar(id, cliente);
    }

    @Override
    public void deletar(Long id) {
        System.out.println("[LOG] Deletando cliente com id: " + id);
        delegate.deletar(id);
    }
}