/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.domain;

public class Position {
    private String positionCode;
    private PositionStatus status;
    private Employee employee; // nullable if not filled

    // Constructor, Getters & Setters
    public Position(String positionCode, PositionStatus status) {
        this.positionCode = positionCode;
        this.status = status;
        this.employee = null;
    }

    public void assignEmployee(Employee employee) {
        if (this.status == PositionStatus.OPEN) {
            this.employee = employee;
            this.status = PositionStatus.CLOSED;
        } else {
            throw new IllegalStateException("Position already filled.");
        }
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public PositionStatus getStatus() {
        return status;
    }

    public void setStatus(PositionStatus status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // toString method
    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", status=" + status +
                ", employee=" + employee +
                '}';
    }

}