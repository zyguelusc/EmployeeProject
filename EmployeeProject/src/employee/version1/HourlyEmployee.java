package employee.version1;

import java.util.Date;
import java.util.Scanner;
public class HourlyEmployee {
	private int empID;
	private String empName;
	private Date empDateHired;
	private Date empBirthDate;
	private float totalHoursWorked;
	private float ratePerHour;
	private int globalVar; // This sets as Max number of employees to input;
	 // Default constructor
    public HourlyEmployee() {
        this.empID = -404;
        this.empName = null;
        this.empDateHired = null;
        this.empBirthDate = null;
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0f;
    }

    // Parameterized constructor 1
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0f;
    }

    // Parameterized constructor 2
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = ratePerHour;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
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
    
    public void displayinfo() {
    	System.out.printf("Employee ID : "
    	+ this.getEmpID() + "\n" + "Name : " + this.getEmpName() + "\n" 
    	+ "Date Hired : " + this.getEmpDateHired() + "\n" + "Birthdate :" + this.getEmpBirthDate()
    	+ "\n" + "Total Hours Worked : " + this.getTotalHoursWorked() + "\n" + "Rate per hour : " + this.getRatePerHour() + "\n\n");
    }

    @Override
    public String toString() {
    	return empName;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scanner = new Scanner(System.in);
		HourlyEmployee he = new HourlyEmployee();	
	//	he.displayinfo();
		
	}

}
