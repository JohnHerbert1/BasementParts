package msg;

import javax.swing.JOptionPane;

public class CollageMsgSucessoLogin extends MsgCollage {

	public CollageMsgSucessoLogin(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object o, String msg) {
		JOptionPane.showMessageDialog(null, o + "Login efetuado com sucesso");
	}

}
