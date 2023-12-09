package msg;

public interface Mediator {

	void sendMsg(MsgCollage collage);
	
	boolean toCheckResponsability(MsgCollage collages);
	
}
