package one.digitalinnovation.gof.service.handler;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistenciaHandler extends ClienteHandler {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    protected void process(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}