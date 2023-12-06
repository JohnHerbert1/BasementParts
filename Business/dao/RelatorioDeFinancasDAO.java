package dao;

import java.util.ArrayList;

import dto.OrdemServiceDTO;
import dto.ProdutoDTO;
import dto.RelatorioFinancasDTO;


public class RelatorioDeFinancasDAO implements CrudFinancasServicos<RelatorioFinancasDTO> {

	private ArrayList<RelatorioFinancasDTO> allRelatorius;
	
	public RelatorioDeFinancasDAO() {
	}

	@Override
	public Iterable<RelatorioFinancasDTO> getList() {
		return allRelatorius;
	}

	@Override
	public boolean save(RelatorioFinancasDTO elemento) throws Exception {
		if(read(elemento) != null ) {
			throw new Exception();
		}
		allRelatorius.add(elemento);
		return true;
	}

	@Override
	public RelatorioFinancasDTO read(RelatorioFinancasDTO relatorio) throws Exception {
		for(int i = 0; i < allRelatorius.size();i++) {
			if(allRelatorius.get(i).getMesServico() == relatorio.getMesServico()) {
				return allRelatorius.get(i);
			}
		}
		throw new Exception();
	}
	
	public boolean saveProdutosInRelatorio(RelatorioFinancasDTO relatorio, ProdutoDTO produto) throws Exception {
		RelatorioFinancasDTO rlt = read(relatorio);
		if(read(rlt) == null) {
			return false;
		}
		
		//SE ISTO DE UM ERRO E SO CRIAR UMA VARIAVEL AUXILIAR
		for(ProdutoDTO prt : rlt.getTodosOsProdutos()) {
			if(prt.getId() == produto.getId()) {
				return false;
			}
		}
			
		rlt.getTodosOsProdutos().add(produto);
		return true;
	}
	
	public boolean saveServicosInRelatorio(RelatorioFinancasDTO relatorio, OrdemServiceDTO ordemServicos) throws Exception {
		RelatorioFinancasDTO rlt = read(relatorio);
		if(read(rlt) == null) {
			return false;
		}
		
		for(OrdemServiceDTO os : rlt.getTodosServicos()) {
			if(os.getIdOS() == ordemServicos.getIdOS()) {
				return false;
			}
		}
		
		rlt.getTodosServicos().add(ordemServicos);
		return true;
		
	}

	@Override//NAO VAI EXISTIR, ACHO SEM SENTIDO TER UM DELECT RELATORIO 
	public boolean delect(int id) throws Exception {
		return false;
	}

}
