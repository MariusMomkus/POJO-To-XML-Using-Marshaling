package lt.viko.eif.marmomkus.Services;

import lt.viko.eif.marmomkus.Service.CarsDAO;
import lt.viko.eif.marmomkus.Service.TransformerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lt.viko.eif.marmomkus.Model.Cars;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransformerServiceTest {

    private TransformerService transformerService;

    private CarsDAO carsDAO;

    @BeforeEach
    void setUp() {
        transformerService = new TransformerService();

    }

    @Test
    void transformToPojoTest() {

        Cars cars = transformerService.transformToPojo("car.xml");

        assertNotNull(cars);

        assertEquals(3, cars.getCarList().size());
    }

    @Test
    void transformToXMLTest() {

        carsDAO = new CarsDAO();

        String carsXML = transformerService.transformToXML(carsDAO.fetchCarsData());

        assertNotNull(carsXML);

        assertTrue(carsXML.contains("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));

        assertTrue(carsXML.contains("<student>"));

    }
}
