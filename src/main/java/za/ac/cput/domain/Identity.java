/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.domain;

public class Identity {
    private String type;
    private String value;

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

    // toString method
    @Override
    public String toString() {
        return "Identity{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}