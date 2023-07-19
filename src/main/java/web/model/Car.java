package web.model;

public class Car {

    private String colour;
    private String model;
    private int series;

    public Car(String colour, String model, int series) {
        this.colour = colour;
        this.model = model;
        this.series = series;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

}
