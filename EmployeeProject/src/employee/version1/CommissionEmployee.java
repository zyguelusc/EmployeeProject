package employee.version1;

import java.util.Date;

public class CommissionEmployee {
	private int empID;
	private String empName;
	private Date empDateHired;
	private Date empBirthDate;
	private double totalSales;
	
	  // Default constructor
    public CommissionEmployee() {
        this.empID = -1;
        this.empName = "";
        this.empDateHired = null;
        this.empBirthDate = null;
        this.totalSales = 0.0;
    }

    // Parameterized constructor 1
    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = 0.0;
    }

    // Parameterized constructor 2
    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    // Accessors (getters)
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    // Mutators (setters)
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Method to compute salary
    public double computeSalary() {
        // assume a fixed commission rate of 10%.
	    //Not final
	    // TO ADD : IF ELSE CONDITIONS OR NESTED IFS 
        double commissionRate = 0.10;
        return totalSales * commissionRate;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
