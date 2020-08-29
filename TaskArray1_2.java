package by.epam.introduction.algorithmization;
/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен
 */

public class TaskArray1_2 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 11, 14, 17, 25, 33, 38, 47, 52, 61 };
		int z = 20;
		int numChanges = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				numChanges++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\nколичество замен " + numChanges);

	}

}
