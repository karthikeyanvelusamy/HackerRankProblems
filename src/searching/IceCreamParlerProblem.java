package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IceCreamParlerProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int iTestCase = Integer.parseInt(reader.readLine());

		while (iTestCase-- > 0) {
			int m = Integer.parseInt(reader.readLine());
			int n = Integer.parseInt(reader.readLine());
			boolean flag = false;
			String[] data = reader.readLine().split("\\ ");
			int[] values = new int[n];
			int i = 0;
			for (String number : data) {
				values[i++] = Integer.parseInt(number);
			}
			int j = 0;
			for (i = 0; i < n - 1; i++) {
				int t = m - values[i];
				for ( j = i + 1; j < n; j++) {
					if (values[j] == t) {
						flag = true;
						break;
					}
				}
				if (flag)
					break;
			}
			if (flag)
				System.out.println((i + 1) + " " + (j + 1));
		}
	}

}
