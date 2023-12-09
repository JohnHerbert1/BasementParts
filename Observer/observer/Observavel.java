package observer;

public interface Observavel {
	
	public void adicionar(Observadora observadora);
	
	public void remover(Observadora observadora);
	
	public void notificar();

}
