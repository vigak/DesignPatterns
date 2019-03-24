public class ShortView extends View {

    private IResource iResource;

    public ShortView(IResource iResource) {
        super(iResource);
        this.iResource = iResource;
    }

    @Override
    String Show() {
        return iResource.title() + iResource.snippet() + iResource.image();
    }
}
