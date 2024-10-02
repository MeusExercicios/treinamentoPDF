package pdfTreino;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfService {
    public void gerarPdf(Pessoa pessoa) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\jv-v-\\Videos\\PessoaInfo.pdf"));
            document.open();

            document.add(new Paragraph("Informações da Pessoa"));
            document.add(new Paragraph(""));

            document.add(new Paragraph("Nome: " + pessoa.getName()));
            document.add(new Paragraph("telefone: " + pessoa.getNumber()));

            document.close();

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
