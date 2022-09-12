public class TelevisionMuteTest {

  public static void main(String[] args) {
    Television tv = new Television("Samsung", 32);

    tv.mute(); //mute the tv
    System.out.println(tv);

    tv.mute(); //unmute the tv
    System.out.println(tv);

    tv.mute(); //mute it again
    System.out.println(tv);

    tv.setVolume(50); //sets volume to 50 and unmutes it
    System.out.println(tv);
  }


}
