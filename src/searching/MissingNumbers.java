package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] frequencyA = new int[100];
		int[] frequencyB = new int[100];
		Arrays.fill(frequencyA, 0);
		Arrays.fill(frequencyB, 0);

		int n = Integer.parseInt(reader.readLine());
		String[] data = reader.readLine().split("\\ ");
		int[] A = new int[n];
		int i = 0;
		for (String number : data) {
			A[i++] = Integer.parseInt(number);
		}
		i = 0;
		int m = Integer.parseInt(reader.readLine());
		data = reader.readLine().split("\\ ");
		int[] B = new int[m];
		int min = Integer.parseInt(data[0]);
		int max = Integer.parseInt(data[0]);
		for (String number : data) {
			B[i++] = Integer.parseInt(number);
			if (B[i - 1] < min)
				min = B[i - 1];
			if (B[i - 1] > max)
				max = B[i - 1];
		}
		for (i = 0; i < A.length; i++)
			frequencyA[(A[i] - min)]++;
		for (i = 0; i < B.length; i++)
			frequencyB[(B[i] - min)]++;
		for (i = 0; i < 100; i++) {
			if (frequencyA[i] != frequencyB[i]) {
				System.out.print((min + i) + " ");
			}
		}

	}
}
