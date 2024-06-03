package smartphone.controlador.equipamento;

import smartphone.controlador.tipo.AparelhoTelefonico;
import smartphone.controlador.tipo.NavegadorInternet;
import smartphone.controlador.tipo.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Realizando uma chamada para o número: "+numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("A chamada foi atendida.");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o correio de voz.");
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Abrindo a página: "+url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando uma nova Aba.");		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando a página.");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando uma música.");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando um música.");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando a musica: "+musica);
	}

}
