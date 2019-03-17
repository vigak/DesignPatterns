public class Contrast implements ICommand {

    private Image image;
    private boolean currentState;

    public Contrast(Image image){
        this.image = image;
    }


    @Override
    public Contrast execute() {
        System.out.println("Executing the Contrast command...");
        image.actionOn();
        currentState = true;
        return this;
    }

    @Override
    public Contrast unexecute() {
        System.out.println("Reversing the Contrast command...");
        image.actionUndo();
        currentState = false;
        return this;
    }
}
