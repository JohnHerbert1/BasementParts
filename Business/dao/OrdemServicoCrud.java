package dao;

import dto.OrdemServiceDTO;

public interface OrdemServicoCrud <t>{

	public Iterable<t> getList();
	
	public boolean save(OrdemServiceDTO servico) throws Exception;
	
	OrdemServiceDTO read(int id) throws Exception;
	
	public boolean update()throws Exception;
	
	public boolean delect(int id) throws Exception;
	
}
