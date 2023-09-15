package employee.version1;

import java.util.Date;

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

	}

}
