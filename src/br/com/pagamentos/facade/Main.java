package br.com.pagamentos.facade;

public class Main {

	public static void main(String[] args) {
		MetodoPagamentoFacade metodoPagamento = new MetodoPagamentoFacade();
		metodoPagamento.pagarCartaoCredito(2.63);
		metodoPagamento.pagarSaldo(58.99);
	}

}
