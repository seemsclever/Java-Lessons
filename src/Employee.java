import java.util.ArrayList;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int id;
    private double salary;
    public int counterID = 0;

    public Employee(String name, String surname, String patronymic, int department, double salary){
        counterID++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counterID;
    }

    @Override
    public String toString(){
        return "Имя = " + this.name + "; Фамилия = " + this.surname + "; Отчество = "
                + this.patronymic + "; Отдел = " + this.department + "; ID = " + this.id + "; Зарплата = " + this.salary;
    }

    public static void printAnReport(ArrayList<Employee> Employees){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        Employee.printAllEmployees(Employees);
        System.out.printf("Фонд зарплат в месяц = %.2f%n", Employee.countSalaryBudget(Employees));
        System.out.printf("Сотрудник с минимальной зарплатой - %s%n", Employee.getEmployeeWithMinSalary(Employees));
        System.out.printf("Сотрудник с минимальной зарплатой - %s%n", Employee.getEmployeeWithMaxSalary(Employees));
        System.out.printf("Средняя зарплата - %.2f%n", Employee.countAbsOfSalaries(Employees));
        Employee.printNamesOfAllEmployees(Employees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getDepartment(){
        return department;
    }
    public int getID(){
        return id;
    }
    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public static void printAllEmployees(ArrayList<Employee> Employees){
        for (Employee employee : Employees){
            System.out.println(employee);
        }
    }

    public static double countSalaryBudget(ArrayList<Employee> Employees){
        double salariesSum = 0;
        for (Employee employee : Employees){
            salariesSum += employee.salary;
        }
        return salariesSum;
    }

    public static Employee getEmployeeWithMinSalary(ArrayList<Employee> Employees){
        int employeeIndex = 0;
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < Employees.size(); i++){
            if (Employees.get(i).salary < minSalary){
                minSalary = Employees.get(i).salary;
                employeeIndex = i;
            }
        }
        return Employees.get(employeeIndex);
    }

    public static Employee getEmployeeWithMaxSalary(ArrayList<Employee> Employees){
        int employeeIndex = 0;
        double minSalary = Double.MIN_VALUE;
        for (int i = 0; i < Employees.size(); i++){
            if (Employees.get(i).salary > minSalary){
                minSalary = Employees.get(i).salary;
                employeeIndex = i;
            }
        }
        return Employees.get(employeeIndex);
    }

    public static double countAbsOfSalaries(ArrayList<Employee> Employees){
        return countSalaryBudget(Employees) / Employees.size();
    }

    public static void printNamesOfAllEmployees(ArrayList<Employee> Employees){
        System.out.println("Ф.И.О. всех сотрулников: ");
        for (Employee employee : Employees){
            System.out.printf("ID %d: %s %s %s%n", employee.id, employee.surname, employee.name, employee.patronymic);
        }
    }

    public static void indexSalaries(ArrayList<Employee> Employees, int index){
        for (Employee employee : Employees){
            employee.salary += employee.salary * index / 100;
        }
    }

    public static void printAnReportForDepartment(ArrayList<Employee> Employees, int department){
        ArrayList<Employee> departmentEmployees = new ArrayList<>();
        for (Employee employee : Employees){
            if (employee.department == department){
                departmentEmployees.add(employee);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Отчет по отделу " + department + ":");
        System.out.printf("Сотрудник с минимальной зарплатой по отделу %d - %s%n", department, getEmployeeWithMinSalary(departmentEmployees));
        System.out.printf("Сотрудник с максимальной зарплатой по отделу %d - %s%n", department, getEmployeeWithMaxSalary(departmentEmployees));
        System.out.printf("Фонд зарплат на отдел %d в месяц = %.2f%n", department, Employee.countSalaryBudget(Employees));
        System.out.printf("Средняя зарплата в отделе %d - %.2f%n", department, Employee.countAbsOfSalaries(departmentEmployees));
        Employee.printNamesOfAllEmployees(departmentEmployees);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void getAllEmployeesWithLowerOrBiggerSalary (ArrayList<Employee> Employees,double salary){
        ArrayList<Employee> employeesWithLowerSalary = new ArrayList<>();
        ArrayList<Employee> employeesWithBiggerSalary = new ArrayList<>();
        for (Employee employee : Employees){
            if (employee.salary < salary) {
                employeesWithLowerSalary.add(employee);
            }
            else {
                employeesWithBiggerSalary.add(employee);
            }
        }
        System.out.printf("Сотрудники с зарплатой меньше %f:%n", salary);
        for (Employee employee : employeesWithLowerSalary){
            System.out.printf("ID %d: %s %s %s %f%n", employee.id, employee.name, employee.surname, employee.patronymic, employee.salary);
        }
        System.out.printf("Сотрудники с зарплатой больше %f:%n", salary);
        for (Employee employee : employeesWithBiggerSalary){
            System.out.printf("ID %d: %s %s %s %f%n", employee.id, employee.name, employee.surname, employee.patronymic, employee.salary);
        }
    }
}
