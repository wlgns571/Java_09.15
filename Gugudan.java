package Iot_Java.day04;

public class Gugudan {
	public static void main(String[] args) {
		// 2�ܿ��� 9�ܱ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��¿���
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 3 * 1 = 3 ...
		// 9 * 9 = 81
		int total = 0;
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
			//total = i * j;
				System.out.print(i + " X " + j + " = " + (i * j) + '\t');
			}
			// '\' : �������ô� ����(space)�� ������ ���ִ� ��ɾ�.
			System.out.println(); 
		}
	}
}