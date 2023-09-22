package testesjava;

import junit.framework.TestCase;

public class TemperaturaCelsiusTest extends TestCase{
    
    public void testTemperaturaCelsius(){
    	TemperaturaCelsius t = new TemperaturaCelsius(50);
        assertTrue(t.converteCelsiusParaFahrenheit() == 122);
        TemperaturaCelsius t2 = new TemperaturaCelsius(40);
        assertTrue(t2.converteCelsiusParaFahrenheit() == 104);
    }
}
