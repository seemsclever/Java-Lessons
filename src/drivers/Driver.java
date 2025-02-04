package drivers;

import transport.Car;
import transport.Transport;

public abstract class Driver<T extends Transport> {
    private String name;
    private int experience;
    private T transport;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public abstract void startMoving();

    public void stopMoving(){
        System.out.println("Движение остановлено");
    }

    public void refill() {
        System.out.println("Автомобиль заправлен до 100%");
    }
}