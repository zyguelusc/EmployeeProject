package employee.version2;

public class EmpVer2Main {
    public static void main (String[] args){
   BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(0, "Zyguel Philip E. Cabogoy", "08/08/2019", "03/25/2004", 40, 5.9);
    System.out.println(bpce);
    bpce.displayInfo();
    }
}