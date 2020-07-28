package br.com.pagamentos.commandpattern;

public class Cobranca {
	enum EstadoCobranca {
        ABERTO, PAGA, CANCELADA
    }
	private EstadoCobranca estado;
	private String usuarioAmigo;
	private double valor;
	private String msg;
	
	public void abrir() {
        this.estado = Estado  .ABERTO;
        System.out.println("O portão abriu...");
    }

    public void fechar() {
        this.estado = EstadoPortao.FECHADO;
        System.out.println("O portão fechou...");
    }
	
	
}
