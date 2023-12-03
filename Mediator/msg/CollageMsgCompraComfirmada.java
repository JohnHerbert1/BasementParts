package msg;

import javax.swing.JOptionPane;

public class CollageMsgCompraComfirmada extends MsgCollage{

	public CollageMsgCompraComfirmada(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object o) {
		JOptionPane.showMessageDialog(null, o  + " Compra confirmada!!!");
	}

}
