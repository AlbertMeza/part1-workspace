public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("LG", 12);

    Television tv3 = new Television("Sony");

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    tv1.turnOn();
    tv1.turnOff();
    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv1);
    System.out.println(tv2);
    System.out.println(tv3);
  }
}
