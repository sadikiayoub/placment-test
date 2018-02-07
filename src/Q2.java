
public class Q2 {
	static void sortArray(int... array) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int inter = array[j];
					array[j] = array[i];
					array[i] = inter;
				}
			}
	}

	public static void main(String[] args) {
		int array[] = { 1, 95, 2, 9, 0, 3, 8, 6, 0, 2, 6, 7, 7, 9, 0, 11, 99, 4, 101, 0, 23, 76 };
		sortArray(array);
		for (int i = 0; i < array.length - 1; i++)
			System.out.print(array[i] + "  ");
	}
}
