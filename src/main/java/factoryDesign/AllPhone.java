package factoryDesign;

public class AllPhone {
  public static Phone getPhone(String modelName,String batery,String colour,int size){
      Phone phone;
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
