package control;

import model.RelatorioModel;

public class RelatorioControl {

	
	private static volatile RelatorioControl instanci;
	protected RelatorioModel relatorioModel;
	
	protected RelatorioControl() {
		this.relatorioModel = new RelatorioModel();
	}
	
	public static synchronized RelatorioControl getInstanci() {
		if(instanci == null) {
			instanci = new RelatorioControl();
		}
		return instanci;
	}
	
	
}
