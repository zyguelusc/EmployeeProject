package employee.version2;
//Done
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
//This class is a reusable function for parsing Date of Type String into DATE FORMAT
public class DateParse {
    public static String convertDateToString(Date date) {
        String pattern = "dd/mm/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    
    public static Date convertStringToDate(String date) {
        Date temp_final = new Date();
        try {
            SimpleDateFormat parser = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
            temp_final = parser.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid input. Please use format dd/mm/yyyy.");
            System.out.println("\n");
        }
        return temp_final;  
  }
}
