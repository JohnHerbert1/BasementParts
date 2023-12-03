package msg;

public abstract class MsgCollage {
	
    protected Mediator mediator;
    
    public MsgCollage(Mediator mediador) {
    	this.mediator = mediador;
    }
	
    public void enviarMsg() {
    	mediator.enviarMsg(this);
    }
    
    public abstract void receberMsg(Object objectMsg);//METODO A QUAL AS CLASS FILHAS HERDARAM PARA MANDAREM MSG 

}
