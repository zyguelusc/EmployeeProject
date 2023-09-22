package employee.version2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;
    //overloaded constructor
    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired,String empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }
    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }
    //default constructor
    public BasePlusCommissionEmployee() {
       super();
       this.baseSalary = 0.0;
    }
    //accessors
    public double getBaseSalary() {
        return baseSalary;
    }
    //mutators
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double computeSalary() {
     
        return super.computeSalary() + baseSalary;
    }
    @Override
    public void displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nEMPLOYEE INFORMATION\n"));
        sb.append(String.format("ID: %d\n", super.getEmpID()));
        sb.append(String.format("Name: %s\n", super.getEmpName()));
        sb.append(String.format("Date Hired: %s\n", DateParse.convertDateToString(super.getEmpDateHired())));
        sb.append(String.format("Date Birthed: %s\n", DateParse.convertDateToString(super.getEmpBirthDate())));
        sb.append(String.format("Total Sales: %.2f\n", super.getTotalSales()));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        
        System.out.println(sb.toString());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d\n", super.getEmpID()));
        sb.append(String.format("Name: %s\n", super.getEmpName()));
        sb.append(String.format("Date Hired: %s\n", DateParse.convertDateToString(super.getEmpDateHired())));
        sb.append(String.format("Date Birthed: %s\n", DateParse.convertDateToString(super.getEmpBirthDate())));
        sb.append(String.format("Total Sales: %.2f\n", super.getTotalSales()));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
   
}
