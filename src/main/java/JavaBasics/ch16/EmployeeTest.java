package JavaBasics.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("다나카");

        Employee employeeGo = new Employee();
        employeeGo.setEmployeeName("고민석");

        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeGo.getEmployeeId());
    }
}
