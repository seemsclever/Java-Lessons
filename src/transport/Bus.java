package transport;

public class Bus extends Transport implements Competing {
    protected float fuelPercentage;
    protected String horn = "HOOOOOOOORN!!!";

    private float bestCircleTime;
    private int maxSpeed;

    public enum PassengerCapacity{
        EXTRA_SMALL("до 10"),
        SMALL("до 25"),
        MEDIUM("40–50"),
        LARGE("60–80"),
        EXTRA_LARGE("100–120");

        private final String passengerCapacity;

        PassengerCapacity(String passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
        }

        public String getPassengerCapacity() {
            return passengerCapacity;
        }
    }

    public Bus(Brand brand, String model, float engineDisplacement){
        super(brand, model);
        this.engineDisplacement = engineDisplacement;
    }

    public Bus(Brand brand, String model, int yearOfProduction, String countryOfAssembly, String color, int maxSpeed) {
        super(brand, model, yearOfProduction, countryOfAssembly, color, maxSpeed);
    }

    public String toString(){
        return "Марка - " + brand + "; Модель - " + model + "; Год производства - " + yearOfProduction + "; Страна сборки - " + countryOfAssembly + "; Цвет - " + color + "; Максимальная скорость - " + maxSpeed;
    }

    @Override
    public void refill() {
        fuelPercentage = 100f;
        System.out.println("Автобус заправлен до 100%");
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = checkAndReturnValue(fuelPercentage, 0f);
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
