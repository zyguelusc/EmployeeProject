package employee.version2;
import java.util.Date;

public class Employee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;

    public Employee() {
        //No Value Since no Params
    }
    
    public Employee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = DateParse.convertStringToDate(empBirthDate);
        this.empDateHired = DateParse.convertStringToDate(empDateHired);
    }
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nEMPLOYEE INFORMATION\n"));
        sb.append(String.format("Id: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParse.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s", DateParse.convertDateToString(this.empBirthDate)));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Id: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParse.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParse.convertDateToString(this.empBirthDate)));
        
        return sb.toString();
    }
}
