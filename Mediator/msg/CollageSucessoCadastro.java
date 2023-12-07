package msg;

import javax.swing.JOptionPane;

public class CollageSucessoCadastro extends MsgCollage {

	public CollageSucessoCadastro(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object o, String msg) {
		JOptionPane.showMessageDialog(null, o.toString() + "Sucesso ao Cadastrar");
	}

}
