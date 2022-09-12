public class Television {

  public static final int MIN_VALUE = 0;
  public static final int MAX_VALUE = 100;

  public static final String MUTED = "<muted>";
  private int muteVolume;

  private boolean isMuted;

  private static int instanceCount = 0;
  private String brand;
  private static int volume;

  private DisplayType display = DisplayType.LED;

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

  public Television(String brand, int volume, DisplayType display){
    this(brand,volume);
    setDisplay(display);
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
    switch(brand){
      case "Samsung":
      case "LG":
      case "Toshiba":
        this.brand = brand;
        break;
      default:
        System.out.printf("%s is invalid;%n", brand);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if(isMuted) {
      this.volume = volume;
      isMuted = false;
    }
    else {
      if (volume < MAX_VALUE && volume >= MIN_VALUE) this.volume = volume;
      else System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume,
            MIN_VALUE, MAX_VALUE);
    }
    }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  public void mute(){
   if(!isMuted()){
     this.muteVolume = getVolume();
     this.setVolume(0);
     this.isMuted = true;
   }
   else {
     this.setVolume(muteVolume);
     this.isMuted = false;
   }
  }

  public boolean isMuted()
  {
    return this.isMuted;
  }

  private boolean verifyInternetConnection(){
    return true;
  }

  public String toString(){
    String s = "Television: brand=" + getBrand() + ", volume=";

    if (isMuted()) s += MUTED;
    else s += getVolume();

    s += ", display=" + getDisplay();

    return s;
  } //read about ternary approach after and that would've been cleaner

}
