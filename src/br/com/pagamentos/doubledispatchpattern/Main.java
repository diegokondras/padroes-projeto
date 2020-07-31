package br.com.pagamentos.doubledispatchpattern;

public class Main {

	public static void main(String[] args) {
		Boleto boleto = new Boleto("123", "1a2b3c", "155.99", "Diego", "Banco X", "9999999999999999999999999999999999999999999");
		Recibo recibo = new Recibo();
		recibo.addPagamento(boleto);
		recibo.imprimeRecibo();
	}

}
