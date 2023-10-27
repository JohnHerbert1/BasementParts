package dao;

import java.util.ArrayList;

import dto.OrdemServiceDTO;
import dto.ProdutoDTO;

public interface OSCrud <t> {
	
	public ArrayList<t>  getList();
	
	public boolean save(OrdemServiceDTO os) throws Exception;
	
	public ProdutoDTO read(int id) throws Exception;
	
	public boolean update(OrdemServiceDTO os);
	
	public void delect(int id);

}
