package msg;

import javax.swing.JOptionPane;

public class CollageMsgSucessoEnvio extends MsgCollage {

	public CollageMsgSucessoEnvio(Mediator m) {
		super(m);
	}


	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Sucesso ao enviar Dados ao Email","Sucesso",JOptionPane.YES_OPTION);

	}

	@Override
	public boolean catchResponsability(String dadosValidos) {
		return true;
	}

}
