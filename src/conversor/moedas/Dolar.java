package conversor.moedas;

import javax.swing.JOptionPane;

import conversor.enumeracoes.TaxaDeCambio;

/**
 * Classe que representa a moeda Dólar com método que realiza conversões para outras moedas
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public class Dolar extends Moeda {

	/**
	 * Método sobrescrito que realiza a conversão de dólar para outra moeda
	 * 
	 * @param escolha 
	 * 		  Uma string informando as moedas da conversão
	 * @param valor
	 * 		  Valor digitado pelo usuário a ser convertido
	 */
	@Override
	public void converteMoeda(String escolha, double valorParaConversao) {
		double valorConvertido;
		String valorConvertidoFormatado;
		String valorEmDolares = FormatadorMoedas.formatadorMoedas("Dólar", valorParaConversao);
		switch (escolha) {
		case "Dólar para Real":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_REAL.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Real", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM REAIS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Dólar para Euro":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_EURO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Euro", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM EUROS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Dólar para Peso Argentino":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_PESO_ARGENTINO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Peso Argentino", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM PESOS ARGENTINOS",
					JOptionPane.INFORMATION_MESSAGE);
			break;		
		case "Dólar para Rublo":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_RUBLO.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Rublo", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM RUBLOS",
					JOptionPane.INFORMATION_MESSAGE);
			break;			
		case "Dólar para Libra Esterlina":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_LIBRA_ESTERLINA.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Libra Esterlina", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM LIBRAS ESTERLINAS",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Dólar para Iene":
			valorConvertido = valorParaConversao * TaxaDeCambio.DOLAR_PARA_IENE.getTaxaDeCambio();
			valorConvertidoFormatado = FormatadorMoedas.formatadorMoedas("Iene", valorConvertido);
			JOptionPane.showMessageDialog(null, valorEmDolares + " = " + valorConvertidoFormatado, "DÓLARES EM IENES",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + escolha);
		}

	}
}
