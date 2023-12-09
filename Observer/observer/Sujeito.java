package observer;
// UML: Sujeito
public interface Sujeito {
	
	public void adicionar(Observadora observadora);
	
	public void remover(Observadora observadora);
	
	public void notificar();

}
