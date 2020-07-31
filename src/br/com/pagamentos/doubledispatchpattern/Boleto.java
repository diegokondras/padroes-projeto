package br.com.pagamentos.doubledispatchpattern;

public class Boleto extends Pagamento {
	
	private String codBarras;
	
	public Boleto(String valor, String codBarras) {
		super(valor);
		this.codBarras = codBarras;
	}

	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.COD_BARRAS, codBarras);
	}
	
}