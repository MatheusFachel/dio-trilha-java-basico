package model;

public class Cliente {
	private String nome;
	private int cpf;
	private int agencia;

	public Cliente(String nome, int agencia,int cpf) {
		this.nome = nome;
		this.cpf  = cpf;
		this.agencia = agencia;
	}

	public String getNome() { return nome; }
	public int getCpf()  { return cpf;  }
	public int getAgencia()  { return agencia;  }
}
