package err;

import javax.swing.JOptionPane;

public class CollageSucessoCadastro extends MsgCollage {

	public CollageSucessoCadastro(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object o) {
		JOptionPane.showMessageDialog(null, o.toString() + "Sucesso ao Cadastrar");
	}

}
