public interface ICommand {

    ICommand execute(); // these are void because this just an action and does not expect anything in return
    ICommand unexecute(); // same here
}
