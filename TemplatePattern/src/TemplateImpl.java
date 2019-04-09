public class TemplateImpl {

    public static void main(String[] args){

        PDFFile pdfFile = new PDFFile("pdfFileLoc");

        pdfFile.saveFile();

        TextFile textFile = new TextFile("textFileLoc");

        textFile.saveFile();
    }
}
