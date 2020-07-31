package br.com.pagamentos.facadepattern;

public class CartaoCredito implements MetodoPagamento {
	
	private String numero;
	private String mesValidade;
	private String anoValidade;
	private String nome;
	private String cvc;
	
	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento com Cartão de Crédito");
	}
	
}
