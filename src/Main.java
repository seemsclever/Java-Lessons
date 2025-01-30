import transport.Car;
import transport.CarService;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CarService carService = new CarService();
        Car BMW = new Car("BMW", "M5 F90", 2.4f, "Black", 2021, "Germany", "Automatic", "Liftback", "14442252", 4, false);
        System.out.println(BMW);
        BMW.setColor("White");
        BMW.setRegistrationNumber("x222xx123");
        carService.changeTiresToSummer(BMW);
        System.out.println(BMW);
    }
}
