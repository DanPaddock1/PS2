package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestIsEven() {
		
		assertEquals(false, MyInteger.isEven(1));
		assertEquals(true, MyInteger.isEven(74));
		
		MyInteger mi1 = new MyInteger(3);
		MyInteger mi2 = new MyInteger(10);
		
		assertEquals(false, MyInteger.isEven(mi1));
		assertEquals(true, MyInteger.isEven(mi2));
	}
	
	@Test
	public void TestIsOdd() {
		
		assertEquals(true, MyInteger.isOdd(9));
		assertEquals(false, MyInteger.isOdd(30));
		
		MyInteger mi1 = new MyInteger(17);
		MyInteger mi2 = new MyInteger(100);
		
		assertEquals(true, MyInteger.isOdd(mi1));
		assertEquals(false, MyInteger.isOdd(mi2));
	}
	
	@Test
	public void TestIsPrime() {
		
		assertEquals(false, MyInteger.isPrime(9));
		assertEquals(true, MyInteger.isOdd(17));
		
		MyInteger mi1 = new MyInteger(7);
		MyInteger mi2 = new MyInteger(50);
		
		assertEquals(true, MyInteger.isPrime(mi1));
		assertEquals(false, MyInteger.isPrime(mi2));
	}
	
	@Test
	public void TestEquals() {
		
		MyInteger mi1 = new MyInteger(14);

		assertEquals(false, mi1.equals(1));
		assertEquals(true, mi1.equals(mi1));
	}
	



}
