package msg;

import javax.swing.JOptionPane;

public class CollageMsgSucessoLogin extends MsgCollage {

	public CollageMsgSucessoLogin(Mediator m) {
		super(m);
	}


	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Login efetuado com Sucesso","Sucesso",JOptionPane.YES_OPTION);

	}

	@Override
	public boolean catchResponsability(String yes) {
		return true;
	}

}
