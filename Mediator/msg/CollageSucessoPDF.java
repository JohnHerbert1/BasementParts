package msg;

import javax.swing.JOptionPane;

public class CollageSucessoPDF extends MsgCollage {

	public CollageSucessoPDF(Mediator m) {
		super(m);
	}

	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Pdf Gerado com Sucesso","Sucesso",JOptionPane.YES_OPTION);

	}

	@Override
	public boolean catchResponsability(String responsabily) {
		return true;
	}


}
