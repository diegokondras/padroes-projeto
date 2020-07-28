package br.com.pagamentos.fluentinterfacepattern;

public class Main {

	public static void main(String[] args) {
		Recarga recarga = new Recarga().naOperadora("TIM").noNumero("47997921493").valor(20.00);
	}

}
