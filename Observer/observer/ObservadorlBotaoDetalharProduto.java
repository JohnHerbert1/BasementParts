package observer;

public class ObservadorlBotaoDetalharProduto implements Observador {

	private ObservavelBotaoDetalharProduto estado;
	
	public ObservadorlBotaoDetalharProduto(ObservavelBotaoDetalharProduto estado) {
		this.estado = estado;
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		estado.notificarObservadores();
	}

}
