package by.epam.introduction.algorithmization;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class TaskArray1_4 {

	public static void main(String[] args) {
		
		int[] a = new int[] { -5, 0, 3, 6, 7, 14, -11, 22, 31, 47, 55, 100 };
		int max = a[0];
		int min = a[0];
		int indexMax = 0;
		int indexMin = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				indexMax = i;
			}
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
			}
		}

		a[indexMax] = min;
		a[indexMin] = max;
		
		for (int i = 0; i < a.length; i++)
		System.out.print(a[i] + " ");

	}

}
