package za.ac.cput.model;

public class Identity {
    private String type;
    private String value;

    public Identity(String type, String value) {
        this.type = type;
        this.value = value;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
