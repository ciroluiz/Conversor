package conversor;

import conversor.moedas.Dolar;
import conversor.moedas.Moeda;
import conversor.moedas.Real;

public class TesteConversor {
	
	public static void main(String[] args) {

		MenuPrincipal menu = new MenuPrincipal();
		boolean resposta;
		
		do {
			String conversor = menu.selecionaConversor();
			if (conversor == null) {
				break;
			}			
			String escolha = menu.selecionaMoedasParaConversao();
			if (escolha == null) {
				break;
			}
			double valorParConversao = menu.recebeValorMonetario();
			if (valorParConversao == -1) {
				break;
			}
			Moeda conversao = null;
			switch (moeda(escolha)) {
				case "Real": {
					conversao = new Real();
					conversao.converteMoeda(escolha, valorParConversao);
					break;
				}
				case "Dólar": {
					conversao = new Dolar();
					conversao.converteMoeda(escolha, valorParConversao);
					break;
				}
			}			
			resposta = menu.desejaContinuar();
		} while (resposta);
		
	}
	
	private static String moeda(String escolha) {
        // Dividir a frase em palavras com base no espaço em branco
        String[] palavras = escolha.split(" ");

        // Obter a primeira palavra
        String primeiraPalavra = palavras[0];

        return primeiraPalavra;
    }

}
