package observer;

public class ObservadorBotaoGerarRelatorioServico implements Observador {
	
	private ObservavelBotaoGerarRelatorioServico estado;
	
	public ObservadorBotaoGerarRelatorioServico(ObservavelBotaoGerarRelatorioServico estado) {
		this.estado = estado;
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		estado.notificarObservadores();
	}

}
