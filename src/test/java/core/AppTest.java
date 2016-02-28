package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

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

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }

	@Test
	public void testAssertEqualsPositive() {
		String s = "ok";
		assertEquals("failure - positive strings are not equal", "ok", s);
		//System.out.println("BeforeClass method will be exectestAssertEqualsPositive");
	}

	@Test
	public void testAssertEqualsNegative() {
		String s = "okk";
		assertEquals("failure - negative strings are equal", "ok", s);
	}

	@Ignore
	@Test
	public void testAssertEqualsIgnored() {
		String s = "ok";
		assertEquals("ignore strings", "ok", s);
	}

	@Test
	public void testAssertSamePositive() {
		Integer i = 5;
		assertSame("should be the same", 5, i);
	}

	@Test
	public void testAssertSameNegaitive() {
		Integer i = 5;
		assertSame("should not be the same", 6, i);
	}

	@Ignore
	@Test
	public void testAssertSameIgnoore() {
		Integer i = 5;
		assertSame("should be ignored", 5, i);
	}

	@Test
	public void testAssertFalsePos() {
		Boolean f = false;
		assertFalse("failure - should be false", f);
	}

	@Test
	public void testAssertFalseNeg() {
		Boolean t = true;
		assertFalse("failure - should be false", t);
	}

	@Test
	public void testAssertTruePos() {
		Boolean t = true;
		assertTrue("failure - should be true", t);
	}

	@Test
	public void testAssertTrueNeg() {
		Boolean f = false;
		assertTrue("failure - should be true", f);
	}

}
