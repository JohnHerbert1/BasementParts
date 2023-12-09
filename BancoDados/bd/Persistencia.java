package bd;

/*
 @Author John Herbert
 */

public class Persistencia  {
	
	private	CreatConnectionBD tabela;
	private static volatile Persistencia instanci;
	
	public Persistencia() {
	}
	
	public synchronized static Persistencia getInstanci() {
		if(instanci == null) {
			return instanci = new Persistencia();
		}
		return instanci;
	}
	
	public void escolherEstrategia(CreatConnectionBD bd) {//ESCOLHE QUAL ESTRATEGIA SERA FEITA 
		this.tabela = bd;
	}
	
	public void salvarXstream(Object object) {//SALVA O ARQUIVO DESEJADO, ESTA OBJECT PRA PODER SER CRIADO INDEPENDENTE DE QUASQUER CLASS
		tabela.creatConnection(object);
	}
	
	public Object recuperar() {//RETORNA UM OBJETO OU SEJA PODE RETORNA QUAISQUER CLASS CRIADADAS SEM A NECESSIDADE DE CRIAR UMA FAMILHA
		return	tabela.recuperar();
	}
}
