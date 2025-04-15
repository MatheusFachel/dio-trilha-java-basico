
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a Classse Scanner (feito)

        //Exibir as menssagens para os usuários (feito)

        //Obter pela classe Scanner os valores digitados no terminal (fetio)

        //Exibir a menssagem final (feito)   

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Para criarmos sua conta precisaremos que nos passe as seguintes infromações:");

        System.err.println("Seu nome:");
        String NomeDeUsuario = scanner.nextLine();

        System.out.println("Seu número de conta");
        int NumeroDeConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("O número da sua agencia:");
        String NumeroDeAgencia = scanner.nextLine();

        System.out.println("Aqui digite o seu saldo de conta:");
        Double SaldoDeConta = scanner.nextDouble();

        System.out.println("CONTA CRIADA!");
        System.out.println("Olá " + NomeDeUsuario + ",obrigado por criar uma conta em nosso banco, sua agência é " + NumeroDeAgencia + ", conta " + NumeroDeConta + " e seu saldo: " + SaldoDeConta + " já está disponível para saque.");
        
        
    }
}
