package chapter3;

public class EmployeeFromHW3 {
    private String name;
    private int rate;
    private int hours;
    private static int totalSumm = 0;

    public EmployeeFromHW3() {
    }

    public EmployeeFromHW3(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public EmployeeFromHW3(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSumm += rate * hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double changeRate(int newrate) {
        totalSumm -= rate * hours;
        this.rate = newrate;
        totalSumm += newrate * hours;
        return getSalary();
    }

    private double getBonuses() {
        return getSalary() * 0.1;
    }


    @Override
    public String toString() {
        return "EmployeeFromHW3{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        EmployeeFromHW3 firstEmpl = new EmployeeFromHW3("Nazar", 100, 2);
        EmployeeFromHW3 secondEmpl = new EmployeeFromHW3("Dima", 100, 3);
        EmployeeFromHW3 thirdEmpl = new EmployeeFromHW3("Natalia", 200, 4);
        System.out.println(firstEmpl);
        System.out.println(secondEmpl);
        System.out.println(thirdEmpl);

        System.out.println("First Employee have :" + firstEmpl.getSalary());
        System.out.println("Second Employee have :" + secondEmpl.getSalary());
        System.out.println("Third Employee have :" + thirdEmpl.getSalary());

        System.out.println("Total Summ from all Employees : " + totalSumm);

        System.out.println("Changing rate first*s Employee on 50 $ : " + firstEmpl.changeRate(50));
        System.out.println(firstEmpl);

        System.out.println(" New Total Summ from all Employees : " + totalSumm);

        System.out.println("Bonuses for Nazar : " + firstEmpl.getBonuses());
    }
}
