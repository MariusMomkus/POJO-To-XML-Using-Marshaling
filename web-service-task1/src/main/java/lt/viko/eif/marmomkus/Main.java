package lt.viko.eif.marmomkus;

import lt.viko.eif.marmomkus.Model.Cars;
import lt.viko.eif.marmomkus.Service.TransformerService;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        TransformerService transformerService = new TransformerService();

        Cars cars = transformerService.transformToPojo("car.xml");

        System.out.println(cars);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to change car 3 name: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                cars.getCarList().get(0).setCarName("Changed Name");
                break;
        }

        System.out.println("Updated cars: " + cars);

        transformerService.transformToXML(cars); // performing transformation to XML and outputting result
    }
}