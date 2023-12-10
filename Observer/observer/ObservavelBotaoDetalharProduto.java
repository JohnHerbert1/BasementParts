package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoDetalharProduto extends Observavel implements ActionListener {

	private List<Observador> observadores;
	private ActionEvent cliqueDoBotao;
	
	public ActionEvent getCliqueDoBotao() {
		return cliqueDoBotao;
	}

	public ObservavelBotaoDetalharProduto() {
		observadores = new ArrayList<>();
	}

	public void adicionar(Observador observador) {
		observadores.add(observador);
	}

	public void remover(Observador observador) {
		int indice = observadores.indexOf(observador);
		if (indice < observadores.size()) {
			observadores.remove(observador);
		}
	}
	
	@Override
	public void notificar() {
		
//		for (Observador observador : observadores) {
//			observador.atualizar();
//		}
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		cliqueDoBotao = (ActionEvent) evento.getSource();
		notificar();
	}

}
