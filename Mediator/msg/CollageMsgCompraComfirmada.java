package msg;

import javax.swing.JOptionPane;

public class CollageMsgCompraComfirmada extends MsgCollage{

	public CollageMsgCompraComfirmada(Mediator m) {
		super(m);
	}

	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Email nao qualificado ao Cadastro precisa ter {@} {.com}","Sucesso",JOptionPane.OK_CANCEL_OPTION);

	}

	@Override
	public boolean catchResponsability(String compra) {
		return true;
	}


}
