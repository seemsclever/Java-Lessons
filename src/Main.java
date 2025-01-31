import transport.Car;
import transport.CarService;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Car.Brand BMWBrand = new Car.Brand("BMW", "Germany");

        Car BMW = new Car(BMWBrand, "M5 F90", 2.4f, "Black", 2021, "Germany", "Automatic", "Liftback", "14442252", 4, false);
        Car.Owner ownerMuhametovDI = BMW.new Owner("Muhametov Danil Ilgizovich", "07.10.2003");
        BMW.setOwner(ownerMuhametovDI);
        System.out.println(BMW);

        BMW.setColor("White");
        BMW.setRegistrationNumber("x222xx123");
        CarService.changeTiresToSummer(BMW);
        System.out.println(BMW);
    }
}
