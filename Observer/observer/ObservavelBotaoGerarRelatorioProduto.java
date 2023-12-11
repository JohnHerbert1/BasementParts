package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoGerarRelatorioProduto extends Observavel implements ActionListener {

	private List<Observador> observadores;
	private ActionEvent cliqueDoBotao;

	public ActionEvent getCliqueDoBotao() {
		return cliqueDoBotao;
	}

	public ObservavelBotaoGerarRelatorioProduto() {
		observadores = new ArrayList<>();
	}

	@Override
	public void notificar() {
		for (Observador observador : observadores) {
			observador.atualizar();
		}
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		cliqueDoBotao = (ActionEvent) evento.getSource();
		notificar();
		
	}

}
