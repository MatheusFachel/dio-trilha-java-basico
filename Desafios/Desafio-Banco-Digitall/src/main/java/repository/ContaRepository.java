package repository;

import model.Conta;
import java.util.List;

public interface ContaRepository {
    void save(Conta conta);
    Conta findByNumero(int numero);
    List<Conta> findAll();
}
