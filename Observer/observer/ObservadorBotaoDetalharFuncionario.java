package observer;

public class ObservadorBotaoDetalharFuncionario implements Observador {

	private ObservavelBotaoDetalharFuncionario estado;
	
	public ObservadorBotaoDetalharFuncionario(ObservavelBotaoDetalharFuncionario estado) {
		this.estado = estado;
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		estado.notificarObservadores();
	}
   
}
