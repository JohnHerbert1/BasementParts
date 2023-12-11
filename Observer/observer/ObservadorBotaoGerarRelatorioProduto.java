package observer;

public class ObservadorBotaoGerarRelatorioProduto implements Observador {
	
	private ObservavelBotaoGerarRelatorioProduto estado;
	
	public ObservadorBotaoGerarRelatorioProduto(ObservavelBotaoGerarRelatorioProduto estado) {
		this.estado = estado;
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		estado.notificarObservadores();
	}
    
}
