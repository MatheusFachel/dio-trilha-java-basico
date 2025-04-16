public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 2;

        if (nota >= 7){
            System.out.println("Aprovado");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }


        // Versão usando operador ternário
        System.out.println("USANDO OPERADOR TERNÁRIO");


        String Resultado = nota > 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado" ;

        System.out.println(Resultado);

    }
}
