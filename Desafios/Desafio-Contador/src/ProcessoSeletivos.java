
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivos {

    public static void main(String[] args) {

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        selecaoCandidatos();
    }


    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE", "MARCIA", "RENATA", "LUCAS", "MATHEUS"};

    

    }

    static void selecaoCandidatos () {

        String [] candidatos = {"FELIPE", "MARCIA", "RENATA", "LUCAS", "MATHEUS", "NICOLE" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;         
        while ( candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];     
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido ) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } 
            candidatosAtual++;
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("AGUARDANDO OS RESULTADOS DOS DEMAIS CANDIDATOS");
        } else {
            System.out.println("AGUARDANDO OS RESULTADOS DEMAIS RESULTADOS");
        }   

    }

    private static double valorPretendido() {
    
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    
    }
}
