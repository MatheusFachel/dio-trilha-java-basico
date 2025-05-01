
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivos {

    public static void main(String[] args) {

        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();

        //imprimirSelecionados();

        String [] candidatos = {"FELIPE", "MARCIA", "RENATA", "LUCAS", "MATHEUS"};
        
        for(String candidato: candidatos) {

            entrandoEmContato(candidato);
            
        }


    }

    static void entrandoEmContato (String candidato) {
        
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do { 

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }            
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else 
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
    }


    //método auxiliar 

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

        
    static void imprimirSelecionados() {

        String [] candidatos = {"FELIPE", "MARCIA", "RENATA", "LUCAS", "MATHEUS"};

        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int indice = 0; indice < candidatos.length; indice++ ) {

            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);

        }

        System.out.println("Forma abrevida de interação for each");

        for (String cadidato: candidatos) {

            System.out.println("O candidato selecionado foi " + cadidato);

        }
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
