package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservavelConcreto implements Observavel {

	private List<Observadora> observadores;
	
	public ObservavelConcreto() {
		observadores = new ArrayList<>();
	}
	
	@Override
	public void adicionar(Observadora observadora) {
		observadores.add(observadora);
	}

	@Override
	public void remover(Observadora observadora) {
		int indice = observadores.indexOf(observadora);
		if (indice < observadores.size()) {
			observadores.remove(observadora);
		}
	}

	@Override
	public void notificar() {
		for (Observadora observadora : observadores) {
			observadora.atualizar();
		}
	}
	
	public void atualizarInformacoes() {
		notificar();
	}

}
