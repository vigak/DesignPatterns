public class PhoneDisplay implements IObserver {

    private WeatherStation weatherStation;
    private int deviceID;

    public PhoneDisplay(int deviceID , WeatherStation weatherStation){
        this.deviceID = deviceID;
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println ("The temperature on PhoneDisplay Device :: " +this.deviceID+" is "+this.weatherStation.getCurrentTemperature());
    }
}
