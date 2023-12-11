package observer;

public abstract class Observavel {

	public abstract void adicionarObservador(Observador observador);
	
	public abstract void removerObservador(Observador observador);

	public abstract void notificarObservadores();

}
