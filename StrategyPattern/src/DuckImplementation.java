public class DuckImplementation {


    public static void main(String[] args){

        // Create instances for constructor injection
        IFlyBehaviour simpleFlyBehaviour = new SimpleFlyBehaviour(); // Horizontal sharing of code which is not possible with inheritance
        IQuackBehaviour simpleQuackBehaviour = new SimpleQuackBehaviour();
        IQuackBehaviour complexQuackBehaviour = new ComplexQuackBehaviour();

        // Create instances of the classes with different behaviours
        DuckBehaviourModule simpleDuckBehaviour = new DuckBehaviourModule(simpleFlyBehaviour, simpleQuackBehaviour);
        DuckBehaviourModule complexDuckBehaviour = new DuckBehaviourModule(simpleFlyBehaviour, complexQuackBehaviour);

        // Print them to check if they are working fine
        System.out.println(simpleDuckBehaviour.toString());
        System.out.println("Prediction :: \n");
        simpleDuckBehaviour.duckPrediction();

        System.out.println("-------------------------------- \n");

        System.out.println(complexDuckBehaviour.toString());
        System.out.println("Prediction :: \n");
        complexDuckBehaviour.duckPrediction();


    }
}
