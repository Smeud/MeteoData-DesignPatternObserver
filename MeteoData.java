import java.util.ArrayList;

public class MeteoData implements Subject {
  private float temperature;
  private float humidity;
  private float pressure;
  private ArrayList observers;

  public MeteoData(){
    observers = new ArrayList();
  }
  public void addObserver(Observer obs){
    observers.add(obs);
  }
  public void deleteObserver(Observer obs){
    int i = observers.indexOf(obs);
    if(i>=0){
      observers.remove(i);
    }
  }
  public void notifyObservers(){
    for (int i=0;i<observers.size();i++){
      Observer o = (Observer)observers.get(i);
      o.update(temperature, humidity, pressure);
    }
  }
  public void setMesures(float t, float h, float p){
    this.temperature = t;
    this.humidity = h;
    this.pressure = p;
    updateMesures();
  }
  public void updateMesures(){
    notifyObservers();
  }
}