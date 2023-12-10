package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaListagemServicos;

public class ObservavelBotaoGerarRelatorioServico implements ActionListener {

	private TelaListagemServicos telaListagemServicos;
	
	public ObservavelBotaoGerarRelatorioServico(TelaListagemServicos telaListagemServicos) {
		this.telaListagemServicos = telaListagemServicos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
