package control;

import dto.FuncionarioDTO;
import model.FuncionarioModel;

public class FuncionarioControl {//ESTA CLASS NAO SEI SE VAI EXISTIR OU SE VOU DIVIDIR EM DUAS EX A 2 TIPOS O QUE TRABALHA COMO MECANICO 

	private static volatile FuncionarioControl instanci;
	protected FuncionarioModel funcionarioModel;
	
	public FuncionarioControl() {
		this.funcionarioModel = new FuncionarioModel();
	}
	
	public static synchronized FuncionarioControl getInstanci() {
		if(instanci == null) {
			instanci = new FuncionarioControl();
		}
		return instanci;
	}
	
	
	public void saveFuncionario(FuncionarioDTO dto) {
		funcionarioModel.serviceConnectSave(dto);
	}
	
	public void delect(FuncionarioDTO dto) {
		funcionarioModel.serviceConnectDelect(dto);
	}
	
	public void update(FuncionarioDTO dto) {
		funcionarioModel.serviceUpdateConnect();
	}
	
	
}
