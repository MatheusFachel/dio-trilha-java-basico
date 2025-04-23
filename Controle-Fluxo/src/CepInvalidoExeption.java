public class CepInvalidoExeption extends Exception {

    public CepInvalidoExeption() {
        super("CEP inválido. Deve conter exatamente 8 caracteres.");
    }
}
