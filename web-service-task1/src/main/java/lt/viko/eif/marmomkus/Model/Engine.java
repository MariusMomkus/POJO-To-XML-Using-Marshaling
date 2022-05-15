package lt.viko.eif.marmomkus.Model;

import javax.xml.bind.annotation.*;


public class Engine {

    public Engine() {
    }

    private int value;
    private int maxValue;

    @Override
    public String toString() {
        return String.format("\tEngine: %s\n\t\tMaxValue: %s", value, maxValue);
    }
    @XmlElement(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @XmlElement(name = "maxValue")
    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }


}
