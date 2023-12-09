package observer;

import java.util.ArrayList;
import java.util.List;
// UML: Sujeito Concreto.
public class SujeitoConcreto implements Sujeito {

	private List<Observadora> observadores;
	
	public SujeitoConcreto() {
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
