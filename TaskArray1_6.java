package by.epam.introduction.algorithmization;

/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class TaskArray1_6 {

	public static void main(String[] args) {
		double[] mas = { 12.1, 52.22, 1.058, 3.1452, 1.0, 7.77, 12, 13.14 };
		int l = mas.length;
		double sum = 0;

		if (l >= 2)
			for (int i = 2; i <= l; i++) {
				boolean flag = true; // предпологаем что число простое
				for (int j = 2; j < i; j++) {
					if (i % j == 0) { // если есть ещё делители без остатка
						flag = false; // то число не простое
					}
				}

				if (flag) {			// если индекс простой
					System.out.println(i);
					sum += mas[i];
				}
			}

		System.out.println("Сумма " + sum);

	}

}
