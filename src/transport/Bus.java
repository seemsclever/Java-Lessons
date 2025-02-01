package transport;

public class Bus extends Transport {
    protected String howToDrive = "It Is Hard To Drive Me";
    protected float fuelPercentage;

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

    public String knowHowToDrive() {
        return "It Is Hard To Drive Me";
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = checkAndReturnValue(fuelPercentage, 0f);
    }

}
