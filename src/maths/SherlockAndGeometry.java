package maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlockAndGeometry {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int iTestCase = Integer.parseInt(reader.readLine());
		while (iTestCase-- > 0) {
			String[] data = reader.readLine().split("\\ ");
			int x = Integer.parseInt(data[0]);
			int y = Integer.parseInt(data[1]);
			int r = Integer.parseInt(data[2]);
			boolean isIntersected = true;
			int[] x1 = new int[3];
			int[] y1 = new int[3];

			for (int i = 0; i < 3; i++) {
				data = reader.readLine().split("\\ ");
				x1[i] = Integer.parseInt(data[0]);
				y1[i] = Integer.parseInt(data[1]);
			}
			int j = 1;
			for (int i = 0; i < 3; i++) {
				double d = Math.sqrt(Math.pow(x1[j] - x1[i], 2) + Math.pow(y1[j] - y1[i], 2));
				double f = Math.sqrt(Math.pow(x1[i] - x, 2) + Math.pow(y1[i] - y, 2));

				double a = d * d;
				double b = 2 * f * d;
				double c = f * f - r * r;

				double ans = b * b - 4 * a * c;

				if (ans < 0) {
					isIntersected = false;
					break;
				}
				if (j == 2)
					j = 0;
				else
					j++;
			}
			if (isIntersected)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
