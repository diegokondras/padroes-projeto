package br.com.pagamentos.doubledispatchpattern;

import java.util.HashMap;
import java.util.Map;

public class Recibo {
	
	private Map<PropriedadesRecibo, String> propriedades;
	
	public void addPagamento(Pagamento pagamento) {
		pagamento.addPropriedades(this);
	}

	
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

	public void imprimeRecibo() {
		
		for (Map.Entry<PropriedadesRecibo,String> entry : propriedades.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	}

}
