
public class Code1 {
	public static void main(String[] args) {

		int result = calculateHighScore(1500);
		displayHighScore("sachin", result);

		result = calculateHighScore(900);
		displayHighScore("tendulkar", result);

		result = calculateHighScore(400);
		displayHighScore("Harbhajan", result);

		result = calculateHighScore(50);
		displayHighScore("yay", result);

	}

	public static void displayHighScore(String name, int pos) {
		System.out.println(name + " managed to get into the position " + pos);
	}

	public static int calculateHighScore(int score) {

		if (score > 1000)
			return 1;
		else if (score > 500 && score < 1000)
			return 2;
		else if (score > 100 && score < 500)
			return 3;
		else
			return 4;
	}

}
