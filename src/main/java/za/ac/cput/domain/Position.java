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

    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", status=" + status +
                ", employee=" + employee +
                '}';
    }

    private class PositionStatus {
        public static final PositionStatus OPEN = null;
        public static final PositionStatus CLOSED = null;
    }

    private class Employee {
        //employee attributes
    }

    public static void main(String[] args) {
        Position position = new Position("1", PositionStatus.OPEN);
        System.out.println(position);
    }

}
