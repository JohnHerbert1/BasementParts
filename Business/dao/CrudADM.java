package dao;

import dto.AdmDTO;

public interface CrudADM <t> {

	

	//public Iterable<t> getList();
	
	public boolean save(AdmDTO elemento) throws Exception;
	
//	public t read(AdmDTO elemento) throws Exception;
	
	public boolean update() throws Exception;
	
	public boolean delect(AdmDTO elemento) throws Exception;
}
