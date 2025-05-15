import java.util.Scanner;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Digite a agencia do cliente: ");
		int agencia = sc.nextInt();
		System.out.print("Digite o CPF do cliente: ");
		int cpf = sc.nextInt();

		Cliente cliente = new Cliente(nome, agencia , cpf);

		Conta cc = new ContaCorrente(cliente, agencia, cpf);
		Conta poupanca = new ContaPoupanca(cliente, agencia, cpf);


		System.out.print("Depósito inicial na Conta Corrente: R$ ");
		double depositoCC = sc.nextDouble();
		cc.depositar(depositoCC);

		System.out.print("Depósito inicial na Poupança: R$ ");
		double depositoPoup = sc.nextDouble();
		poupanca.depositar(depositoPoup);


		System.out.print("Quanto deseja transferir da CC para a Poupança? R$ ");
		double valorTransf = sc.nextDouble();
		cc.transferir(valorTransf, poupanca);


		System.out.println("\n--- Extrato Conta Corrente ---");
		cc.imprimirExtrato();

		System.out.println("\n--- Extrato Conta Poupança ---");
		poupanca.imprimirExtrato();

		sc.close();
	}
}
