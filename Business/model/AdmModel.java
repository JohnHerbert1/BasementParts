package model;

import java.util.ArrayList;

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
	
	
	public ArrayList<AdmDTO> connectedArrayList(){
		
		return admDAO.getList();
	}
	
	public boolean connectRead(AdmDTO admDTO) {
		
		return admDAO.read(admDTO);
	}
	
	//SERVICOS RELACIONADO AO CLIENT 
	public void serviceCreat() {
		
	}
}
