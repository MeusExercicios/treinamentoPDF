package pdfTreino;

import javax.swing.*;

public class App
{
    public static void main( String[] args )
    {
        String name = JOptionPane.showInputDialog(null,"Qual o seu nome ?");
        String cellphone = JOptionPane.showInputDialog(null,"Qual o seu número de telefone ");

        Pessoa pessoa = new Pessoa(name,cellphone);

        PdfService pdfService = new PdfService();
        pdfService.gerarPdf(pessoa);

        JOptionPane.showMessageDialog(null,"PDF gerado!");

    }
}
