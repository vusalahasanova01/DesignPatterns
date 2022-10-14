package factoryDesign;

public class TelephoneFactory {
  public static Telephone getPhone(String modelName, String batery, String colour, int size){
      Telephone phone;
      if(("Iphone").equalsIgnoreCase(modelName)){
        phone =new Iphone (modelName,batery,colour,size);
      }
      else if(("Samsung").equalsIgnoreCase(modelName)){
        phone =new Samsung( modelName,batery,colour,size);
      }
      else {
        throw new RuntimeException("There is no telephone model");
      }
      return phone;
  }
}
