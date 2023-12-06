package msg;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MediadorMsg implements Mediator{

	protected ArrayList<MsgCollage> collages;
	private Object o;
	private String dadosStrings;
	
	public MediadorMsg(Object o) {//CONSTRUTOR SO PRA MSG
		collages = new ArrayList<>();
		this.o = o;
	}
	
	public MediadorMsg(String dadosString) {//CONSTRUTOR PRA VALIDACAO TEXTO, TAMBEM RETORNA MSG MAIS USA STRING PRA CAPTURAR DADOS
		collages = new ArrayList<>();
		this.dadosStrings = dadosString;
	}
	
	public void addMediador(MsgCollage m) {
		collages.add(m);
	}

	@Override
	public void enviarMsg(MsgCollage collage) {
		for(MsgCollage m: collages) {
			if(m != collage) {
				definirProtocolo(m);
				m.receberMsg(o,dadosStrings);
			}
		}
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

}
