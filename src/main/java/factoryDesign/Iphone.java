package factoryDesign;

public class Iphone implements Telephone {
  private String modelName;
  private String batery;
  private String colour;
  private int size;

  public Iphone(String modelName, String batery, String colour, int size) {
    this.modelName = modelName;
    this.batery = batery;
    this.colour = colour;
    this.size = size;
  }

  @Override
  public String modelName() {
    return modelName;
  }

  @Override
  public String batery() {
    return batery;
  }

  @Override
  public String colour() {
    return colour;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "Iphone{" +
        "modelName='" + modelName + '\'' +
        ", Batery='" + batery + '\'' +
        ", colour='" + colour + '\'' +
        ", size=" + size +
        '}';
  }
}
