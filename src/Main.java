import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<>();;

        Employee Danil = new Employee("Данил", "Мухаметов", "Илгизович", 1, 300_000);
        Employees.add(Danil);
        Employee Gosha = new Employee("Георгий", "Тиунов", "Сергеевоич", 2, 10_000);
        Employees.add(Gosha);
        Employee Aidar = new Employee("Айдар", "Нигматуллин", "Ильдарович", 2, 200_000);
        Employees.add(Aidar);


        Employee.printAnReport(Employees);
        
        Employee.indexSalaries(Employees, 10);

        Employee.printAnReportForDepartment(Employees, 2);

        Employee.getAllEmployeesWithLowerOrBiggerSalary(Employees, 50_000);
    }
}