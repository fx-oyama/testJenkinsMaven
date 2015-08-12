package maventest;

import junit.framework.TestCase;

public class JenUtilTest  extends TestCase  {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void test001() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cal);

	}

	public void test002() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cal);

	}

	public void test003() {
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		JenUtil cv = new JenUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cal);

	}


}
