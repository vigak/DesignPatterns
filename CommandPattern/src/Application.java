import java.util.LinkedList;

public class Application implements  IApplication{

    private ICommand BrightOn;
    private ICommand ContrastOn;
    private ICommand BlurOn;
    private LinkedList<ICommand> commandQueue;

    public Application(ICommand BrightOn, ICommand ContrastOn, ICommand BlurOn, LinkedList<ICommand> commandQueue){
        this.BrightOn = BrightOn;
        this.ContrastOn = ContrastOn;
        this.BlurOn = BlurOn;
        this.commandQueue = commandQueue;
    }


    @Override
    public boolean addToQueue(ICommand actionOnImage) {
        commandQueue.push(actionOnImage);
        return true;
    }

    @Override
    public boolean undoTheCommands(LinkedList<ICommand> commandQueue) {

        commandQueue.stream().forEach(e -> e.unexecute());
        return true;

    }
}
