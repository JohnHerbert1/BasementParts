package dao;

import java.util.ArrayList;
import java.util.Iterator;

import dto.AdmDTO;

public class AdmDAO implements CrudADM<AdmDTO>{

	ArrayList<AdmDTO> allAdms;
	
	public AdmDAO() {
		
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
	public boolean delect(AdmDTO elemento) throws Exception {
		return allAdms.remove(0) != null;
	}

}
