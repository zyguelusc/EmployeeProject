package employee.version2;

public class PieceWorkerEmployee extends Employee {
	private int totalPiecesFinished;
	private float ratePerPiece;
	
	//private int globalVar; // This sets as Max number of employees to input;
	
	public PieceWorkerEmployee() {
	    super();
	    this.totalPiecesFinished = 0;
	    this.ratePerPiece = 0.0f;
	}
	public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0f;
	 }

	// Constructor 3: Parameterized constructor with all employee information
	public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate, int totalPiecesFinished, float ratePerPiece) {
		super(empID, empName, empDateHired, empBirthDate);
		this.totalPiecesFinished = totalPiecesFinished;
		this.ratePerPiece = ratePerPiece;
	}
	
	// Accessors (getters)

    public float getTotalPiecesFinsihed() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }
    
    // Mutators (setters)
    
    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        return salary;
    }
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Hours Worked: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerPiece));
        
        System.out.println(sb.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Hours Worked: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerPiece));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
    
	

}
