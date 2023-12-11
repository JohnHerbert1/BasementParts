package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ObservavelBotaoGerarRelatorioServico extends Observavel implements ActionListener {

	private List<Observador> observadores = new ArrayList<>();
	
	public ObservavelBotaoGerarRelatorioServico() {
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
