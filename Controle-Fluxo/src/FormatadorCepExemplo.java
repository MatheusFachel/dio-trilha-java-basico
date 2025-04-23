 
public class FormatadorCepExemplo {
    
    public static void main(String[] args) {
        try {
            
            String cepFormatado = formatarCep("23.765.-064");
            System.out.println(cepFormatado);

        } catch (CepInvalidoExeption e) {
        
            System.out.println("O cep não corresponde a regra de negocio ");

        }
        
    }

    static String formatarCep(String Cep) throws CepInvalidoExeption {

        if (Cep.length() != 8) {

            throw new CepInvalidoExeption();    

        }
        return "23.765-064";

    }

}
