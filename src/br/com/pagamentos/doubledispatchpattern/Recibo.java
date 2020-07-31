package br.com.pagamentos.doubledispatchpattern;

import java.util.HashMap;
import java.util.Map;

public class Recibo {
	private Map<PropriedadesRecibo, String> propriedades;
	
	public void addPropriedade(PropriedadesRecibo tipo, String valor) {
		getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
	}
	
	private Map<PropriedadesRecibo, String> getPropriedades() {
		if (propriedades == null) {
			propriedades = new HashMap<PropriedadesRecibo, String>();
			for (PropriedadesRecibo tipo : PropriedadesRecibo.values())
				propriedades.put(tipo, "");
		}
		return propriedades;
	}
}
