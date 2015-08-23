package sorting;

import java.util.Scanner;

/**
 *
 * @author Nayan Srivastava
 */
public class TheFullCountingSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt(); // length of array

		StringBuilder[] stringArray = new StringBuilder[101];
		for (int i = 0; i < len; i++) {
			int k = scanner.nextInt();
			StringBuilder stringBuilder = new StringBuilder(scanner.next());
			if (i < (len / 2)) {
				stringBuilder = new StringBuilder("-");
			}
			if (stringArray[k] != null) {
				stringArray[k] = stringArray[k].append(" ").append(stringBuilder);
			} else {
				stringArray[k] = stringBuilder;
			}
		}
		scanner.close();
		for (int i = 0; i < 101; i++) {
			if (stringArray[i] != null) {
				System.out.print(stringArray[i] + " ");
			}
		}
		
	}

}