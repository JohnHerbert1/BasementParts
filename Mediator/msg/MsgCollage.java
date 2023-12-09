package msg;

public abstract class MsgCollage {
	
    protected Mediator mediator;
    
    public MsgCollage(Mediator mediador) {
    	this.mediator = mediador;
    }
	
    public void sendMsg() {
    	mediator.sendMsg(this);//METODO RESPONSAVEL POR NOTIFICAR.
    }
    
    public boolean toCheckRensposability() {
    	return mediator.toCheckResponsability(this);
    }
    
    public abstract void catchMsg(Object objectMsg,String dadosString);//METODO A QUAL AS CLASS FILHAS HERDARAM PARA MANDAREM MSG 

    public abstract boolean catchResponsability(String stringObject);//ATUALIZA A RESPONSABILIDADE DO ENVIO DE MENSAGENS
}
