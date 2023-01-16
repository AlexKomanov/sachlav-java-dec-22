package lesson_08.computer;

public class GraphicCard {

    // Fields
    private long frequency;
    private String brand;

    // Constructor
    public GraphicCard(long frequency, String brand) {
        this.frequency = frequency;
        this.brand = brand;
    }

    // Getters and Setters


    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Custom functions

    @Override
    public String toString() {
        return "GraphicCard{" +
                "frequency=" + frequency +
                ", brand='" + brand + '\'' +
                '}';
    }
}
