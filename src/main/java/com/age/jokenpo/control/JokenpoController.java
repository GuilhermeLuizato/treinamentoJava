package com.age.jokenpo.control;

import static com.age.jokenpo.model.JokenpoModel.*;

public class JokenpoController {
	
	public static String escolhaDoUsuario() {

        String usuario = "";
        do
        {
            System.out.println("Escolha sua arma!(Pedra, Papel ou Tesoura)");
            usuario = leitor.nextLine();
        } while (!validarEscolha(usuario));
        return usuario;
    }

}
