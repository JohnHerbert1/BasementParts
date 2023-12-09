package msg;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Mediador implements Mediator{
	
	private volatile static Mediador instaci;
	protected ArrayList<MsgCollage> collages;
	private Object o;
	private String dadosStrings;
	
	protected Mediador() {
		this.collages = new ArrayList<>();
	}
	
	public static synchronized Mediador getInstanci() {
		if(instaci == null) {
			instaci = new Mediador();
		}
		return instaci;
	}
	
	public void addMediador(MsgCollage m) {
		collages.add(m);
	}

	@Override
	public void sendMsg(MsgCollage collage) {
		for(MsgCollage m: collages) {
			if(m == collage) {
				definirProtocolo(m);
				m.catchMsg(m, dadosStrings);
			}
		}
	}
	
	public void setDados(Object dadosA) {
		this.dadosStrings = (String) dadosA; this.o = dadosA;
		
	}
	
	private void definirProtocolo(MsgCollage collag) {
		if(collag instanceof CollageMsgCompraComfirmada) {
			JOptionPane.showMessageDialog(null, "Protocolo [Compra]");
		}else if(collag instanceof CollageMsgSucessoLogin) {
			JOptionPane.showMessageDialog(null, "Protocolo [Login]");
		}else if(collag instanceof CollageCadastroVerifiction) {
				JOptionPane.showMessageDialog(null, "Protocolo seguranca [Cadastro]");
		}else if(collag instanceof CollageMsgSucessoEnvio) {
			JOptionPane.showMessageDialog(null, "Protocolo de envio ao [Email]");
		}
	}

	@Override
	public boolean toCheckResponsability(MsgCollage collage) {
		boolean isTipyOfResponsability = false;
		for(MsgCollage m : collages) {
			if(m == collage) {
				isTipyOfResponsability = m.catchResponsability(dadosStrings);
			}
		}
		return isTipyOfResponsability;
	}

}
