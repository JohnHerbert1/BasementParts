import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;

import organazi.ValueStatic;

public class RelatorioFinancas extends Relatorio<RelatorioFinancas>{

	public RelatorioFinancas() {
	}

	@Override
	public void gerarRelatorio(RelatorioFinancas element){
		
		
		Document document = new Document(PageSize.A4);
		
		FileOutputStream outPutPDF = null;
		
		try {
		outPutPDF = new FileOutputStream(ValueStatic.RELATORIO_FINANCAS);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
			
	}
	
	
	

}
