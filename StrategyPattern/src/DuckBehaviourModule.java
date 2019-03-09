public class DuckBehaviourModule{

    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;

    public DuckBehaviourModule(IFlyBehaviour iFlyBehaviour, IQuackBehaviour iQuackBehaviour){
        this.iFlyBehaviour = iFlyBehaviour;
        this.iQuackBehaviour = iQuackBehaviour;
    }

    @Override
    public String toString(){
        return "This duck has a "+this.iFlyBehaviour.fly()+" and a "+this.iQuackBehaviour.quack();
    }

}
