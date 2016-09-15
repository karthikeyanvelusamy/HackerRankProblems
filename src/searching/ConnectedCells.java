package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectedCells {
	static int max = 0;
	static int count = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int rows = Integer.parseInt(reader.readLine());
		int cols = Integer.parseInt(reader.readLine());
		int[][] matrix = new int[rows][cols];
		boolean isVisited[][] = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			String[] data = reader.readLine().split("\\ ");
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = Integer.parseInt(data[j]);
				isVisited[i][j] = false;
			}
		}
		for (int i = 0; i < rows; i++) {
			String[] data = reader.readLine().split("\\ ");
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = Integer.parseInt(data[j]);
				isVisited[i][j] = false;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				visitCell(i, j, isVisited, rows, cols, matrix);
			}
		}
		System.out.println(max);

	}

	private static void visitCell(int i, int j, boolean[][] isVisited, int n, int m, int[][] matrix) {
		if (i < 0 || j < 0 || i > n || j > m || isVisited[i][j] || matrix[i][j] == 0) {
			return;
		}
		isVisited[i][j] = true;
		if (matrix[i][j] == 1)
			count++;
		if (count > max)
			max = count;
		visitCell(i - 1, j, isVisited, n, m, matrix);
		visitCell(i + 1, j, isVisited, n, m, matrix);
		visitCell(i, j - 1, isVisited, n, m, matrix);
		visitCell(i, j + 1, isVisited, n, m, matrix);
		visitCell(i - 1, j - 1, isVisited, n, m, matrix);
		visitCell(i + 1, j + 1, isVisited, n, m, matrix);
		visitCell(i + 1, j - 1, isVisited, n, m, matrix);
		visitCell(i - 1, j + 1, isVisited, n, m, matrix);
		count = 0;
	}
}
