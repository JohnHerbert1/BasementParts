package state;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class State implements ActionListener {
	
	protected JFrame telaDispose;
	protected JFrame openTela;
	
	protected JButton botao;
	protected ActionEvent event;

	
	public void setTelaDispose(JFrame telaDispose) {
		this.telaDispose = telaDispose;
	}
	public void setOpenTela(JFrame openTela) {
		this.openTela = openTela;
	}
	public void setBotao(JButton botao) {
		this.botao = botao;
	}
	public void setEvent(ActionEvent event) {
		this.event = event;
	}

	public JFrame getTelaDispose() {
		return telaDispose;
	}

	public JFrame getOpenTela() {
		return openTela;
	}

	public JButton getBotao() {
		return botao;
	}

	public ActionEvent getEvent() {
		return event;
	}
	
	
	
	
}
