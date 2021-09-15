package Iot_Java.day04;

import java.util.Scanner;

public class SwitchDemo2 {
public static void main(String[] args) {
	int month = 2;
	System.out.println("월을 입력하세요: ");
	Scanner sc = new Scanner(System.in);
	// Scanner는 자바 자체 명령어
	// 동적 화면 출력 가능
	month = sc.nextInt();
	// 자동완성 키는 Ctrl + space
	// 31일 : 1,3,5,7,8,10,12
	// 30일 : 4,6,9,11
	// 28일 : 2
	switch (month) {
	//	출력예시
	//	화면에 아래와 같이 출력하세요.
	//	5월달은 31일까지 입니다.
	case 1: case 3: 
	case 5: case 7: 
	case 8: case 10: 
	case 12:
		System.out.println(month + "월은 31일까지 입니다.");
	break;
	case 4: case 6: 
	case 9: case 11:
		System.out.println(month + "월은 30일까지 입니다.");
	break;
	case 2:
		System.out.println(month + "월은 28일까지 입니다.");
	break;
	default:
		System.out.println("잘못된 월을 입력하셨습니다.");
		break;
	}
}
}
// Swich 데모 달력 case 명령어를 전략적으로 활용한 예시.