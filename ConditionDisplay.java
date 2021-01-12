public class ConditionDisplay implements Observer, Display {
  private float temperature;
  private float humidity;
  private Subject meteoData; 

  public ConditionDisplay(Subject md){
    this.meteoData = md;
    meteoData.addObserver(this);
  }
  public void display() {
    System.out.println("Conditions actuelles:"+temperature+" degres et "+humidity+" % d'humidite");
  }
  public void update(float t, float h, float p) {
    this.temperature = t;
    this.humidity = h;
    display();
  }
}