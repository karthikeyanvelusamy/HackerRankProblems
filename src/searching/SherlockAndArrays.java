package searching;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlockAndArrays {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int iTestCase = Integer.parseInt(reader.readLine());

		while (iTestCase-- > 0) {
			boolean flag = true;
			int n = Integer.parseInt(reader.readLine());
			String[] data = reader.readLine().split("\\ ");
			int[] values = new int[n];
			int i = 0;
			long totalSum = 0;
			for (String dataNumber : data) {
				int value = Integer.parseInt(dataNumber);
				totalSum += value;
				values[i++] = value;
			}
			long sum2 = 0;
			if (n == 1) {
				System.out.println("YES");
				continue;
			}
			for (int j = n - 2; j > 0; j--) {
				long sum1 = totalSum;
				sum2 += values[j + 1];
				sum1 -= sum2;
				sum1 -= values[j];
				if (sum1 == sum2) {
					System.out.println("YES");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NO");
			}
		}
	}
}
