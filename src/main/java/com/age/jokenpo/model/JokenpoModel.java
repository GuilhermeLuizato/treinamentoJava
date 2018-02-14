package com.age.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

import static com.age.jokenpo.control.JokenpoController.*;

public class JokenpoModel {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void jogar() {
        String computador = escolhaDoComputador();
        String usuario = escolhaDoUsuario();
        determinarVencedor(computador, usuario);
    }
	
	public static String escolhaDoComputador() {
        Random geraNumeroComputador = new Random();
        int escolhaDoComputador = geraNumeroComputador.nextInt(3) + 1;
        
        String computador = "";
        if (escolhaDoComputador == 1) {
            computador = "Pedra";
        }
        if (escolhaDoComputador == 2) {
            computador = "Papel";
        }
        if (escolhaDoComputador == 3) {
            computador = "Tesoura";
        }
        return computador;
    }
	
	public static boolean jogarNovamente() {
		
        System.out.println("Deseja jogar novamente?(s/n)");
        
        String jogarNovamente = leitor.nextLine();
        
        if (jogarNovamente.toLowerCase().equals("s")) {
            return true;
        } else if (jogarNovamente.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Opção Inválida");
            return jogarNovamente();
        }
    }
	
	 public static boolean validarEscolha(String escolha) {
		 
	        boolean statusDaEscolha;
	        if (escolha.equals("Pedra")) {
	            statusDaEscolha = true;
	        }
	        else if (escolha.equals("Papel")){
	            statusDaEscolha = true;	
	        }
	        else if (escolha.equals("Tesoura")) {
	            statusDaEscolha = true;
	        }
	        else {
	            statusDaEscolha = false;
	            System.out.println("Erro! Tenha certeza que está escolhendo certo.");
	        }
	        return statusDaEscolha;
	    }
	 
	 public static void determinarVencedor(String computador, String usuario)
	    {
	        System.out.println("Escolha do Computador: " + computador);
	        System.out.println("Sua escolha: " + usuario);
	        
	        if (computador.equals("Pedra") && usuario.equals("Tesoura")) {
	            System.out.println("Computador venceu! Mais sorte da próxima vez");
	        }
	        
	        if (computador.equals("Tesoura") && usuario.equals("Papel")) {
	            System.out.println("Computador venceu! Mais sorte da próxima vez");
	        }
	        
	        if (computador.equals("Papel") && usuario.equals("Pedra")) {
	            System.out.println("Computador venceu! Mais sorte da próxima vez");
	        }
	        
	        if (computador.equals("Pedra") && usuario.equals("Papel")) {
	            System.out.println("Você venceu!!");
	        }
	        
	        if (computador.equals("Tesoura") && usuario.equals("Pedra")) {
	            System.out.println("Você venceu!!");
	        }
	        
	        if (computador.equals("Papel") && usuario.equals("Tesoura")) { 
	            System.out.println("Você venceu!");
	        } else if (computador.equals(usuario)) {
	            System.out.println("Empate! O jogo deve ser jogado novamente.");
	        }
	        return;
	    }
}
