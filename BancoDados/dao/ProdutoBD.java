package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class ProdutoBD implements ConnectionXML{
	
	
	private  XStream xstream = new XStream(new DomDriver("ISO-8859-1"));
	private   File arquivo = new File("!Party-Helpy.xml ");

	

	@Override
	public ProdutoDAO recuperar() {
		
		try {

			if (arquivo.exists()) {
				FileInputStream fis = new FileInputStream(arquivo);
				xstream.addPermission(AnyTypePermission.ANY);
				return (ProdutoDAO) xstream.fromXML(fis);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new ProdutoDAO();
	}



	@Override
	public void salvar(Object element) {
		ProdutoDAO produtoDAO = (ProdutoDAO) element;
		

		String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n";
		xml += xstream.toXML(produtoDAO);

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
	





}
