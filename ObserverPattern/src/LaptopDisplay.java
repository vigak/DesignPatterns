public class LaptopDisplay implements IObserver {

    private WeatherStation weatherStation;
    private int deviceID;

    public LaptopDisplay(int deviceID, WeatherStation weatherStation){
        this.deviceID = deviceID;
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(){
        System.out.println ("The temperature on LaptopDisplay Device :: " +this.deviceID+" is "+this.weatherStation.getCurrentTemperature());
    }
}
