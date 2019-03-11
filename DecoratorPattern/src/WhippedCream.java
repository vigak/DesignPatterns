public class WhippedCream extends AddOns {

    Beverage beverage;

    WhippedCream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription()+", Whipped Cream";
    }

    @Override
    int getCost() {
        return this.beverage.getCost() + 1;
    }
}
