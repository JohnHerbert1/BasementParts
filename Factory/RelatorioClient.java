import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import dto.BoletoDTO;

public class RelatorioClient extends Relatorio<BoletoDTO> {

	public RelatorioClient() {
	}

	@Override
	public void gerarRelatorio(BoletoDTO object) {
		Document document = new Document(PageSize.A4);
		
		
		try {
			FileOutputStream outPutPDF = new FileOutputStream(ValueStatic.RELATORIO_CLIENT);
			PdfWriter.getInstance(document, outPutPDF);
			
			document.open();
			
			
			
			
		}catch(FileNotFoundException | DocumentException  e) {
			e.printStackTrace();
		}
		
		
	}

}
