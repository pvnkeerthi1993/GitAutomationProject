package mockInterview1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnit_Test {
   @Test
	
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}
