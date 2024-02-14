import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.CargoShip;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {

//        IEngine combustionEngine = new CombustionEngine(99,"01/01/2024");
//        Car hondaJazz = new Car(1300,150,"hatchback", combustionEngine);
//        System.out.println(hondaJazz.getHorsePower());
//
//        IEngine elEngine = new ElectricEngine(399,100);
//        hondaJazz.setEngine(elEngine);
//        System.out.println(hondaJazz.getHorsePower());

        //Testing
        IEngine boatEngine = new CombustionEngine(42, "01/01/2024");
        Speedboat speedboat = new Speedboat(200, 80, "Aluminium", false, boatEngine);
        System.out.println(speedboat.getHorsePower());
        speedboat.setEngine(new ElectricEngine(500, 100));
        System.out.println(speedboat.getHorsePower());

        CargoShip cargoShip = new CargoShip(1000,10,"Steel",30,boatEngine);
        System.out.println(cargoShip.getHorsePower());
        cargoShip.setEngine(new ElectricEngine(500, 100));
        System.out.println(cargoShip.getHorsePower());

        
    }

}
