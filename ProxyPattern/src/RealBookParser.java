public class RealBookParser implements IBookParser {

    private String bookName;

    public RealBookParser(String bookName){
        // Assume that this is a expensive operation
        this.bookName = bookName;
    }


    @Override
    public int getNumberOfPages() {
        return 50;
    }

    @Override
    public int getNumberOfChapters() {
        return 5;
    }
}
