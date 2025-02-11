package drivers;

import exceptions.DriverDontHaveLicenseException;
import transport.Transport;

public abstract class Driver<T extends Transport> {
    private String name;
    private int experience;
    private T transport;

    public Driver(String name, int experience) {
        setName(name);
        try {
            setExperience(experience);
        } catch (DriverDontHaveLicenseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", transport=" + transport.getBrand() + " " + transport.getModel() +
                '}';
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

    public void setExperience(int experience) throws DriverDontHaveLicenseException {
        if (experience >= 0){
            this.experience = experience;
        } else {
            throw new DriverDontHaveLicenseException("Стаж не может быть отрицательным.");
        }
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