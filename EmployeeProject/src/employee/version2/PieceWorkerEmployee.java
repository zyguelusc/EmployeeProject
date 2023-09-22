package employee.version2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PieceWorkerEmployee {
	private int empID;
	private String empName;
	private Date empDateHired;
	private Date empBirthDate;
	private int totalPiecesFinished;
	private float ratePerPiece;
	
	//private int globalVar; // This sets as Max number of employees to input;
	
	public PieceWorkerEmployee() {
		this.empID = -404;
	    this.empName = null;
	    this.empDateHired = null;
	    this.empBirthDate = null;
	    this.totalPiecesFinished = 0;
	    this.ratePerPiece = 0.0f;
	}
	public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
	    this.empID = empID;
	    this.empName = empName;
	    this.empDateHired = empDateHired;
	    this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0f;
	 }

	// Constructor 3: Parameterized constructor with all employee information
	public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
		this.empID = empID;
		this.empName = empName;
		this.empDateHired = empDateHired;
		this.empBirthDate = empBirthDate;
		this.totalPiecesFinished = totalPiecesFinished;
		this.ratePerPiece = ratePerPiece;
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

    public float getPiecesFinsihed() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
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
    
    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        return salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birth Date: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nDate Hired: " + empDateHired +
                "\nBirth Date: " + empBirthDate +
                "\nTotal Pieces Finished: " + totalPiecesFinished +
                "\nRate Per Piece: " + ratePerPiece +
                "\nSalary: " + computeSalary();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<PieceWorkerEmployee> employees = new ArrayList<>();
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

            System.out.print("Total Pieces Finished: ");
            int totalPiecesFinished = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Rate Per Piece: ");
            float ratePerPiece = scanner.nextFloat();

            // Create a new employee instance
            PieceWorkerEmployee employee = new PieceWorkerEmployee(empID, empName, empDateHired, empBirthDate, totalPiecesFinished, ratePerPiece);

            // Add the employee to the ArrayList
            employees.add(employee);
        }

        // Display information for all employees
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("\nEmployee #" + (i + 1) + " Information:");
            //employees.get(i).displayInfo();
            System.out.println(employees.get(i).toString());
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
