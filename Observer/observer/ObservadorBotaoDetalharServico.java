package observer;

public class ObservadorBotaoDetalharServico implements Observador {
	
	private ObservavelBotaoDetalharServico estado;
	
	public ObservadorBotaoDetalharServico(ObservavelBotaoDetalharServico estado) {
		this.estado = estado;
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		estado.notificarObservadores();
	}
    
}
