package by.epam.introduction.algorithmization;

/*
 * 6. ������ ������������������ N ������������ �����. ��������� ����� �����, ���������� ������ �������
�������� �������� �������.
 */

public class TaskArray1_6 {

	public static void main(String[] args) {
		double[] mas = { 12.1, 52.22, 1.058, 3.1452, 1.0, 7.77, 12, 13.14 };
		int l = mas.length;
		double sum = 0;

		if (l >= 2)
			for (int i = 2; i <= l; i++) {
				boolean flag = true; // ������������ ��� ����� �������
				for (int j = 2; j < i; j++) {
					if (i % j == 0) { // ���� ���� ��� �������� ��� �������
						flag = false; // �� ����� �� �������
					}
				}

				if (flag) {			// ���� ������ �������
					System.out.println(i);
					sum += mas[i];
				}
			}

		System.out.println("����� " + sum);

	}

}
