package DesafioControleFluxo;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(){
        super("Você deve inserir um segundo parâmetro maior que o primeiro");
    }
}
