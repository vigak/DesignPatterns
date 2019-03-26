public class ProxyPatternImpl {

    public static void main(String[] args){
        String bookName = "Head First Design Patterns";
        ProxyBookParser bookParser = new ProxyBookParser(bookName);
        System.out.println(bookParser.getNumberOfPages()); // The object that is created at this point is mostly cached since the creation operation is expensive
        System.out.println(bookParser.getNumberOfChapters());
    }
}
