package dao;

import java.util.ArrayList;

import dto.AdmDTO;

public class AdmDAO implements CrudADM<AdmDTO>{

	ArrayList<AdmDTO> allAdms= new ArrayList<AdmDTO>();
	protected AdmBD admBD;
	
	public AdmDAO() {
		
		admBD= new AdmBD();
	}

	@Override
	public boolean save(AdmDTO elemento) throws Exception {
		
		if(read(elemento)==false) {
			throw new Exception();
		}
		allAdms.add(elemento);
		admBD.salvar(allAdms);
		return false;
	}


	
	@Override
	public boolean update() throws Exception {
		return false;
	}

	@Override
	public boolean delect(AdmDTO elemento) throws Exception {
		return allAdms.remove(0) != null;
	}

	public boolean procurar(AdmDTO dto) {
		
		for(int i= 0; i< allAdms.size(); i++) {
			
			if (allAdms.get(i).equals(dto)) {
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public ArrayList<AdmDTO> getList() {
		
		return allAdms;
	}

	@Override
	public boolean read(AdmDTO admDTO){
		
		for(int i = 0; i <allAdms.size();i++) {
			if(allAdms.get(i).geteMail() == admDTO.geteMail()) {
				return true;
			}
		}
		return false;
	}
	
}
