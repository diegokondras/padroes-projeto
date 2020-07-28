package br.com.pagamentos.doubledispatchpattern;

public abstract class Transacao {
	
	private String codBarras;
	
	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.COD_BARRAS, codBarras);
	}

}
