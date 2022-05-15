package lt.viko.eif.marmomkus.Model;

import javax.xml.bind.annotation.*;


public class Repairs {
    private String repairType;
    private int cost;

    public Repairs() {
    }

    @Override
    public String toString() {return String.format("Repair type: %s\n\t\tCosts: %d\n", repairType, cost);}

    @XmlElement(name = "repairType")
    public String getRepairtype() {return repairType;}

    public void setRepairType(String repairType) {this.repairType = repairType;}

    @XmlElement(name = "cost")
    public int getCost() {return cost;}

    public void setCost(int cost) {
        this.cost = cost;
    }
        
}
