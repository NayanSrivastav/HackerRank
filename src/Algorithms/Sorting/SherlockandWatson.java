package sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nayan Srivastava
 */
public class SherlockandWatson {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int t = 0;
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		t = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < len; i++) {
			arr.add(sc.nextInt());
		}
		for (int i = 0; i < t; i++) {
			int tmp = arr.get(len - 1);
			arr.remove(len - 1);
			arr.add(0, tmp);
		}

		for (int i = 0; i < q; i++) {
			System.out.println(arr.get(sc.nextInt()));
		}
	}

}
