package control;

import javax.swing.text.View;

import model.AdmModel;

public class AdmControl {

	private static volatile AdmControl istanci;//VOU VER SE E REALMENTE NESSESARIO COMO TUDO VAI SER LIGADO NO FACEDE ACHO EU QUE SO SERA NESSERAI TER O SINGLETON LÁ E CLARO NA FABRICA
	protected AdmModel ADMModel;
	protected View view; 
	
	public AdmControl(AdmModel model) {//ESTOU FAZENDO ASSIM PRA FUNCIONAR COMO AGREGAÇÃO
		this.ADMModel = model;
	}
	
	//EXEMPLO DE COMO APLICA O SINGLETON:------------------------------------------------
	public static synchronized AdmControl getAdmControl(AdmModel model) {	
		if(istanci == null) {
		return	istanci = new AdmControl(model);
		}
		return istanci;
	}
	
}
