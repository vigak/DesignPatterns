import java.util.LinkedList;

public interface IApplication {

    boolean addToQueue(ICommand actionOnImage);
    boolean undoTheCommands(LinkedList<ICommand> commandQueue);
}
