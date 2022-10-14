package abstractFactory;

public class Iphone implements  Telephone{
 private String modelName;
private String battery;
private String colour;

  public Iphone(String modelName, String battery, String colour, int sizeTelephone) {
    this.modelName = modelName;
    this.battery = battery;
    this.colour = colour;
    this.sizeTelephone = sizeTelephone;
  }

  private int sizeTelephone;
  @Override
  public String modelName() {
    return modelName;
  }

  @Override
  public String battery() {
    return battery;
  }

  @Override
  public String colour() {
    return colour;
  }

  @Override
  public int sizeTelephone() {
    return sizeTelephone;
  }

  @Override
  public String toString() {
    return "Iphone{" +
        "modelName='" + modelName + '\'' +
        ", battery='" + battery + '\'' +
        ", colour='" + colour + '\'' +
        ", sizeTelephone=" + sizeTelephone +
        '}';
  }
}
