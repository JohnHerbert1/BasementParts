package msg;

import javax.swing.JOptionPane;

public class CollageSucessoPDF extends MsgCollage {

	public CollageSucessoPDF(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object objectMsg) {
		JOptionPane.showMessageDialog(null, objectMsg + "PDF gerado com sucesso");
	}

}
