package bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import dao.AdmDAO;

public class AdmTabela implements CreatConnectionBD{
	
	public AdmTabela() {
	}
	
	
	private  XStream xstream = new XStream(new DomDriver());
	private   File arquivo = new File("Administrador.xml");
	
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

	public AdmDAO recuperar() {

		try {

			if (arquivo.exists()) {
				FileInputStream fis = new FileInputStream(arquivo);
				xstream.addPermission(AnyTypePermission.ANY);
				return (AdmDAO) xstream.fromXML(fis);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new AdmDAO();
	}
	

}
