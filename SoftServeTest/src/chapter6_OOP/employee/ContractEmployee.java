package chapter6_OOP.employee;

public class ContractEmployee extends Employee implements CalculatePay {
    private String contractEmployeeID = " 1111 ";
    private String federalTaxIDmember = "federalTaxIdmember is : 567890 ";

    @Override
    public String getEmployeeID() {
        return contractEmployeeID;
    }

    @Override
    public int calculatePay(int numberOFhours) {
        int perHour = 10;
        return numberOFhours * perHour;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "contractEmployeeID='" + contractEmployeeID + '\'' +
                ", federalTaxIDmember='" + federalTaxIDmember + '\'' +
                '}';
    }
}
