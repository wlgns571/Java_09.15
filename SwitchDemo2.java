package Iot_Java.day04;

import java.util.Scanner;

public class SwitchDemo2 {
public static void main(String[] args) {
	int month = 2;
	System.out.println("���� �Է��ϼ���: ");
	Scanner sc = new Scanner(System.in);
	// Scanner�� �ڹ� ��ü ��ɾ�
	// ���� ȭ�� ��� ����
	month = sc.nextInt();
	// �ڵ��ϼ� Ű�� Ctrl + space
	// 31�� : 1,3,5,7,8,10,12
	// 30�� : 4,6,9,11
	// 28�� : 2
	switch (month) {
	//	��¿���
	//	ȭ�鿡 �Ʒ��� ���� ����ϼ���.
	//	5������ 31�ϱ��� �Դϴ�.
	case 1: case 3: 
	case 5: case 7: 
	case 8: case 10: 
	case 12:
		System.out.println(month + "���� 31�ϱ��� �Դϴ�.");
	break;
	case 4: case 6: 
	case 9: case 11:
		System.out.println(month + "���� 30�ϱ��� �Դϴ�.");
	break;
	case 2:
		System.out.println(month + "���� 28�ϱ��� �Դϴ�.");
	break;
	default:
		System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		break;
	}
}
}
// Swich ���� �޷� case ��ɾ ���������� Ȱ���� ����.