package conversor.enumeracoes;

/**
 * Enumeração que representa os tipos de conversores que o programa disponibiliza
 * 
 * @author Ciro Luiz
 * @version 1.0
 */
public enum TipoConversor {

	CONVERSOR_DE_MOEDAS("Conversor de Moedas");
	
	/**
	 * Nome do tipo do conversor
	 */
	private final String tipoDeConversor;
	
	/**
	 * Construtor que inicializa os atributos
	 * 
	 * @param tipoDeConversor
	 * 		  O tipo do conversor 
	 */
	TipoConversor(String tipoDeConversor){
		this.tipoDeConversor = tipoDeConversor;
	}
	
	/**
	 * Método que retorna um array com o(s) nome(s) do(s) conversor(es)
	 * 
	 * @return um array com o(s) nome(s) do(s) conversor(es)
	 */
	public static String[] tiposDeConversor() {
		TipoConversor[] conversores = TipoConversor.values();
		String[] opcoesDeConversor = new String[conversores.length];
		for (int i = 0; i < opcoesDeConversor.length; i++) {
			opcoesDeConversor[i] = conversores[i].tipoDeConversor;
		}
		return opcoesDeConversor;
	}
	
}
