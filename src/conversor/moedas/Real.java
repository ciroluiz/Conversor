package conversor.moedas;

import javax.swing.JOptionPane;

import conversor.enumeracoes.TaxaDeCambio;

/**
 * Classe que representa a moeda Real com método que realiza conversões para outras moedas
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public class Real extends Moeda {

	/**
	 * Método sobrescrito que realiza a conversão de real para outra moeda
	 * 
	 * @param escolha 
	 * 		  Uma string informando as moedas da conversão
	 * @param valor
	 * 		  Valor digitado pelo usuário a ser convertido
	 */
	public void converteMoeda(String escolha, double valorParaConversao) {
		double valorConvertido;
		String valorConvertidoFormatado;
		String valorEmReais = FormatadorMoedas.formatadorMoedas("Real", valorParaConversao);
		switch (escolha) {
		case "Real para Dólar":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_DÓLAR.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Dólar", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM DÓLARES",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Real para Euro":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_EURO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Euro", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM EUROS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Real para Peso Argentino":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_PESO_ARGENTINO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Peso Argentino", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM PESOS AGENTINOS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Real para Rublo":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_RUBLO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Rublo", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM RUBLOS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Real para Libra Esterlina":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_LIBRA_ESTERLINA.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Libra Esterlina", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM LIBRAS ESTERLINAS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Real para Iene":
			valorConvertido = valorParaConversao * TaxaDeCambio.REAL_PARA_IENE.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Iene", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmReais + " = " + valorConvertidoFormatado, "REAIS EM IENES",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + escolha);
		}
	}

}
