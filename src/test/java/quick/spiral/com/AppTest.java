package quick.spiral.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void calsAdd()
    {
    	Calculator c = new Calculator();
        assertEquals(2, c.add(1,1) );
    }
	
	@Test
    public void calcSubtract()
    {
    	Calculator c = new Calculator();
        assertEquals(0, c.subtract(1,1) );
    }
}
