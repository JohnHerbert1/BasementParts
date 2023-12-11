package control;

import javax.swing.text.View;

import dto.AdmDTO;
import model.AdmModel;

public class AdmControl {

	private static volatile AdmControl istanci;//VOU VER SE E REALMENTE NESSESARIO COMO TUDO VAI SER LIGADO NO FACEDE ACHO EU QUE SO SERA NESSERAI TER O SINGLETON LÁ E CLARO NA FABRICA
	protected AdmModel adiministradorModel;
	protected View view; 
	
	public AdmControl() {//ESTOU FAZENDO ASSIM PRA FUNCIONAR COMO AGREGAÇÃO
		adiministradorModel = new AdmModel();
	}
	
	public static synchronized AdmControl getAdmControl() {	
		if(istanci == null) {
			return	istanci = new AdmControl();
		}
		return istanci;
	}
	
	public void saveControll(AdmDTO dto) {
		adiministradorModel.serviceConnectSave(dto);
	}
	
	public boolean isLogin(AdmDTO dto) {
		return adiministradorModel.serviceConnectIsLogin(dto);
	}
	
	public void delect() {
		adiministradorModel.serviceConnectDelet();
	}
		
	//EXEMPLO DE COMO APLICA O SINGLETON:------------------------------------------------
	
}
