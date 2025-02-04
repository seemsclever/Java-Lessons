package drivers;

import transport.Truck;

public class DriverCCategory extends Driver<Truck>{

    public DriverCCategory(String name, int experience) {
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
