
public class Q4a {
	static char[][] matrixXO = { { '|', 'O', '|', 'O', '|', 'X', '|' }, { '|', 'O', '|', 'X', '|', 'X', '|' },
			{ '|', 'X', '|', ' ', '|', 'O', '|' } };

	static void printXO() {
		for (int i = 0; i < matrixXO.length; i++) {
			for (int j = 0; j < matrixXO[i].length; j++) {
				System.out.print(matrixXO[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printXO();
	}
}
