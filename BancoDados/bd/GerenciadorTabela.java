package bd;

public class GerenciadorTabela {
	
	private	CreatConnectionBD tabela;
	private static volatile GerenciadorTabela instanci;
	
	public GerenciadorTabela() {
		//this.tabela = escolha;
	}
	
	public synchronized static GerenciadorTabela getGerenetTabela() {
		if(instanci == null) {
			return instanci = new GerenciadorTabela();
		}
		return instanci;
	}
	
	public void escolherEstrategia(CreatConnectionBD bd) {
		this.tabela = bd;
	}
	
	public void salvarXstream(Object object) {
		tabela.creatConnection(object);
	}
	
	public Object recuperar() {
		return	tabela.recuperar();
	}
}
