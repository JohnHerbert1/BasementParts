package dao;

import java.util.ArrayList;

import dto.ProdutoDTO;

//INTERFACE DE PRODUTO
public interface ProdutoCrud <t> {
	
	public ArrayList<t>  getList();
	
	public boolean save(ProdutoDTO produtoDto) throws Exception;
	
	public ProdutoDTO read(int id) throws Exception;
	
	public boolean update(ProdutoDTO produtoDto);
	
	public void delect(int id);
	
	
}
