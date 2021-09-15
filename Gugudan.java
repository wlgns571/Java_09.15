package Iot_Java.day04;

public class Gugudan {
	public static void main(String[] args) {
		// 2단에서 9단까지 출력하는 프로그램을 작성하시오.
		// 출력예시
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
			// '\' : 역슬래시는 공간(space)을 나누게 해주는 명령어.
			System.out.println(); 
		}
	}
}