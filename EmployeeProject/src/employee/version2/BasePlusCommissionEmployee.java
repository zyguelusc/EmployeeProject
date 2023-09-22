package employee.version2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BasePlusCommissionEmployee {
    private int empID;
	private String empName;
	private Date empDateHired;
	private Date empBirthDate;
	private double totalSales;
    private double baseSalary;
    //overloaded constructor
    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    //default constructor
    public BasePlusCommissionEmployee() {
        this.empID = -1;
        this.empName = "";
        this.empDateHired = null;
        this.empBirthDate = null;
        this.totalSales = 0.0;
        this.baseSalary = 0.0;
    }
    //accessors
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
    public double getBaseSalary() {
        return baseSalary;
    }
    //mutators
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
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
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
        return CompSalary + baseSalary;
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Date Hired: " + empDateHired);
        System.out.println("Employee Birth Date: " + empBirthDate);
        System.out.println("Employee Total Sales: " + totalSales);
        System.out.println("Employee Base Salary: " + baseSalary);
        System.out.println("Employee Salary: " + computeSalary());
    }
    @Override
    public String toString(){
        return "Employee ID: " + empID + "\nEmployee Name: " +
         empName + "\nEmployee Date Hired: " + empDateHired + 
         "\nEmployee Birth Date: " + empBirthDate + "\nEmployee Total Sales: " 
         + totalSales + "\nEmployee Base Salary: " + baseSalary + "\nEmployee Salary: " + computeSalary();
    }
    public static void main(String[] args){
        ArrayList<BasePlusCommissionEmployee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of employees: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < maxEmployees; i++) {
            System.out.println("\nEnter Employee #" + (i + 1) + " Details:");
            System.out.print("Employee ID: ");
            int empID = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Employee Name: ");
            String empName = scanner.nextLine();

            System.out.print("Date Hired (dd-MM-yyyy): ");
            String hireDateStr = scanner.nextLine();
            Date empDateHired = parseDate(dateFormat, hireDateStr);

            System.out.print("Birth Date (dd-MM-yyyy): ");
            String birthDateStr = scanner.nextLine();
            Date empBirthDate = parseDate(dateFormat, birthDateStr);

            System.out.print("Total Sales: ");
            double totalSales = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline character
            System.out.print("Base Salary: ");
            double baseSalary = scanner.nextDouble();

            // Create a new employee instance
            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(empID, empName, empDateHired, empBirthDate, totalSales, baseSalary);

            // Add the employee to the ArrayList
            employeeList.add(employee);
        }

        // Display information for all employees
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("\nEmployee #" + (i + 1) + " Information:");
            System.out.println(employeeList.get(i).toString());
        }

        // Close the scanner
        scanner.close();
    
    }

    private static Date parseDate(SimpleDateFormat dateFormat, String dateStr) {
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
