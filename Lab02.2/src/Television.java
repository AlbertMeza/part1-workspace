public class Television {
  private String brand;
  private int volume;

  void turnOn(){
    System.out.println("Let's watch television on our " + this.brand + " with the volume of " + this.volume);
  }

  void turnOff(){
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

  public String toString(){
    return "Television: brand=" + getBrand() + ", volume=" + getVolume();
  }

}
