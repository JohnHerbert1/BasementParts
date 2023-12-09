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
	public void serviceConnectDelect(FuncionarioDTO funcionario) {
		try {
		funcionarioDAO.delect(funcionario);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void serviceUpdateConnect() {
		try {
			funcionarioDAO.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<FuncionarioDTO> serviceAllDisplay() {
		return funcionarioDAO.getList();
	}
}
