package transport;

public class Truck extends Transport implements Competing {
    private float bestCircleTime;
    private int maxSpeed;

    public enum LoadCapacity{
        N1("до 3,5 тонн"),
        N2("свыше 3,5 до 12 тонн"),
        N3("свыше 12 тонн");

        private final String loadCapacity;

        LoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public String getLoadCapacity() {
            return loadCapacity;
        }
    }

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

    @Override
    public void doCheckout(){
        System.out.println("Произведена диагностика грузового автомобиля " + this.getBrand() + " " + this.getModel());
    }
}
