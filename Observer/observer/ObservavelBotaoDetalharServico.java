package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoDetalharServico extends Observavel implements ActionListener {

private List<Observador> observadores = new ArrayList<>();
	
	public ObservavelBotaoDetalharServico() {
		observadores = new ArrayList<>();
	}

	@Override
	public void notificar() {
		for (Observador observador : observadores) {
			observador.atualizar();
		}
	}
	
	public void atualizarInformações() {
		notificar();
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		notificar();
	}

}
