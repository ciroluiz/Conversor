package conversor.moedas;

/**
 * Classe abstrata para representar a moeda de cada país/região
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public abstract class Moeda {

	/**
	 * Assinatura de método que deverá ser implementado nas classes de moedas específicas 
	 * que recebe a informação de qual a moeda que será convertida e para qual, 
	 * e o valor a ser convertido 
	 * 
	 * @param escolha 
	 * 		  Uma string informando as moedas da conversão
	 * @param valor
	 * 		  Valor digitado pelo usuário a ser convertido
	 */
	public abstract void converteMoeda(String escolha, double valor);

}


