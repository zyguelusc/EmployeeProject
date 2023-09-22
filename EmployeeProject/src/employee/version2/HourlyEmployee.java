package employee.version2;


public class HourlyEmployee extends Employee {

	private float totalHoursWorked;
	private float ratePerHour;

    public HourlyEmployee() {
        super();
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0f;
    }

    // Parameterized constructor 1
    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0f;
    }

    // Parameterized constructor 2
    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked,float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Accessors (getters)
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    // Mutators (setters)
    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    // Method to compute salary
    public double computeSalary() {
        return totalHoursWorked * ratePerHour;
    }
    
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Hours Worked: %.2f\n", this.totalHoursWorked));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerHour));
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Hours Worked: %.2f\n", this.totalHoursWorked));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerHour));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
    
	
}
