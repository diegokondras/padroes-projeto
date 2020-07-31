package br.com.pagamentos.doubledispatchpattern;

public abstract class Pagamento {
	private String valor;

	public Pagamento(String valor) {
		super();
		this.valor = valor;
	}
	
	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.VALOR, valor);
	}
	
}
