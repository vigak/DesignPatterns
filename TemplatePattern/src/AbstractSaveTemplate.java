abstract class AbstractSaveTemplate {

    void saveFile(){
        this.validate();
        this.save();
    }

    abstract boolean validate();

    abstract boolean save();

}
