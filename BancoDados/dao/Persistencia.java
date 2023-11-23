package dao;

public class Persistencia {

	ConnectionXML conecao;
	
	public Persistencia(ConnectionXML connect) {
		this.conecao = connect;
	}
	
	
	public void connectSaveXML(Object impleObject) {
		conecao.salvar(impleObject);
	}

}
