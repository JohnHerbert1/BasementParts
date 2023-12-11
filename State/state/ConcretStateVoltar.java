package state;

import java.awt.event.ActionEvent;

public class ConcretStateVoltar extends State {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		getTelaDispose().setVisible(false);	
		getOpenTela().setVisible(true);
	}





}
