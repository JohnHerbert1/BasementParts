package dao;

import dto.AdmDTO;

public interface CrudADM <t> {

	

	public Iterable<t> getList();
	
	public boolean save(AdmDTO elemento) throws Exception;
	
	public boolean read(AdmDTO admDTO) ;
	
	public boolean update() throws Exception;
	
	public boolean delect(AdmDTO elemento) throws Exception;
}
