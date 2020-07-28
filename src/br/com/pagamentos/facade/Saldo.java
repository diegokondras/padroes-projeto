package br.com.pagamentos.facade;

public class Saldo implements MetodoPagamento {
	
	private double valorSaldo;

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento com o Saldo");
	}

}
