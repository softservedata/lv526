package chapter6_OOP.employee;

public class Employee implements CalculatePay {
    String employeeID;

    @Override
    public int calculatePay(int x) {
        return 0;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
