package employee.version1;


//import employee.version1.HourlyEmployee;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {

	public Main() {
	
	}
	

	public static void main(String[] args) {
	
		HourlyEmployee emp1 = new HourlyEmployee();
		CommissionEmployee emp2 = new CommissionEmployee();
		BasePlusCommissionEmployee emp3 = new BasePlusCommissionEmployee();
		PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
		
		
		emp1.setEmpID(1);
		emp2.setEmpID(1);
		emp3.setEmpID(1);
		emp4.setEmpID(1);
		
		emp1.setEmpName("John");
		emp2.setEmpName("John");
		emp3.setEmpName("John");
		emp4.setEmpName("John");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String dateHiredStr = "2018-01-01";
		String empBirthDateStr = "1990-01-01";
        Date empDateHired = null;
		Date empBirthDate = null;	
            try {
				empDateHired = dateFormat.parse(dateHiredStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                return;
            }
			
			try {
				empBirthDate = dateFormat.parse(empBirthDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                return;
            }
		//SET DATE HIRED
			
		emp1.setEmpDateHired(empDateHired);	
		emp2.setEmpDateHired(empDateHired);
		emp3.setEmpDateHired(empDateHired);
		emp4.setEmpDateHired(empDateHired);
		
		//SET BIRTHDATE	

		emp1.setEmpBirthDate(empBirthDate);
		emp2.setEmpBirthDate(empBirthDate);
		emp3.setEmpBirthDate(empBirthDate);
		emp4.setEmpBirthDate(empBirthDate);

		System.out.println("THIS IS THE TEST FOR HOURLY EMPLOYEE IN MAIN");
		System.out.println(emp1.toString() + "\n\n\n");
		System.out.println("THIS IS THE TEST FOR COMMISSION EMPLOYEE IN MAIN");
		System.out.println(emp2.toString() + "\n\n\n");
		System.out.println("THIS IS THE TEST FOR BASE PLUS COMMISSION EMPLOYEE IN MAIN");
		System.out.println(emp3.toString() + "\n\n\n");
		System.out.println("THIS IS THE TEST FOR PIECE WORKER EMPLOYEE IN MAIN");
		System.out.println(emp4.toString() + "\n\n\n");	

	
	}

}
