package lt.viko.eif.marmomkus.Services;

import lt.viko.eif.marmomkus.Model.Cars;
import lt.viko.eif.marmomkus.Service.CarsDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarsDAOTest {
    private CarsDAO carsDAO;

    @BeforeEach
    void setUp() {
        carsDAO = new CarsDAO();
    }

    @Test
    void fetchStudentsDataTesting() {

        Cars students = carsDAO.fetchCarsData();

        assertNotNull(students);

        assertEquals( 3 , students.getCarList().size(), "List is not as expected");

        assertEquals("bmw", students.getCarList().get(0).getCarName());

        assertEquals(1, students.getCarList().get(0).getEngineList().size());
        assertEquals(1, students.getCarList().get(1).getEngineList().size());
        assertEquals(1, students.getCarList().get(2).getEngineList().size());

        assertEquals(1, students.getCarList().get(0).getRepairsList().size());
        assertEquals(2, students.getCarList().get(1).getRepairsList().size());
        assertEquals(1, students.getCarList().get(2).getRepairsList().size());



    }

}
