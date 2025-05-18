package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteFactoryImpl implements ClienteFactory {

    private final ViaCepService viaCepService;

    @Autowired
    public ClienteFactoryImpl(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }

    @Override
    public Cliente create(String nome, String cep) {
        Endereco endereco = viaCepService.consultarCep(cep);
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        return cliente;
    }
}
