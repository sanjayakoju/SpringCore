package model;

public class Bike implements Vehicle {

    private String model;
    private double price;

    public Bike() {
    }


    public Bike(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void move() {
        System.out.println("Moving at 10 mph");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
