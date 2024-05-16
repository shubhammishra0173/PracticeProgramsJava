package StringToDateConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class test1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dateInString = "19590709";
		/*LocalDate date = LocalDate.parse(dateInString, DateTimeFormatter.ofPattern("yyyymmdd",Locale.ENGLISH));
		System.out.println(date);
		Date.parse(dateInString);
		
*/		String dateString = "19590709";
SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
Date date = format.parse(dateString);
System.out.println(date);


		
		
	}

}
