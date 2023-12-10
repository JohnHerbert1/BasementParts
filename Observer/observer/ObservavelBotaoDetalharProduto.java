package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoDetalharProduto extends Observavel implements ActionListener {

	private List<Observadora> observadores;
	private ActionEvent cliqueDoBotao;
	
	public ActionEvent getCliqueDoBotao() {
		return cliqueDoBotao;
	}

	public ObservavelBotaoDetalharProduto() {
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
			// if (cliqueDoBotao.getSource())	// Como notificar o clique do botão?
				observadora.atualizar();
		}
	}
	
	// public void atualizarInformacoes() {
	// 	notificar();
	// }	// Comentei porque não sei se o método é necessário.

	@Override
	public void actionPerformed(ActionEvent evento) {
		cliqueDoBotao = (ActionEvent) evento.getSource();
		notificar();
	}

}
