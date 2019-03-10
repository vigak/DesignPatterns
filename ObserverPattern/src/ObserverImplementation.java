public class ObserverImplementation {

    public static void main(String[] args){

        WeatherStation weatherStation = new WeatherStation();

        // Display has a connection to the concrete observer class so that it can access the getTemperature() method which returns the
        // current temperature whenever notifyObserver() is being called (which in turn invokes the update() method in observer)
        PhoneDisplay OLEDPhoneDisplay = new PhoneDisplay(1, weatherStation);
        PhoneDisplay FlipPhoneDisplay = new PhoneDisplay(2 ,weatherStation);
        LaptopDisplay LEDLaptopDisplay = new LaptopDisplay(1, weatherStation);
        LaptopDisplay LCDLaptopDisplay = new LaptopDisplay(2, weatherStation);

        weatherStation.addObserver(OLEDPhoneDisplay);
        weatherStation.addObserver(FlipPhoneDisplay);
        weatherStation.addObserver(LEDLaptopDisplay);
        weatherStation.addObserver(LCDLaptopDisplay);

        weatherStation.setCurrentTemperature(34);
        weatherStation.notifyObserver();

        weatherStation.removeObserver(FlipPhoneDisplay);

        weatherStation.setCurrentTemperature(23);
        weatherStation.notifyObserver();

    }
}
