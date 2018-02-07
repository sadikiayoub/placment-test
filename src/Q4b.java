
public class Q4b {
	static int[][] trianglePascal = new int[9][9];

	static void fillTrianglePascal() {
		trianglePascal[0][0] = 1;
		trianglePascal[1][0] = 1;
		trianglePascal[1][1] = 1;
		for (int i = 2; i < 9; i++) {
			trianglePascal[i][0] = 1;
			for (int j = 1; j < i + 1; j++) {
				trianglePascal[i][j] = trianglePascal[i - 1][j - 1] + trianglePascal[i - 1][j];
			}
		}
	}

	static void printTrianglePascal() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(trianglePascal[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		fillTrianglePascal();
		printTrianglePascal();
	}
}
