public class LongView extends View {

    private IResource iResource;

    public LongView(IResource iResource){
        super(iResource);
        this.iResource = iResource;
    }

    @Override
    public String Show(){
        return iResource.title()+iResource.snippet()+iResource.image();
    }
}
