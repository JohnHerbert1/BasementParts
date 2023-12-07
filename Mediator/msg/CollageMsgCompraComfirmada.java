package msg;

import javax.swing.JOptionPane;

public class CollageMsgCompraComfirmada extends MsgCollage{

	public CollageMsgCompraComfirmada(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object o, String msg) {
		JOptionPane.showMessageDialog(null, o  + " Compra confirmada!!!");
	}

}
