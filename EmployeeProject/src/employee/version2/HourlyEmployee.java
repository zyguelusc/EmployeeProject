package employee.version2;


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
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked,float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
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
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nDate Hired: " + empDateHired +
                "\nBirth Date: " + empBirthDate +
                "\nTotal Hours Worked: " + totalHoursWorked +
                "\nRate Per Hour: " + ratePerHour +
                "\nSalary: " + computeSalary();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        HourlyEmployee[] employees = new HourlyEmployee[10];
        int numEmployees;

        System.out.println("Enter the number of employees to input: ");
        numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (numEmployees > employees.length) {
            System.out.println("Number of employees exceeds the maximum limit.");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Input employee data
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter data for Employee #" + (i + 1));

            // Employee ID
            System.out.print("Employee ID: ");
            int empID = scanner.nextInt();
          
            scanner.nextLine(); // Consume the newline character

            // Employee Name
            System.out.print("Employee Name: ");
            String empName = scanner.nextLine();
           

            // Date Hired (assuming date format is "dd-MM-yyyy")
            System.out.print("Date Hired (dd-MM-yyyy): ");
            String dateHiredStr = scanner.nextLine();
            Date empDateHired = null;
            try {
                empDateHired = dateFormat.parse(dateHiredStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                return;
            }
       

            // Birth Date (assuming date format is "dd-MM-yyyy")
            System.out.print("Birth Date (dd-MM-yyyy): ");
            String birthDateStr = scanner.nextLine();
            Date empBirthDate = null;
            try {
                empBirthDate = dateFormat.parse(birthDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                return;
            }
            // Total Hours Worked
            System.out.print("Total Hours Worked: ");
            float totalHoursWorked = scanner.nextFloat();


            // Rate Per Hour
            System.out.print("Rate Per Hour: ");
            float ratePerHour = scanner.nextFloat();
         
            // Create an employee object with the entered data
            employees[i] = new HourlyEmployee(empID, empName, empDateHired, empBirthDate, totalHoursWorked, ratePerHour);
            
        }

        // Display information for all employees
       for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.println(employees[i].toString());
        }
     
	}

}
