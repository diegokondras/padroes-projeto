package br.com.pagamentos.commandpattern;

public class Saldo implements Pagamento {

	@Override
	public void processaPagamento() {
		System.out.println("Processando pagamento com o saldo disponível");
	}

}
