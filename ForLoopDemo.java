package Iot_Java.day04;

public class ForLoopDemo {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
		// i++ : i = i + 1, i += 1
			System.out.println("Count is " + i);
		}
		// 문제 1 ~ 100 까지의 합을 구하는 식을 구하시오.
		// 예시 : 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 ...
		int total = 0;
		for(int i =0; i <= 100; i++) {
//			total += i;
			total = total + i;
			System.out.println(i + ", TOTAL:" + total );
		}
		System.out.println("1 ~ 100의 총합은 " + total );
		// ( 1 + n ) * n
		int n = 1000;
		System.out.println(((n+1)*n)/2);
	}
}
