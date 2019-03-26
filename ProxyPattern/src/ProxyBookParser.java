public class ProxyBookParser implements  IBookParser{

    private String bookName;
    private RealBookParser realBookParser;

    public ProxyBookParser(String bookName){
        // No expensive operation is involved here
        this.bookName = bookName;
    }


    @Override
    public int getNumberOfPages() {
        if (realBookParser == null) // Create the proxy object when there is absolute need
            this.realBookParser = new RealBookParser(this.bookName);

        return realBookParser.getNumberOfPages();
    }

    @Override
    public int getNumberOfChapters() {
        if (realBookParser == null)
            this.realBookParser = new RealBookParser(this.bookName);

        return realBookParser.getNumberOfChapters();
    }
}
