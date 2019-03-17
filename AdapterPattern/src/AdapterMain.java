public class AdapterMain {

    public static void main(String[] args){
        Adaptee adaptee = new Adaptee(); // Create an object of the target adaptee
        ITarget target = new Adapter(adaptee); // Pass the adaptee dependency to the adapter
        target.request(); // Invoke the target method in the adaptee from the adapter
    }
}
