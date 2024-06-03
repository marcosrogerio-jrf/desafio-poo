package smartphone.controlador;

import smartphone.controlador.equipamento.Smartphone;

public class Controlador {
	
	public static void main(String[] args) {
		Smartphone iphone = new Smartphone();
		
		// MODO - APARELHO TELEFÔNICO
		System.out.println("Funções do Aparelho Telefônico");
		System.out.println("************************************************");		
		iphone.ligar("(77) 99999-8888" );
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println("************************************************");	
		
		// MODO - NAVEGADOR
		System.out.println("Funções do Navegador");
		System.out.println("************************************************");		
		iphone.exibirPagina("https://www.dio.me");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		System.out.println("************************************************");	
		
		// MODO - REPRODUTOR MUSICAL
		System.out.println("Funções do Reprodutor Musical");
		System.out.println("************************************************");		
		iphone.selecionarMusica("Cássia Eller - Malandragem");
		iphone.tocar();
		iphone.pausar();
		System.out.println("************************************************");	
	}

}
