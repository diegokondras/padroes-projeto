package br.com.pagamentos.commandpattern;

public class Transacao {
	 private Pagamento pagamento;

	public Transacao(Pagamento pagamento) {
		super();
		this.pagamento = pagamento;
	}
	 
	public void processaPagamento() {
		pagamento.processaPagamento();
	}
	
}
