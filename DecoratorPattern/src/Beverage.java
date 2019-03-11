public abstract class Beverage {

    @Override
    public String toString(){
        return "This contains "+this.getDescription()+" and costs $ "+this.getCost();
    }

    abstract String getDescription();
    abstract int getCost();
}
