package bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import dao.OrdemServicoDAO;

public class OrdemServicoTabela implements CreatConnectionBD {
	

	private  XStream xstream = new XStream(new DomDriver());
	private  File arquivo = new File("OrdemServico.xml");

	public OrdemServicoTabela() {
	}

	@Override
	public void creatConnection(Object objeto) {
		String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n";
		xml += xstream.toXML(objeto);

		try {
			if (!arquivo.exists()) 
				arquivo.createNewFile();
			PrintWriter gravar = new PrintWriter(arquivo);
			gravar.print(xml);
			gravar.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public OrdemServicoDAO recuperar() {
		
		try {

			if (arquivo.exists()) {
				FileInputStream fis = new FileInputStream(arquivo);
				xstream.addPermission(AnyTypePermission.ANY);
				return (OrdemServicoDAO) xstream.fromXML(fis);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new OrdemServicoDAO();
	}

	

}
