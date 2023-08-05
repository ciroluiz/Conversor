package conversor.enumeracoes;

/**
 * Enumeração que representa as taxas de câmbio específicas entre moedas diferentes
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public enum TaxaDeCambio {

	REAL_PARA_DÓLAR(0.21, "Real para Dólar"),
	REAL_PARA_EURO(0.19, "Real para Euro"),
	REAL_PARA_PESO_ARGENTINO(53.56, "Real para Peso Argentino"),
	REAL_PARA_RUBLO(18.73, "Real para Rublo"),
	REAL_PARA_LIBRA_ESTERLINA(0.16, "Real para Libra Esterlina"),
	REAL_PARA_IENE(29.16, "Real para Iene"),
	
	DOLAR_PARA_REAL(4.87, "Dólar para Real"),
	DOLAR_PARA_EURO(0.91, "Dólar para Euro"),
	DOLAR_PARA_PESO_ARGENTINO(260.77, "Dólar para Peso Argentino"),
	DOLAR_PARA_RUBLO(91.26, "Dólar para Rublo"),
	DOLAR_PARA_LIBRA_ESTERLINA(0.78, "Dólar para Libra Esterlina"),
	DOLAR_PARA_IENE(142.10, "Dólar para Iene");
	
//	EURO_PARA_REAL(5.35),
//	PESO_ARGENTINO_PARA_REAL(0.019),
//	RUBLO_PARA_REAL(0.053),
//	LIBRA_ESTERLINA_PARA_REAL(6.26),
//	IENE_PARA_REAL(0.034),
//	
//	EURO_PARA_DOLAR(1.10), 
//	PESO_ARGENTINO_PARA_DOLAR(0.0038), 
//	RUBLO_PARA_DOLAR(0.011),
//	LIBRA_ESTERLINA_PARA_DOLAR(1.28), 
//	IENE__PARA_DOLAR(0.0070);
	
	/**
	 * Valor da taxa de câmbio
	 */
	private double taxaDeCambio;
	
	/**
	 * Moedas da relação nas taxas de câmbio
	 */
	private String moedas;

	/**
	 * Construtor que inicializa os atributos
	 * @param taxaDeCambio
	 * 	 	  Valor da taxa de câmbio em decimal
	 * @param moedas
	 * 		  As moedas que representam a conversão da taxa de câmbio
	 */
	TaxaDeCambio(double taxaDeCambio, String moedas) {
		this.taxaDeCambio = taxaDeCambio;
		this.moedas = moedas;
	}

	/**
	 * Método get que obtém a taxa de câmbio
	 * 
	 * @return o valor decimal da taxa de câmbio
	 */
	public double getTaxaDeCambio() {
		return this.taxaDeCambio;
	}
	
	/**
	 * Método get que obtém as moedas que representam a conversão da taxa de câmbio
	 * 
	 * @return o nome das moedas que representam a conversão da taxa de câmbio
	 */
	public String getMoedas() {
		return this.moedas;
	}
	
	/**
	 * Método que retorna um array com os nomes das moedas da relação de conversão
	 * 
	 * @return um array com os nomes das moedas da relação de conversão
	 */
	public static String[] moedasParaConversao() {
		TaxaDeCambio[] moedasTaxaCambio = TaxaDeCambio.values();
		String[] opcoesDeMoedas = new String[moedasTaxaCambio.length];
		for (int i = 0; i < opcoesDeMoedas.length; i++) {
			opcoesDeMoedas[i] = moedasTaxaCambio[i].moedas;
		}
		return opcoesDeMoedas;
	}

}
