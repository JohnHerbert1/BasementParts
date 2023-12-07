package msg;

import javax.swing.JOptionPane;

public class CollageSucessoPDF extends MsgCollage {

	public CollageSucessoPDF(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object objectMsg, String dadosString) {
		isAptitoMsg(dadosString);
	}

	
	private boolean isAptito(String efetivo) {
		boolean retorno = false;
		
		switch(efetivo.toUpperCase()) {
		case "ANDAMENTO":
			retorno = false;
			break;
		case "TERMINADO":
			retorno = true;
		}
		return retorno;
	}
	
	private void isAptitoMsg(String efetivo) {
		if(isAptito(efetivo)) {
			JOptionPane.showMessageDialog(null, "PDF gerado com Sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "PDF nao pode ser Criado ou ter seus dados compra adicionados,pos a compras em andamento");
		}
	}
}
