import java.util.ArrayList;

class Business {
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.1;

    private ArrayList<Employee> employees;

    public Business(String name) {
        this(name, "N/a", 1000);
    }

    public Business(String name, double startingFunds) {
        this(name, "N/a", startingFunds);
    }
 
    public Business(String name, String owner, double startingFunds) {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;

        employees = new ArrayList<Employee>();

        totalBusinesses++;
    }
 
    public void payTaxes() {
        funds -= funds * TAX_RATE;
    }

    public void hireEmployee(String name, String role, double salary) {
        Employee newEmployee = new Employee(name, role, salary);
        employees.add(newEmployee);
    }

    public void paySalaries(double hoursWorked) {
        for (Employee employee : employees) {
            double pay = employee.salary * hoursWorked;
            funds -= pay;
        }
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public double getFunds() {
        return funds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public static int getTotalBusinesses() {
        return totalBusinesses;
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.employeeInfo();
        }
    }
 
    class Employee {
        private String name;
        private String role;
        private double salary;
 
        public Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        public void employeeInfo() {
            System.out.println(
                "Employee: " + name +
                " | Role: " + role +
                " | Salary: $" + salary + "/hour"
            );
        }
    }
}
