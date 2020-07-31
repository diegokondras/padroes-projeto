package br.com.pagamentos.commandpattern;

public class CartaoCredito implements Pagamento {

	@Override
	public void processaPagamento() {
		System.out.println("Processando pagamento com Cart�o de Cr�dito");
	}

}
