package abstractFactory;

public class IphoneFactory implements TelephoneFactory{
  @Override
  public Telephone getTelephone(String modelName, String battery, String colour, int sizeTelephone) {
    return new Iphone(modelName,battery,colour,sizeTelephone);
  }
}
