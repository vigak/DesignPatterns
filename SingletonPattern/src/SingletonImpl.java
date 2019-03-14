public class SingletonImpl {

    public static void main(String[] args){
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        System.out.println("Memory of the first instance :: "+firstInstance);
        System.out.println("Memory of the second instance :: "+secondInstance);
    }
}
