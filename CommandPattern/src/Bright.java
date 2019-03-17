public class Bright implements ICommand {

    private Image image;
    private boolean currentState;

    public Bright(Image image){
        this.image = image;
    }

    @Override
    public Bright execute() {
        System.out.println("Executing the Bright command...");
        image.actionOn();
        currentState = true;
        return this;
    }

    @Override
    public Bright unexecute() {
        System.out.println("Reversing the Bright command...");
        image.actionUndo();
        currentState = false;
        return this;
    }
}
