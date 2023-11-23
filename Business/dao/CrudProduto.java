package dao;

import dto.ProdutoDTO;

public interface CrudProduto <t> {
	
	public Iterable<t> getList();
	
	public boolean save(ProdutoDTO produto) throws Exception;
	
	ProdutoDTO read(int id) throws Exception;
	
	public boolean update(int id, int preco, String nome)throws Exception;
	
	public void delect(int id) throws Exception;
	
}
