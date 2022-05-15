package lt.viko.eif.marmomkus.Service;

import lt.viko.eif.marmomkus.Model.Car;
import lt.viko.eif.marmomkus.Model.Cars;
import lt.viko.eif.marmomkus.Model.Engine;
import lt.viko.eif.marmomkus.Model.Repairs;

public class CarsDAO {

    public Cars fetchCarsData() { // creating all objects and setting properties

        Car first = new Car();
        Car second = new Car();
        Car third = new Car();


        Cars cars = new Cars(); // creating Cars to store car objects

        Engine one = new Engine();
        Engine three = new Engine();

        Repairs engine = new Repairs();
        Repairs suspension = new Repairs();

        engine.setRepairType("Engine");
        engine.setCost(1000);

        suspension.setRepairType("Suspension");
        suspension.setCost(300);


        first.setCarName("bmw");
        first.setCarType("sedan");
        first.setId(19823);
        first.setYear(1995);

        second.setCarName("audi");
        second.setCarType("Coupe");
        second.setId(456873);
        second.setYear(1999);

        third.setCarName("opel");
        third.setCarType("Hatchback");
        third.setId(871358);
        third.setYear(2001);

        one.setValue(1);
        one.setMaxValue(3);

        three.setValue(1);
        three.setMaxValue(3);

        first.getRepairsList().add(engine);
        second.getRepairsList().add(engine);
        second.getRepairsList().add(suspension);
        third.getRepairsList().add(engine);

        first.getEngineList().add(one);
        second.getEngineList().add(one);
        third.getEngineList().add(one);

        // Putting each car object to cars

        cars.getCarList().add(first);
        cars.getCarList().add(second);
        cars.getCarList().add(third);

        return cars;
    }

}
