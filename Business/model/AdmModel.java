package model;

import bd.AdmTabela;
import bd.Persistencia;
import dao.AdmDAO;
import dto.AdmDTO;

public class AdmModel {
	
	Persistencia persistencia = Persistencia.getInstanci();
	private AdmDAO admDAO;
	
	public AdmModel() {
		persistencia.escolherEstrategia(new AdmTabela());
		admDAO = (AdmDAO) persistencia.recuperar();
		
	}
	
	public void serviceConnectSave(AdmDTO admDTO) {
		
		try {			
			admDAO.save(admDTO);
			persistencia.salvarXstream(admDAO);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public void serviceConnectDelet(AdmDTO admDTO) {
		
		try {
			
			admDAO.delect(admDTO);
			persistencia.salvarXstream(admDAO);
			
		} catch (Exception e) {
	
			System.out.print(e.getMessage());
		}
	}
	
	public void serviceConnectIsLogin(AdmDTO object) {
		
	}
	
	//SERVICOS RELACIONADO AO CLIENT 
	public void serviceCreat() {
		
	}
}
