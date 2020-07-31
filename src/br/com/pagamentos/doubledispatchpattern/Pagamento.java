package br.com.pagamentos.doubledispatchpattern;

public abstract class Pagamento {
	private String transacao;
	private String codAutenticacao;
	private String valor;
	private String pagador;
	private String beneficiario;
	
	public Pagamento(String transacao, String codAutenticacao, String valor, String pagador, String beneficiario) {
		super();
		this.transacao = transacao;
		this.codAutenticacao = codAutenticacao;
		this.valor = valor;
		this.pagador = pagador;
		this.beneficiario = beneficiario;
	}

	public void addPropriedades(Recibo recibo) {
		recibo.addPropriedade(PropriedadesRecibo.TRANSACAO, transacao);
		recibo.addPropriedade(PropriedadesRecibo.COD_AUTENTICACAO, codAutenticacao);
		recibo.addPropriedade(PropriedadesRecibo.VALOR, valor);
		recibo.addPropriedade(PropriedadesRecibo.PAGADOR, pagador);
		recibo.addPropriedade(PropriedadesRecibo.BENEFICIARIO, beneficiario);
	}
	
}
