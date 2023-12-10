package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaListagemFuncionarios;

public class OuvinteGerarRelatorioFuncionario implements ActionListener {
	
	private TelaListagemFuncionarios telaListagemFuncionarios;
	
	public OuvinteGerarRelatorioFuncionario(TelaListagemFuncionarios telaListagemFuncionarios) {
		this.telaListagemFuncionarios = telaListagemFuncionarios;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
