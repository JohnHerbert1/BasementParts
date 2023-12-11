package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoDetalharFuncionario extends Observavel implements ActionListener {

	private List<Observador> observadores = new ArrayList<>();
	private ActionEvent cliqueDoBotao;

	public ActionEvent getCliqueDoBotao() {
		return cliqueDoBotao;
	}
	
	public void setCliqueDoBotao(ActionEvent cliqueDoBotao) {
		this.cliqueDoBotao = cliqueDoBotao;;
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
	