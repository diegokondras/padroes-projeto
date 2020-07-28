package br.com.pagamentos.facade;

public class MetodoPagamentoFacade {
	
	private MetodoPagamento saldo;
	private MetodoPagamento cartaoCredito;
	
	public MetodoPagamentoFacade() {
		saldo = new Saldo();
		cartaoCredito = new CartaoCredito();
	}

	public void pagarSaldo(double valor) {
		saldo.pagar(valor);
	}
	
	public void pagarCartaoCredito(double valor) {
		cartaoCredito.pagar(valor);
	}

}
