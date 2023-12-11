package msg;

import javax.swing.JOptionPane;

public class CollageSucessoCadastro extends MsgCollage {

	public CollageSucessoCadastro(Mediator m) {
		super(m);
	}


	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso","Sucesso",JOptionPane.YES_OPTION);

	}

	@Override
	public boolean catchResponsability(String truer) {
		return true;
	}

}