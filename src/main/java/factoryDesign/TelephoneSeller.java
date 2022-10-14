package factoryDesign;

public class TelephoneSeller {
  public static void main(String[] args) {
    Telephone iphone = TelephoneFactory.getPhone("Iphone","3000","Black",8);
    Telephone samsung =  TelephoneFactory.getPhone("Samsung","4000","White",8);
    System.out.println("iphone features");
    System.out.println(iphone);
    System.out.println("\nSamsung features");
    System.out.println(samsung);

  }
}
