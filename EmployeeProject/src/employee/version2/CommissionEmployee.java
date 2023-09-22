package employee.version2;
//Done
public class CommissionEmployee extends Employee {
	
	private double totalSales;
	
	// Default constructor
    public CommissionEmployee() {
        super();
    }

    // Parameterized constructor 1
    public CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        /*this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate; */
        super(empID, empName, empDateHired, empBirthDate);
       

    }

    // Parameterized constructor 2
    public CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales) {
       /*  this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;*/
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    // Accessors (getters)
    

    public double getTotalSales() {
        return totalSales;
    }

    // Mutators (setters)
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
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        return sb.toString();
    }

	

}
