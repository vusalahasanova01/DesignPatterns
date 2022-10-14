package abstractFactory;

public interface TelephoneFactory {
  Telephone getTelephone(String modelName,String battery, String colour, int sizeTelephone);
}
