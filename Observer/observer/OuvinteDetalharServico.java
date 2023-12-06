package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaListagemServicos;

public class OuvinteDetalharServico implements ActionListener {

	private TelaListagemServicos telaListagemServicos;
	
	public OuvinteDetalharServico(TelaListagemServicos telaListagemServicos) {
		this.telaListagemServicos = telaListagemServicos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
