package one.digitalinnovation.gof.builder;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClienteBuilder {

    private final Cliente cliente;

    public ClienteBuilder() {
        this.cliente = new Cliente();
    }

    public ClienteBuilder nome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder endereco(Endereco endereco) {
        cliente.setEndereco(endereco);
        return this;
    }

    public Cliente build() {
        return cliente;
    }
}