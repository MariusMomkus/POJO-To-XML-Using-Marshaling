package lt.viko.eif.marmomkus.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Cars {

    public Cars() {
    }

    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    @XmlElement(name = "car")
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return String.format(printCars());
    }

    private String printCars() {
        String result = "";
        for (Car Ca : getCarList()) {
            result += Ca;
        }
        return result;
    }
}
