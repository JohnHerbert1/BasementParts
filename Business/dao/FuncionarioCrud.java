package dao;

import dto.FuncionarioDTO;

//NAO SEI SE VAMOS CRIAR DUAS INTERFACES PRA OS USERS <ADM> E <CLIENT>, POR ISTO SO VOU CRIAR O DE CLIENT.
//SE DECIDIMOS EM TER UM ADM, PODERIAMOS FAZER UM CONPOSITE, CLORO QUE TENHO QUE VER SE VAI DAR PRA FAZER.

//VOU VER COMO CRIAR UM CONPOSITE SEM AFETAR O PADRAO DAO 
public interface FuncionarioCrud <t> {
	
	public Iterable<t> getList();
	
	public boolean save(FuncionarioDTO funcionario) throws Exception;
	
	public FuncionarioDTO read(int id) throws Exception;
	
	public boolean update() throws Exception;
	
	public boolean delect(FuncionarioDTO funcionario) throws Exception;
	
	
}
