package msg;

import javax.swing.JOptionPane;

public class CollageCadastroVerifiction extends MsgCollage {

	public CollageCadastroVerifiction(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object objectMsg) {
		JOptionPane.showMessageDialog(null, objectMsg + "O Email colocado nao e permitido, veja se tem {@} ou {.com}");
	}	
	
}
