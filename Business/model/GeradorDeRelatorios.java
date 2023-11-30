package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeradorDeRelatorios {
	
	public static void gerarPdf() throws FileNotFoundException, DocumentException {

		Document doc = new Document(PageSize.A4);
		OutputStream os = new FileOutputStream("Relatório.pdf");
		PdfWriter.getInstance(doc, os);
		
		doc.open();
		Paragraph pg = new Paragraph("Adicionei um parágrafo");
		doc.add(pg);
		doc.close();
		
	}	
}
