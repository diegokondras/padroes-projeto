package br.com.pagamentos.doubledispatchpattern;

public class TransacaoBoleto extends Transacao {
	
	public void addPropriedades(Recibo recibo) {
		super.addPropriedades(recibo);
		recibo.addPropriedade(PropriedadesRecibo.COD_BARRAS, custoArmazenamento);
	}

}
