package msg;

import javax.swing.JOptionPane;

public class CollageCamposVazios extends MsgCollage {

	public CollageCamposVazios(Mediator m) {
		super(m);
	}


	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Campos de texto estao vazios","Erro",JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public boolean catchResponsability(String campo) {
		return campo.isBlank();
	}

}
