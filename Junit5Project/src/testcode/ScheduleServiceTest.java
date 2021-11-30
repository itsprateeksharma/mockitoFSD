package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceTest {

	// assuming urrent time zone is IST.. than only test should continue
	@Test
	void testDoSchedule() {

		TimeZone tzone = TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("India Standard Time"));

		// test doschedule method

		ScheduleService ss = new ScheduleService();
		assertTrue(ss.doSchedule());
	}

	@Test
	public void doScheduleLocaleNonUS() {

		// Assume that the current locale is US
		Locale currentLocale = Locale.getDefault();
		assumeFalse(currentLocale.equals(Locale.US));

		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.doSchedule());

	}

	
	  //assume current os is windows
	  @Test 
	  void testBackupCalendar() 
	  { 
		  assumeTrue(System.getProperty("os.name").startsWith("Windows"));

		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());
	  }
	 
}
