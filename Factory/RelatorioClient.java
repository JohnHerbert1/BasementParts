import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import dto.BoletoDTO;
import fabricas.Fabrica;

public class RelatorioClient extends Relatorio<BoletoDTO> {

	public RelatorioClient() {
	}

	@Override
	public void gerarRelatorio(BoletoDTO object) {
		Document doc = new Document(PageSize.A4);
		
		
		try {
			FileOutputStream outPutPDF = new FileOutputStream(ValueStatic.RELATORIO_CLIENT);
			PdfWriter.getInstance(doc, outPutPDF);
			Paragraph linhaEmBranco = new Paragraph("                                     ");
			
			String imgSrc = "Business/Imagens/iconBasementParts.png";
			Image image = Image.getInstance(imgSrc);
			image.setAlignment(Element.ALIGN_MIDDLE);
			doc.add(image);
			
			
			Paragraph linhaEmBranco2 = new Paragraph("                                     ");
			PdfWriter.getInstance(doc, new FileOutputStream("relatorio.pdf"));
			doc.open();

			
			Paragraph nome = new Paragraph("Relatorio Compra");
			nome.setAlignment(Element.ALIGN_LEFT);

			Paragraph agencia = new Paragraph("Boleto");
			agencia.setAlignment(Element.ALIGN_RIGHT);

			LocalDate dataAtual = LocalDate.now();
			Paragraph textoData = new Paragraph("Data da Emicao do Relatorio");
			Paragraph data = new Paragraph(
					dataAtual.getDayOfMonth() + "/" + dataAtual.getMonthValue() + "/" + dataAtual.getYear());

			Paragraph EmailFuncionario = null;

			Paragraph preco = null;

			Paragraph id = null;

			Paragraph produto = null;
			
			Paragraph efetuamentoCompra= null;
			
			Paragraph dataDePagamento = null;
			
			Paragraph servico =null;
			
			Paragraph referenciEmail = new Paragraph("Email do funcionario:");
			EmailFuncionario = new Paragraph(object.getFuncionario().getEmail());
			
			Paragraph valor = new Paragraph("Preco:");
			preco = new Paragraph(object.getPrice() + "");
			
			
			Paragraph identificador = new Paragraph("id:");
			id = new Paragraph(object.getId() + "");
			
			if(object.getProduto() != null) {
			Paragraph referenciProduto = new Paragraph("Preco:");
			produto = new Paragraph(object.getProduto().getNomeDoProduto() + "");
			doc.add(referenciProduto);
			doc.add(produto);
			}
			
			Paragraph dataEfetuamento = new Paragraph("Data da Compra:");
			efetuamentoCompra = new Paragraph(object.getEfetuamentoDaCompra() + "");
			
			
			Paragraph referenciaPagamento = new Paragraph("Data de Pagamento:");
			dataDePagamento = new Paragraph(object.getDataDePamento() + "");
			
			if(object.getServico() != null) {
			Paragraph referenciaServico = new Paragraph("Servico:");
			servico = new Paragraph(object.getServico() + "");
			doc.add(referenciaServico);
			doc.add(servico);
			}
			
			
			doc.add(referenciEmail);
			doc.add(EmailFuncionario);
			doc.add(valor);
			doc.add(preco);
			doc.add(identificador);
			doc.add(id);
			doc.add(dataEfetuamento);
			doc.add(efetuamentoCompra);
			doc.add(referenciaPagamento);
			doc.add(dataDePagamento);
			
			doc.open();
			
			
			
			
		}catch(FileNotFoundException | DocumentException  e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
