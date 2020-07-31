package br.com.pagamentos.commandpattern;

public class Main {

	public static void main(String[] args) {
        Pagamento credito = new CartaoCredito();
        Pagamento debito = new CartaoDebito();
        Pagamento saldo = new Saldo();

        Transacao transacao = new Transacao(credito);
        transacao.processaPagamento();
        
        Transacao transacao2 = new Transacao(debito);
        transacao2.processaPagamento();
        
        Transacao transacao3 = new Transacao(saldo);
        transacao3.processaPagamento();
	}

}
