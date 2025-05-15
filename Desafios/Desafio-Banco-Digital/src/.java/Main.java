import java.util.Scanner;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 📝 Ler dados do cliente
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Digite a agencia do cliente: ");
		String agencia = sc.nextLine();
		System.out.print("Digite o CPF do cliente: ");
		String cpf = sc.nextLine();

		Cliente cliente = new Cliente(nome, agencia , cpf);

		// 📂 Criar contas
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		// 💰 Operações iniciais
		System.out.print("Depósito inicial na Conta Corrente: R$ ");
		double depositoCC = sc.nextDouble();
		cc.depositar(depositoCC);

		System.out.print("Depósito inicial na Poupança: R$ ");
		double depositoPoup = sc.nextDouble();
		poupanca.depositar(depositoPoup);

		// 🔄 Transferência opcional
		System.out.print("Quanto deseja transferir da CC para a Poupança? R$ ");
		double valorTransf = sc.nextDouble();
		cc.transferir(valorTransf, poupanca);

		// 📄 Imprimir extratos
		System.out.println("\n--- Extrato Conta Corrente ---");
		cc.imprimirExtrato();

		System.out.println("\n--- Extrato Conta Poupança ---");
		poupanca.imprimirExtrato();

		sc.close();
	}
}
