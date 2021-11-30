package newfeatures;

import java.util.Date;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		//Legacy class to deal with date & Time which is now deprecated
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours()+" : "+d1.getMinutes()+" : "+d1.getSeconds());
		
		//calendar class
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("*******Java 8 Date & Time Classes********");
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println("Date and Time is : "+d +" --"+t);
		System.out.println("Before Formatting: "+dt);
		
		LocalDateTime dt2=dt.minusDays(100);
		System.out.println(dt2);
		
		LocalDateTime dt3=dt.plusDays(50);
		System.out.println(dt3);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy , HH:mm:ss");
		String dt1=dt.format(format);
		
		System.out.println("After Formatting : "+dt1);
		
		//Java Clock class is used to provide an access to the current, date and time using a time zone.
		
		Clock c1= Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		//zoned date time to deal with various time zones
		ZoneId z1= ZoneId.of("Asia/Tokyo");
		LocalTime t1=LocalTime.now(z1);
		System.out.println("Japan time is : "+t1);
		
		ZonedDateTime z2= ZonedDateTime.now();
		System.out.println(z2.getZone() +" " +z2.getDayOfWeek());
		
		System.out.println(z2);
		
	}

}
