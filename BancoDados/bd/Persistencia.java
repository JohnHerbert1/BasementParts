package bd;

public class Persistencia {
	
	private	CreatConnectionBD tabela;
	private static volatile Persistencia instanci;
	
	public Persistencia() {
		//this.tabela = escolha;
	}
	
	public synchronized static Persistencia getInstanci() {
		if(instanci == null) {
			return instanci = new Persistencia();
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
