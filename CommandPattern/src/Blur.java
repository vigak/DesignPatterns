public class Blur implements ICommand{

    private Image image;
    private boolean currentState;

    public Blur(Image image){
        this.image = image;
    }


    @Override
    public Blur execute() {
        System.out.println("Executing the Blur command...");
        image.actionOn();
        currentState = true;
        return this;
    }

    @Override
    public Blur unexecute() {
        System.out.println("Reversing the Blur command...");
        image.actionUndo();
        currentState = false;
        return this;
    }
}
