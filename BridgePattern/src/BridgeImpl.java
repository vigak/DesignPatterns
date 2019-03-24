public class BridgeImpl {

    public static void main(String[] args){

        ArtistResource artistResource = new ArtistResource();

        LongView longArtistView = new LongView(artistResource);
        ShortView shortArtistView = new ShortView(artistResource);


        System.out.println(longArtistView.Show());
        System.out.println(shortArtistView.Show());

    }
}
