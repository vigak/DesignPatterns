public class MakeBeverage {

    public static void main(String[] args){

        // Create a concrete subclass of base class Beverage
        Beverage Coffee = new Coffee();

        // Notice that the decorators can work only when the concrete subclass of the base class is available
        // The Addons exhibits a "is-a" relationship as well as a "has-a" relationship with the beverage base class

        AddOns whippedCream = new WhippedCream(Coffee);
        AddOns cinnamonTopping = new CinnamonTopping(whippedCream);

        // Print to check if this works
        System.out.println(cinnamonTopping.toString());
    }
}
