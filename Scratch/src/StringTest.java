public class StringTest {

  public static void main(String[] args) {
    String greeting = "Hello";
    String name = "Albert";
    String sentence = "The quick brown fox jumps over the lazy dog";

    String upper = greeting.toUpperCase();

    System.out.println(greeting);
    System.out.println(name);
    System.out.println(sentence);
    System.out.println(upper);

    String salutations = "Hello";

    System.out.println(salutations == greeting);
    System.out.println(salutations.equals(greeting));
    System.out.println(salutations.equals(upper));
    System.out.println(salutations.equalsIgnoreCase(upper));
  }
}
