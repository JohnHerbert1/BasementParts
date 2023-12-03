package msg;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MediadorMsg implements Mediator{

	protected ArrayList<MsgCollage> collages;
	private Object o;
	
	public MediadorMsg(Object o) {
		collages = new ArrayList<>();
		this.o = o;
	}
	
	public void addMediador(MsgCollage m) {
		collages.add(m);
	}

	@Override
	public void enviarMsg(MsgCollage collage) {
		for(MsgCollage m: collages) {
			if(m != collage) {
				definirProtocolo(m);
				m.receberMsg(o);
			}
		}
	}
	
	private void definirProtocolo(MsgCollage collag) {
		if(collag instanceof CollageMsgCompraComfirmada) {
			JOptionPane.showMessageDialog(null, "Protocolo [Compra]");
		}else if(collag instanceof CollageMsgSucessoLogin) {
			JOptionPane.showMessageDialog(null, "Protocolo [Login]");
		}else if(collag instanceof CollageSucessoCadastro) {
				JOptionPane.showMessageDialog(null, "Protocolo [Cadastro]");
		}else if(collag instanceof CollageMsgSucessoEnvio) {
			JOptionPane.showMessageDialog(null, "Protocolo de envio ao [Email]");
		}
		
	}

}
