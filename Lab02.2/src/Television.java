public class Television {

  public static final int MIN_VALUE = 0;
  public static final int MAX_VALUE = 100;

  private static int instanceCount = 0;
  private String brand;
  private static int volume;

  public Television(){
    instanceCount++;
  }

  public Television(String brand){
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume){
    this(brand);
    setVolume(volume);
  }

  public void turnOn(){
    boolean isConnected = verifyInternetConnection();
    System.out.println("Let's watch television on our " + this.brand + " with the volume of " + this.volume);
  }

  public void turnOff(){
    System.out.println("That's enough television on our " + this.brand + " for today");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MAX_VALUE && volume > MIN_VALUE) this.volume = volume;
    else System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VALUE, MAX_VALUE);
  }

  private boolean verifyInternetConnection(){
    return true;
  }
  public String toString(){
    return "Television: brand=" + getBrand() + ", volume=" + getVolume();
  }

}
