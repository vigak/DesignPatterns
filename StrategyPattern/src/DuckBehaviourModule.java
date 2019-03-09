public class DuckBehaviourModule{

    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;

    public DuckBehaviourModule(IFlyBehaviour iFlyBehaviour, IQuackBehaviour iQuackBehaviour){
        this.iFlyBehaviour = iFlyBehaviour;
        this.iQuackBehaviour = iQuackBehaviour;
    }

    void duckPrediction(){
        if (this.iFlyBehaviour.fly().contains("Complex") || this.iQuackBehaviour.quack().contains("Complex")) // Simple handling of different objects
            System.out.println("This should be a wild duck. \n");
        else
            System.out.println("This should be a city duck. \n");
    }

    @Override
    public String toString(){
        return "This duck has a "+this.iFlyBehaviour.fly()+" and a "+this.iQuackBehaviour.quack()+"\n";
    }

}
