package abstractFactory;

public class SamsungFactory implements TelephoneFactory{
  @Override
  public Telephone getTelephone(String modelName, String battery, String colour, int sizeTelephone) {
    return new Samsung(modelName,battery,colour,sizeTelephone);
  }
}
