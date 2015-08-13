package maventest;

public class JenMain {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int sts = 0;
		String cStr = "";

		JenUtil ju = new JenUtil();


		sts =ju.calculateValue(a, b);

        System.out.println("sts = " + sts);


		while (true) {
			System.out.println(">>>>" + cStr);
			if (cStr == "1") {
				break;
			}
		}



	}

}
