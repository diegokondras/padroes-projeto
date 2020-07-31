package br.com.pagamentos.doubledispatchpattern;

public class Recarga extends Pagamento {
	private String celular;
	private String operadora;
	
	public Recarga(String valor, String celular, String operadora) {
		super(valor);
		this.celular = celular;
		this.operadora = operadora;
	}

	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.CELULAR, celular);
		recibo.addPropriedade(PropriedadesRecibo.OPERADORA, operadora);
	}
	
}
