
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;


public class fine {
	static float rate = 1;
	public static long calcFine(String dueDateStr){
		long daysOverdue;
		Date dueDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//String dateInString = "12/03/2014";
	 
		try {
	 
			dueDate = formatter.parse(dueDateStr);
			System.out.println(dueDate);
			System.out.println(formatter.format(dueDate));
	 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Date currDate = new Date();
		Date currDate = DateUtils.truncate(new Date(), Calendar.DATE);
		
		
		daysOverdue = (currDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
		System.out.println(daysOverdue);
		if(daysOverdue<=0)
			return 0;
		else
			return daysOverdue*(long)rate;
		
	}
	
	
	
	
	
	
	

}
