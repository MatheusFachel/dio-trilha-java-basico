package one.digitalinnovation.gof.service.handler;

import one.digitalinnovation.gof.model.Cliente;

public class ValidacaoHandler extends ClienteHandler {

    @Override
    protected void process(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
    }
}
