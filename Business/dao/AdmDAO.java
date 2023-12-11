package dao;

import java.util.ArrayList;

import dto.AdmDTO;

public class AdmDAO implements CrudADM<AdmDTO>{

	ArrayList<AdmDTO> allAdms;
	
	public AdmDAO() {
		this.allAdms = new ArrayList<>();
	}

	@Override
	public boolean save(AdmDTO elemento) throws Exception {
		
		if(allAdms.size() > 0) {
			throw new Exception();
		}
		allAdms.add(elemento);
		return false;
	}



	@Override
	public boolean update() throws Exception {
		return false;
	}

	@Override
	public boolean delect() throws Exception {
		return allAdms.remove(0) != null;
	}

	@Override
	public boolean read(AdmDTO elemento) {
			for(AdmDTO adm : allAdms) {
				if(adm.geteMail().equals(elemento.geteMail()) & adm.getSenha().equals(elemento.getSenha())) {
				return true;
				}
			}
			return false;
	}


}
