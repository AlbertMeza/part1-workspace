public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.PLASMA);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());
    System.out.println();

    Television tv2 = new Television("LG", 12);

    Television tv3 = new Television("Sony");

    Television tv4 = new Television("Toshiba", 20, DisplayType.OLED);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());
    System.out.println();

    tv1.turnOn();
    tv1.turnOff();
    System.out.println();
    tv2.turnOn();
    tv2.turnOff();

    System.out.println();
    System.out.println(tv1);
    System.out.println(tv2);
    System.out.println(tv3);
    System.out.println(tv4);
  }
}
