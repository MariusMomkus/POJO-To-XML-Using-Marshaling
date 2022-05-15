package lt.viko.eif.marmomkus.Model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

// lombok
// @Data
// write order by xml elements names. Taking fields names
public class Car {

  public Car() {
  }

  private int id;
  private String carName;
  private String carType;
  private int year;


  private List<Engine> engines = new ArrayList<>();
  private List<Repairs> repairs = new ArrayList<>();

  @Override
  public String toString() {
    return String.format("CAR:\n\t\tcar Name: %s\n\t\tcar Type: %s\n\t\tID: %s\n\t\tyear: %s\n\t%s\n%s", carName, carType, id, year, printEngine(), printRepairs());

  }

  private String printEngine() {
    String result = "";
    for (Engine engine : getEngineList()) {
      result += String.format("%s", engine);
    }
    return result;
  }

  private String printRepairs() {
    String result1 = "";
    for (Repairs repairs : getRepairsList()) {
      result1 += String.format("\t\t%s", repairs);
    }
    return result1;
  }

  @XmlElement(name = "carName")
  public String getCarName() {
    return carName;
  }

  public void setCarName(String CarName) {
    this.carName = CarName;
  }

  @XmlElement(name = "carType")
  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  @XmlElement(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @XmlElement(name = "year")
  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @XmlElement(name = "engines")
  public List<Engine> getEngineList() {
    return engines;
  }

  public void setEngineList(List<Engine> engineList) {
    this.engines = engineList;
  }

  @XmlElement(name = "repairs") // the most appropriate way to change names to fti xml
  public List<Repairs> getRepairsList() {
    return repairs;
  }

  public void setRepairsList(List<Repairs> repairsList) {
    this.repairs = repairsList;
  }

}
