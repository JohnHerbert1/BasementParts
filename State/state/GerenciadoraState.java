package state;

import javax.swing.JFrame;

public class GerenciadoraState {

	private State state;
	
	
	public GerenciadoraState(State stado) {
		this.state = stado;
	}
	
	public State getState() {
		return state;
	}
	
	public void setTelaDispose(JFrame frame) {
		state.setTelaDispose(frame);
	}
	
	public void setTelaOpner(JFrame frame) {
		state.setOpenTela(frame);
	}
	
	public void setInicializable() {
		state.getOpenTela().setVisible(false);
	}
	
	

}
