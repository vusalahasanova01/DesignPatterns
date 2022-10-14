package singleton;

public class Singleton {
  private static Singleton singleton;
  private static int number = 0;

  private Singleton() {
    System.out.println("Singleton");
  }

  public static Singleton getSingleton() {
    if (singleton == null) {
      synchronized (Singleton.class) {
        if (singleton == null) {
          singleton = new Singleton();
        }
      }
    }
    number++;
    System.out.println(number);
    return singleton;
  }

}
