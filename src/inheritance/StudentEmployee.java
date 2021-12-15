package inheritance;

public class StudentEmployee extends Student {

    private String employeeId;
    private double rateOfPayPerHour;


    public StudentEmployee(String firsName, String lastName, String studentId, String employeeId, double rateOfPayPerHour) {
        super(firsName, lastName, studentId);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString(){
        return super.toString() + "employeeId = " + employeeId + ", rateOfPayPerHour = " + rateOfPayPerHour;
    }
}
