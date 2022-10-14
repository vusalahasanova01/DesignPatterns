package abstractFactory;

public class TelephoneSeller {
  public static void main(String[] args) {
    IphoneFactory iphoneFactory = new IphoneFactory();
    Telephone iphone = iphoneFactory.getTelephone("14 pro", "200", "grey", 7);
    SamsungFactory samsungFactory = new SamsungFactory();
    Telephone samsung = samsungFactory.getTelephone("A51", "3500", "white", 8);
    System.out.println(iphone);
    System.out.println("-----------------------------------------");
    System.out.println(samsung);

  }
}
