package conversor.moedas;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe que representa um formatador de valores monetários de acordo com cada moeda e região
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public class FormatadorMoedas {

	/**
	 * Método estático que formata um valor monetário específico de acordo 
	 * com uma seleção prévia do usuário
	 * 
	 * @param moeda
	 * 		  Uma string informando a moeda escolhida
	 * @param valor
	 * 		  Valor digitado pelo usuário a ser formatado
	 * @return o valor monetário formatado de acordo com a moeda 
	 */
	public static String formatadorMoedas(String moeda, double valor) {
		Locale locale = null;
		switch (moeda) {
		case "Real":
			locale = new Locale("pt", "BR"); // Localização brasileira
			break;
		case "Dólar":
			locale = new Locale("en", "US"); // Localização estadunidense
			break;
		case "Euro":
			locale = new Locale("fr", "FR"); // Localização européia
			break;
		case "Peso Argentino":
			locale = new Locale("es", "AR"); // Localização argentina
			break;
		case "Rublo":
			locale = new Locale("ru", "RU"); // Localização russa
			break;
		case "Libra Esterlina":
			locale = new Locale("en", "GB"); // Localização reino unido
			break;
		case "Iene":
			locale = new Locale("ja", "JP"); // Localização japonesa
			break;
		default:
			break;
		}

		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(locale);
		String valorFormatado = formatoMoeda.format(valor);
		return valorFormatado;
	}

}
