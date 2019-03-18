public class FacadeMain {

    public static void main(String[] args){
        Product product = new Product("Toy", "gt456V");

        FacadeImpl facade = new FacadeImpl(product);
        facade.placeOrder(); // If place order has to be called in different places in the code, then this method can be used

    }
}
