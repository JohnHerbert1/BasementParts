package control;

import model.BoletoModel;

public class BoletoControl {

	private static volatile BoletoControl instanci;
	protected BoletoModel boletoModel;
	
	
	protected BoletoControl() {
		this.boletoModel = new BoletoModel();
	}
	
	public static synchronized BoletoControl getInstanci() {
		if(instanci == null) {
			return instanci = new BoletoControl();
		}
		return instanci;
	}
	
	
}
