package Iot_Java.day04;

public class ForLoopDemo2 {
	public static void main(String[] args) {
		// 1���� 100������ ¦���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int sum = 0;
		for(int i = 2; i <= 100; i += 2) {
		// i += 2�� i�� 2�� �����Ѵٴ� ��
			sum = sum + i;
		}
		System.out.println("1���� 100������ ����:" + sum);
		sum = 0;
		for(int i = 1; i <= 100; i ++) {
			if( i % 2 == 0) {
		// %�� ������ ���ϴ� ������
		// i 1 : (1 % 2) => 1 == 0
		// i 2 : (2 % 2) => 0
			sum = sum + i;
			}
		}
		System.out.println("1���� 100������ ����:" + sum);
	}
}