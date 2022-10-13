package singleton;

public class Singleton {
  private static Singleton singleton;
  private Singleton() {
    System.out.println("Singleton");
  }

  public static Singleton getSingleton() {
    return singleton;
  }

}
