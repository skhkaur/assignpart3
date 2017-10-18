import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	Implementation obj;
	int books;
	int days;
	double price;
	double penalty;
	double ans;
	
	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
		 
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testdayLibraryPenaltySystem() {
		
		 books = 3;
		 days = 1;
		 price = 200;
		 penalty = (price*.10);
		 ans = penalty*books*days;
		assertEquals(ans,obj.WeeklyPenaltySystem(penalty, books, days),0.001);
	}
	public void testWeeklyLibraryPenaltySystem() {
		
		 books = 2;
		 days = 7;
		 price = 50;
		 penalty = (price*.10);
		 ans = penalty*books*days;
		assertEquals(ans,obj.WeeklyPenaltySystem(penalty, books, days),0.001);
	}
	public void testMonthlyLibraryPenaltySystem() {
		
		 books = 1;
		 days = 30;
		 price = 40;
		 penalty = (price*.10);
		 ans = penalty*books*days;
		assertEquals(ans,obj.WeeklyPenaltySystem(penalty, books, days),0.001);
	}
}

