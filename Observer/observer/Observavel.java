package observer;

import java.util.List;

public abstract class Observavel {

	private List<Observador> observadores;

	public void adicionar(Observador observador) {
		observadores.add(observador);
	}
	
	public void remover(Observador observador) {
		int indice = observadores.indexOf(observador);
		if (indice < observadores.size()) {
			observadores.remove(observador);
		}
	}

	public abstract void notificar();

}
