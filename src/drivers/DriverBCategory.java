package drivers;

import transport.Car;

public class DriverBCategory extends Driver<Car>{

    public DriverBCategory(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void startMoving() {
        if(getTransport() == null){
            System.out.println("Водитель " + getName() + " не имеет закрепленного автомобиля.");
        }
        else{
            System.out.println("Водитель " + getName() + " управляет автомобилем " + getTransport().getBrand() + " " + getTransport().getModel() + " и будет участвовать в заезде.");
        }
    }
}
