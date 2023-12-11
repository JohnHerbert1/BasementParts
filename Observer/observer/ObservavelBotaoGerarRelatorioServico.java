package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import view.TelaGerarRelatorio;
import view.TelaListagemServicos;

public class ObservavelBotaoGerarRelatorioServico extends Observavel implements ActionListener {

	private List<Observador> observadores;
	private TelaListagemServicos telaListagemServicos;
	
	public ObservavelBotaoGerarRelatorioServico() {
		observadores = new ArrayList<>();
	}
	
	@Override
	public void adicionarObservador(Observador observador) {
		observadores.add(observador);
	}
	
	@Override
	public void removerObservador(Observador observador) {
		observadores.remove(observador);
	}

	@Override
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.atualizar();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		notificarObservadores();
		telaListagemServicos.dispose();
		new TelaGerarRelatorio();
	}

}
