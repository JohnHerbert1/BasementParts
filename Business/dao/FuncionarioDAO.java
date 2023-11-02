package dao;

import java.util.ArrayList;

import dto.FuncionarioDTO;

public class FuncionarioDAO implements FuncionarioCrud <FuncionarioDTO>{

	
	private ArrayList<FuncionarioDTO> allFuncionarios;
	
	@Override
	public ArrayList<FuncionarioDTO> getList() {
		return  allFuncionarios;
	}

	@Override
	public boolean save(FuncionarioDTO funcionario) throws Exception {
		
		if(read(funcionario.getIdFuncionario()) != null) {
			return false;
		}
		
		allFuncionarios.add(funcionario);
		return true;
	}

	@Override
	public FuncionarioDTO read(int id) throws Exception {
		for(int i = 0; i < allFuncionarios.size();i++) {
			if(allFuncionarios.get(i).getIdFuncionario() == id) {
				return allFuncionarios.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean update() throws Exception  {
		if(read(0) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delect(int id) throws Exception{
		if(read(id) != null) {
			allFuncionarios.remove(id);
			return true;
		}
		
		return false;
	}

}
