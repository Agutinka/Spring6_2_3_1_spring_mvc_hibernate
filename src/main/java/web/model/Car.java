package web.model;

public class Car {
    private int number;
    private String model;
    private String colour;

    public Car(int number, String model, String colour) {
        this.number = number;
        this.model = model;
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
