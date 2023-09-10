import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int counter = 0;
			for (int i = 0; i < n; i++) {
				int index = i;
				while (index < n && a[index] == a[i]) {
					index++;
				}
				counter++;
				i = index - 1;
			}
			System.out.println(counter);
		}
		fs.close();
	}
}
