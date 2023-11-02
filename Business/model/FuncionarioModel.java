package model;

import java.util.ArrayList;

import dao.FuncionarioDAO;
import dto.FuncionarioDTO;

public class FuncionarioModel {

	private FuncionarioDAO funcionarioDAO;
	
	public FuncionarioModel() {
		funcionarioDAO = new FuncionarioDAO();
	}
	
	public void serviceConnectSave(FuncionarioDTO funcionario) {
		try {
		funcionarioDAO.save(funcionario);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	public void serviceConnectDelect(int id) {
		try {
		funcionarioDAO.delect(id);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public ArrayList<FuncionarioDTO> serviceAllDisplay() {
		return funcionarioDAO.getList();
	}
}
