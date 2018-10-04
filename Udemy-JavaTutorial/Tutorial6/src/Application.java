public class Application {
	public static void main(String[] args) {
		int value = 0;
		while (true) {
			System.out.println("Here" + "  " + value);
			if (value == 5) break;
			value++;
			System.out.println("Running");
		}
	}
}
