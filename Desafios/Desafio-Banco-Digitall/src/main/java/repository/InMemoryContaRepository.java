package repository;

import model.Conta;
import java.util.*;

public class InMemoryContaRepository implements ContaRepository {
    private final Map<Integer, Conta> storage = new HashMap<>();

    @Override
    public void save(Conta conta) {
        storage.put(conta.numero, conta);
    }

    @Override
    public Conta findByNumero(int numero) {
        return storage.get(numero);
    }

    @Override
    public List<Conta> findAll() {
        return new ArrayList<>(storage.values());
    }
}
