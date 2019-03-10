import java.util.ArrayList;

public class WeatherStation implements IObservable {

    private ArrayList<IObserver> subscribedDevices = new ArrayList<>();
    private int currentTemperature;


    @Override
    public void addObserver(IObserver iObserver) {
        this.subscribedDevices.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        this.subscribedDevices.remove(iObserver);
    }

    @Override
    public void notifyObserver() {
        this.subscribedDevices.stream().forEach(e -> e.update());
    }


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
