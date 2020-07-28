package br.com.pagamentos.fluentinterfacepattern;

public class Recarga {
	
	private String operadora;
	private String numero;
	private double valor;
	
	public Recarga naOperadora(String operadora) {
		this.operadora = operadora;
		return this;
	}
	
	public Recarga noNumero(String numero) {
		this.numero = numero;
		return this;
	}
	
	public Recarga valor(double valor) {
		this.valor = valor;
		return this;
	}

	public String getOperadora() {
		return operadora;
	}

	public String getNumero() {
		return numero;
	}

	public double getValor() {
		return valor;
	}

}
