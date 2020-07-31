package br.com.pagamentos.facadepattern;

public class Saldo implements MetodoPagamento {
	
	private double valorSaldo;

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento com o Saldo");
	}

}
