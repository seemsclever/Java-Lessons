package transport;

public class Truck extends Transport implements Competing {
    private float bestCircleTime;
    private int maxSpeed;

    public Truck(Brand brand, String model, float engineDisplacement){
        super(brand, model);
        this.engineDisplacement = engineDisplacement;
    }
    public Truck(Brand brand, String model, int yearOfProduction, String countryOfAssembly, String color, int maxSpeed) {
        super(brand, model, yearOfProduction, countryOfAssembly, color, maxSpeed);
    }

    public String toString(){
        return "Марка - " + brand + "; Модель" + model + "; Объем двигателя" + engineDisplacement;
    }

    @Override
    public void refill() {

    }

    @Override
    public void makePitStop() {
        System.out.println("Сделан пит-стоп " + brand.getName() + " " + model);
    }

    @Override
    public void setBestCircleTime(float bestCircleTime) {
        this.bestCircleTime = bestCircleTime;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
