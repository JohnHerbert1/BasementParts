package msg;

import javax.swing.JOptionPane;

public class CollageMsgSucessoEnvio extends MsgCollage {

	public CollageMsgSucessoEnvio(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object objectMsg) {
		JOptionPane.showMessageDialog(null, objectMsg + " Relatorio enviado com sucesso");
	}

}
