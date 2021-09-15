package Iot_Java.day04;

public class ForLoopDemo2 {
	public static void main(String[] args) {
		// 1부터 100까지의 짝수의 합을 구하는 프로그램을 작성하시오.
		int sum = 0;
		for(int i = 2; i <= 100; i += 2) {
		// i += 2는 i가 2씩 증가한다는 뜻
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 총합:" + sum);
		sum = 0;
		for(int i = 1; i <= 100; i ++) {
			if( i % 2 == 0) {
		// %는 나머지 구하는 연산자
		// i 1 : (1 % 2) => 1 == 0
		// i 2 : (2 % 2) => 0
			sum = sum + i;
			}
		}
		System.out.println("1부터 100까지의 총합:" + sum);
	}
}