package factoryDesign;

public class TelephoneSeller {
  public static void main(String[] args) {
    Phone iphone = AllPhone.getPhone("Iphone","3000","Black",8);
    Phone samsung =  AllPhone.getPhone("Samsung","4000","White",8);
    System.out.println("iphone features");
    System.out.println(iphone);
    System.out.println("\nSamsung features");
    System.out.println(samsung);

  }
}
