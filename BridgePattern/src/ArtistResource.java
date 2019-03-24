public class ArtistResource implements IResource {


    @Override
    public String snippet() {
        return "This is a sample snippet!";
    }

    @Override
    public String title() {
        return "This is a sample title!";
    }

    @Override
    public String image() {
        return "This is a sample image!";
    }
}
