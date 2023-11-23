package control;

/*
 * By: John Herbert;
 * Version = 1;
 */

public class FacadeControl {
//LEMBAR QUE AINDA VAI TER AS TELAS OU SEJA CODIGO NOS BOTOS DE ATIVAÇÃO CLASSE AINDA VAI EXITIR MAIS EM UMA AVALIACAO MELHOR;
 	
	private static volatile FacadeControl facade;
	private FuncionarioControl controleFuncionario;
	private OrdemServicoControl OSControl;
	
	
	private FacadeControl(FuncionarioControl funcionario,OrdemServicoControl OrdemServico) {
		this.controleFuncionario = funcionario;
		this.OSControl = OrdemServico;
	}
	
	public static synchronized FacadeControl getFacadeControl(FuncionarioControl funcionario,OrdemServicoControl OrdemServico) {
		if(facade == null) {
			return new FacadeControl(funcionario, OrdemServico);
		}
		return facade;
	}
	
	public void configurarFacade() {
		
	}
	

}
