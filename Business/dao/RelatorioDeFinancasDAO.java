package dao;

import java.util.ArrayList;

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

	@Override//NAO VAI EXISTIR, ACHO SEM SENTIDO TER UM DELECT RELATORIO 
	public boolean delect(int id) throws Exception {
		return false;
	}

}
