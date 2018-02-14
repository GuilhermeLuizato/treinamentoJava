package com.age.jokenpo.view;

import static com.age.jokenpo.model.JokenpoModel.*;

public class JokenpoView {
	
	 public static void main(String[] args)
	    {
	        jogar();
	        while (jogarNovamente())
	        {
	            jogar();
	        }
	    }
	
}
