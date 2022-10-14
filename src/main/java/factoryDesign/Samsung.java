package factoryDesign;

public class Samsung implements Telephone {
  private String modelName;
  private String batery;
  private String colour;
  private int size;

  public Samsung(String modelName, String batery, String colour, int size) {
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
    return "Samsung{" +
        "modelName='" + modelName + '\'' +
        ", Batery='" + batery + '\'' +
        ", colour='" + colour + '\'' +
        ", size=" + size +
        '}';
  }
}
