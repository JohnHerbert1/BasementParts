package bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import dao.ProdutoDAO;

public class ProdutoTabela implements CreatConnectionBD {

	private  XStream xstream = new XStream(new DomDriver());
	private   File arquivo = new File("Produto.xml ");
	
	
	

	@Override
	public ProdutoDAO recuperar() {
		
		try {

			if (this.arquivo.exists()) {
				FileInputStream fis = new FileInputStream(this.arquivo);
				this.xstream.addPermission(AnyTypePermission.ANY);
				return (ProdutoDAO) xstream.fromXML(fis);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new ProdutoDAO();
	}



	@Override
	public void creatConnection(Object element) {
		

		String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n";
		xml += xstream.toXML(element);

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
