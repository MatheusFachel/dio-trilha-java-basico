package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public interface ClienteFactory {
    Cliente create(String nome, String cep);
}