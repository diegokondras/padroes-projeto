package br.com.pagamentos.commandpattern;

public class Cobranca {
	enum EstadoCobranca {
        ABERTO, PAGA, CANCELADA
    }
	private EstadoCobranca estado;
	private String usuarioAmigo;
	private double valor;
	private String msg;
	
	
}
