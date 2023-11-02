package dao;

import java.util.ArrayList;

import dto.OrdemServiceDTO;

public class OrdemServicoDAO implements OrdemServicoCrud<OrdemServiceDTO>{
	
	private ArrayList<OrdemServiceDTO> todosOsServicos;

	public OrdemServicoDAO() {
		todosOsServicos = new ArrayList<>();
		}

	@Override
	public Iterable<OrdemServiceDTO> getList() {
		return todosOsServicos;
	}

	@Override
	public boolean save(OrdemServiceDTO servico) throws Exception {
		if(read(servico.getIdOS()) != null) {
			return false;
		}
		
		todosOsServicos.add(servico);
		return false;
	}

	@Override
	public OrdemServiceDTO read(int id) throws Exception {
		for(int i = 0; i < todosOsServicos.size();i++) {
			if(todosOsServicos.get(i).getIdOS() == id) {
				return todosOsServicos.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean update() throws Exception {
		return false;
	}

	@Override
	public boolean delect(int id) throws Exception {
		if(read(id) != null) {
			todosOsServicos.remove(id);
			return true;
		}
		return false;
	}

	
}
