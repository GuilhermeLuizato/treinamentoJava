package com.age.jokenpo;

import static com.age.jokenpo.Methods.*;

public class Utilitario {

	public static void main (String [] args) {

		//Atribuições 
			//1 - papel; 
			//2 - pedra; 
			//3 - tesoura

		//Lógica
			//Usuario(1) Computador(2) = -1, vencedor Usuário
			//Usuario(1) Computador(3) = -2, vencedor Computador
			//Usuario(2) Computador(1) = 1, vencedor Computador
			//Usuario(2) Computador(3) = -1, vencedor Usuário
			//Usuario(3) Computador(1) = 2, vencedor Usuário
			//Usuario(3) Computador(2) = 1, vencedor Computador
		
		System.out.println("Escolha a opção desejada.");
		System.out.println("1 - Papel");
		System.out.println("2 - Pedra");
		System.out.println("3 - Tesoura");

		int escolhaDoUsuario = lerOpcaoDoUsuario();
		int escolhaDoComputador = lerOpcaoDoComputador();
	
		imprimirEscolhaDoUsuario(escolhaDoUsuario);
		imprimirEscolhaDoComputador(escolhaDoComputador);
		verificaResultado(escolhaDoUsuario, escolhaDoComputador);
	}
}
