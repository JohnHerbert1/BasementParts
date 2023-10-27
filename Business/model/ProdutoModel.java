package model;

import java.util.ArrayList;

import dao.ProdutoDAO;
import dto.ProdutoDTO;

public class ProdutoModel {
	
	private ProdutoDAO produtoCrud;
	
	
	public ProdutoModel() {
		produtoCrud = new ProdutoDAO();
	}
	
	//SERVICOS RELACIONADO AO PRODUTO:
	public void serviceSave(ProdutoDTO produtoDto) {
		try {
			produtoCrud.save(produtoDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ProdutoDTO> serviceViewAll() {
		return produtoCrud.getList();
	}
	
	public void remove(int id) {
		produtoCrud.delect(id);
	}

}
