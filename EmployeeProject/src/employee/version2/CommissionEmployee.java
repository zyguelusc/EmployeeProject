package employee.version2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
    @Override
    public String toString(){
        return "Employee ID: " + empID + "\nEmployee Name: " +
         empName + "\nEmployee Date Hired: " + empDateHired + 
         "\nEmployee Birth Date: " + empBirthDate + "\nEmployee Total Sales: " 
         + totalSales + "\nEmployee Salary: " + computeSalary();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CommissionEmployee> cemp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.print("Enter the maximum number of employees: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int i = 0; i < maxEmployees; i++) {
            System.out.println("Enter the details of employee #" + (i + 1));
            System.out.print("Employee ID: ");
            int empID = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Employee Name: ");
            String empName = scanner.nextLine();
            System.out.print("Date Hired (dd-MM-yyyy): ");
            Date empDateHired = null;
            try {
                empDateHired = sdf.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
                i--;
                continue;
            }
            System.out.print("Birth Date (dd-MM-yyyy): ");
            Date empBirthDate = null;
            try {
                empBirthDate = sdf.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
                i--;
                continue;
            }
            System.out.print("Total Sales: ");
            double totalSales = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            
            CommissionEmployee emp = new CommissionEmployee(empID, empName, empDateHired, empBirthDate, totalSales);
            cemp.add(emp);
        }
        scanner.close();
        //display all employees
        for (int i = 0; i < cemp.size(); i++) {
            System.out.println("\nEmployee #" + (i + 1) + " Information:");
            System.out.println(cemp.get(i).toString());
        }
    }

}
