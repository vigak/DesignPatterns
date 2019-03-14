public class Singleton {

    private static volatile Singleton instance; // volatile for visibility between threads
    private static final Object lock = new Object(); // Never use String literals for locks since they might be changed over time

    private Singleton() {
        // Making it private restricts the other classes from calling the constructor directly
        // to create an instance of Singleton,
        // thus preventing this to be a singleton class
        System.out.println("Instance of Singleton!"); // Check how many times this is printed
    }

    public static Singleton getInstance(){ //Double check singleton creation
        Singleton resultInstance = instance;
        if (resultInstance == null){ // first check
            synchronized (lock){
                resultInstance = instance;
                if (resultInstance == null) // double check -- increases efficiency of creating Singleton objects by 25%
                    instance = resultInstance = new Singleton();
            }
        }
        return resultInstance;
    }
}
