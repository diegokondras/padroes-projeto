package br.com.pagamentos.commandpattern;

public class CartaoDebito implements Pagamento {

	@Override
	public void processaPagamento() {
		System.out.println("Processando pagamento com Cart�o de D�bito");
	}

}
