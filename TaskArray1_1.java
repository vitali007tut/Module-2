package by.epam.introduction.algorithmization;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class TaskArray1_1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 8, 25, 36, 10, 44, 58, 67, 9 };
		int k = 3;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}

		System.out.printf("Сумма элементов кратных %d = %d", k, sum);
	}

}
