package br.com.pagamentos.commandpattern;

public class CartaoCredito implements Pagamento {

	@Override
	public void processaPagamento() {
		System.out.println("Processando pagamento com Cartão de Crédito");
	}

}
