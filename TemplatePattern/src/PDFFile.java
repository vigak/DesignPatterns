public class PDFFile extends AbstractSaveTemplate {

    private String PDFFileLocation;

    PDFFile(String PDFFileLocation){
        this.PDFFileLocation = PDFFileLocation;
    }


    @Override
    boolean validate() {
        if (!PDFFileLocation.isEmpty()) return true;
        return false;
    }

    @Override
    boolean save() {
        if (this.validate()) {
            System.out.println("PDF File is saved successfully");
            return true;
        }
        return false;
    }
}
