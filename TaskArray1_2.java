package by.epam.introduction.algorithmization;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */

public class TaskArray1_2 {

	public static void main(String[] args) {
		int[] mas = { 5, 6, 1, 10, 30, 111, 9, 55 };
		int z = 10;
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}

		System.out.print("Новый массив ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("\nКоличество замен " + count);
	}
}
