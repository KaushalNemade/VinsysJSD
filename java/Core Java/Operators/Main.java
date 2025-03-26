//import java.util.*;

public class Main {
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		int g = -1;

		if (g <= 100 && g >= 0) {
			if (g >= 90) {
				System.out.println("O");
			} else {
				if (g >= 80) {
					System.out.println("A");
				} else {
					if (g >= 60) {
						System.out.println("B");
					} else {
						System.out.println("C");
					}
				}
			}
		} else {
			System.out.println("Invalid Marks");
		}
	}
}