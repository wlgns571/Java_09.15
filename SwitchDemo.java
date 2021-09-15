package Iot_Java.day04;

public class SwitchDemo {
public static void main(String[] args) {
	int day = 3;
	switch (day) {
	case 1:
		System.out.println("월요일입니다");
		break;
	case 2:
		System.out.println("화요일입니다");
		break;
	case 3:
		System.out.println("수요일입니다");
		break;
	case 4:
		System.out.println("목요일입니다");
		break;
	case 5:
		System.out.println("금요일입니다");
		break;
	case 6:
		System.out.println("토요일입니다");
		break;
	case 7:
		System.out.println("일요일입니다");
		break;
	default:
		System.out.println("잘 모르겠습니다.");
		break;
	} 
}
}