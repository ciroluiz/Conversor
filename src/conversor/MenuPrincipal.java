package conversor;

import javax.swing.JOptionPane;

import conversor.enumeracoes.TaxaDeCambio;
import conversor.enumeracoes.TipoConversor;

/**
 * Classe que representa as telas de opções e seleções de conversões
 * 
 * @author Ciro Luiz
 * @version 1.0
 */

public class MenuPrincipal {

	/**
	 * Recebe a escolha do usuário(primeiramente qual o conversor que será usado
	 * e depois as moedas para a conversão)
	 */
	private String selecao;

	/**
	 * Exibe uma tela onde o usuário deve escolher entre os tipos de conversores
	 * disponíveis
	 * 
	 * @return a escolha do usuário dentre as opções fornecidas
	 */
	public String selecionaConversor() {
		selecao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", 
				JOptionPane.QUESTION_MESSAGE, null, TipoConversor.tiposDeConversor(), 
				TipoConversor.tiposDeConversor());
		if (selecao == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado.", "Aviso", 1);
		}
		return selecao;
	}

	/**
	 * Exibe uma tela onde o usuário deve escolher entre os tipos de conversões de
	 * moedas disponíveis
	 * 
	 * @return a escolha do usuário dentre as opções fornecidas
	 */
	public String selecionaMoedasParaConversao() {
		selecao = (String) JOptionPane.showInputDialog(null,
				"Escolha as moedas para realizar a conversão do seu dinheiro", "Moedas",
				JOptionPane.INFORMATION_MESSAGE, null, TaxaDeCambio.moedasParaConversao(),
				TaxaDeCambio.moedasParaConversao());
		if (selecao == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado.", "Aviso", 1);
		}
		return selecao;
	}

	/**
	 * Exibe uma tela para a entrada do valor que será fornecido pelo usuário para a
	 * realização da conversão. O valor fornecido será analisado e será verificado
	 * se foi digitada uma entrada válida: somente números ou números com um(1)
	 * ponto ou uma(1) vírgula para a representação de casas decimais.
	 * 
	 * @return o valor numérico digitado pelo usuário ou uma mensagem de "Entrada
	 *         inválida" devido a entrada do usuário ser uma letra ou sequência de
	 *         caracteres que não representem um valor monetário inteiro ou
	 *         frácionario com o uso do ponto(.) ou vírgula(,)
	 */
	public double recebeValorMonetario() {
		String valor;
		double valorMonetario = 0;
		try {
			do {
				valor = JOptionPane.showInputDialog("Insira o valor para conversão");

				try {
					if ((valor.matches(".*[0-9].*") && valor.matches("^.*?,.*$"))
							|| valor.matches(".*[0-9].*") && valor.matches(".*\\..*") 
							|| valor.matches("\\d+")) {
						valor = valor.replaceAll("[^0-9]", ".");
						valorMonetario = Double.parseDouble(valor);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Entrada inválida. " 
							+ "Certifique-se de inserir um valor válido para a conversão.",
							"Erro", 0);
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Entrada inválida. " 
							+ "Certifique-se de inserir um valor válido para a conversão.",
							"Erro",	0);
				}
			} while (valor.matches("") || valor.matches(".*[^a-zA-Z0-9].*") 
					|| valor.matches(".*[a-zA-Z].*"));
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa finalizado.", "Aviso", 1);
			return -1;
		}
		return valorMonetario;
	}

	/**
	 * Exibe uma caixa de diálogo após a exibição da conversão com a mensagem
	 * "Deseja continuar?" e as opções "Yes, No, Cancel"
	 * 
	 * @return true ou false de acordo com a escolha do usuário, onde true 
	 * é para continuar com as conversões e o programa reinicia e false 
	 * para finalizar o programa com uma mensagem específica em uma caixa 
	 * de diálogo
	 */
	public boolean desejaContinuar() {
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", 
				"Escolha uma opção", 1, 3, null);
		if (resposta == JOptionPane.YES_OPTION) {
			return true;
		} else if (resposta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado.", "Aviso", 1);
		} else if (resposta == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa cancelado.", "Aviso", 1);
		} else if (resposta == JOptionPane.CLOSED_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa fechado.", "Aviso", 1);
		}
		return false;
	}

}
