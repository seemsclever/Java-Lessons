import drivers.DriverBCategory;
import drivers.DriverCCategory;
import drivers.DriverDCategory;
import transport.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

//        Car.Brand BMWBrand = new Car.Brand("BMW", "Germany");
//
//        Car BMW = new Car(BMWBrand, "M5 F90", 2.4f, "Black", 340, 2021, "Germany", "Automatic", "Liftback", "14442252", 4, false);
//        Car.Owner ownerMuhametovDI = BMW.new Owner("Muhametov Danil Ilgizovich", "07.10.2003");
//        BMW.setOwner(ownerMuhametovDI);
//        System.out.println(BMW);
//        BMW.horn();
//
//        BMW.setColor("White");
//        BMW.setRegistrationNumber("x222xx123");
//        CarService.changeTiresToSummer(BMW);
//        System.out.println(BMW);
//
//        Bus.Brand NEFAZBrand = new Bus.Brand("nefaz", "Russia");
//        Bus nefaz = new Bus(NEFAZBrand, "FK431", 2010, NEFAZBrand.getCountry(), "White", 110);
//        System.out.println(nefaz);
//        nefaz.horn();
//        nefaz.refill();

        Transport.Brand mercedesBrand = new Transport.Brand("Mercedes", "Germany");
        Transport.Brand nefaz = new Transport.Brand("NEFAZ", "Russia");
        Transport.Brand volvo = new Transport.Brand("Volvo", "Germany");

        System.out.println("Mercedes:");
        Car mercedes1 = new Car(mercedesBrand, "E63", 4.1f);
        Car mercedes2 = new Car(mercedesBrand, "E43", 3.1f);
        Car mercedes3 = new Car(mercedesBrand, "C63", 3.5f);
        Car mercedes4 = new Car(mercedesBrand, "C43", 2.5f);
        System.out.println(mercedes1 + "\n" + mercedes2 + "\n" + mercedes3 + "\n" + mercedes4);
        System.out.println();

        System.out.println("NEFAZ:");
        Bus nefaz1 = new Bus(nefaz, "F412", 3f);
        Bus nefaz2 = new Bus(nefaz, "F431", 3.2f);
        Bus nefaz3 = new Bus(nefaz, "F414", 3f);
        Bus nefaz4 = new Bus(nefaz, "F453", 4.1f);
        System.out.println(nefaz1 + "\n" + nefaz2 + "\n" + nefaz3 + "\n" + nefaz4);
        System.out.println();

        System.out.println("Volvo:");
        Truck volvo1 = new Truck(volvo, "CD321", 3.5f);
        Truck volvo2 = new Truck(volvo, "XF415", 4f);
        Truck volvo3 = new Truck(volvo, "DS431", 3.6f);
        Truck volvo4 = new Truck(volvo, "CD323", 3.3f);
        System.out.println(volvo1 + "\n" + volvo2 + "\n" + volvo3 + "\n" + volvo4);
        System.out.println();

        volvo1.startMoving();
        mercedes1.makePitStop();

        DriverBCategory mihailo = new DriverBCategory("Mihailo", 30);
        mihailo.setTransport(mercedes1);
        mihailo.startMoving();

        DriverCCategory alex = new DriverCCategory("Alex", 1);
        alex.setTransport(volvo4);
        alex.startMoving();

        DriverDCategory dmitriy = new DriverDCategory("Dmitriy", 10);
        dmitriy.setTransport(nefaz1);
        dmitriy.startMoving();

        Car mercedes5 = new Car(mercedesBrand, "G30", 3.0f, "White", 300, 2020, "Czech", "Manual", Car.BodyType.STATION_WAGON, "x001xx003", 4, false);
        System.out.println(mercedes5);
    }
}
