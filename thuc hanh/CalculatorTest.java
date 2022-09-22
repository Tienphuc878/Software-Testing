package st.prtc;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal=new Calculator();

	public CalculatorTest(String name) {
		super(name);
	}
		
	public void testMethod2_1() {
		assertEquals(1,cal.method2(true, true));
	}
	
	public void testMethod2_2() {
		assertEquals(2,cal.method2(false, false));
	}
	
	public void testSum() {
		assertEquals(2,cal.sum(1,1));
	}
}
