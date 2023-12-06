package model;

import java.util.ArrayList;

import bd.Persistencia;
import bd.ProdutoTabela;
import dao.ProdutoDAO;
import dto.ProdutoDTO;

public class ProdutoModel {
	
	private Persistencia persistencia = Persistencia.getInstanci();
	private ProdutoDAO produtoCrud;
	
	public ProdutoModel() {
		persistencia.escolherEstrategia(new ProdutoTabela());
		produtoCrud = (ProdutoDAO) persistencia.recuperar();
	}
	
	//SERVICOS RELACIONADO AO PRODUTO:
	public void serviceSave(ProdutoDTO produtoDto) {
		try {
			ModeloAutomatizarID<ProdutoDTO> automizarId = new ModeloAutomatizarID<>();
			produtoDto.setId(automizarId.gerarID(produtoCrud.getList(), produtoDto));
			produtoCrud.save(produtoDto);
			persistencia.salvarXstream(produtoCrud);
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
