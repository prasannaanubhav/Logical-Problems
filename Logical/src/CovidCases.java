public class CovidCases {

	static int sum = 0;

	public static void upperCase(String value) {

		if (value.equals("A")) {
			System.out.println("27");
			sum = sum + Integer.parseInt("27");
		}
		if (value.equals("B")) {
			System.out.println("28");
			sum = sum + Integer.parseInt("28");
		}

		if (value.equals("C")) {

			System.out.println("29");
			sum = sum + Integer.parseInt("29");
		}
		if (value.equals("D")) {

			System.out.println("30");
			sum = sum + Integer.parseInt("30");
		}
		if (value.equals("E")) {

			System.out.println("31");
			sum = sum + Integer.parseInt("31");
		}
		if (value.equals("F")) {

			System.out.println("32");
			sum = sum + Integer.parseInt("32");
		}
		if (value.equals("G")) {

			System.out.println("33");
			sum = sum + Integer.parseInt("33");
		}
		if (value.equals("H")) {

			System.out.println("34");
			sum = sum + Integer.parseInt("34");
		}
		if (value.equals("I")) {

			System.out.println("35");
			sum = sum + Integer.parseInt("35");
		}
		if (value.equals("J")) {

			System.out.println("36");
			sum = sum + Integer.parseInt("36");
		}
		if (value.equals("K")) {

			System.out.println("37");
			sum = sum + Integer.parseInt("27");
		}
		if (value.equals("L")) {

			System.out.println("38");
			sum = sum + Integer.parseInt("38");
		}
		if (value.equals("M")) {

			System.out.println("39");
			sum = sum + Integer.parseInt("39");
		}
		if (value.equals("N")) {

			System.out.println("40");
			sum = sum + Integer.parseInt("40");
		}
		if (value.equals("O")) {

			System.out.println("41");
			sum = sum + Integer.parseInt("41");
		}
		if (value.equals("P")) {

			System.out.println("42");
			sum = sum + Integer.parseInt("42");
		}
		if (value.equals("Q")) {

			System.out.println("43");
			sum = sum + Integer.parseInt("43");
		}
		if (value.equals("R")) {

			System.out.println("44");
			sum = sum + Integer.parseInt("44");
		}
		if (value.equals("S")) {

			System.out.println("45");
			sum = sum + Integer.parseInt("45");
		}
		if (value.equals("T")) {

			System.out.println("46");
			sum = sum + Integer.parseInt("46");
		}
		if (value.equals("U")) {

			System.out.println("47");
			sum = sum + Integer.parseInt("47");
		}
		if (value.equals("V")) {

			System.out.println("48");
			sum = sum + Integer.parseInt("48");
		}
		if (value.equals("W")) {

			System.out.println("49");
			sum = sum + Integer.parseInt("49");
		}
		if (value.equals("X")) {

			System.out.println("50");
			sum = sum + Integer.parseInt("50");
		}
		if (value.equals("Y")) {

			System.out.println("51");
			sum = sum + Integer.parseInt("51");
		}
		if (value.equals("Z")) {

			System.out.println("52");
			sum = sum + Integer.parseInt("52");
		}

	}

	public static void lowerCase(String value) {

		if (value.equals("a")) {
			System.out.println("1");
			sum = sum + Integer.parseInt("1");
		}
		if (value.equals("b")) {
			System.out.println("2");
			sum = sum + Integer.parseInt("2");
		}
		if (value.equals("c")) {
			System.out.println("3");
			sum = sum + Integer.parseInt("3");
		}
		if (value.equals("d")) {
			System.out.println("4");
			sum = sum + Integer.parseInt("4");
		}
		if (value.equals("e")) {
			System.out.println("5");
			sum = sum + Integer.parseInt("5");
		}
		if (value.equals("f")) {
			System.out.println("6");
			sum = sum + Integer.parseInt("6");
		}
		if (value.equals("g")) {
			System.out.println("7");
			sum = sum + Integer.parseInt("7");
		}
		if (value.equals("h")) {
			System.out.println("8");
			sum = sum + Integer.parseInt("8");
		}
		if (value.equals("i")) {
			System.out.println("9");
			sum = sum + Integer.parseInt("9");
		}
		if (value.equals("j")) {
			System.out.println("10");
			sum = sum + Integer.parseInt("10");
		}
		if (value.equals("k")) {
			System.out.println("11");
			sum = sum + Integer.parseInt("11");
		}
		if (value.equals("l")) {
			System.out.println("12");
			sum = sum + Integer.parseInt("12");
		}
		if (value.equals("m")) {
			System.out.println("13");
			sum = sum + Integer.parseInt("13");
		}
		if (value.equals("n")) {
			System.out.println("14");
			sum = sum + Integer.parseInt("14");
		}
		if (value.equals("o")) {
			System.out.println("15");
			sum = sum + Integer.parseInt("15");
		}
		if (value.equals("p")) {
			System.out.println("16");
			sum = sum + Integer.parseInt("16");
		}
		if (value.equals("q")) {
			System.out.println("17");
			sum = sum + Integer.parseInt("17");
		}
		if (value.equals("r")) {
			System.out.println("18");
			sum = sum + Integer.parseInt("18");
		}
		if (value.equals("s")) {
			System.out.println("19");
			sum = sum + Integer.parseInt("19");
		}
		if (value.equals("t")) {
			System.out.println("20");
			sum = sum + Integer.parseInt("20");
		}
		if (value.equals("u")) {
			System.out.println("21");
			sum = sum + Integer.parseInt("21");
		}
		if (value.equals("v")) {
			System.out.println("22");
			sum = sum + Integer.parseInt("22");
		}
		if (value.equals("w")) {
			System.out.println("23");
			sum = sum + Integer.parseInt("23");
		}
		if (value.equals("x")) {
			System.out.println("24");
			sum = sum + Integer.parseInt("24");
		}
		if (value.equals("y")) {
			System.out.println("25");
			sum = sum + Integer.parseInt("25");
		}
		if (value.equals("z")) {
			System.out.println("26");
			sum = sum + Integer.parseInt("26");
		}

	}

	public static void fullstopValue(int value) {
		sum = sum + value;
	}

	public static void displaySum() {
		System.out.println("sum of all digits = " + sum);
	}

	public static void upperCaseLoweCaseChecker1(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 65 && value.charAt(i) <= 90) {
				upperCase(String.valueOf(value.charAt(i)));
			} else if (value.charAt(i) == 46) {
				fullstopValue(99);
			} else {
				lowerCase(String.valueOf(value.charAt(i)));
			}
		}
	}

	public static void upperCaseLoweCaseChecker2(String value, int len) {
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 65 && value.charAt(i) <= 90) {
//				upperCase(String.valueOf(value.charAt(i)));
				UppercaseIncrement(String.valueOf(value.charAt(i)), len);
			} else if (value.charAt(i) == 46) {
				fullstopValue(99);
			} else {
//				lowerCase(String.valueOf(value.charAt(i)));
				LowercaseIncrement(String.valueOf(value.charAt(i)), len);

			}
		}
	}

	public static void LowercaseIncrement(String value, int len) {
		if (value.equals("a")) {
			System.out.println(1 + len);
			sum = sum + Integer.parseInt("1") + len;
		}
		if (value.equals("b")) {
			System.out.println(2 + len);
			sum = sum + Integer.parseInt("2") + len;
		}
		if (value.equals("c")) {
			System.out.println(3 + len);
			sum = sum + Integer.parseInt("3") + len;
		}
		if (value.equals("d")) {
			System.out.println(4 + len);
			sum = sum + Integer.parseInt("4") + len;
		}
		if (value.equals("e")) {
			System.out.println(5 + len);
			sum = sum + Integer.parseInt("5") + len;
		}
		if (value.equals("f")) {
			System.out.println(6 + len);
			sum = sum + Integer.parseInt("6") + len;
		}
		if (value.equals("g")) {
			System.out.println(7 + len);
			sum = sum + Integer.parseInt("7") + len;
		}
		if (value.equals("h")) {
			System.out.println(8 + len);
			sum = sum + Integer.parseInt("8") + len;
		}
		if (value.equals("i")) {
			System.out.println(9 + len);
			sum = sum + Integer.parseInt("9") + len;
		}
		if (value.equals("j")) {
			System.out.println(10 + len);
			sum = sum + Integer.parseInt("10") + len;
		}
		if (value.equals("k")) {
			System.out.println(11 + len);
			sum = sum + Integer.parseInt("11") + len;
		}
		if (value.equals("l")) {
			System.out.println(12 + len);
			sum = sum + Integer.parseInt("12") + len;
		}
		if (value.equals("m")) {
			System.out.println(13 + len);
			sum = sum + Integer.parseInt("13") + len;
		}
		if (value.equals("n")) {
			System.out.println(14 + len);
			sum = sum + Integer.parseInt("14") + len;
		}
		if (value.equals("o")) {
			System.out.println(15 + len);
			sum = sum + Integer.parseInt("15") + len;
		}
		if (value.equals("p")) {
			System.out.println(16 + len);
			sum = sum + Integer.parseInt("16") + len;
		}
		if (value.equals("q")) {
			System.out.println(17 + len);
			sum = sum + Integer.parseInt("17") + len;
		}
		if (value.equals("r")) {
			System.out.println(18 + len);
			sum = sum + Integer.parseInt("18") + len;
		}
		if (value.equals("s")) {
			System.out.println(19 + len);
			sum = sum + Integer.parseInt("19") + len;
		}
		if (value.equals("t")) {
			System.out.println(20 + len);
			sum = sum + Integer.parseInt("20") + len;
		}
		if (value.equals("u")) {
			System.out.println(21 + len);
			sum = sum + Integer.parseInt("21") + len;
		}
		if (value.equals("v")) {
			System.out.println(22 + len);
			sum = sum + Integer.parseInt("22") + len;
		}
		if (value.equals("w")) {
			System.out.println(23 + len);
			sum = sum + Integer.parseInt("23") + len;
		}
		if (value.equals("x")) {
			System.out.println(24 + len);
			sum = sum + Integer.parseInt("24") + len;
		}
		if (value.equals("y")) {
			System.out.println(25 + len);
			sum = sum + Integer.parseInt("25") + len;
		}
		if (value.equals("z")) {
			System.out.println(26 + len);
			sum = sum + Integer.parseInt("26") + len;
		}

	}

	public static void UppercaseIncrement(String value, int len) {
		if (value.equals("A")) {
			System.out.println(27 + len);
			sum = sum + Integer.parseInt("27") + len;
		}
		if (value.equals("B")) {
			System.out.println(28 + len);
			sum = sum + Integer.parseInt("28") + len;
		}

		if (value.equals("C")) {

			System.out.println(29 + len);
			sum = sum + Integer.parseInt("29") + len;
		}
		if (value.equals("D")) {

			System.out.println(30 + len);
			sum = sum + Integer.parseInt("30") + len;
		}
		if (value.equals("E")) {

			System.out.println(31 + len);
			sum = sum + Integer.parseInt("31") + len;
		}
		if (value.equals("F")) {

			System.out.println(32 + len);
			sum = sum + Integer.parseInt("32") + len;
		}
		if (value.equals("G")) {

			System.out.println(33 + len);
			sum = sum + Integer.parseInt("33") + len;
		}
		if (value.equals("H")) {

			System.out.println(34 + len);
			sum = sum + Integer.parseInt("34") + len;
		}
		if (value.equals("I")) {

			System.out.println(35 + len);
			sum = sum + Integer.parseInt("35") + len;
		}
		if (value.equals("J")) {

			System.out.println(36 + len);
			sum = sum + Integer.parseInt("36") + len;
		}
		if (value.equals("K")) {

			System.out.println(37 + len);
			sum = sum + Integer.parseInt("27") + len;
		}
		if (value.equals("L")) {

			System.out.println(38 + len);
			sum = sum + Integer.parseInt("38") + len;
		}
		if (value.equals("M")) {

			System.out.println(39 + len);
			sum = sum + Integer.parseInt("39") + len;
		}
		if (value.equals("N")) {

			System.out.println(40 + len);
			sum = sum + Integer.parseInt("40") + len;
		}
		if (value.equals("O")) {

			System.out.println(41 + len);
			sum = sum + Integer.parseInt("41") + len;
		}
		if (value.equals("P")) {

			System.out.println(42 + len);
			sum = sum + Integer.parseInt("42") + len;
		}
		if (value.equals("Q")) {

			System.out.println(43 + len);
			sum = sum + Integer.parseInt("43") + len;
		}
		if (value.equals("R")) {

			System.out.println(44 + len);
			sum = sum + Integer.parseInt("44") + len;
		}
		if (value.equals("S")) {

			System.out.println(45 + len);
			sum = sum + Integer.parseInt("45") + len;
		}
		if (value.equals("T")) {

			System.out.println(46 + len);
			sum = sum + Integer.parseInt("46") + len;
		}
		if (value.equals("U")) {

			System.out.println(47 + len);
			sum = sum + Integer.parseInt("47") + len;
		}
		if (value.equals("V")) {

			System.out.println(48 + len);
			sum = sum + Integer.parseInt("48") + len;
		}
		if (value.equals("W")) {

			System.out.println(49 + len);
			sum = sum + Integer.parseInt("49") + len;
		}
		if (value.equals("X")) {

			System.out.println(50 + len);
			sum = sum + Integer.parseInt("50") + len;
		}
		if (value.equals("Y")) {

			System.out.println(51 + len);
			sum = sum + Integer.parseInt("51") + len;
		}
		if (value.equals("Z")) {

			System.out.println(52 + len);
			sum = sum + Integer.parseInt("52") + len;
		}

	}

	public static void main(String[] args) {

		String value = "COVID crisis";
		String s[] = value.split(" ");
		for (int i = 0; i < s.length; i++) {
			String splitedValue = s[i];
			upperCaseLoweCaseChecker1(splitedValue);
		}
		displaySum();
		for (int i = 0; i < s.length; i++) {
			String splitedValue = s[i];
			int length = splitedValue.length();
			length = length * 100;
			upperCaseLoweCaseChecker2(splitedValue, length);

		}
		displaySum();

	}
}
