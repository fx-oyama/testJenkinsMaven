package maventest;

public class JenUtil {

	public JenUtil(){
	}


	/**
	 * 計算.
	 * @param a aaaa
	 * @param b fvvv
	 * @return ssss
	 */
	public final int calculateValue(final int a, final int b) {
		return a + b;
	}

	public final int calculateValue2(final int a, final int b) {

		if(a == 0 || b == 0) {
			return -1;
		}

		return a * b;
	}


}
