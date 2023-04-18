package devhope.Ex7;


import java.util.List;


public class ArithmeticOperation {

    private String name;
    private int minNumberOfOperands;
    private String description;
    private List<String> properties;

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, List<String> properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }
}
