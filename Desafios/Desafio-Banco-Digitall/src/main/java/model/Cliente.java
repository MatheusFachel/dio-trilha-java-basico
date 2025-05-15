package model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Cliente {
	private String nome;
	private int agencia;
	private int cpf;
}
