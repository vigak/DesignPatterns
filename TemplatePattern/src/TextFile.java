public class TextFile extends AbstractSaveTemplate {

    private String textFileLocation;

    TextFile(String textFileLocation){
        this.textFileLocation = textFileLocation;
    }


    @Override
    boolean validate() {
        if (!textFileLocation.isEmpty()) return true;
        return false;
    }

    @Override
    boolean save() {
        if (this.validate()) {
            System.out.println("Text File is saved successfully");
            return true;
        }
        return false;
    }
}
