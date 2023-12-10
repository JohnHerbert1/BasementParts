package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaListagemServicos;

public class ObservavelBotaoDetalharServico implements ActionListener {

	private TelaListagemServicos telaListagemServicos;
	
	public ObservavelBotaoDetalharServico(TelaListagemServicos telaListagemServicos) {
		this.telaListagemServicos = telaListagemServicos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
