package control;

import dto.OrdemServiceDTO;
import model.OrdemServicoModel;

public class OrdemServicoControl {
	
	private static volatile OrdemServicoModel instanci;
	protected OrdemServicoModel servicosModel;
	
	public OrdemServicoControl() {
		this.servicosModel = new OrdemServicoModel();
	}
	
	
	public void save(OrdemServiceDTO dto) {
		servicosModel.serviceConnectCreat(dto);
	}
	
	public void delect() {
	}
	
	

}
