package br.com.pagamentos.doubledispatchpattern;

public class Boleto extends Pagamento {
	
	private String codBarras;

	public Boleto(String transacao, String codAutenticacao, String valor, String pagador, String beneficiario, String codBarras) {
		super(transacao, codAutenticacao, valor, pagador, beneficiario);
		this.codBarras = codBarras;
	}

	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.COD_BARRAS, codBarras);
	}
	
}
