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
        double CompSalary;
    	if(totalSales < 50000) { //Low sales
    	   CompSalary = totalSales * 0.05;
    	
    	}else if (totalSales >= 50000 && totalSales < 100000) { //typical Sales
    	   CompSalary = totalSales * 0.20;
    	   
    	}else if (totalSales >= 100000 && totalSales < 500000) { //typical sales
    		CompSalary = totalSales * 0.30;
    	
    	}else if (totalSales >= 500000) { 	//High Sales
    		CompSalary = totalSales * 0.50;
    	
    	}else {
    		CompSalary = -1.0;
    	}
        
    	return CompSalary;
	    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
