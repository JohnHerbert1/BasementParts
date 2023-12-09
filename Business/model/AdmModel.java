package model;

import dao.AdmDAO;
import dto.AdmDTO;

public class AdmModel {

	private AdmDAO admDAO;
	
	public AdmModel() {
		
		admDAO= new AdmDAO();
	}
	
	public void serviceConnectSave(AdmDTO admDTO) {
		
		try {
			admDAO.save(admDTO);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public void serviceConnectDelet(AdmDTO admDTO) {
		
		try {
			
			admDAO.delect(admDTO);
			
		} catch (Exception e) {
	
			System.out.print(e.getMessage());
		}
	}
	
	public boolean connectProcurar(AdmDTO admDTO) {
		
		return admDAO.procurar(admDTO);
	}
	
	
	//SERVICOS RELACIONADO AO CLIENT 
	public void serviceCreat() {
		
	}
}
