package maventest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JenUtilTest {

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
	public void test001() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cv.calculateValue(a, b));

	}

	@Test
	public void test002() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cv.calculateValue(a, b));

	}

	@Test
	public void test003() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cv.calculateValue(a, b));

	}




}
