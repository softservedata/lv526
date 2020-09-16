package chapter6_OOP.employee;

public class SalariedEmployee extends Employee implements CalculatePay {
    private String salariedEmployeeID = " 2222 ";
    private String socialSecurityNumber = " socialSecurityNumber : 123456";

    @Override
    public int calculatePay(int fixedMonthlyPayment) {
        return fixedMonthlyPayment;
    }

    @Override
    public String getEmployeeID() {
        return salariedEmployeeID;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salariedEmployeeID='" + salariedEmployeeID + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
