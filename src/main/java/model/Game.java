package model;

public class Game {

    private Vehicle vehicle;

    public Game() {
    }


    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void init() {
        System.out.println("Init Method called");
    }

    public void destroy() {
        System.out.println("XML - Bean Destroy");
    }

    public void play() {
        vehicle.move();
    }

    @Override
    public String toString() {
        return "Game{" +
                "vehicle=" + vehicle +
                '}';
    }
}
