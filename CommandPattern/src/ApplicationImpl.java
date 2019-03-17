import java.util.LinkedList;

public class ApplicationImpl {

    public static void main(String[] args){
        Image image = new Image(); // Receiver on which the actions are to be performed
        LinkedList<ICommand> commandQueue = new LinkedList<>(); // List of commands passed on the receiver

        // Actions loaded with the receiver to perform actions on
        Bright bright = new Bright(image);
        Blur blur = new Blur(image);
        Contrast contrast = new Contrast(image);

        // Initialize application with dependencies
        Application photoshop = new Application(bright, blur, contrast, commandQueue);

        // Perform different actions on the image , you'd only be interacting with the interface and not with the receiver directly
        // this gives you an advantage to add more actions to the interface if needed, flexibility is guaranteed here
        // Encapsulation of the commands in the receiver
        photoshop.addToQueue(bright.execute());
        photoshop.addToQueue(blur.execute());
        photoshop.addToQueue(contrast.execute());

        // Undo the list of commands executed
        photoshop.undoTheCommands(commandQueue);

        System.out.println("End of commands");
    }
}
