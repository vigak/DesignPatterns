public abstract class View {

    private IResource iResource;

    public View(IResource iResource){
        this.iResource = iResource;
    }

    abstract String Show();
}
