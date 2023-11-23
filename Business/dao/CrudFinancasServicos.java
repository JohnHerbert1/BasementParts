package dao;

import dto.RelatorioFinancasDTO;

public interface CrudFinancasServicos <t> {
	
	
	public Iterable<t> getList();
	
	public boolean save(RelatorioFinancasDTO elemento) throws Exception;
	
	public t read(RelatorioFinancasDTO elemento) throws Exception;
	
	//public boolean update() throws Exception;
	
	public boolean delect(int id) throws Exception;

}
