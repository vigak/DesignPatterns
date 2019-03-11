public class CinnamonTopping extends AddOns {

    Beverage beverage;

    CinnamonTopping(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription()+", Cinnamon Topping";
    }

    @Override
    int getCost() {
        return this.beverage.getCost() + 2;
    }
}
