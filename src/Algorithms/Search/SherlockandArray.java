package searching;

import java.util.Scanner;

/**
 * 
 * @author Nayan Srivastava
 *
 */
public class SherlockandArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		while (a-- > 0) {
			int n = sc.nextInt();
			int totalSum = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				totalSum += arr[i];
			}

			// check if number at zeroth position is equal to sum
			if (totalSum - arr[0] == 0) {
				System.out.println("YES");
			} else if (n < 3) {
				System.out.println("NO");
			} else {
				boolean flag = false;
				int sumSoFar = 0;
				for (int i = 1; i < n; i++) {
					sumSoFar += arr[i - 1];
					if (sumSoFar == (totalSum - arr[i] - sumSoFar)) {
						flag = true;
						break;
					}
				}
				if (flag)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
		sc.close();
	}
}
