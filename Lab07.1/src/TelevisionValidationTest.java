public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television testTV = new Television();
    testTV.setVolume(25);
    testTV.setVolume(-10);
    testTV.setVolume(101);

    System.out.println(testTV);

    testTV.setBrand("LG");
    testTV.setBrand("Visio");
    System.out.println(testTV);
  }

}
