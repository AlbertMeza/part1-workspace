public class Television {
  private String brand;
  private int volume;

  public void turnOn(){
    boolean isConnected = verifyInternetConnection();
    System.out.println("Let's watch television on our " + this.brand + " with the volume of " + this.volume);
  }

  public void turnOff(){
    System.out.println("That's enough television on our " + this.brand + " for today");
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
    this.volume = volume;
  }

  private boolean verifyInternetConnection(){
    return true;
  }
  public String toString(){
    return "Television: brand=" + getBrand() + ", volume=" + getVolume();
  }

}
