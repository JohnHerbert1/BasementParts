package observer;

public abstract class Observavel {
	
	public abstract void adicionar(Observadora observadora);
	
	public abstract void remover(Observadora observadora);
	
	public abstract void notificar();

}
