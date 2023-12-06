package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.TelaListagemFuncionarios;

public class OuvinteDetalharFuncionario implements ActionListener {
	
	private TelaListagemFuncionarios telaListagemFuncionarios;
	
	public OuvinteDetalharFuncionario(TelaListagemFuncionarios telaListagemFuncionarios) {
		this.telaListagemFuncionarios = telaListagemFuncionarios;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(telaListagemFuncionarios, "Clicou!");
	}

}
