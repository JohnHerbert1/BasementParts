package model;

import java.util.ArrayList;

import bd.FuncionarioTabela;
import bd.Persistencia;
import dao.FuncionarioDAO;
import dto.FuncionarioDTO;

public class FuncionarioModel {
	
	protected Persistencia persistencia = Persistencia.getInstanci();
	private FuncionarioDAO funcionarioDAO;
	
	public FuncionarioModel() {
		persistencia.escolherEstrategia(new FuncionarioTabela());
		funcionarioDAO = (FuncionarioDAO) persistencia.recuperar();
	}
	
	public void serviceConnectSave(FuncionarioDTO funcionario) {
		try {
		ModeloAutomatizarID<FuncionarioDTO> automizarId = new ModeloAutomatizarID<>();
		funcionario.setIdFuncionario(automizarId.gerarID(funcionarioDAO.getList(), funcionario));
		funcionarioDAO.save(funcionario);
		persistencia.salvarXstream(funcionarioDAO);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	public void serviceConnectDelect(FuncionarioDTO funcionario) {
		try {
		funcionarioDAO.delect(funcionario);
		persistencia.salvarXstream(funcionarioDAO);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void serviceUpdateConnect() {
		try {
			funcionarioDAO.update();
			persistencia.salvarXstream(funcionarioDAO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<FuncionarioDTO> serviceAllDisplay() {
		return funcionarioDAO.getList();
	}
}
