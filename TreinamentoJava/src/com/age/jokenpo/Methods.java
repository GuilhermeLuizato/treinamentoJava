package com.age.jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Methods {
	public static int lerOpcaoDoUsuario() {
		Scanner leitor = new Scanner(System.in);
		int escolhaDoUsuario = leitor.nextInt();
		return escolhaDoUsuario;
	}
	
	public static int lerOpcaoDoComputador() {
		Random geraNumeroComputador = new Random();
		int escolhaDoComputador = geraNumeroComputador.nextInt(3) + 1;
		return escolhaDoComputador;
	}
		
	public static boolean usuarioEscolherTesouraEComputadorEscolherPapel(int escolhaDoUsuario, int escolhaDoComputador) {
		return (escolhaDoUsuario - escolhaDoComputador) == 2;
	}

	public static boolean usuarioEscolherPapelOuPedraEComputadorEscolherPedraOuTesouraRespectivamente(int escolhaDoUsuario, int escolhaDoComputador) {
		return (escolhaDoUsuario - escolhaDoComputador) == -1;
	}

	public static void verificaResultado(int escolhaDoUsuario, int escolhaDoComputador) {
		if (escolhaDoUsuario == escolhaDoComputador) {
			System.out.println("Empate");
		}
		else if (usuarioEscolherPapelOuPedraEComputadorEscolherPedraOuTesouraRespectivamente(escolhaDoUsuario, escolhaDoComputador) ||
				 usuarioEscolherTesouraEComputadorEscolherPapel(escolhaDoUsuario, escolhaDoComputador) ) {
			System.out.println("Usuário Vencedor");
		}
		else {
			System.out.println("Computador Vencedor");
		}
	}
	
	public static void imprimirEscolhaDoComputador(int escolhaDoComputador) {
		switch(escolhaDoComputador) {
		case 1:
			System.out.println("Computador Escolheu Papel");
			break;
		case 2:
			System.out.println("Computador Escolheu Pedra");
			break;
		case 3:
			System.out.println("Computador Escolheu Tesoura");
			break;
		}
	}

	public static void imprimirEscolhaDoUsuario(int escolhaDoUsuario) {
		switch(escolhaDoUsuario) {
		case 1:
			System.out.println("Usuário Escolheu Papel");
			break;
		case 2:
			System.out.println("Usuário Escolheu Pedra");
			break;
		case 3:
			System.out.println("Usuário Escolheu Tesoura");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}
	
}
