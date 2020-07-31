package br.com.pagamentos.doubledispatchpattern;

public class Recarga extends Pagamento {
	private String celular;
	
	public Recarga(String transacao, String codAutenticacao, String valor, String pagador, String beneficiario, String celular) {
		super(transacao, codAutenticacao, valor, pagador, beneficiario);
		this.celular = celular;
	}

	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.CELULAR, celular);
	}
	
}
