package quick.spiral.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void calsAdd()
    {
    	Calculator c = new Calculator();
        assertEquals(3, c.add(1,1) );
    }
}
