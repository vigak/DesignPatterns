public class DuckImplementation {


    public static void main(String[] args){
        IFlyBehaviour flyBehaviour = new SimpleFlyBehaviour();
        IQuackBehaviour quackBehaviour = new ComplexQuackBehaviour();
        DuckBehaviourModule duckBehaviourModule = new DuckBehaviourModule(flyBehaviour, quackBehaviour);
        System.out.println(duckBehaviourModule.toString());
    }
}
