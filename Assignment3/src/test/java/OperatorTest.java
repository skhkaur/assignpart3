import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
          Operator obj;
                 int i;
                 
 
 
	@Before
	public void setUp() throws Exception {
		obj = new Operator();
		i = 4;
	
		
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		i = 0;
		
	}

	@Test
	public void testSquare() {
		assertEquals(16,obj.square(i));
	}

	@Test
	public void testIncrement() {
		assertEquals(5,obj.Increment(i));
	}

	@Test
	public void testDecrement() {
		assertEquals(3,obj.decrement(i));
	}

}
