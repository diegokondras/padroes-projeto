package br.com.pagamentos.commandpattern;

public interface Comando {
	
	public String fazer();

	public String desfazer();

}
